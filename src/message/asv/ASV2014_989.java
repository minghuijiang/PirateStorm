package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_989 extends Message{

	public static final int id = 1580;
	public int eventId;
	public int ASV2014_2635;

	public ASV2014_989(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.eventId = data.readByte();
		this.ASV2014_2635 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.eventId);
		data.writeByte(this.ASV2014_2635);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_989(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_989 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1580;
//
//        private var ASV2014_3728:int;
//        private var ASV2014_3010:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3728 = _arg1.readByte();
//            this.ASV2014_3010 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3728);
//            _arg1.writeByte(this.ASV2014_3010);
//        }
//
//        public function get eventId():int
//        {
//            return (this.ASV2014_3728);
//        }
//
//        public function set eventId(_arg1:int):void
//        {
//            this.ASV2014_3728 = _arg1;
//        }
//
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_3728 = "[!_" (String#2158)
// ASV2014_989 = "=\"5" (String#12779)
//