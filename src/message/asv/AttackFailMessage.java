package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class AttackFailMessage extends Message{

	public static final int id = 1023;
	public int _reason;

	public AttackFailMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._reason = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._reason);
	}

	public void action(){
		user.log("AttackFail:  "+_reason);
//		if(_reason==1){
//			user.isTooFar= true;
//		}else{
//			user.isTooFar= false;
//		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new AttackFailMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_535 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1023;
//
//        private var _reason:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._reason = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._reason);
//        }
//
//        public function get reason():int
//        {
//            return (this._reason);
//        }
//
//        public function set reason(_arg1:int):void
//        {
//            this._reason = _arg1;
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
// ASV2014_535 = "^\"6" (String#9876)
//