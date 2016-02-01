package message.arena;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ArenaStatus1Message extends Message{

	public static final int id = 1400;
	public int _status;

	public ArenaStatus1Message(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._status = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._status);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ArenaStatus1Message(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_999 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1400;
//
//        private var _status:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._status = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._status);
//        }
//
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
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
// ASV2014_999 = ">!T" (String#12902)
//