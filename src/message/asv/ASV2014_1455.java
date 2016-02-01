package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1455 extends Message{

	public static final int id = 0x0600;
	public int mapAId;
	public int mapBId;

	public ASV2014_1455(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.mapAId = data.readByte();
		this.mapBId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.mapAId);
		data.writeByte(this.mapBId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1455(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1455 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0x0600;
//
//        private var ASV2014_6600:int;
//        private var ASV2014_6601:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6600 = _arg1.readByte();
//            this.ASV2014_6601 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6600);
//            _arg1.writeByte(this.ASV2014_6601);
//        }
//
//        public function get mapAId():int
//        {
//            return (this.ASV2014_6600);
//        }
//
//        public function set mapAId(_arg1:int):void
//        {
//            this.ASV2014_6600 = _arg1;
//        }
//
//        public function get mapBId():int
//        {
//            return (this.ASV2014_6601);
//        }
//
//        public function set mapBId(_arg1:int):void
//        {
//            this.ASV2014_6601 = _arg1;
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
// ASV2014_1455 = "\"h" (String#21389)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6600 = "9D" (String#8647)
// ASV2014_6601 = "7E" (String#8632)
//