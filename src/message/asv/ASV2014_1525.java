package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1525 extends Message{

	public static final int id = 1086;
	public int morale;
	public int lootShare;
	public MessageList pirates;
	public MessageList specialists;

	public ASV2014_1525(User user) {
		super(user);
		specialists = new MessageList(user);
		pirates = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.morale = data.readShort();
		this.lootShare = data.readByte();
		this.pirates.deserialize(data);
		this.specialists.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this.morale);
		data.writeByte(this.lootShare);
		this.pirates.serialize(data);
		this.specialists.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1525(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1525 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1086;
//
//        private var ASV2014_6482:int;
//        private var ASV2014_6483:int;
//        private var ASV2014_6617:ASV2014_194;
//        private var ASV2014_6618:ASV2014_194;
//
//        public function ASV2014_1525()
//        {
//            this.ASV2014_6617 = new ASV2014_194();
//            this.ASV2014_6618 = new ASV2014_194();
//            super();
//            this.pirates = new ASV2014_194();
//            this.specialists = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6482 = _arg1.readShort();
//            this.ASV2014_6483 = _arg1.readByte();
//            this.ASV2014_6617.deserialize(_arg1);
//            this.ASV2014_6618.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_6482);
//            _arg1.writeByte(this.ASV2014_6483);
//            this.ASV2014_6617.ASV2014_2336(_arg1);
//            this.ASV2014_6618.ASV2014_2336(_arg1);
//        }
//
//        public function get morale():int
//        {
//            return (this.ASV2014_6482);
//        }
//
//        public function set morale(_arg1:int):void
//        {
//            this.ASV2014_6482 = _arg1;
//        }
//
//        public function get lootShare():int
//        {
//            return (this.ASV2014_6483);
//        }
//
//        public function set lootShare(_arg1:int):void
//        {
//            this.ASV2014_6483 = _arg1;
//        }
//
//        public function get pirates():ASV2014_194
//        {
//            return (this.ASV2014_6617);
//        }
//
//        public function set pirates(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6617 = _arg1;
//        }
//
//        public function get specialists():ASV2014_194
//        {
//            return (this.ASV2014_6618);
//        }
//
//        public function set specialists(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6618 = _arg1;
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
// ASV2014_1525 = "3\"l" (String#15797)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6482 = "0!4" (String#9041)
// ASV2014_6483 = "`!p" (String#5850)
// ASV2014_6617 = "+!," (String#13972)
// ASV2014_6618 = "-#T" (String#13947)
//