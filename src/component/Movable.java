package component;

import java.util.ArrayList;
import java.util.List;

import message.Message;
import message.MovePathInfo;
import message.asv.PositionInfo;

import com.mingJiang.data.Pair;

public class Movable {

	protected List<Pair<Location, Double>> dist;
	protected boolean isParsed;
	protected long stopTime;
	protected int needTime;
	protected Location location;
	protected double speed;
	protected final Object lock = new Object();
	public Movable(){
		dist = new ArrayList<>();
		isParsed = false;
		stopTime = System.currentTimeMillis();
		needTime = 0;
		location = new Location(0, 0);
		speed=0;
	}
	
	public void update(MovePathInfo info){
		synchronized (lock) {
		//	System.out.println(info);
			setTime(info._time);
			setPath(info.moveList.list);
		}
	}
	
	private void setPath(List<Message> locations){
		dist.clear();
		isParsed= false;
		for(Message l: locations){
			if(l instanceof PositionInfo){
				dist.add(new Pair<Location, Double>(new Location(((PositionInfo) l).posX, ((PositionInfo) l).posY), 0.0));
			}

		}
	}
	
	private void setTime(int timeNeed){
		needTime = timeNeed;
		stopTime = System.currentTimeMillis()+needTime;
	}
	
	private void calculateDistance(){
		if(isParsed)
			return ;
		double totalDistance=0;
		for(int i=0;i<dist.size()-1;i++){
			Location current = dist.get(i).getKey();
			Location next = dist.get(i+1).getKey();
			double distance = current.distanceFrom(next);
			totalDistance+=distance;
			dist.get(i).setObj(distance);
			//System.out.println(current+"  to  "+next+"  dis: "+distance);
		}
		speed = (double)totalDistance/needTime;
		isParsed=true;
	//	System.out.println("Need: "+needTime+"  speed: "+speed+"  dis:"+dist.size());
	}
	
	public Location currentLocation(){
		synchronized (lock) {
			calculateDistance();
			int elapse = (int) (needTime-(stopTime-System.currentTimeMillis()));
			if(elapse<100) // approximation
				return location;
			if(elapse>=needTime-50){
				needTime=0;
				if(dist.size()==0)
					return location;
				return dist.get(dist.size()-1).getKey();
			}
	//		System.out.println("need: "+needTime+"  elapse: "+elapse);
			needTime-=elapse;
			double move = (elapse*speed);
			while(move>2){
			//	System.out.println("e: "+move +"  "+dist.get(0));
				Pair<Location, Double> tmp = dist.get(0);
				if(tmp.getObj()>move){
					tmp.setObj(tmp.getObj()-move);
					break;
				}else{
					move-=tmp.getObj();
					dist.remove(0);
				}
			}
			Location l = dist.get(0).getKey().deepInto(dist.get(1).getKey(), (int)(move));
			location.setX(l.getX());
			location.setY(l.getY());
			return location;
		}
		

	}
}
