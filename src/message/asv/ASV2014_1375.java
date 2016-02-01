package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1375 extends Message{

	public static final int id = 1397;
	public int _teamId;
	public String teamName;
	public int _currentRank;
	public int _maxRank;
	public MessageList _members;
	public int freeSlots;
	public int maxSlotAmount;
	public int currencyAmount;
	public int _currencyType;

	public ASV2014_1375(User user) {
		super(user);
		_members = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readInt();
		this.teamName = data.readUTF();
		this._currentRank = data.readInt();
		this._maxRank = data.readInt();
		this._members.deserialize(data);
		this.freeSlots = data.readByte();
		this.maxSlotAmount = data.readByte();
		this.currencyAmount = data.readInt();
		this._currencyType = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._teamId);
		data.writeUTF(this.teamName);
		data.writeInt(this._currentRank);
		data.writeInt(this._maxRank);
		this._members.serialize(data);
		data.writeByte(this.freeSlots);
		data.writeByte(this.maxSlotAmount);
		data.writeInt(this.currencyAmount);
		data.writeByte(this._currencyType);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1375(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1375 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1397;
//
//        private var _teamId:int;
//        private var ASV2014_2887:String;
//        private var _currentRank:int;
//        private var _maxRank:int;
//        private var _members:ASV2014_194;
//        private var ASV2014_3857:int;
//        private var ASV2014_6547:int;
//        private var ASV2014_5405:int;
//        private var _currencyType:int;
//
//        public function ASV2014_1375()
//        {
//            this._members = new ASV2014_194();
//            super();
//            this.teamName = "";
//            this.members = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._teamId = _arg1.readInt();
//            this.ASV2014_2887 = _arg1.readUTF();
//            this._currentRank = _arg1.readInt();
//            this._maxRank = _arg1.readInt();
//            this._members.deserialize(_arg1);
//            this.ASV2014_3857 = _arg1.readByte();
//            this.ASV2014_6547 = _arg1.readByte();
//            this.ASV2014_5405 = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this.ASV2014_2887);
//            _arg1.writeInt(this._currentRank);
//            _arg1.writeInt(this._maxRank);
//            this._members.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_3857);
//            _arg1.writeByte(this.ASV2014_6547);
//            _arg1.writeInt(this.ASV2014_5405);
//            _arg1.writeByte(this._currencyType);
//        }
//
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
//        }
//
//        public function get teamName():String
//        {
//            return (this.ASV2014_2887);
//        }
//
//        public function set teamName(_arg1:String):void
//        {
//            this.ASV2014_2887 = _arg1;
//        }
//
//        public function get currentRank():int
//        {
//            return (this._currentRank);
//        }
//
//        public function set currentRank(_arg1:int):void
//        {
//            this._currentRank = _arg1;
//        }
//
//        public function get maxRank():int
//        {
//            return (this._maxRank);
//        }
//
//        public function set maxRank(_arg1:int):void
//        {
//            this._maxRank = _arg1;
//        }
//
//        public function get members():ASV2014_194
//        {
//            return (this._members);
//        }
//
//        public function set members(_arg1:ASV2014_194):void
//        {
//            this._members = _arg1;
//        }
//
//        public function get freeSlots():int
//        {
//            return (this.ASV2014_3857);
//        }
//
//        public function set freeSlots(_arg1:int):void
//        {
//            this.ASV2014_3857 = _arg1;
//        }
//
//        public function get maxSlotAmount():int
//        {
//            return (this.ASV2014_6547);
//        }
//
//        public function set maxSlotAmount(_arg1:int):void
//        {
//            this.ASV2014_6547 = _arg1;
//        }
//
//        public function get currencyAmount():int
//        {
//            return (this.ASV2014_5405);
//        }
//
//        public function set currencyAmount(_arg1:int):void
//        {
//            this.ASV2014_5405 = _arg1;
//        }
//
//        public function get currencyType():int
//        {
//            return (this._currencyType);
//        }
//
//        public function set currencyType(_arg1:int):void
//        {
//            this._currencyType = _arg1;
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
// ASV2014_1375 = "2#<" (String#12648)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2887 = "!#w" (String#4128)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3857 = "7!k" (String#5709)
// ASV2014_5405 = "`!2" (String#3927)
// ASV2014_6547 = "#! " (String#17374)
//