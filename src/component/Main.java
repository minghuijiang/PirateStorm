package component;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Position;

import org.omg.CORBA.Current;

import message.ActivateCaptainsOrderMessage;
import message.AttackMessage;
import message.HarbourDepartureMessage;
import message.ItemInfo;
import message.MatchUserReadyMessage;
import message.Message;
import message.MoveRequestMessage;
import message.RepairMessage;
import message.SelectEnemyMessage;
import message.ShopBuyMessage;
import message.asv.ASV2014_452;
import message.asv.AuctionMessage;
import message.asv.DoBidMessage;
import message.asv.GetTechBackMessage;
import message.asv.HardWareTracking;
import message.asv.InitRepairMessage;
import message.asv.RequestAuction;
import message.asv.ReviveMsg;
import message.asv.SelectTechMessage;
import message.asv.SpecialItemMessage;
import message.asv.StartTechMessage;

public class Main {

	static{
		com.mingJiang.log.Logging.initLogger();
	}
	public static Location[] locations= {
		new Location(4000,4000), new Location(6000,6000),
		new Location(4000, 6000), new Location(6000, 4000)
//		new Location(2000,2000), new Location(8000,2000),
//		new Location(2000,4000), new Location(8000,4000),
//		new Location(2000,6000), new Location(8000,6000),
//		new Location(2000,8000), new Location(8000,8000),
//		new Location(2000,6000), new Location(3000,4000),
//		new Location(8000,6000), new Location(8000,4000),
	};
//	public static Location targetLocation = locations[0];
	
	public static Location nextLocation(User user){
		user.count++;
		if(user.count>=locations.length)
			user.count=0;
		return locations[user.count];
	}
	
	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		//42274 32748
		ClientSocket.showSocket=false;
		final User user = new User(631522, "208d71f2c001321466c1f1c508046209");
		user.limitLv=true;
		user.login();
		user.doBid =!false;
		user.showLog = false;
		user.revive();

		if(user.doBid){
			user.send(new RequestAuction(user));
			for(int i: user.bidItem)
				user.send(new DoBidMessage(user,i));
		}
		
		new Thread(){
			public void run(){
				while(user.isAlive){
					Main.sleep(200);
					moveNext(user);
					checkBlood(user);
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(user.isAlive){
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(user.hp<3000&&user.isBotting()){
					//	user.revive();
						user.moveTo(1200, 1200);
					}else{
						user.keepMove = false;
						getLoot(user);
					//	if(user.isBuffered(84))
							fight(user);
							user.keepMove = true;
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				int c =10;
				while(user.isAlive){
					if(c%3==0){
						user.revive();
						user.useItem(2);
					}
					if(c++%10==0&&!false){
						for(Message m: msgs)
							user.send(m);
						
					}
					
					if(user.isBotting())
						for(Message m: Skillmsgs)
							user.send(m);
					
					Main.sleep(10000);
					
					
				}
			}
		}.start();

	}


	
	public static void moveNext(User user){
		if(!user.isBotting())
			return;
		if(user.keepMove){
			if(user.stopTime<=System.currentTimeMillis()){
				user.targetLocation = nextLocation(user);
				user.kkk=0;
			}else{
				user.kkk++;
				if(user.kkk>100){
					user.kkk=0;
					user.setMsg("Not move too long: "+user.stopTime+"  "+System.currentTimeMillis());
					user.targetLocation = nextLocation(user);
				}
			}
			user.moveTo(user.targetLocation);
		}
	}
	
	public static void getLoot(User user) {
		if(!user.isBotting()||!user.pick)
			return;
		while(!user.getLoots().isEmpty()) {
			user.setMsg("Start get loot: " + user.getLoots().size());
			List<Loot> loots =user.getLoot();
			LootSort sort = new LootSort(user.location);
			List<Loot> sorted = sort.sort(loots);
			for (Loot l : sorted) {
				if(l==null||user.getLoots().get(l.getId())==null)
					continue;
				if(!user.isBotting())
					return ;
				user.targetLoot= l.getId();
				Enemy enemy = null;
				Message select = null;
				Message attack = new AttackMessage(user);
				
					if(user.target.size()>0){
						user.setMsg("Target size: "+user.target.size());
						for(int i=0;i<user.target.size();i++){
							if((enemy =user.enemies.get(user.target.get(i)))!=null){
								user.setMsg("Enemy : "+enemy.getName());
								if(user.canFight())
									break;
								else{
									if(enemy.id<1000000000){
										break;
									}else
										enemy=null;
								}
							}
							
						}
						user.target.clear();
					}
					if(enemy==null&&user.canFight())
						enemy = getEnemy(user);
					user.setMsg("Enemy: "+(enemy!=null?enemy.getName():"null")+ "  ");
					if(enemy!=null){
						user.setMsg("Shoot on:  "+enemy.id);
						select = new SelectEnemyMessage(user, enemy.id);
						user.send(select);
						user.send(attack);
						if(!user.canFight()){
							user.moveTo(enemy.currentLocation());
						}
					}
				
			//	long startTime = System.currentTimeMillis();

				user.moveTo(l.getLocation());
			//	user.setMsg("Get Loot: "+l.getId()+" "+l.getLocation()+" from "+user.location);

				int c = 0;
				while ((user.getLoots().get(l.getId()) != null)&&!user.location.equals(l.getLocation()) 
						&& c++ < 300&&user.isBotting()) {
					Main.sleep(20);
				
					if (c % 30 == 0) {
						user.moveTo(l.getLocation());
						if(enemy!=null&&user.canFight()){
							user.send(select);
							user.send(attack);
						}
					}
				}			
				user.lootNum++;

//				user.setMsg("Finish get Loot: "+l.getId()+"  "+l.getLocation()+"  Time "+(System.currentTimeMillis()-startTime)+" c: "+c
//						+"  lootNull: "+(user.loots.get(l.getId())==null)
//						+"  LocationEqual: "+user.location.equals(l.getLocation())
//						+" "+user.location);
				//if(c>290)
					user.getLoots().remove(l.getId());
				//user.targetLoot= 0;
			}
			if(user.getLoots().isEmpty())
				user.setMsg("Finish get loot");
		}
		
	}
	
	public static void counterAttack(User user){
		if(user.target.size()>0){
			user.setMsg("Fight target "+user.target.size());
			for(int i=0;i<user.target.size();i++)
				user.fight(user.enemies.get(user.target.get(i)),false);
			user.target.clear();
		}
	}
	
	public static void fight(User user){
		if(!user.isBotting()||!user.canFight())
			return;
		if(user.hp<1000){
			user.setMsg("HP low, skip fight " +user.hp);
			return ;
		}
		if(user.target.size()>1)
			counterAttack(user);
		int c =0;

		int size = user.enemies.size();
		if(size==0)
			return ;
		
		//user.setMsg("Start Fight: "+user.enemies.size());
		Enemy next = getEnemy(user);
	
		while(next!=null&&c++<2&&user.isBotting()){
		//	user.setMsg("Fight: "+next.getName());
			if(user.enemies.get(next.id)==null)
				continue;
			user.fight(next);
		//	user.setMsg("Finish Fight: "+next.getName());

			if(user.target.size()>3)
				counterAttack(user);
			next = getEnemy(user);
		}

		//user.setMsg("Finish fight:" );
		
	}

	
	private static Enemy getEnemy(User user){
		for(Enemy e: user.getEnemiesByClosest()){
			user.nullTime = 0;
			return e;
		}
		if(user.nullTime++>100){
			//	user.setMsg("Null enemy:" );
			user.nullTime=0;
				user.revive();
				user.keepMove=true;
			//	user.ammo[0]=0;
				
			}
		return null;
	}
	
	
	static ItemInfo techSelect = new ItemInfo(null, 49, 1,2, 1);
//	static ItemInfo techSelect = new ItemInfo(null, 20, 5,2, 1);
//	static ItemInfo techSelect2 = new ItemInfo(null, 20, 5,3, 1);
	static Message[] msgs = {
		new GetTechBackMessage(null,1),
		new SelectTechMessage(null,1,techSelect),
		new StartTechMessage(null,1),
		new GetTechBackMessage(null,2),
		new SelectTechMessage(null,2,techSelect),
		new StartTechMessage(null,2),
		new GetTechBackMessage(null,3),
		new SelectTechMessage(null,3,techSelect),
		new StartTechMessage(null,3),
		//new GetTechBackMessage(null,1),
//		new SelectTechMessage(null,1,techSelect2),
//		new StartTechMessage(null,1),
//		new GetTechBackMessage(null,2),
//		new SelectTechMessage(null,2,techSelect2),
//		new StartTechMessage(null,2),
//		new GetTechBackMessage(null,3),
//		new SelectTechMessage(null,3,techSelect2),
//		new StartTechMessage(null,3),
	//	new SpecialItemMessage(null, 18),
	//	new MatchUserReadyMessage(null,9, true),
		new MatchUserReadyMessage(null,1,false),
		new MatchUserReadyMessage(null,2,false),
		new MatchUserReadyMessage(null,3,false),
	};
	static Message[] Skillmsgs = {
		new ActivateCaptainsOrderMessage(null,5),
		new ActivateCaptainsOrderMessage(null,6),
		new ActivateCaptainsOrderMessage(null,7),
		new ActivateCaptainsOrderMessage(null,8),
		new ActivateCaptainsOrderMessage(null,9),
	};
	static InitRepairMessage msg2 = new InitRepairMessage(null);
	static ActivateCaptainsOrderMessage hp2 = new ActivateCaptainsOrderMessage(null,2);
	
	public static void checkBlood(User user){
		checkBlood(user, 7500);
	}
	
	public static void checkBlood(User user,int cost){
		if(!user.isBotting())
			return;
		user.send(msg2);
		if(user.hp<5000)
			user.send(hp2);
		if(user.gold>10000){
			if(user.ammo[0]<1000){
				user.setMsg("buy ammo!!!"+user.ammo[0]);
	
				ShopBuyMessage msg = new ShopBuyMessage(user);
				msg.itemType=4;
				msg.defaultId=1;
				if(user.gold<100000){
					msg._amount=1;
					user.ammo[0]+=1000;
				}
				else{
					msg._amount=10;
					user.ammo[0]+=10000;
				}
				msg._currencyType=0;
				msg._currencyValue= cost;
				user.send(msg);
				
			}
	
			if(user.weapon[0]<1000){
				user.setMsg("buy weapon!!!"+user.weapon[0]);
	
				ShopBuyMessage msg = new ShopBuyMessage(user);
				msg.itemType=5;
				msg.defaultId=1;
				if(user.gold<100000){
					msg._amount=1;
					user.weapon[0]+=1000;
				}
				else{
					msg._amount=10;
					user.weapon[0]+=10000;
				}
				msg._currencyType=0;
				msg._currencyValue= cost;
				user.send(msg);
				
			}
		}
	}
}

class LootSort{

	private Location current;
	public  LootSort(Location startLocation) {
		current = startLocation;
	}
	
	public List<Loot> sort(List<Loot> startList) {
		if(startList.size()<2)
			return startList;
		List<Loot> endList = new ArrayList<>();
		while(startList.size()>0)
			endList.add(getNext(startList,current));
		return endList;
	}

	private Loot getNext(List<Loot> startList, Location current2) {
		if(startList.size()==1)
			return startList.remove(0);
		int index = 0;
		double dis = startList.get(0).getLocation().distanceFrom(current2);
		
		for(int i=0;i<startList.size();i++){
			Loot l = startList.get(i);
			double cDis = l.getLocation().distanceFrom(current2);
			if(cDis<dis){
				dis = cDis;
				index = i;
			}else{
		//		System.out.println("longer: "+cDis+" vs: "+dis);
			}
		}
		current= startList.get(index).getLocation();
		return startList.remove(index);
	}
	
}
