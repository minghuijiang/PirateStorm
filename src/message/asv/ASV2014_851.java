package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_851 extends Message{

	public static final int id = 1275;
	public MessageList _result;

	public ASV2014_851(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._result.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._result.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_851(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_851 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1275;
//
//        private var _result:ASV2014_194;
//
//        public function ASV2014_851()
//        {
//            this._result = new ASV2014_194();
//            super();
//            this.result = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._result.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._result.ASV2014_2336(_arg1);
//        }
//
//        public function get result():ASV2014_194
//        {
//            return (this._result);
//        }
//
//        public function set result(_arg1:ASV2014_194):void
//        {
//            this._result = _arg1;
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
// ASV2014_851 = "2j" (String#8788)
//