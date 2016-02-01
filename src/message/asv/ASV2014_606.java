package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_606 extends Message{

	public static final int id = 1574;
	public MessageList ASV2014_4425;

	public ASV2014_606(User user) {
		super(user);
		ASV2014_4425 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4425.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.ASV2014_4425.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_606(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_606 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1574;
//
//        private var ASV2014_5691:ASV2014_194;
//
//        public function ASV2014_606()
//        {
//            this.ASV2014_5691 = new ASV2014_194();
//            super();
//            this.ASV2014_4425 = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5691.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_5691.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_4425():ASV2014_194
//        {
//            return (this.ASV2014_5691);
//        }
//
//        public function set ASV2014_4425(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5691 = _arg1;
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
// ASV2014_4425 = "8\"d" (String#16817)
// ASV2014_5691 = "-!m" (String#13879)
// ASV2014_606 = "-!U" (String#11270)
//