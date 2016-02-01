package message.asv;

import message.ActivateCaptainsOrderMessage;
import message.AttackMessage;
import message.MatchInvitationReplyMessage;
import message.MatchUserReadyMessage;
import message.Message;
import message.SelectEnemyMessage;

import com.mingJiang.as.ByteArray;

import component.Enemy;
import component.Location;
import component.User;

public class ASV2014_987 extends Message{

	public static final int id = 1352;
	public int _type;
	public int _countdown;


	public ASV2014_987(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._countdown = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeByte(this._countdown);
	}

	public void action(){
		new Thread(){
			public void run(){
				try {
					if(_type<4&&_type>0){
						
			//		Thread.sleep((_countdown-9)*1000);
					if(user.userId==631522)
						Thread.sleep(5000);
					user.isArena=true;
					}
					if(_type==9){
						user.isArena=false;
						user.isBG=true;
					//	Thread.sleep((_countdown-5)*1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				{
					user.enemies.clear();
					if(_type<4&&_type>0&&!user.isBG){
						user.isArena=true;
						user.send(new MatchInvitationReplyMessage(user,_type));
						doArena();
					}else if(_type==9){
						user.isBG= true;
						user.isArena=false;
						user.send(new MatchInvitationReplyMessage(user,9));
						doBG();
					}
				}
			}
		}.start();
		
	}

	private void doBG() {
	
				user.setMsg("Start battleGround: ");
				user.departure();
				new Thread(){
					public void run(){
						while(user.isBG&&user.isAlive){
							int lowHp = 2000;
							int id = 0;
							if(!user.isCoolDown(7)){
								try{
								for(Enemy e: user.getAllEnemies()){
									if(e.agg==2&&e.currentHp<=1700){
										if(e.currentHp<lowHp){
											id= e.id;
											lowHp = e.currentHp;
										}
										
									}
								}
								}catch(Exception e){
									
								}
							}
							if(id!=0){
								{
									user.setMsg("Send rocket: "+id+"  "+lowHp);
									user.send(new SelectEnemyMessage(user,id));
									user.send(new AttackMessage(user));
									user.useItem(7);
								}
							}
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}.start();
				int c=0;
				while(user.isBG&&user.isAlive){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
					if(user.stopTime<=System.currentTimeMillis()){
						Location targetLocation = nextLocation();
						if(c++%10==0)
							user.moveTo(targetLocation);
					}
					
//					if(user.isCoolDown(7)||user.isCoolDown(1)){
//						
//					}else {
//						user.useItem(1);
//					}

					
				//	}else
					try{
					for(Enemy e: user.getAllEnemies()){
						if(e.id>1000000000&&e.currentHp>0)
							user.fight(e);
						else if(e.agg==2&&e.currentHp>0){
							user.useSkill(e.id);
							user.fight(e);
						}

					}}catch(Exception ee){}
				}
			//	user.send(new MatchUserReadyMessage(null,9));
				user.setMsg("End battleground: ");
			//	}
	
	}

	private void doArena() {
				
				user.setMsg("Start Arena:  "+_type);
				user.departure();
				user.moveTo(user.location);
		
				int c = 0;
				while(user.isAlive&&user.isArena){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
					//if(c++<100)
			
					
					try{
						if(!user.enemies.containsKey(631522)){
							if(user.stopTime<=System.currentTimeMillis()){
								if(c++%10==0){
									Location targetLocation = nextLocation();
									user.moveTo(targetLocation);
								}
							}
							
							for(Enemy e: user.getAllEnemies()){
								if(e.agg==2){
									user.setMsg("Attack Arena: "+e.id);
									user.useSkill(e.id);
									user.fight(e);
								}
							}
						}
						else{
							if(c++==0)
								user.moveTo(user.enemies.get(631522).currentLocation());
						}
					}catch(Exception e){
						
					}
				}
				
				user.setMsg("End Arena:  ");
			//	user.send(new MatchUserReadyMessage(null,1));

		
	}
	
	public Location nextLocation(){
		locationCount++;
		if(locationCount>=locs.length)
			locationCount=0;
		return locs[locationCount];
	}
	public int locationCount= 0;
	public static Location[] locs = {
		new Location(1000, 1000),new Location(3000, 1000),
		new Location(1000, 3000),new Location(3000, 3000)
	};
	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_987(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_987 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1352;
//
//        private var _type:int;
//        private var _countdown:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this._countdown = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this._countdown);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
//        }
//
//        public function get countdown():int
//        {
//            return (this._countdown);
//        }
//
//        public function set countdown(_arg1:int):void
//        {
//            this._countdown = _arg1;
//        }
//
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_987 = "9#!" (String#12022)
//