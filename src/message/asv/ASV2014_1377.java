package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1377 extends Message{

	public static final int id = 1081;
	public int objectId;
	public int ASV2014_3034;

	public ASV2014_1377(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_3034 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeByte(this.ASV2014_3034);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1377(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1377 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1081;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_3787:int;
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
//            this.ASV2014_3787 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeByte(this.ASV2014_3787);
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
//        public function get ASV2014_3034():int
//        {
//            return (this.ASV2014_3787);
//        }
//
//        public function set ASV2014_3034(_arg1:int):void
//        {
//            this.ASV2014_3787 = _arg1;
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
// ASV2014_1377 = "`\"C" (String#12696)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3034 = "&2" (String#3230)
// ASV2014_3787 = "3!Y" (String#6529)
//