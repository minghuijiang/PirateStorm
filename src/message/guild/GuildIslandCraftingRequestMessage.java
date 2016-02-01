package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildIslandCraftingRequestMessage extends Message{

	public static final int id = 1326;
	public int blueprintType;
	public int blueprintDefaultId;

	public GuildIslandCraftingRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.blueprintType = data.readByte();
		this.blueprintDefaultId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.blueprintType);
		data.writeByte(this.blueprintDefaultId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildIslandCraftingRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1446 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1326;
//
//        private var ASV2014_5891:int;
//        private var ASV2014_5892:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5891 = _arg1.readByte();
//            this.ASV2014_5892 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5891);
//            _arg1.writeByte(this.ASV2014_5892);
//        }
//
//        public function get blueprintType():int
//        {
//            return (this.ASV2014_5891);
//        }
//
//        public function set blueprintType(_arg1:int):void
//        {
//            this.ASV2014_5891 = _arg1;
//        }
//
//        public function get blueprintDefaultId():int
//        {
//            return (this.ASV2014_5892);
//        }
//
//        public function set blueprintDefaultId(_arg1:int):void
//        {
//            this.ASV2014_5892 = _arg1;
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
// ASV2014_1446 = "0#8" (String#12706)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5891 = "`\"l" (String#6245)
// ASV2014_5892 = "&\"x" (String#6139)
//