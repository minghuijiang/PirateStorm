package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1541 extends Message{

	public static final int id = 1546;
	public int orderId;

	public ASV2014_1541(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.orderId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.orderId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1541(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1541 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1546;
//
//        private var ASV2014_5483:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5483 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5483);
//        }
//
//        public function get orderId():int
//        {
//            return (this.ASV2014_5483);
//        }
//
//        public function set orderId(_arg1:int):void
//        {
//            this.ASV2014_5483 = _arg1;
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
// ASV2014_1541 = "7#p" (String#11314)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5483 = "7\"`" (String#2479)
//