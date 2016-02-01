package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_947 extends Message{

	public static final int id = 1158;
	public int ASV2014_3482;
	public int ASV2014_6301;
	public int targetAmount;

	public ASV2014_947(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3482 = data.readInt();
		this.ASV2014_6301 = data.readByte();
		this.targetAmount = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3482);
		data.writeByte(this.ASV2014_6301);
		data.writeByte(this.targetAmount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_947(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_947 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1158;
//
//        private var ASV2014_6271:int;
//        private var ASV2014_6300:int;
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
//            this.ASV2014_6300 = _arg1.readByte();
//            this.ASV2014_6276 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6271);
//            _arg1.writeByte(this.ASV2014_6300);
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
//        public function get ASV2014_6301():int
//        {
//            return (this.ASV2014_6300);
//        }
//
//        public function set ASV2014_6301(_arg1:int):void
//        {
//            this.ASV2014_6300 = _arg1;
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
// ASV2014_6300 = ";\"#" (String#15842)
// ASV2014_6301 = "1Y" (String#27396)
// ASV2014_947 = "!!$" (String#7995)
//