package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildIslandNPCInfoDetailRequestMessage extends Message{

	public static final int id = 1277;
	public int ASV2014_3361;

	public GuildIslandNPCInfoDetailRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3361 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_3361);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildIslandNPCInfoDetailRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_847 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1277;
//
//        private var ASV2014_4570:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4570 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4570);
//        }
//
//        public function get ASV2014_3361():int
//        {
//            return (this.ASV2014_4570);
//        }
//
//        public function set ASV2014_3361(_arg1:int):void
//        {
//            this.ASV2014_4570 = _arg1;
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
// ASV2014_3361 = "&h" (String#5281)
// ASV2014_4570 = "\"#q" (String#3188)
// ASV2014_847 = "-!e" (String#11142)
//