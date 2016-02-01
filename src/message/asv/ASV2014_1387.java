package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1387 extends Message{

	public static final int id = 1565;
	public int tutorialType;
	public int ASV2014_6443;
	public int ASV2014_6444;

	public ASV2014_1387(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.tutorialType = data.readByte();
		this.ASV2014_6443 = data.readShort();
		this.ASV2014_6444 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.tutorialType);
		data.writeShort(this.ASV2014_6443);
		data.writeShort(this.ASV2014_6444);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1387(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1387 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1565;
//
//        private var ASV2014_5519:int;
//        private var ASV2014_6549:int;
//        private var ASV2014_6550:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5519 = _arg1.readByte();
//            this.ASV2014_6549 = _arg1.readShort();
//            this.ASV2014_6550 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5519);
//            _arg1.writeShort(this.ASV2014_6549);
//            _arg1.writeShort(this.ASV2014_6550);
//        }
//
//        public function get tutorialType():int
//        {
//            return (this.ASV2014_5519);
//        }
//
//        public function set tutorialType(_arg1:int):void
//        {
//            this.ASV2014_5519 = _arg1;
//        }
//
//        public function get ASV2014_6443():int
//        {
//            return (this.ASV2014_6549);
//        }
//
//        public function set ASV2014_6443(_arg1:int):void
//        {
//            this.ASV2014_6549 = _arg1;
//        }
//
//        public function get ASV2014_6444():int
//        {
//            return (this.ASV2014_6550);
//        }
//
//        public function set ASV2014_6444(_arg1:int):void
//        {
//            this.ASV2014_6550 = _arg1;
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
// ASV2014_1387 = "^\"b" (String#12861)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5519 = ",O" (String#1982)
// ASV2014_6443 = "\"#o" (String#27107)
// ASV2014_6444 = "+#u" (String#24526)
// ASV2014_6549 = "7#a" (String#15828)
// ASV2014_6550 = "2!g" (String#16474)
//