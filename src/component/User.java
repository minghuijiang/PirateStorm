package component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import message.ActivateCaptainsOrderMessage;
import message.AttackMessage;
import message.HarbourDepartureMessage;
import message.Message;
import message.MoveRequestMessage;
import message.SelectEnemyMessage;
import message.asv.ASV2014_452;
import message.asv.BuffMessage;
import message.asv.DoBidMessage;
import message.asv.HardWareTracking;
import message.asv.ReviveMsg;
import message.asv.SpecialItemMessage;

import com.mingJiang.gui.Messagable;


public class User implements Messagable {

	public ClientSocket socket;
	private Map<Integer, Loot> loots;
	public Map<Integer, Enemy> enemies;
	public List<Integer> target;
	public List<Integer> bidItem = new ArrayList<>();
	public Map<Integer, BidRunnable> runnable=new HashMap<>();
	private Map<Integer, Long> bufferMap,cooldownMap;
	public World world;
	public boolean keepMove=true;
	
	public int kkk = 0;
	public int count = (int) (Math.random()*(double)Main.locations.length);
	public Location targetLocation= Main.locations[count];
	public int nullTime = 0;
	public boolean limitLv = false;
	public long gold,dimond=0;
	public int[] ammo= new int[3], weapon=new int[3];
	public int hp,freeDive = 0;;
	public int exp=0,xp=0;
	public int userId;
	public Location location,dist;
	public String userName;
	public boolean isMoving=false, isTooFar=false;
	public long stopTime = System.currentTimeMillis();
	public boolean doBid  = !false;
	public boolean showLog = true;
	public boolean isAlive = false;
	public String session;
	public int lootNum=0,destoryNum=0;
	public int targetLoot= 0;
	
	public boolean isArena = false;
	public boolean isBG = false;
	public int killer = 0;
	public User(int id,String session) {
		userId= id;
		this.session = session;
		loots = new HashMap<>();
		enemies = new HashMap<>();
		bufferMap= new HashMap<>();
		cooldownMap = new HashMap<>();
		socket = new ClientSocket(this);
		location = new Location(4000, 4000);
		dist = new Location(4000, 4000);
		world = new World(this);
		target = new ArrayList<>();
	//	bidItem.add(11084);
		bidItem.add(11170);
	//	bidItem.add(11108);
	//	bidItem.add(11085);
		isAlive=true;
		setMsg(id+"  "+count);
	}
	
	
	public void login(){
	//	ClientSocket.showSocket=true;
		socket.connect();
	}

	public boolean fightPlayer = false;
	public List<Enemy> getEnemies(){
		List<Enemy> tmp = new ArrayList<>();
		try{
		for(Enemy e: enemies.values()){
			if(!fightPlayer){
				if(e.id>=1000000000)
					tmp.add(e);
			}else{
				tmp.add(e);
			}
		}}catch(Exception e){}
		return tmp;
	}
	
	public List<Enemy> getAllEnemies(){
		List<Enemy> tmp = new ArrayList<>();
		for(Enemy e: enemies.values()){
			tmp.add(e);	
		}
		return tmp;
	}
	
	public List<Enemy> getEnemiesByClosest(){
		List<Enemy> tmp = getEnemies();
		Collections.sort(tmp,new Comparator<Enemy>() {
			@Override
			public int compare(Enemy o1, Enemy o2) {
				double dis1 = o1.currentLocation().distanceFrom(location);
				double dis2 = o2.currentLocation().distanceFrom(location);
				if(dis1<dis2)
					return -1;
				if(dis2<dis1)
					return +1;
				return 0;
			}
		});
		return tmp;
	}
	
	public List<Loot> getLootByCloset(){
		List<Loot> tmp =getLoot();

		Collections.sort(tmp, new Comparator<Loot>() {

			@Override
			public int compare(Loot o1, Loot o2) {
				double d1 = o1.getLocation().distanceFrom(location);
				double d2 = o2.getLocation().distanceFrom(location);
				if(d1<d2)
					return -1;
				if(d2<d1)
					return +1;
				return 0;
			}
		});
		return tmp;
	}
	
	public List<Loot> getLoot(){
		List<Loot> tmp = new ArrayList<>();
		for(Loot l: loots.values())
			tmp.add(l);
		return tmp;
	}

	@Override
	public void setMsg(String s) {
		System.out.println("MSG: "+System.currentTimeMillis()+" "+this+" : "+s);
	}


	@Override
	public void log(String s) {
		if(showLog)
		System.out.println("LOG: "+System.currentTimeMillis()+" "+this+" : "+s);
		
	}


	@Override
	public void error(String s) {
		System.out.println("ERR: "+System.currentTimeMillis()+" "+this+" : "+s);
		
	}

	public void send(Message message){
		if(isAlive)
		socket.sendMessage(message);
	}
	
	public void moveTo(Location loc){

		moveTo(loc.getX(),loc.getY());
	}
	
	int ccc = 0;
	public void moveTo(int x, int y){
		
		if(!isAlive)
			return ;
	//	if(isArena||isBG)
		if(ccc++>50){
			ccc=0;
		//	this.setMsg("current: "+location+"  Move to ["+x+","+y+"]");
		}
	//	log("move from: "+location +" to ["+x+","+y+"]");
		MoveRequestMessage move =new MoveRequestMessage(this);
		move.posX = x;
		move.posY = y;
		if(dist.getX()==x&&dist.getY()==y){
			
		}else{
			dist.setX(x);
			dist.setY(y);
			stopTime= System.currentTimeMillis()+1000;
		}

		send(move);
		isMoving  = true;

	}

	public synchronized void addBuffer(int buffId, int time){
		bufferMap.put(buffId, System.currentTimeMillis()+time*1000);
	}
	
	/**
	 * 
	 * @param buffId
	 *       22 hide
	 *       84 guild xp
	 * @return
	 */
	public boolean isBuffered(int buffId){
		if(bufferMap.containsKey(buffId))
			if(bufferMap.get(buffId)>System.currentTimeMillis())
				return true;
		return false;
	}
	
	public boolean canFight(){
		if(limitLv)
			useItem(18);
		return isBuffered(84)||!limitLv;
	}
	
	public synchronized void addCoolDown(int item, int time){
		cooldownMap.put(item, System.currentTimeMillis()+time);
	}
	
	public boolean isCoolDown(int item){
		if(cooldownMap.containsKey(item)){
			if(cooldownMap.get(item)>System.currentTimeMillis())
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param item
	 *    2 speed
	 *    7 rocket 1500-2500
	 *    1 hide
	 *    18 guild xp half
	 * @return
	 */
	public boolean useItem(int item){
		if(isCoolDown(item))
			return false;
		this.send(new SpecialItemMessage(this, item));
		this.addCoolDown(item, 1000);
		return true;
	}
	
	public void useSkill(int enemy){
		this.send(new ActivateCaptainsOrderMessage(this, 9));
		this.send(new ActivateCaptainsOrderMessage(this, 8));
		this.send(new ActivateCaptainsOrderMessage(this, 6));
		this.send(new ActivateCaptainsOrderMessage(this, 5));
		this.send(new SelectEnemyMessage(this, enemy));
		this.send(new ActivateCaptainsOrderMessage(this, 8));
		this.send(new ActivateCaptainsOrderMessage(this, 4));
		this.send(new ActivateCaptainsOrderMessage(this, 3));
		this.send(new ActivateCaptainsOrderMessage(this, 1));
	}

	public void fight(Enemy e){
		fight(e,true);
	}
	public void fight(Enemy e,boolean move){
		if(e==null||e.id==userId||enemies.get(e.id)==null)
			return ;
	//	long startTime = System.currentTimeMillis();
	//	this.log("Fight==========="+e.id+ "  "+e.location+ " "+e.currentHp+" my: "+location+" distance: "+e.location.distanceFrom(location));
		SelectEnemyMessage msg = new SelectEnemyMessage(this,e.id);
		send(msg);
		if(move){
			Location loc =getClosestLocation(e.currentLocation(),80,80,location);
		//	log("User: "+location+" Target: "+e.currentLocation()+"  Suggest: "+loc);
			moveTo(loc);
		}
		AttackMessage msg2 = new AttackMessage(this);
		send(msg2);
		int c= 0;
		boolean hasSend = false;
		while(enemies.get(e.id)!=null&&c++<300&&isAlive){
			try {
				Thread.sleep(20);
				if(c%30==0){
					if(move){
						Location loc =getClosestLocation(e.currentLocation(),100,100,location);
						moveTo(loc);
					}
					send(msg);
					send(msg2);
				}
	
				if(hp<5000&&!hasSend){
					send(new ActivateCaptainsOrderMessage(this,1));
					send(new ActivateCaptainsOrderMessage(this,2));
					send(new ActivateCaptainsOrderMessage(this,3));
					hasSend = true;
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.id>=1000000000)
			enemies.remove(e.id);
	//	this.log("Finish Fight====="+e.id+ "  "+e.location+ " "+e.currentHp + " "+(System.currentTimeMillis()-startTime)+"  cF: "+c);
	}
	
	public String toString(){
		return String.format("%-15s", userName);
	}
	
	public void bidChange(final int timeLeft,final int id){
		log("bid change: "+timeLeft+"  id: "+id);
		if(!doBid){
			return ;
		}
		final User user = this;
		if(bidItem.contains(id)){
			if(runnable.get(id)==null){
				BidRunnable run = new BidRunnable(timeLeft, id, this);
				runnable.put(id, run);
			}else{
				runnable.get(id).setStopTime(timeLeft);
				runnable.get(id).start();
			}
		}
	}
	
	public void departure(){
		send(new HarbourDepartureMessage(this));
		send(new HardWareTracking(this));
		send(new ASV2014_452(this));
	}
	
	public boolean isBotting(){
		return (!isBG)&&!isArena;
	}
	
	public boolean pick = true;
	
	public void revive(){
		if(isBotting()){//||killer==631522){
			if(killer!=0)
				setMsg("Revive after killed by: "+killer);
			killer = 0;
			this.send(new ReviveMsg(this));
			this.departure();
		}
	}
	
	public static Location getClosestLocation(Location target, int dx,int dy, Location current){
		int x=0;
		int y=0;
		if(current.getX()>target.getX()){
			if(current.getY()>target.getY()){//south east
				x=target.getX()+dx;
				y= target.getY()+dy;
			}else{//north east
				x=target.getX()+dx;
				y= target.getY()-dy;
			}
		}else{
			if(current.getY()>target.getY()){//south west
				x=target.getX()-dx;
				y= target.getY()+dy;
			}else{//north west
				x=target.getX()-dx;
				y= target.getY()-dy;
			}
		}
		
		return new Location(x, y);
	}
	
	public synchronized Map<Integer, Loot> getLoots(){
		return loots;
	}
}
