package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_981 extends Message{

	public static final int id = 1614;
	public int ASV2014_4339;
	public int upgradeLane;
	public MessageList upgradePath;

	public ASV2014_981(User user) {
		super(user);
		upgradePath = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4339 = data.readByte();
		this.upgradeLane = data.readByte();
		this.upgradePath.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4339);
		data.writeByte(this.upgradeLane);
		this.upgradePath.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_981(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_981 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1614;
//
//        private var ASV2014_5609:int;
//        private var ASV2014_5724:int;
//        private var ASV2014_6318:ASV2014_194;
//
//        public function ASV2014_981()
//        {
//            this.ASV2014_6318 = new ASV2014_194();
//            super();
//            this.upgradePath = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5609 = _arg1.readByte();
//            this.ASV2014_5724 = _arg1.readByte();
//            this.ASV2014_6318.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5609);
//            _arg1.writeByte(this.ASV2014_5724);
//            this.ASV2014_6318.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_4339():int
//        {
//            return (this.ASV2014_5609);
//        }
//
//        public function set ASV2014_4339(_arg1:int):void
//        {
//            this.ASV2014_5609 = _arg1;
//        }
//
//        public function get upgradeLane():int
//        {
//            return (this.ASV2014_5724);
//        }
//
//        public function set upgradeLane(_arg1:int):void
//        {
//            this.ASV2014_5724 = _arg1;
//        }
//
//        public function get upgradePath():ASV2014_194
//        {
//            return (this.ASV2014_6318);
//        }
//
//        public function set upgradePath(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6318 = _arg1;
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
// ASV2014_4339 = "9\"i" (String#3988)
// ASV2014_5609 = "+#5" (String#2370)
// ASV2014_5724 = "]!G" (String#8487)
// ASV2014_6318 = "^#p" (String#14124)
// ASV2014_981 = "+#K" (String#12924)
//