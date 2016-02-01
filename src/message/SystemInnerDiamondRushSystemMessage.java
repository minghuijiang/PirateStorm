package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerDiamondRushSystemMessage extends Message{

	public static final int id = 1339;
	public int ASV2014_3731;

	public SystemInnerDiamondRushSystemMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3731 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3731);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerDiamondRushSystemMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerDiamondRushSystemMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1339;
//
//        private var ASV2014_3936:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3936 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3936);
//        }
//
//        public function get ASV2014_3731():int
//        {
//            return (this.ASV2014_3936);
//        }
//
//        public function set ASV2014_3731(_arg1:int):void
//        {
//            this.ASV2014_3936 = _arg1;
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
// ASV2014_3731 = "^#k" (String#4208)
// ASV2014_3936 = "=K" (String#3197)
//