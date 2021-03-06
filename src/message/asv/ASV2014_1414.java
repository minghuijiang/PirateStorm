package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1414 extends Message{

	public static final int id = 1329;
	public int _status;
	public int craftingId;

	public ASV2014_1414(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._status = data.readByte();
		this.craftingId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._status);
		data.writeInt(this.craftingId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1414(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1414 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1329;
//
//        private var _status:int;
//        private var ASV2014_5881:int;
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
//            this.ASV2014_5881 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._status);
//            _arg1.writeInt(this.ASV2014_5881);
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
//        public function get craftingId():int
//        {
//            return (this.ASV2014_5881);
//        }
//
//        public function set craftingId(_arg1:int):void
//        {
//            this.ASV2014_5881 = _arg1;
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
// ASV2014_1414 = "3!d" (String#12812)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5881 = "[#I" (String#4915)
//