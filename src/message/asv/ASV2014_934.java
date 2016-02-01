package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_934 extends Message{

	public static final int id = 1148;
	public int ASV2014_3482;
	public int targetAmount;
	public int targetType;
	public int targetID;

	public ASV2014_934(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3482 = data.readInt();
		this.targetAmount = data.readShort();
		this.targetType = data.readByte();
		this.targetID = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3482);
		data.writeShort(this.targetAmount);
		data.writeByte(this.targetType);
		data.writeShort(this.targetID);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_934(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_934 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1148;
//
//        private var ASV2014_6271:int;
//        private var ASV2014_6276:int;
//        private var ASV2014_6286:int;
//        private var ASV2014_6287:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6271 = _arg1.readInt();
//            this.ASV2014_6276 = _arg1.readShort();
//            this.ASV2014_6286 = _arg1.readByte();
//            this.ASV2014_6287 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6271);
//            _arg1.writeShort(this.ASV2014_6276);
//            _arg1.writeByte(this.ASV2014_6286);
//            _arg1.writeShort(this.ASV2014_6287);
//        }
//
//        public function get ASV2014_3482():int
//        {
//            return (this.ASV2014_6271);
//        }
//
//        public function set ASV2014_3482(_arg1:int):void
//        {
//            this.ASV2014_6271 = _arg1;
//        }
//
//        public function get targetAmount():int
//        {
//            return (this.ASV2014_6276);
//        }
//
//        public function set targetAmount(_arg1:int):void
//        {
//            this.ASV2014_6276 = _arg1;
//        }
//
//        public function get targetType():int
//        {
//            return (this.ASV2014_6286);
//        }
//
//        public function set targetType(_arg1:int):void
//        {
//            this.ASV2014_6286 = _arg1;
//        }
//
//        public function get targetID():int
//        {
//            return (this.ASV2014_6287);
//        }
//
//        public function set targetID(_arg1:int):void
//        {
//            this.ASV2014_6287 = _arg1;
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
// ASV2014_3482 = "4#\"" (String#1396)
// ASV2014_6271 = "+\"J" (String#771)
// ASV2014_6276 = "%!N" (String#1191)
// ASV2014_6286 = "\"K" (String#16480)
// ASV2014_6287 = "4\"u" (String#16338)
// ASV2014_934 = "=\"$" (String#7608)
//