package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1520 extends Message{

	public static final int id = 1325;
	public int itemType;
	public int itemDefaultId;
	public int blueprintType;
	public int blueprintDefaultId;
	public int _currencyValue;
	public int _currencyType;
	public int _amount;
	public int _settings;
	public MessageList _stats;
	public int _requiredRaidPoints;
	public MessageList dependencies;

	public ASV2014_1520(User user) {
		super(user);
		dependencies = new MessageList(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this.itemDefaultId = data.readByte();
		this.blueprintType = data.readByte();
		this.blueprintDefaultId = data.readByte();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
		this._amount = data.readInt();
		this._settings = data.readByte();
		this._stats.deserialize(data);
		this._requiredRaidPoints = data.readInt();
		this.dependencies.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		data.writeByte(this.itemDefaultId);
		data.writeByte(this.blueprintType);
		data.writeByte(this.blueprintDefaultId);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
		data.writeInt(this._amount);
		data.writeByte(this._settings);
		this._stats.serialize(data);
		data.writeInt(this._requiredRaidPoints);
		this.dependencies.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1520(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1520 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1325;
//
//        private var ASV2014_2516:int;
//        private var ASV2014_2843:int;
//        private var ASV2014_5891:int;
//        private var ASV2014_5892:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//        private var _amount:int;
//        private var _settings:int;
//        private var _stats:ASV2014_194;
//        private var _requiredRaidPoints:int;
//        private var ASV2014_5644:ASV2014_194;
//
//        public function ASV2014_1520()
//        {
//            this._stats = new ASV2014_194();
//            this.ASV2014_5644 = new ASV2014_194();
//            super();
//            this.stats = new ASV2014_194();
//            this.dependencies = new ASV2014_194();
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
//            this.ASV2014_2843 = _arg1.readByte();
//            this.ASV2014_5891 = _arg1.readByte();
//            this.ASV2014_5892 = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//            this._amount = _arg1.readInt();
//            this._settings = _arg1.readByte();
//            this._stats.deserialize(_arg1);
//            this._requiredRaidPoints = _arg1.readInt();
//            this.ASV2014_5644.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeByte(this.ASV2014_5891);
//            _arg1.writeByte(this.ASV2014_5892);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._amount);
//            _arg1.writeByte(this._settings);
//            this._stats.ASV2014_2336(_arg1);
//            _arg1.writeInt(this._requiredRaidPoints);
//            this.ASV2014_5644.ASV2014_2336(_arg1);
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
//        public function get itemDefaultId():int
//        {
//            return (this.ASV2014_2843);
//        }
//
//        public function set itemDefaultId(_arg1:int):void
//        {
//            this.ASV2014_2843 = _arg1;
//        }
//
//        public function get blueprintType():int
//        {
//            return (this.ASV2014_5891);
//        }
//
//        public function set blueprintType(_arg1:int):void
//        {
//            this.ASV2014_5891 = _arg1;
//        }
//
//        public function get blueprintDefaultId():int
//        {
//            return (this.ASV2014_5892);
//        }
//
//        public function set blueprintDefaultId(_arg1:int):void
//        {
//            this.ASV2014_5892 = _arg1;
//        }
//
//        public function get currencyValue():int
//        {
//            return (this._currencyValue);
//        }
//
//        public function set currencyValue(_arg1:int):void
//        {
//            this._currencyValue = _arg1;
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
//        public function get amount():int
//        {
//            return (this._amount);
//        }
//
//        public function set amount(_arg1:int):void
//        {
//            this._amount = _arg1;
//        }
//
//        public function get settings():int
//        {
//            return (this._settings);
//        }
//
//        public function set settings(_arg1:int):void
//        {
//            this._settings = _arg1;
//        }
//
//        public function get stats():ASV2014_194
//        {
//            return (this._stats);
//        }
//
//        public function set stats(_arg1:ASV2014_194):void
//        {
//            this._stats = _arg1;
//        }
//
//        public function get requiredRaidPoints():int
//        {
//            return (this._requiredRaidPoints);
//        }
//
//        public function set requiredRaidPoints(_arg1:int):void
//        {
//            this._requiredRaidPoints = _arg1;
//        }
//
//        public function get dependencies():ASV2014_194
//        {
//            return (this.ASV2014_5644);
//        }
//
//        public function set dependencies(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5644 = _arg1;
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
// ASV2014_1520 = "%p" (String#6583)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5644 = "2Y" (String#2822)
// ASV2014_5891 = "`\"l" (String#6245)
// ASV2014_5892 = "&\"x" (String#6139)
//