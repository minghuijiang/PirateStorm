package component;

import message.EnemyInfo;

public class Enemy extends Movable{

	public int id;
	public int currentHp;
	public int level;
	public int typeId;
	public int agg;
	public String nameString;

	public Enemy(EnemyInfo info){
		this(info.objectId, info._level, info.posX, info.posY,info.typeId,info._currentHitpoints,info.ASV2014_3031,info.displayName);
	}
	
	public Enemy(int id, int level, int x, int y, int typeId,int hp,int agg,String name) {
		this.id= id;
		this.level= level;
		this.typeId=typeId;
		location= new Location(x, y);
		stopTime=System.currentTimeMillis();
		currentHp=hp;
		this.agg=agg;
		nameString= name;
	}

	public boolean isMonster(){
		return typeId==1;
	}
	
	public String getName(){
		return nameString+" "+id;
	}
	
}
