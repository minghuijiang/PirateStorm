package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_572 extends Message{

	public static final int id = 1597;
	public MessageList ASV2014_4342;

	public ASV2014_572(User user) {
		super(user);
		ASV2014_4342 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4342.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.ASV2014_4342.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_572(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_572 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1597;
//
//        private var ASV2014_5597:ASV2014_194;
//
//        public function ASV2014_572()
//        {
//            this.ASV2014_5597 = new ASV2014_194();
//            super();
//            this.ASV2014_4342 = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5597.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_5597.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_4342():ASV2014_194
//        {
//            return (this.ASV2014_5597);
//        }
//
//        public function set ASV2014_4342(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5597 = _arg1;
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
// ASV2014_4342 = "9a" (String#17105)
// ASV2014_5597 = "]!;" (String#14110)
// ASV2014_572 = "#\"P" (String#11466)
//