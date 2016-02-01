package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_540 extends Message{

	public static final int id = 1021;
	public int ASV2014_4253;

	public ASV2014_540(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4253 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.ASV2014_4253);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_540(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_540 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1021;
//
//        private var ASV2014_5512:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5512 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_5512);
//        }
//
//        public function get ASV2014_4253():int
//        {
//            return (this.ASV2014_5512);
//        }
//
//        public function set ASV2014_4253(_arg1:int):void
//        {
//            this.ASV2014_5512 = _arg1;
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
// ASV2014_4253 = "+#N" (String#5263)
// ASV2014_540 = "[!9" (String#6435)
// ASV2014_5512 = "8#J" (String#5711)
//