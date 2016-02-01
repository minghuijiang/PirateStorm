package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1388 extends Message{

	public static final int id = 1098;
	public int groupUserId;

	public ASV2014_1388(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.groupUserId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.groupUserId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1388(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1388 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1098;
//
//        private var ASV2014_6056:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6056 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6056);
//        }
//
//        public function get groupUserId():int
//        {
//            return (this.ASV2014_6056);
//        }
//
//        public function set groupUserId(_arg1:int):void
//        {
//            this.ASV2014_6056 = _arg1;
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
// ASV2014_1388 = "5Y" (String#12932)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6056 = "`\"a" (String#3421)
//