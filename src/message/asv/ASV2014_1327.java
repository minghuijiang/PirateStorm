package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1327 extends Message{

	public static final int id = 1564;
	public int objectId;
	public int ASV2014_3591;

	public ASV2014_1327(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_3591 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeInt(this.ASV2014_3591);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1327(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1327 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1564;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_4965:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_4965 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeInt(this.ASV2014_4965);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get ASV2014_3591():int
//        {
//            return (this.ASV2014_4965);
//        }
//
//        public function set ASV2014_3591(_arg1:int):void
//        {
//            this.ASV2014_4965 = _arg1;
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
// ASV2014_1327 = "=!Z" (String#12711)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3591 = "&#M" (String#12649)
// ASV2014_4965 = "5Z" (String#9465)
//