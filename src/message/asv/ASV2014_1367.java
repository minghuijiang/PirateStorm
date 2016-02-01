package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1367 extends Message{

	public static final int id = 1413;
	public MessageList groups;

	public ASV2014_1367(User user) {
		super(user);
		groups = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.groups.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.groups.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1367(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1367 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1413;
//
//        private var ASV2014_6541:ASV2014_194;
//
//        public function ASV2014_1367()
//        {
//            this.ASV2014_6541 = new ASV2014_194();
//            super();
//            this.groups = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6541.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6541.ASV2014_2336(_arg1);
//        }
//
//        public function get groups():ASV2014_194
//        {
//            return (this.ASV2014_6541);
//        }
//
//        public function set groups(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6541 = _arg1;
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
// ASV2014_1367 = ">!J" (String#13109)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6541 = "3\"R" (String#14699)
//