package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_483 extends Message{

	public static final int id = 1120;
	public int itemDefaultId;
	public int itemLevel;
	public int _amount;
	public MessageList _stats;
	public int _settings;

	public ASV2014_483(User user) {
		super(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.itemDefaultId = data.readByte();
		this.itemLevel = data.readByte();
		this._amount = data.readInt();
		this._stats.deserialize(data);
		this._settings = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemDefaultId);
		data.writeByte(this.itemLevel);
		data.writeInt(this._amount);
		this._stats.serialize(data);
		data.writeByte(this._settings);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_483(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_483 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1120;
//
//        private var ASV2014_2843:int;
//        private var ASV2014_2844:int;
//        private var _amount:int;
//        private var _stats:ASV2014_194;
//        private var _settings:int;
//
//        public function ASV2014_483()
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
//            this.ASV2014_2843 = _arg1.readByte();
//            this.ASV2014_2844 = _arg1.readByte();
//            this._amount = _arg1.readInt();
//            this._stats.deserialize(_arg1);
//            this._settings = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeByte(this.ASV2014_2844);
//            _arg1.writeInt(this._amount);
//            this._stats.ASV2014_2336(_arg1);
//            _arg1.writeByte(this._settings);
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
//        public function get itemLevel():int
//        {
//            return (this.ASV2014_2844);
//        }
//
//        public function set itemLevel(_arg1:int):void
//        {
//            this.ASV2014_2844 = _arg1;
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
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_2844 = "0!H" (String#1902)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_483 = "\"#S" (String#9044)
//