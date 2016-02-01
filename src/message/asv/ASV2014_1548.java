package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1548 extends Message{

	public static final int id = 1055;
	public MessageList toolTips;

	public ASV2014_1548(User user) {
		super(user);
		toolTips = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.toolTips.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.toolTips.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1548(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1548 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1055;
//
//        private var ASV2014_6621:ASV2014_194;
//
//        public function ASV2014_1548()
//        {
//            this.ASV2014_6621 = new ASV2014_194();
//            super();
//            this.toolTips = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6621.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6621.ASV2014_2336(_arg1);
//        }
//
//        public function get toolTips():ASV2014_194
//        {
//            return (this.ASV2014_6621);
//        }
//
//        public function set toolTips(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6621 = _arg1;
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
// ASV2014_1548 = " !D" (String#15560)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6621 = "?!2" (String#15148)
//