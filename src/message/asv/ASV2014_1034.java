package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1034 extends Message{

	public static final int id = 1526;
	public MessageList ASV2014_6375;

	public ASV2014_1034(User user) {
		super(user);
		ASV2014_6375 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6375.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.ASV2014_6375.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1034(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1034 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1526;
//
//        private var ASV2014_6374:ASV2014_194;
//
//        public function ASV2014_1034()
//        {
//            this.ASV2014_6374 = new ASV2014_194();
//            super();
//            this.ASV2014_6375 = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6374.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6374.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_6375():ASV2014_194
//        {
//            return (this.ASV2014_6374);
//        }
//
//        public function set ASV2014_6375(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6374 = _arg1;
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
// ASV2014_1034 = ";\"," (String#13280)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6374 = "%#'" (String#14517)
// ASV2014_6375 = "3!J" (String#21916)
//