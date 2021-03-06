package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1283 extends Message{

	public static final int id = 1084;
	public int _buffId;

	public ASV2014_1283(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._buffId = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._buffId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1283(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1283 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1084;
//
//        private var _buffId:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._buffId = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._buffId);
//        }
//
//        public function get buffId():int
//        {
//            return (this._buffId);
//        }
//
//        public function set buffId(_arg1:int):void
//        {
//            this._buffId = _arg1;
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
// ASV2014_1283 = "4!d" (String#8962)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//