package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1280 extends Message{

	public static final int id = 1267;
	public int ASV2014_6316;

	public ASV2014_1280(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6316 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_6316);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1280(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1280 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1267;
//
//        private var ASV2014_6500:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6500 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6500);
//        }
//
//        public function get ASV2014_6316():int
//        {
//            return (this.ASV2014_6500);
//        }
//
//        public function set ASV2014_6316(_arg1:int):void
//        {
//            this.ASV2014_6500 = _arg1;
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
// ASV2014_1280 = "9\"n" (String#11967)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6316 = "-\"7" (String#13911)
// ASV2014_6500 = "96" (String#8322)
//