package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1025 extends Message{

	public static final int id = 1557;
	public int step;
	public int ASV2014_6004;
	public int tutorialType;

	public ASV2014_1025(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.step = data.readByte();
		this.ASV2014_6004 = data.readByte();
		this.tutorialType = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.step);
		data.writeByte(this.ASV2014_6004);
		data.writeByte(this.tutorialType);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1025(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1025 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1557;
//
//        private var ASV2014_6350:int;
//        private var ASV2014_6351:int;
//        private var ASV2014_5519:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6350 = _arg1.readByte();
//            this.ASV2014_6351 = _arg1.readByte();
//            this.ASV2014_5519 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6350);
//            _arg1.writeByte(this.ASV2014_6351);
//            _arg1.writeByte(this.ASV2014_5519);
//        }
//
//        public function get step():int
//        {
//            return (this.ASV2014_6350);
//        }
//
//        public function set step(_arg1:int):void
//        {
//            this.ASV2014_6350 = _arg1;
//        }
//
//        public function get ASV2014_6004():int
//        {
//            return (this.ASV2014_6351);
//        }
//
//        public function set ASV2014_6004(_arg1:int):void
//        {
//            this.ASV2014_6351 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1025 = "4!g" (String#12941)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5519 = ",O" (String#1982)
// ASV2014_6004 = "0\"l" (String#10684)
// ASV2014_6350 = ";\"1" (String#8996)
// ASV2014_6351 = "\"!W" (String#8845)
//