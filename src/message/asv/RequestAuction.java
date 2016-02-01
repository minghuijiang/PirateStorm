package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class RequestAuction extends Message{

	public static final int id = 1450;
	public int ASV2014_4442=2;

	public RequestAuction(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4442 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4442);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new RequestAuction(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_642 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1450;
//
//        private var ASV2014_5692:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5692 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5692);
//        }
//
//        public function get ASV2014_4442():int
//        {
//            return (this.ASV2014_5692);
//        }
//
//        public function set ASV2014_4442(_arg1:int):void
//        {
//            this.ASV2014_5692 = _arg1;
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
// ASV2014_4442 = "[!v" (String#6664)
// ASV2014_5692 = "#\"@" (String#4932)
// ASV2014_642 = "7#t" (String#11054)
//