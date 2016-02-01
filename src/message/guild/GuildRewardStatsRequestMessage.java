package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildRewardStatsRequestMessage extends Message{

	public static final int id = 1241;
	public int valueId;
	public int targetRewardLevel;

	public GuildRewardStatsRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.valueId = data.readInt();
		this.targetRewardLevel = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.valueId);
		data.writeInt(this.targetRewardLevel);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildRewardStatsRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1473 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1241;
//
//        private var ASV2014_4223:int;
//        private var ASV2014_5661:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4223 = _arg1.readInt();
//            this.ASV2014_5661 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4223);
//            _arg1.writeInt(this.ASV2014_5661);
//        }
//
//        public function get valueId():int
//        {
//            return (this.ASV2014_4223);
//        }
//
//        public function set valueId(_arg1:int):void
//        {
//            this.ASV2014_4223 = _arg1;
//        }
//
//        public function get targetRewardLevel():int
//        {
//            return (this.ASV2014_5661);
//        }
//
//        public function set targetRewardLevel(_arg1:int):void
//        {
//            this.ASV2014_5661 = _arg1;
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
// ASV2014_1473 = "<\"g" (String#12047)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4223 = "+!P" (String#3487)
// ASV2014_5661 = "5=" (String#8277)
//