package message.asv;

import message.Message;

import com.mingJiang.as.ByteArray;

import component.Enemy;
import component.User;

public class EnemyStopMessage extends Message{

	public static final int id = 1076;
	public int objectId;
	public int posX;
	public int posY;

	public EnemyStopMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		if(objectId==user.userId){
			user.isMoving=false;
			user.location.setX(posX);
			user.location.setY(posY);
		}else{
		
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new EnemyStopMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1409 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1076;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get posX():int
//        {
//            return (this.ASV2014_4037);
//        }
//
//        public function set posX(_arg1:int):void
//        {
//            this.ASV2014_4037 = _arg1;
//        }
//
//        public function get posY():int
//        {
//            return (this.ASV2014_4038);
//        }
//
//        public function set posY(_arg1:int):void
//        {
//            this.ASV2014_4038 = _arg1;
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
// ASV2014_1409 = "50" (String#12511)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
//