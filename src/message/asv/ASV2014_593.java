package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_593 extends Message{

	public static final int id = 1242;
	public int targetRewardLevel;
	public MessageList ASV2014_4375;

	public ASV2014_593(User user) {
		super(user);
		ASV2014_4375 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.targetRewardLevel = data.readInt();
		this.ASV2014_4375.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.targetRewardLevel);
		this.ASV2014_4375.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_593(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_593 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1242;
//
//        private var ASV2014_5661:int;
//        private var ASV2014_5662:ASV2014_194;
//
//        public function ASV2014_593()
//        {
//            this.ASV2014_5662 = new ASV2014_194();
//            super();
//            this.ASV2014_4375 = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5661 = _arg1.readInt();
//            this.ASV2014_5662.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5661);
//            this.ASV2014_5662.ASV2014_2336(_arg1);
//        }
//
//        public function get targetRewardLevel():int
//        {
//            return (this.ASV2014_5661);
//        }
//
//        public function set targetRewardLevel(_arg1:int):void
//        {
//            this.ASV2014_5661 = _arg1;
//        }
//
//        public function get ASV2014_4375():ASV2014_194
//        {
//            return (this.ASV2014_5662);
//        }
//
//        public function set ASV2014_4375(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5662 = _arg1;
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
// ASV2014_4375 = "9\"-" (String#19935)
// ASV2014_5661 = "5=" (String#8277)
// ASV2014_5662 = "^#K" (String#14022)
// ASV2014_593 = "@#_" (String#10810)
//