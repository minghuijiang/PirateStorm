package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildIslandCraftingOperationRequestMessage extends Message{

	public static final int id = 1328;
	public int craftingId;
	public int _operation;

	public GuildIslandCraftingOperationRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.craftingId = data.readInt();
		this._operation = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.craftingId);
		data.writeByte(this._operation);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildIslandCraftingOperationRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1507 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1328;
//
//        private var ASV2014_5881:int;
//        private var _operation:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5881 = _arg1.readInt();
//            this._operation = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5881);
//            _arg1.writeByte(this._operation);
//        }
//
//        public function get craftingId():int
//        {
//            return (this.ASV2014_5881);
//        }
//
//        public function set craftingId(_arg1:int):void
//        {
//            this.ASV2014_5881 = _arg1;
//        }
//
//        public function get operation():int
//        {
//            return (this._operation);
//        }
//
//        public function set operation(_arg1:int):void
//        {
//            this._operation = _arg1;
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
// ASV2014_1507 = "=!%" (String#12225)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5881 = "[#I" (String#4915)
//