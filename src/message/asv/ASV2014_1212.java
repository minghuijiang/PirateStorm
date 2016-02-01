package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1212 extends Message{

	public static final int id = 1071;
	public int choosenCurrency;
	public int repairIntervalMs;

	public ASV2014_1212(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.choosenCurrency = data.readByte();
		this.repairIntervalMs = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.choosenCurrency);
		data.writeShort(this.repairIntervalMs);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1212(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1212 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1071;
//
//        private var ASV2014_5510:int;
//        private var ASV2014_6456:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5510 = _arg1.readByte();
//            this.ASV2014_6456 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5510);
//            _arg1.writeShort(this.ASV2014_6456);
//        }
//
//        public function get choosenCurrency():int
//        {
//            return (this.ASV2014_5510);
//        }
//
//        public function set choosenCurrency(_arg1:int):void
//        {
//            this.ASV2014_5510 = _arg1;
//        }
//
//        public function get repairIntervalMs():int
//        {
//            return (this.ASV2014_6456);
//        }
//
//        public function set repairIntervalMs(_arg1:int):void
//        {
//            this.ASV2014_6456 = _arg1;
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
// ASV2014_1212 = "&5" (String#12079)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5510 = "+\"Y" (String#8929)
// ASV2014_6456 = "4x" (String#16430)
//