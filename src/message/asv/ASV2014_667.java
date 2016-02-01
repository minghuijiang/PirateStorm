package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_667 extends Message{

	public static final int id = 1518;
	public int _joker;
	public MessageList lootList;

	public ASV2014_667(User user) {
		super(user);
		lootList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._joker = data.readByte();
		this.lootList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._joker);
		this.lootList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_667(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_667 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1518;
//
//        private var _joker:int;
//        private var ASV2014_5753:ASV2014_194;
//
//        public function ASV2014_667()
//        {
//            this.ASV2014_5753 = new ASV2014_194();
//            super();
//            this.lootList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._joker = _arg1.readByte();
//            this.ASV2014_5753.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._joker);
//            this.ASV2014_5753.ASV2014_2336(_arg1);
//        }
//
//        public function get joker():int
//        {
//            return (this._joker);
//        }
//
//        public function set joker(_arg1:int):void
//        {
//            this._joker = _arg1;
//        }
//
//        public function get lootList():ASV2014_194
//        {
//            return (this.ASV2014_5753);
//        }
//
//        public function set lootList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5753 = _arg1;
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
// ASV2014_5753 = "##f" (String#14405)
// ASV2014_667 = "4\"7" (String#8679)
//