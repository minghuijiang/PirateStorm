package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1304 extends Message{

	public static final int id = 1323;
	public int ASV2014_5899;
	public MessageList buildList;
	public MessageList blueprintList;

	public ASV2014_1304(User user) {
		super(user);
		blueprintList = new MessageList(user);
		buildList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_5899 = data.readByte();
		this.buildList.deserialize(data);
		this.blueprintList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_5899);
		this.buildList.serialize(data);
		this.blueprintList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1304(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1304 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1323;
//
//        private var ASV2014_6508:int;
//        private var ASV2014_6509:ASV2014_194;
//        private var ASV2014_6510:ASV2014_194;
//
//        public function ASV2014_1304()
//        {
//            this.ASV2014_6509 = new ASV2014_194();
//            this.ASV2014_6510 = new ASV2014_194();
//            super();
//            this.buildList = new ASV2014_194();
//            this.blueprintList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6508 = _arg1.readByte();
//            this.ASV2014_6509.deserialize(_arg1);
//            this.ASV2014_6510.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6508);
//            this.ASV2014_6509.ASV2014_2336(_arg1);
//            this.ASV2014_6510.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_5899():int
//        {
//            return (this.ASV2014_6508);
//        }
//
//        public function set ASV2014_5899(_arg1:int):void
//        {
//            this.ASV2014_6508 = _arg1;
//        }
//
//        public function get buildList():ASV2014_194
//        {
//            return (this.ASV2014_6509);
//        }
//
//        public function set buildList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6509 = _arg1;
//        }
//
//        public function get blueprintList():ASV2014_194
//        {
//            return (this.ASV2014_6510);
//        }
//
//        public function set blueprintList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6510 = _arg1;
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
// ASV2014_1304 = "2\"+" (String#8950)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5899 = "#2" (String#24459)
// ASV2014_6508 = "2#t" (String#15705)
// ASV2014_6509 = "7!n" (String#15151)
// ASV2014_6510 = "^#\"" (String#13982)
//