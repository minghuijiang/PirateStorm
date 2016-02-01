package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_702 extends Message{

	public static final int id = 1184;
	public int shipyardSlotCount;
	public int shipyardSlotCosts;
	public int shipyardSlotCurrency;

	public ASV2014_702(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.shipyardSlotCount = data.readByte();
		this.shipyardSlotCosts = data.readInt();
		this.shipyardSlotCurrency = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.shipyardSlotCount);
		data.writeInt(this.shipyardSlotCosts);
		data.writeByte(this.shipyardSlotCurrency);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_702(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_702 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1184;
//
//        private var ASV2014_1968:int;
//        private var ASV2014_5825:int;
//        private var ASV2014_5826:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_1968 = _arg1.readByte();
//            this.ASV2014_5825 = _arg1.readInt();
//            this.ASV2014_5826 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_1968);
//            _arg1.writeInt(this.ASV2014_5825);
//            _arg1.writeByte(this.ASV2014_5826);
//        }
//
//        public function get shipyardSlotCount():int
//        {
//            return (this.ASV2014_1968);
//        }
//
//        public function set shipyardSlotCount(_arg1:int):void
//        {
//            this.ASV2014_1968 = _arg1;
//        }
//
//        public function get shipyardSlotCosts():int
//        {
//            return (this.ASV2014_5825);
//        }
//
//        public function set shipyardSlotCosts(_arg1:int):void
//        {
//            this.ASV2014_5825 = _arg1;
//        }
//
//        public function get shipyardSlotCurrency():int
//        {
//            return (this.ASV2014_5826);
//        }
//
//        public function set shipyardSlotCurrency(_arg1:int):void
//        {
//            this.ASV2014_5826 = _arg1;
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
// ASV2014_1968 = "%" (String#3474)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5825 = "7" (String#17788)
// ASV2014_5826 = "[\"V" (String#18744)
// ASV2014_702 = "\"\";" (String#9685)
//