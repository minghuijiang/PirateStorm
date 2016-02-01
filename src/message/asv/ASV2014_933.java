package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_933 extends Message{

	public static final int id = 1155;
	public int ASV2014_3482;
	public int _currencyType;
	public int currencyAmount;

	public ASV2014_933(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3482 = data.readInt();
		this._currencyType = data.readByte();
		this.currencyAmount = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3482);
		data.writeByte(this._currencyType);
		data.writeInt(this.currencyAmount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_933(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_933 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1155;
//
//        private var ASV2014_6271:int;
//        private var _currencyType:int;
//        private var ASV2014_5405:int;
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
//            this._currencyType = _arg1.readByte();
//            this.ASV2014_5405 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6271);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this.ASV2014_5405);
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
//        public function get currencyType():int
//        {
//            return (this._currencyType);
//        }
//
//        public function set currencyType(_arg1:int):void
//        {
//            this._currencyType = _arg1;
//        }
//
//        public function get currencyAmount():int
//        {
//            return (this.ASV2014_5405);
//        }
//
//        public function set currencyAmount(_arg1:int):void
//        {
//            this.ASV2014_5405 = _arg1;
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
// ASV2014_5405 = "`!2" (String#3927)
// ASV2014_6271 = "+\"J" (String#771)
// ASV2014_933 = "40" (String#7550)
//