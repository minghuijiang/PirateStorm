package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class ElseLoginMessage extends Message{

	public static final int id = 1062;

	public ElseLoginMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
	}

	public void serialize(ByteArray data){
	}

	public void action(){
		user.socket.isConnected=false;
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ElseLoginMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_31 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1062;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
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
// ASV2014_31 = "@#q" (String#12631)
//