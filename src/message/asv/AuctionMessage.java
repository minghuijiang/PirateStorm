package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class AuctionMessage extends Message{

	public static final int id = 1451;
	public int ASV2014_4442;
	public int _currentTime;
	public boolean _hasWonItems;
	public int minLevel;
	public MessageList _myRunningItems;
	public MessageList _otherRunningItems;
	public MessageList _closedItems;

	public AuctionMessage(User user) {
		super(user);
		_closedItems = new MessageList(user);
		_otherRunningItems = new MessageList(user);
		_myRunningItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4442 = data.readByte();
		this._currentTime = data.readInt();
		this._hasWonItems = data.readBoolean();
		this.minLevel = data.readByte();
		this._myRunningItems.deserialize(data);
		this._otherRunningItems.deserialize(data);
		this._closedItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4442);
		data.writeInt(this._currentTime);
		data.writeBoolean(this._hasWonItems);
		data.writeByte(this.minLevel);
		this._myRunningItems.serialize(data);
		this._otherRunningItems.serialize(data);
		this._closedItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new AuctionMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_608 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1451;
//
//        private var ASV2014_5692:int;
//        private var _currentTime:int;
//        private var _hasWonItems:Boolean;
//        private var ASV2014_4439:int;
//        private var _myRunningItems:ASV2014_194;
//        private var _otherRunningItems:ASV2014_194;
//        private var _closedItems:ASV2014_194;
//
//        public function ASV2014_608()
//        {
//            this._myRunningItems = new ASV2014_194();
//            this._otherRunningItems = new ASV2014_194();
//            this._closedItems = new ASV2014_194();
//            super();
//            this.myRunningItems = new ASV2014_194();
//            this.otherRunningItems = new ASV2014_194();
//            this.closedItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5692 = _arg1.readByte();
//            this._currentTime = _arg1.readInt();
//            this._hasWonItems = _arg1.readBoolean();
//            this.ASV2014_4439 = _arg1.readByte();
//            this._myRunningItems.deserialize(_arg1);
//            this._otherRunningItems.deserialize(_arg1);
//            this._closedItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5692);
//            _arg1.writeInt(this._currentTime);
//            _arg1.writeBoolean(this._hasWonItems);
//            _arg1.writeByte(this.ASV2014_4439);
//            this._myRunningItems.ASV2014_2336(_arg1);
//            this._otherRunningItems.ASV2014_2336(_arg1);
//            this._closedItems.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_4442():int
//        {
//            return (this.ASV2014_5692);
//        }
//
//        public function set ASV2014_4442(_arg1:int):void
//        {
//            this.ASV2014_5692 = _arg1;
//        }
//
//        public function get currentTime():int
//        {
//            return (this._currentTime);
//        }
//
//        public function set currentTime(_arg1:int):void
//        {
//            this._currentTime = _arg1;
//        }
//
//        public function get hasWonItems():Boolean
//        {
//            return (this._hasWonItems);
//        }
//
//        public function set hasWonItems(_arg1:Boolean):void
//        {
//            this._hasWonItems = _arg1;
//        }
//
//        public function get minLevel():int
//        {
//            return (this.ASV2014_4439);
//        }
//
//        public function set minLevel(_arg1:int):void
//        {
//            this.ASV2014_4439 = _arg1;
//        }
//
//        public function get myRunningItems():ASV2014_194
//        {
//            return (this._myRunningItems);
//        }
//
//        public function set myRunningItems(_arg1:ASV2014_194):void
//        {
//            this._myRunningItems = _arg1;
//        }
//
//        public function get otherRunningItems():ASV2014_194
//        {
//            return (this._otherRunningItems);
//        }
//
//        public function set otherRunningItems(_arg1:ASV2014_194):void
//        {
//            this._otherRunningItems = _arg1;
//        }
//
//        public function get closedItems():ASV2014_194
//        {
//            return (this._closedItems);
//        }
//
//        public function set closedItems(_arg1:ASV2014_194):void
//        {
//            this._closedItems = _arg1;
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
// ASV2014_4439 = "9\"E" (String#3945)
// ASV2014_4442 = "[!v" (String#6664)
// ASV2014_5692 = "#\"@" (String#4932)
// ASV2014_608 = "##+" (String#11430)
//