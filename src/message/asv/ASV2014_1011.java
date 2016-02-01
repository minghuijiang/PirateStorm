package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1011 extends Message{

	public static final int id = 1552;
	public MessageList _items;

	public ASV2014_1011(User user) {
		super(user);
		_items = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._items.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._items.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1011(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1011 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1552;
//
//        private var _items:ASV2014_194;
//
//        public function ASV2014_1011()
//        {
//            this._items = new ASV2014_194();
//            super();
//            this.items = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._items.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._items.ASV2014_2336(_arg1);
//        }
//
//        public function get items():ASV2014_194
//        {
//            return (this._items);
//        }
//
//        public function set items(_arg1:ASV2014_194):void
//        {
//            this._items = _arg1;
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
// ASV2014_1011 = "`#Y" (String#10868)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//