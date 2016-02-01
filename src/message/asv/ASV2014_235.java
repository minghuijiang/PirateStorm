package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_235 extends Message{

	public static final int id = 1576;
	public int itemSetId;
	public int itemSetBuffConfigId;
	public int itemSetBuffLevel;
	public int itemSetItemAmount;
	public MessageList itemSetStats;

	public ASV2014_235(User user) {
		super(user);
		itemSetStats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.itemSetId = data.readByte();
		this.itemSetBuffConfigId = data.readShort();
		this.itemSetBuffLevel = data.readByte();
		this.itemSetItemAmount = data.readByte();
		this.itemSetStats.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemSetId);
		data.writeShort(this.itemSetBuffConfigId);
		data.writeByte(this.itemSetBuffLevel);
		data.writeByte(this.itemSetItemAmount);
		this.itemSetStats.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_235(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_235 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1576;
//
//        private var ASV2014_4218:int;
//        private var ASV2014_4219:int;
//        private var ASV2014_4220:int;
//        private var ASV2014_4221:int;
//        private var ASV2014_4222:ASV2014_194;
//
//        public function ASV2014_235()
//        {
//            this.ASV2014_4222 = new ASV2014_194();
//            super();
//            this.itemSetStats = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4218 = _arg1.readByte();
//            this.ASV2014_4219 = _arg1.readShort();
//            this.ASV2014_4220 = _arg1.readByte();
//            this.ASV2014_4221 = _arg1.readByte();
//            this.ASV2014_4222.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4218);
//            _arg1.writeShort(this.ASV2014_4219);
//            _arg1.writeByte(this.ASV2014_4220);
//            _arg1.writeByte(this.ASV2014_4221);
//            this.ASV2014_4222.ASV2014_2336(_arg1);
//        }
//
//        public function get itemSetId():int
//        {
//            return (this.ASV2014_4218);
//        }
//
//        public function set itemSetId(_arg1:int):void
//        {
//            this.ASV2014_4218 = _arg1;
//        }
//
//        public function get itemSetBuffConfigId():int
//        {
//            return (this.ASV2014_4219);
//        }
//
//        public function set itemSetBuffConfigId(_arg1:int):void
//        {
//            this.ASV2014_4219 = _arg1;
//        }
//
//        public function get itemSetBuffLevel():int
//        {
//            return (this.ASV2014_4220);
//        }
//
//        public function set itemSetBuffLevel(_arg1:int):void
//        {
//            this.ASV2014_4220 = _arg1;
//        }
//
//        public function get itemSetItemAmount():int
//        {
//            return (this.ASV2014_4221);
//        }
//
//        public function set itemSetItemAmount(_arg1:int):void
//        {
//            this.ASV2014_4221 = _arg1;
//        }
//
//        public function get itemSetStats():ASV2014_194
//        {
//            return (this.ASV2014_4222);
//        }
//
//        public function set itemSetStats(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_4222 = _arg1;
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
// ASV2014_235 = "3#7" (String#8417)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4218 = "<#4" (String#17891)
// ASV2014_4219 = "4\"\"" (String#16156)
// ASV2014_4220 = "^\"4" (String#16343)
// ASV2014_4221 = "%\"E" (String#17503)
// ASV2014_4222 = "2#m" (String#14681)
//