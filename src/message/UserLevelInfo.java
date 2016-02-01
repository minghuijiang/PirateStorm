package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class UserLevelInfo extends Message{

	public static final int id = 1137;
	public int _userId;
	public int _level;

	public UserLevelInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._level = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeShort(this._level);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new UserLevelInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_962 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1137;
//
//        private var _userId:int;
//        private var _level:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._level = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeShort(this._level);
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
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
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
// ASV2014_962 = "<#3" (String#8885)
//