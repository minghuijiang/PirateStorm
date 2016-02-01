package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_177 extends Message{

	public static final int id = 1446;
	public int tokenId;
	public int ASV2014_3902;
	public int packageSize;
	public int _currencyValue;
	public int _currencyType;
	public int itemDefaultId;
	public int itemType;
	public int _settings;
	public MessageList _stats;

	public ASV2014_177(User user) {
		super(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.tokenId = data.readByte();
		this.ASV2014_3902 = data.readInt();
		this.packageSize = data.readShort();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
		this.itemDefaultId = data.readByte();
		this.itemType = data.readByte();
		this._settings = data.readByte();
		this._stats.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.tokenId);
		data.writeInt(this.ASV2014_3902);
		data.writeShort(this.packageSize);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
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
		return new ASV2014_177(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_177 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1446;
//
//        private var ASV2014_3900:int;
//        private var ASV2014_3901:int;
//        private var ASV2014_3903:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//        private var ASV2014_2843:int;
//        private var ASV2014_2516:int;
//        private var _settings:int;
//        private var _stats:ASV2014_194;
//
//        public function ASV2014_177()
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
//            this.ASV2014_3900 = _arg1.readByte();
//            this.ASV2014_3901 = _arg1.readInt();
//            this.ASV2014_3903 = _arg1.readShort();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//            this.ASV2014_2843 = _arg1.readByte();
//            this.ASV2014_2516 = _arg1.readByte();
//            this._settings = _arg1.readByte();
//            this._stats.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3900);
//            _arg1.writeInt(this.ASV2014_3901);
//            _arg1.writeShort(this.ASV2014_3903);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this._settings);
//            this._stats.ASV2014_2336(_arg1);
//        }
//
//        public function get tokenId():int
//        {
//            return (this.ASV2014_3900);
//        }
//
//        public function set tokenId(_arg1:int):void
//        {
//            this.ASV2014_3900 = _arg1;
//        }
//
//        public function get ASV2014_3902():int
//        {
//            return (this.ASV2014_3901);
//        }
//
//        public function set ASV2014_3902(_arg1:int):void
//        {
//            this.ASV2014_3901 = _arg1;
//        }
//
//        public function get packageSize():int
//        {
//            return (this.ASV2014_3903);
//        }
//
//        public function set packageSize(_arg1:int):void
//        {
//            this.ASV2014_3903 = _arg1;
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
// ASV2014_177 = "=\"k" (String#6652)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3900 = "&^" (String#10211)
// ASV2014_3901 = "8#X" (String#10829)
// ASV2014_3902 = "`!Y" (String#14102)
// ASV2014_3903 = "6!v" (String#18302)
//