package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1217 extends Message{

	public static final int id = 1449;
	public MessageList _wonItems;

	public ASV2014_1217(User user) {
		super(user);
		_wonItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._wonItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._wonItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1217(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1217 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1449;
//
//        private var _wonItems:ASV2014_194;
//
//        public function ASV2014_1217()
//        {
//            this._wonItems = new ASV2014_194();
//            super();
//            this.wonItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._wonItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._wonItems.ASV2014_2336(_arg1);
//        }
//
//        public function get wonItems():ASV2014_194
//        {
//            return (this._wonItems);
//        }
//
//        public function set wonItems(_arg1:ASV2014_194):void
//        {
//            this._wonItems = _arg1;
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
// ASV2014_1217 = "[>" (String#12894)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//