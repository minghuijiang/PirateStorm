package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1073 extends Message{

	public static final int id = 1358;
	public MessageList types;

	public ASV2014_1073(User user) {
		super(user);
		types = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.types.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.types.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1073(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1073 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1358;
//
//        private var ASV2014_5792:ASV2014_194;
//
//        public function ASV2014_1073()
//        {
//            this.ASV2014_5792 = new ASV2014_194();
//            super();
//            this.types = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5792.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_5792.ASV2014_2336(_arg1);
//        }
//
//        public function get types():ASV2014_194
//        {
//            return (this.ASV2014_5792);
//        }
//
//        public function set types(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5792 = _arg1;
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
// ASV2014_1073 = "+!q" (String#12855)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5792 = "8t" (String#4844)
//