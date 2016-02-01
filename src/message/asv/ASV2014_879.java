package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_879 extends Message{

	public static final int id = 1266;
	public int _status;
	public boolean _attack;

	public ASV2014_879(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._status = data.readByte();
		this._attack = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._status);
		data.writeBoolean(this._attack);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_879(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_879 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1266;
//
//        private var _status:int;
//        private var _attack:Boolean;
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
//            this._attack = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._status);
//            _arg1.writeBoolean(this._attack);
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
//        public function get attack():Boolean
//        {
//            return (this._attack);
//        }
//
//        public function set attack(_arg1:Boolean):void
//        {
//            this._attack = _arg1;
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
// ASV2014_879 = "9!T" (String#8893)
//