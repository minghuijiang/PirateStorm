package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1249 extends Message{

	public static final int id = 1179;
	public int ASV2014_6474;
	public MessageList _npcs;

	public ASV2014_1249(User user) {
		super(user);
		_npcs = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6474 = data.readByte();
		this._npcs.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_6474);
		this._npcs.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1249(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1249 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1179;
//
//        private var ASV2014_6473:int;
//        private var _npcs:ASV2014_194;
//
//        public function ASV2014_1249()
//        {
//            this._npcs = new ASV2014_194();
//            super();
//            this.npcs = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6473 = _arg1.readByte();
//            this._npcs.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6473);
//            this._npcs.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_6474():int
//        {
//            return (this.ASV2014_6473);
//        }
//
//        public function set ASV2014_6474(_arg1:int):void
//        {
//            this.ASV2014_6473 = _arg1;
//        }
//
//        public function get npcs():ASV2014_194
//        {
//            return (this._npcs);
//        }
//
//        public function set npcs(_arg1:ASV2014_194):void
//        {
//            this._npcs = _arg1;
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
// ASV2014_1249 = "&\"T" (String#12892)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6473 = "%Z" (String#18961)
// ASV2014_6474 = "[\"]" (String#28775)
//