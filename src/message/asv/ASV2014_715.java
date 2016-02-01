package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_715 extends Message{

	public static final int id = 1305;
	public int constructionInstanceID;
	public int _locaId;
	public int constructionType;
	public int currentLevel;
	public int _currencyType;
	public int _currencyValue;
	public int constructionStatus;
	public MessageList dependencies;
	public int ASV2014_5842;
	public MessageList _stats;
	public boolean _locked;

	public ASV2014_715(User user) {
		super(user);
		_stats = new MessageList(user);
		dependencies = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.constructionInstanceID = data.readInt();
		this._locaId = data.readShort();
		this.constructionType = data.readByte();
		this.currentLevel = data.readByte();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
		this.constructionStatus = data.readByte();
		this.dependencies.deserialize(data);
		this.ASV2014_5842 = data.readInt();
		this._stats.deserialize(data);
		this._locked = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.constructionInstanceID);
		data.writeShort(this._locaId);
		data.writeByte(this.constructionType);
		data.writeByte(this.currentLevel);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
		data.writeByte(this.constructionStatus);
		this.dependencies.serialize(data);
		data.writeInt(this.ASV2014_5842);
		this._stats.serialize(data);
		data.writeBoolean(this._locked);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_715(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_715 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1305;
//
//        private var ASV2014_5844:int;
//        private var _locaId:int;
//        private var ASV2014_5845:int;
//        private var ASV2014_5706:int;
//        private var _currencyType:int;
//        private var _currencyValue:int;
//        private var ASV2014_5846:int;
//        private var ASV2014_5644:ASV2014_194;
//        private var ASV2014_5847:int;
//        private var _stats:ASV2014_194;
//        private var _locked:Boolean;
//
//        public function ASV2014_715()
//        {
//            this.ASV2014_5644 = new ASV2014_194();
//            this._stats = new ASV2014_194();
//            super();
//            this.dependencies = new ASV2014_194();
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
//            this.ASV2014_5844 = _arg1.readInt();
//            this._locaId = _arg1.readShort();
//            this.ASV2014_5845 = _arg1.readByte();
//            this.ASV2014_5706 = _arg1.readByte();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this.ASV2014_5846 = _arg1.readByte();
//            this.ASV2014_5644.deserialize(_arg1);
//            this.ASV2014_5847 = _arg1.readInt();
//            this._stats.deserialize(_arg1);
//            this._locked = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5844);
//            _arg1.writeShort(this._locaId);
//            _arg1.writeByte(this.ASV2014_5845);
//            _arg1.writeByte(this.ASV2014_5706);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this.ASV2014_5846);
//            this.ASV2014_5644.ASV2014_2336(_arg1);
//            _arg1.writeInt(this.ASV2014_5847);
//            this._stats.ASV2014_2336(_arg1);
//            _arg1.writeBoolean(this._locked);
//        }
//
//        public function get constructionInstanceID():int
//        {
//            return (this.ASV2014_5844);
//        }
//
//        public function set constructionInstanceID(_arg1:int):void
//        {
//            this.ASV2014_5844 = _arg1;
//        }
//
//        public function get locaId():int
//        {
//            return (this._locaId);
//        }
//
//        public function set locaId(_arg1:int):void
//        {
//            this._locaId = _arg1;
//        }
//
//        public function get constructionType():int
//        {
//            return (this.ASV2014_5845);
//        }
//
//        public function set constructionType(_arg1:int):void
//        {
//            this.ASV2014_5845 = _arg1;
//        }
//
//        public function get currentLevel():int
//        {
//            return (this.ASV2014_5706);
//        }
//
//        public function set currentLevel(_arg1:int):void
//        {
//            this.ASV2014_5706 = _arg1;
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
//        public function get constructionStatus():int
//        {
//            return (this.ASV2014_5846);
//        }
//
//        public function set constructionStatus(_arg1:int):void
//        {
//            this.ASV2014_5846 = _arg1;
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
//        public function get ASV2014_5842():int
//        {
//            return (this.ASV2014_5847);
//        }
//
//        public function set ASV2014_5842(_arg1:int):void
//        {
//            this.ASV2014_5847 = _arg1;
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
//        public function get locked():Boolean
//        {
//            return (this._locked);
//        }
//
//        public function set locked(_arg1:Boolean):void
//        {
//            this._locked = _arg1;
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
// ASV2014_5644 = "2Y" (String#2822)
// ASV2014_5706 = "]#2" (String#2737)
// ASV2014_5842 = "=#m" (String#13681)
// ASV2014_5844 = "\"&" (String#8824)
// ASV2014_5845 = "1\"V" (String#3776)
// ASV2014_5846 = " !-" (String#6578)
// ASV2014_5847 = "-#h" (String#10973)
// ASV2014_715 = ",!" (String#4100)
//