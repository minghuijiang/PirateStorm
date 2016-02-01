package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_65 extends Message{

	public static final int id = 1167;
	public int _locaId;
	public int _livesLeft;
	public MessageList _lostItems;

	public ASV2014_65(User user) {
		super(user);
		_lostItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._locaId = data.readInt();
		this._livesLeft = data.readByte();
		this._lostItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this._locaId);
		data.writeByte(this._livesLeft);
		this._lostItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_65(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_65 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1167;
//
//        private var _locaId:int;
//        private var _livesLeft:int;
//        private var _lostItems:ASV2014_194;
//
//        public function ASV2014_65()
//        {
//            this._lostItems = new ASV2014_194();
//            super();
//            this.lostItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._locaId = _arg1.readInt();
//            this._livesLeft = _arg1.readByte();
//            this._lostItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._locaId);
//            _arg1.writeByte(this._livesLeft);
//            this._lostItems.ASV2014_2336(_arg1);
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
//        public function get livesLeft():int
//        {
//            return (this._livesLeft);
//        }
//
//        public function set livesLeft(_arg1:int):void
//        {
//            this._livesLeft = _arg1;
//        }
//
//        public function get lostItems():ASV2014_194
//        {
//            return (this._lostItems);
//        }
//
//        public function set lostItems(_arg1:ASV2014_194):void
//        {
//            this._lostItems = _arg1;
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
// ASV2014_65 = "[!z" (String#8086)
//