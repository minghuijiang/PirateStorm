package message;

import message.asv.PositionInfo;

import com.mingJiang.as.ByteArray;

import component.Enemy;
import component.Location;
import component.User;

public class MovePathInfo extends Message{

	public static final int id = 1014;
	public int _userId;
	public MessageList moveList;
	public int _time;

	public MovePathInfo(User user) {
		super(user);
		moveList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.moveList.deserialize(data);
		this._time = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		this.moveList.serialize(data);
		data.writeInt(this._time);
	}

	public void action(){
		if(_userId==user.userId){
		//	System.out.println(this);
			PositionInfo info =(PositionInfo) this.moveList.list.get(0);
			user.location.setX(info.posX);
			user.location.setY(info.posY);
			user.stopTime=System.currentTimeMillis()+_time;
		}else{
			Enemy e = user.enemies.get(_userId);
			if(e!=null){
				e.update(this);
			}
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new MovePathInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_961 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1014;
//
//        private var _userId:int;
//        private var ASV2014_6307:ASV2014_194;
//        private var _time:int;
//
//        public function ASV2014_961()
//        {
//            this.ASV2014_6307 = new ASV2014_194();
//            super();
//            this.moveList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this.ASV2014_6307.deserialize(_arg1);
//            this._time = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            this.ASV2014_6307.ASV2014_2336(_arg1);
//            _arg1.writeInt(this._time);
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
//        }
//
//        public function get moveList():ASV2014_194
//        {
//            return (this.ASV2014_6307);
//        }
//
//        public function set moveList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6307 = _arg1;
//        }
//
//        public function get time():int
//        {
//            return (this._time);
//        }
//
//        public function set time(_arg1:int):void
//        {
//            this._time = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6307 = "^$" (String#14308)
// ASV2014_961 = "2#9" (String#6438)
//