package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1405 extends Message{

	public static final int id = 1503;
	public MessageList offerList;

	public ASV2014_1405(User user) {
		super(user);
		offerList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.offerList.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.offerList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1405(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1405 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1503;
//
//        private var ASV2014_6564:ASV2014_194;
//
//        public function ASV2014_1405()
//        {
//            this.ASV2014_6564 = new ASV2014_194();
//            super();
//            this.offerList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6564.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6564.ASV2014_2336(_arg1);
//        }
//
//        public function get offerList():ASV2014_194
//        {
//            return (this.ASV2014_6564);
//        }
//
//        public function set offerList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6564 = _arg1;
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
// ASV2014_1405 = ",!`" (String#12338)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6564 = "<+" (String#14276)
//