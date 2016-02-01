package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class AutoLogoutMessage extends Message{

	public static final int id = 1061;
	public int logoutSeconds;

	public AutoLogoutMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.logoutSeconds = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.logoutSeconds);
	}

	public void action(){
		user.send(new CancelLogoutMessage(user));
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new AutoLogoutMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1262 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1061;
//
//        private var ASV2014_6481:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6481 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_6481);
//        }
//
//        public function get logoutSeconds():int
//        {
//            return (this.ASV2014_6481);
//        }
//
//        public function set logoutSeconds(_arg1:int):void
//        {
//            this.ASV2014_6481 = _arg1;
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
// ASV2014_1262 = "5\"u" (String#13486)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6481 = "]!B" (String#16612)
//