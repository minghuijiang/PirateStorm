package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_465 extends Message{

	public static final int id = 1579;
	public int eventId;
	public int ASV2014_2635;
	public int ASV2014_3731;
	public int startDateInSeconds;
	public int _priority;
	public MessageList _items;

	public ASV2014_465(User user) {
		super(user);
		_items = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.eventId = data.readByte();
		this.ASV2014_2635 = data.readByte();
		this.ASV2014_3731 = data.readInt();
		this.startDateInSeconds = data.readInt();
		this._priority = data.readInt();
		this._items.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.eventId);
		data.writeByte(this.ASV2014_2635);
		data.writeInt(this.ASV2014_3731);
		data.writeInt(this.startDateInSeconds);
		data.writeInt(this._priority);
		this._items.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_465(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_465 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1579;
//
//        private var ASV2014_3728:int;
//        private var ASV2014_3010:int;
//        private var ASV2014_3936:int;
//        private var ASV2014_5254:int;
//        private var _priority:int;
//        private var _items:ASV2014_194;
//
//        public function ASV2014_465()
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
//            this.ASV2014_3728 = _arg1.readByte();
//            this.ASV2014_3010 = _arg1.readByte();
//            this.ASV2014_3936 = _arg1.readInt();
//            this.ASV2014_5254 = _arg1.readInt();
//            this._priority = _arg1.readInt();
//            this._items.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3728);
//            _arg1.writeByte(this.ASV2014_3010);
//            _arg1.writeInt(this.ASV2014_3936);
//            _arg1.writeInt(this.ASV2014_5254);
//            _arg1.writeInt(this._priority);
//            this._items.ASV2014_2336(_arg1);
//        }
//
//        public function get eventId():int
//        {
//            return (this.ASV2014_3728);
//        }
//
//        public function set eventId(_arg1:int):void
//        {
//            this.ASV2014_3728 = _arg1;
//        }
//
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
//        }
//
//        public function get ASV2014_3731():int
//        {
//            return (this.ASV2014_3936);
//        }
//
//        public function set ASV2014_3731(_arg1:int):void
//        {
//            this.ASV2014_3936 = _arg1;
//        }
//
//        public function get startDateInSeconds():int
//        {
//            return (this.ASV2014_5254);
//        }
//
//        public function set startDateInSeconds(_arg1:int):void
//        {
//            this.ASV2014_5254 = _arg1;
//        }
//
//        public function get priority():int
//        {
//            return (this._priority);
//        }
//
//        public function set priority(_arg1:int):void
//        {
//            this._priority = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_3728 = "[!_" (String#2158)
// ASV2014_3731 = "^#k" (String#4208)
// ASV2014_3936 = "=K" (String#3197)
// ASV2014_465 = "%\">" (String#11341)
// ASV2014_5254 = "<\"Z" (String#5411)
//