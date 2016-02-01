package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerMonsterHuntSystemMessage extends Message{

	public static final int id = 1592;
	public int eventId;
	public int ASV2014_3731;

	public SystemInnerMonsterHuntSystemMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.eventId = data.readShort();
		this.ASV2014_3731 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.eventId);
		data.writeInt(this.ASV2014_3731);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerMonsterHuntSystemMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerMonsterHuntSystemMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1592;
//
//        private var ASV2014_3728:int;
//        private var ASV2014_3936:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3728 = _arg1.readShort();
//            this.ASV2014_3936 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_3728);
//            _arg1.writeInt(this.ASV2014_3936);
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
//        public function get ASV2014_3731():int
//        {
//            return (this.ASV2014_3936);
//        }
//
//        public function set ASV2014_3731(_arg1:int):void
//        {
//            this.ASV2014_3936 = _arg1;
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
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3728 = "[!_" (String#2158)
// ASV2014_3731 = "^#k" (String#4208)
// ASV2014_3936 = "=K" (String#3197)
//