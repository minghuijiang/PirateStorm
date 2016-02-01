package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_941 extends Message{

	public static final int id = 1160;
	public int ASV2014_3482;
	public int shipDefaultId;
	public int targetAmount;

	public ASV2014_941(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3482 = data.readInt();
		this.shipDefaultId = data.readByte();
		this.targetAmount = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3482);
		data.writeByte(this.shipDefaultId);
		data.writeByte(this.targetAmount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_941(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_941 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1160;
//
//        private var ASV2014_6271:int;
//        private var ASV2014_6293:int;
//        private var ASV2014_6276:int;
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
//            this.ASV2014_6293 = _arg1.readByte();
//            this.ASV2014_6276 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6271);
//            _arg1.writeByte(this.ASV2014_6293);
//            _arg1.writeByte(this.ASV2014_6276);
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
//        public function get shipDefaultId():int
//        {
//            return (this.ASV2014_6293);
//        }
//
//        public function set shipDefaultId(_arg1:int):void
//        {
//            this.ASV2014_6293 = _arg1;
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
// ASV2014_6293 = "^d" (String#16897)
// ASV2014_941 = "[\"3" (String#7599)
//