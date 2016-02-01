package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1478 extends Message{

	public static final int id = 1101;
	public int inviteeId;

	public ASV2014_1478(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.inviteeId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.inviteeId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1478(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1478 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1101;
//
//        private var ASV2014_5248:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5248 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5248);
//        }
//
//        public function get inviteeId():int
//        {
//            return (this.ASV2014_5248);
//        }
//
//        public function set inviteeId(_arg1:int):void
//        {
//            this.ASV2014_5248 = _arg1;
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
// ASV2014_1478 = "`!l" (String#22096)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5248 = "2!]" (String#8158)
//