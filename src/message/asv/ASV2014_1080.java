package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1080 extends Message{

	public static final int id = 1391;
	public int seasonStatus;

	public ASV2014_1080(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.seasonStatus = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.seasonStatus);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1080(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1080 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1391;
//
//        private var ASV2014_3840:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3840 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3840);
//        }
//
//        public function get seasonStatus():int
//        {
//            return (this.ASV2014_3840);
//        }
//
//        public function set seasonStatus(_arg1:int):void
//        {
//            this.ASV2014_3840 = _arg1;
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
// ASV2014_1080 = "^K" (String#13265)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3840 = "[!P" (String#6486)
//