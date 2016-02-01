package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_166 extends Message{

	public static final int id = 1415;
	public int _arenaPoints;
	public int ASV2014_3861;
	public int _currencyValue;
	public int _currencyType;
	public int _amount;
	public int itemDefaultId;
	public int itemType;
	public int _settings;
	public MessageList _stats;

	public ASV2014_166(User user) {
		super(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._arenaPoints = data.readInt();
		this.ASV2014_3861 = data.readByte();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
		this._amount = data.readInt();
		this.itemDefaultId = data.readByte();
		this.itemType = data.readByte();
		this._settings = data.readByte();
		this._stats.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this._arenaPoints);
		data.writeByte(this.ASV2014_3861);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
		data.writeInt(this._amount);
		data.writeByte(this.itemDefaultId);
		data.writeByte(this.itemType);
		data.writeByte(this._settings);
		this._stats.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_166(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_166 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1415;
//
//        private var _arenaPoints:int;
//        private var ASV2014_3860:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//        private var _amount:int;
//        private var ASV2014_2843:int;
//        private var ASV2014_2516:int;
//        private var _settings:int;
//        private var _stats:ASV2014_194;
//
//        public function ASV2014_166()
//        {
//            this._stats = new ASV2014_194();
//            super();
//            this.stats = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._arenaPoints = _arg1.readInt();
//            this.ASV2014_3860 = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//            this._amount = _arg1.readInt();
//            this.ASV2014_2843 = _arg1.readByte();
//            this.ASV2014_2516 = _arg1.readByte();
//            this._settings = _arg1.readByte();
//            this._stats.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._arenaPoints);
//            _arg1.writeByte(this.ASV2014_3860);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._amount);
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this._settings);
//            this._stats.ASV2014_2336(_arg1);
//        }
//
//        public function get arenaPoints():int
//        {
//            return (this._arenaPoints);
//        }
//
//        public function set arenaPoints(_arg1:int):void
//        {
//            this._arenaPoints = _arg1;
//        }
//
//        public function get ASV2014_3861():int
//        {
//            return (this.ASV2014_3860);
//        }
//
//        public function set ASV2014_3861(_arg1:int):void
//        {
//            this.ASV2014_3860 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_166 = "5\"R" (String#6450)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3860 = "7\"L" (String#2922)
// ASV2014_3861 = " #a" (String#4951)
//