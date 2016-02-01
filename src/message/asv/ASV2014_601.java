package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_601 extends Message{

	public static final int id = 1545;
	public int orderId;
	public int orderLevel;
	public boolean _unlocked;
	public int _currencyType;
	public int _currencyValue;
	public MessageList _stats;
	public int _currentCooldown;
	public int _cooldown;
	public int nextUnlockPlayerLevel;
	public MessageList nextStats;
	public int discountPercentage;

	public ASV2014_601(User user) {
		super(user);
		nextStats = new MessageList(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.orderId = data.readInt();
		this.orderLevel = data.readInt();
		this._unlocked = data.readBoolean();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
		this._stats.deserialize(data);
		this._currentCooldown = data.readInt();
		this._cooldown = data.readInt();
		this.nextUnlockPlayerLevel = data.readInt();
		this.nextStats.deserialize(data);
		this.discountPercentage = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.orderId);
		data.writeInt(this.orderLevel);
		data.writeBoolean(this._unlocked);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
		this._stats.serialize(data);
		data.writeInt(this._currentCooldown);
		data.writeInt(this._cooldown);
		data.writeInt(this.nextUnlockPlayerLevel);
		this.nextStats.serialize(data);
		data.writeByte(this.discountPercentage);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_601(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_601 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1545;
//
//        private var ASV2014_5483:int;
//        private var ASV2014_5685:int;
//        private var _unlocked:Boolean;
//        private var _currencyType:int;
//        private var _currencyValue:int;
//        private var _stats:ASV2014_194;
//        private var _currentCooldown:int;
//        private var _cooldown:int;
//        private var ASV2014_5686:int;
//        private var ASV2014_5687:ASV2014_194;
//        private var ASV2014_4225:int;
//
//        public function ASV2014_601()
//        {
//            this._stats = new ASV2014_194();
//            this.ASV2014_5687 = new ASV2014_194();
//            super();
//            this.stats = new ASV2014_194();
//            this.nextStats = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5483 = _arg1.readInt();
//            this.ASV2014_5685 = _arg1.readInt();
//            this._unlocked = _arg1.readBoolean();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._stats.deserialize(_arg1);
//            this._currentCooldown = _arg1.readInt();
//            this._cooldown = _arg1.readInt();
//            this.ASV2014_5686 = _arg1.readInt();
//            this.ASV2014_5687.deserialize(_arg1);
//            this.ASV2014_4225 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5483);
//            _arg1.writeInt(this.ASV2014_5685);
//            _arg1.writeBoolean(this._unlocked);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//            this._stats.ASV2014_2336(_arg1);
//            _arg1.writeInt(this._currentCooldown);
//            _arg1.writeInt(this._cooldown);
//            _arg1.writeInt(this.ASV2014_5686);
//            this.ASV2014_5687.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_4225);
//        }
//
//        public function get orderId():int
//        {
//            return (this.ASV2014_5483);
//        }
//
//        public function set orderId(_arg1:int):void
//        {
//            this.ASV2014_5483 = _arg1;
//        }
//
//        public function get orderLevel():int
//        {
//            return (this.ASV2014_5685);
//        }
//
//        public function set orderLevel(_arg1:int):void
//        {
//            this.ASV2014_5685 = _arg1;
//        }
//
//        public function get unlocked():Boolean
//        {
//            return (this._unlocked);
//        }
//
//        public function set unlocked(_arg1:Boolean):void
//        {
//            this._unlocked = _arg1;
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
//        public function get currentCooldown():int
//        {
//            return (this._currentCooldown);
//        }
//
//        public function set currentCooldown(_arg1:int):void
//        {
//            this._currentCooldown = _arg1;
//        }
//
//        public function get cooldown():int
//        {
//            return (this._cooldown);
//        }
//
//        public function set cooldown(_arg1:int):void
//        {
//            this._cooldown = _arg1;
//        }
//
//        public function get nextUnlockPlayerLevel():int
//        {
//            return (this.ASV2014_5686);
//        }
//
//        public function set nextUnlockPlayerLevel(_arg1:int):void
//        {
//            this.ASV2014_5686 = _arg1;
//        }
//
//        public function get nextStats():ASV2014_194
//        {
//            return (this.ASV2014_5687);
//        }
//
//        public function set nextStats(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5687 = _arg1;
//        }
//
//        public function get discountPercentage():int
//        {
//            return (this.ASV2014_4225);
//        }
//
//        public function set discountPercentage(_arg1:int):void
//        {
//            this.ASV2014_4225 = _arg1;
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
// ASV2014_4225 = "8\"D" (String#6840)
// ASV2014_5483 = "7\"`" (String#2479)
// ASV2014_5685 = "?\"#" (String#11548)
// ASV2014_5686 = " #7" (String#10808)
// ASV2014_5687 = "+Y" (String#8175)
// ASV2014_601 = "]\"o" (String#4474)
//