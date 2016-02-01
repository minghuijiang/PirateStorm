package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_734 extends Message{

	public static final int id = 1439;
	public MessageList _list;

	public ASV2014_734(User user) {
		super(user);
		_list = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._list.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._list.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_734(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_734 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1439;
//
//        private var _list:ASV2014_194;
//
//        public function ASV2014_734()
//        {
//            this._list = new ASV2014_194();
//            super();
//            this.list = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._list.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._list.ASV2014_2336(_arg1);
//        }
//
//        public function get list():ASV2014_194
//        {
//            return (this._list);
//        }
//
//        public function set list(_arg1:ASV2014_194):void
//        {
//            this._list = _arg1;
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
// ASV2014_734 = "8#2" (String#7376)
//