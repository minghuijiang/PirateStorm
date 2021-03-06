package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1512 extends Message{

	public static final int id = 1590;
	public int ASV2014_4272;

	public ASV2014_1512(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4272 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.ASV2014_4272);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1512(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1512 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1590;
//
//        private var ASV2014_4269:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4269 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_4269);
//        }
//
//        public function get ASV2014_4272():int
//        {
//            return (this.ASV2014_4269);
//        }
//
//        public function set ASV2014_4272(_arg1:int):void
//        {
//            this.ASV2014_4269 = _arg1;
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
// ASV2014_1512 = "2\"m" (String#11800)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4269 = "<\"i" (String#6913)
// ASV2014_4272 = "<#K" (String#8169)
//