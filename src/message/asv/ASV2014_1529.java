package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1529 extends Message{

	public static final int id = 1031;
	public int typeId;
	public int ASV2014_2635;

	public ASV2014_1529(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.typeId = data.readByte();
		this.ASV2014_2635 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.typeId);
		data.writeByte(this.ASV2014_2635);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1529(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1529 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1031;
//
//        private var ASV2014_5424:int;
//        private var ASV2014_3010:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5424 = _arg1.readByte();
//            this.ASV2014_3010 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5424);
//            _arg1.writeByte(this.ASV2014_3010);
//        }
//
//        public function get typeId():int
//        {
//            return (this.ASV2014_5424);
//        }
//
//        public function set typeId(_arg1:int):void
//        {
//            this.ASV2014_5424 = _arg1;
//        }
//
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
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
// ASV2014_1529 = ";\"N" (String#14422)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_5424 = "3h" (String#3435)
//