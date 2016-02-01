package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class StatusRequestMessage extends Message{

	public static final int id = 1309;
	public int constuctionID;
	public int constructionStatus;

	public StatusRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.constuctionID = data.readInt();
		this.constructionStatus = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.constuctionID);
		data.writeByte(this.constructionStatus);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new StatusRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1488 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1309;
//
//        private var ASV2014_6605:int;
//        private var ASV2014_5846:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6605 = _arg1.readInt();
//            this.ASV2014_5846 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6605);
//            _arg1.writeByte(this.ASV2014_5846);
//        }
//
//        public function get constuctionID():int
//        {
//            return (this.ASV2014_6605);
//        }
//
//        public function set constuctionID(_arg1:int):void
//        {
//            this.ASV2014_6605 = _arg1;
//        }
//
//        public function get constructionStatus():int
//        {
//            return (this.ASV2014_5846);
//        }
//
//        public function set constructionStatus(_arg1:int):void
//        {
//            this.ASV2014_5846 = _arg1;
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
// ASV2014_1488 = "1V" (String#11981)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5846 = " !-" (String#6578)
// ASV2014_6605 = "39" (String#16810)
//