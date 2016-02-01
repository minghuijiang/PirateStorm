package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;

import component.FixedObject;
import component.User;

public class WorldInfo extends Message{

	public static final int id = 1009;
	public int mapId;
	public int mapType;
	public int maxX;
	public int maxY;
	public MessageList contentList;

	public WorldInfo(User user) {
		super(user);
		contentList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.mapId = data.readShort();
		this.mapType = data.readByte();
		this.maxX = data.readShort();
		this.maxY = data.readShort();
		this.contentList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this.mapId);
		data.writeByte(this.mapType);
		data.writeShort(this.maxX);
		data.writeShort(this.maxY);
		this.contentList.serialize(data);
	}

	public void action(){
		for(Message msg: contentList.list){
	//		user.world.addStaticObject(new FixedObject((StaticObjectMessage) msg));
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new WorldInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_985 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1009;
//
//        private var ASV2014_2515:int;
//        private var ASV2014_6321:int;
//        private var ASV2014_6322:int;
//        private var ASV2014_6323:int;
//        private var ASV2014_6324:ASV2014_194;
//
//        public function ASV2014_985()
//        {
//            this.ASV2014_6324 = new ASV2014_194();
//            super();
//            this.contentList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2515 = _arg1.readShort();
//            this.ASV2014_6321 = _arg1.readByte();
//            this.ASV2014_6322 = _arg1.readShort();
//            this.ASV2014_6323 = _arg1.readShort();
//            this.ASV2014_6324.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_2515);
//            _arg1.writeByte(this.ASV2014_6321);
//            _arg1.writeShort(this.ASV2014_6322);
//            _arg1.writeShort(this.ASV2014_6323);
//            this.ASV2014_6324.ASV2014_2336(_arg1);
//        }
//
//        public function get mapId():int
//        {
//            return (this.ASV2014_2515);
//        }
//
//        public function set mapId(_arg1:int):void
//        {
//            this.ASV2014_2515 = _arg1;
//        }
//
//        public function get mapType():int
//        {
//            return (this.ASV2014_6321);
//        }
//
//        public function set mapType(_arg1:int):void
//        {
//            this.ASV2014_6321 = _arg1;
//        }
//
//        public function get ASV2014_1967():int
//        {
//            return (this.ASV2014_6322);
//        }
//
//        public function set ASV2014_1967(_arg1:int):void
//        {
//            this.ASV2014_6322 = _arg1;
//        }
//
//        public function get ASV2014_5329():int
//        {
//            return (this.ASV2014_6323);
//        }
//
//        public function set ASV2014_5329(_arg1:int):void
//        {
//            this.ASV2014_6323 = _arg1;
//        }
//
//        public function get contentList():ASV2014_194
//        {
//            return (this.ASV2014_6324);
//        }
//
//        public function set contentList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6324 = _arg1;
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
// ASV2014_1967 = "0" (String#1392)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2515 = ",!8" (String#2039)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5329 = "3#e" (String#18911)
// ASV2014_6321 = ",\"Y" (String#17755)
// ASV2014_6322 = "2\"[" (String#16435)
// ASV2014_6323 = "&N" (String#15691)
// ASV2014_6324 = "'\"K" (String#13665)
// ASV2014_985 = "33" (String#6851)
//