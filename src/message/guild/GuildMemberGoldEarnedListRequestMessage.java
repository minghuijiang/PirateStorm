package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildMemberGoldEarnedListRequestMessage extends Message{

	public static final int id = 1293;
	public int ASV2014_2747;

	public GuildMemberGoldEarnedListRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2747 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_2747);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildMemberGoldEarnedListRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_865 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1293;
//
//        private var ASV2014_3845:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3845 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3845);
//        }
//
//        public function get ASV2014_2747():int
//        {
//            return (this.ASV2014_3845);
//        }
//
//        public function set ASV2014_2747(_arg1:int):void
//        {
//            this.ASV2014_3845 = _arg1;
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
// ASV2014_2747 = "=x" (String#2620)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3845 = "@\"O" (String#1779)
// ASV2014_865 = "9\"<" (String#11318)
//