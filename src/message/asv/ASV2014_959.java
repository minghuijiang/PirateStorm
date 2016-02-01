package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_959 extends Message{

	public static final int id = 1568;
	public int packageId;
	public int offerId;
	public MessageList _items;
	public int _endTimeSec;

	public ASV2014_959(User user) {
		super(user);
		_items = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.packageId = data.readByte();
		this.offerId = data.readByte();
		this._items.deserialize(data);
		this._endTimeSec = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.packageId);
		data.writeByte(this.offerId);
		this._items.serialize(data);
		data.writeInt(this._endTimeSec);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_959(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_959 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1568;
//
//        private var ASV2014_3438:int;
//        private var ASV2014_3439:int;
//        private var _items:ASV2014_194;
//        private var _endTimeSec:int;
//
//        public function ASV2014_959()
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
//            this.ASV2014_3438 = _arg1.readByte();
//            this.ASV2014_3439 = _arg1.readByte();
//            this._items.deserialize(_arg1);
//            this._endTimeSec = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3438);
//            _arg1.writeByte(this.ASV2014_3439);
//            this._items.ASV2014_2336(_arg1);
//            _arg1.writeInt(this._endTimeSec);
//        }
//
//        public function get packageId():int
//        {
//            return (this.ASV2014_3438);
//        }
//
//        public function set packageId(_arg1:int):void
//        {
//            this.ASV2014_3438 = _arg1;
//        }
//
//        public function get offerId():int
//        {
//            return (this.ASV2014_3439);
//        }
//
//        public function set offerId(_arg1:int):void
//        {
//            this.ASV2014_3439 = _arg1;
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
//        public function get endTimeSec():int
//        {
//            return (this._endTimeSec);
//        }
//
//        public function set endTimeSec(_arg1:int):void
//        {
//            this._endTimeSec = _arg1;
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
// ASV2014_3438 = "2#[" (String#5772)
// ASV2014_3439 = "+6" (String#4881)
// ASV2014_959 = "=\"=" (String#12697)
//