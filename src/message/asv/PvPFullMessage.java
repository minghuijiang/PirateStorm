package message.asv;

import message.BattlegroundInfoRequestMessage;
import message.Message;

import com.mingJiang.as.ByteArray;

import component.User;

public class PvPFullMessage extends Message{

	public static final int id = 1362;
	public int _type;

	public PvPFullMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
	}

	public void action(){
		if(_type==9)
			user.send(new BattlegroundInfoRequestMessage(user));
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new PvPFullMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1391 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1362;
//
//        private var _type:int;
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
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1391 = " #'" (String#12768)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//