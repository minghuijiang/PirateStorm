package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildTruceCancelMessage extends Message{

	public static final int id = 0x0500;
	public int targetGuildId;

	public GuildTruceCancelMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.targetGuildId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.targetGuildId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildTruceCancelMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_832 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0x0500;
//
//        private var ASV2014_6177:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6177 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6177);
//        }
//
//        public function get targetGuildId():int
//        {
//            return (this.ASV2014_6177);
//        }
//
//        public function set targetGuildId(_arg1:int):void
//        {
//            this.ASV2014_6177 = _arg1;
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
// ASV2014_6177 = "!#A" (String#6017)
// ASV2014_832 = "6#0" (String#10283)
//