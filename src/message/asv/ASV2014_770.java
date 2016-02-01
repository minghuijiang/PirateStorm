package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_770 extends Message{

	public static final int id = 1052;
	public int _functionId;
	public int _key;

	public ASV2014_770(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._functionId = data.readByte();
		this._key = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._functionId);
		data.writeByte(this._key);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_770(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_770 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1052;
//
//        private var _functionId:int;
//        private var _key:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._functionId = _arg1.readByte();
//            this._key = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._functionId);
//            _arg1.writeByte(this._key);
//        }
//
//        public function get functionId():int
//        {
//            return (this._functionId);
//        }
//
//        public function set functionId(_arg1:int):void
//        {
//            this._functionId = _arg1;
//        }
//
//        public function get key():int
//        {
//            return (this._key);
//        }
//
//        public function set key(_arg1:int):void
//        {
//            this._key = _arg1;
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
// ASV2014_770 = "9i" (String#8323)
//