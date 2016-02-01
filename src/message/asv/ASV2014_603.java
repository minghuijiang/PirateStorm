package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_603 extends Message{

	public static final int id = 1119;
	public int itemType;
	public MessageList _items;
	public int ASV2014_4418;
	public int maxSlots;

	public ASV2014_603(User user) {
		super(user);
		_items = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this._items.deserialize(data);
		this.ASV2014_4418 = data.readInt();
		this.maxSlots = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		this._items.serialize(data);
		data.writeInt(this.ASV2014_4418);
		data.writeInt(this.maxSlots);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_603(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_603 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1119;
//
//        private var ASV2014_2516:int;
//        private var _items:ASV2014_194;
//        private var ASV2014_5688:int;
//        private var ASV2014_5689:int;
//
//        public function ASV2014_603()
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
//            this.ASV2014_2516 = _arg1.readByte();
//            this._items.deserialize(_arg1);
//            this.ASV2014_5688 = _arg1.readInt();
//            this.ASV2014_5689 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            this._items.ASV2014_2336(_arg1);
//            _arg1.writeInt(this.ASV2014_5688);
//            _arg1.writeInt(this.ASV2014_5689);
//        }
//
//        public function get itemType():int
//        {
//            return (this.ASV2014_2516);
//        }
//
//        public function set itemType(_arg1:int):void
//        {
//            this.ASV2014_2516 = _arg1;
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
//        public function get ASV2014_4418():int
//        {
//            return (this.ASV2014_5688);
//        }
//
//        public function set ASV2014_4418(_arg1:int):void
//        {
//            this.ASV2014_5688 = _arg1;
//        }
//
//        public function get maxSlots():int
//        {
//            return (this.ASV2014_5689);
//        }
//
//        public function set maxSlots(_arg1:int):void
//        {
//            this.ASV2014_5689 = _arg1;
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
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4418 = "`\"i" (String#25507)
// ASV2014_5688 = "?\"s" (String#18094)
// ASV2014_5689 = ";U" (String#18291)
// ASV2014_603 = "!\"i" (String#8759)
//