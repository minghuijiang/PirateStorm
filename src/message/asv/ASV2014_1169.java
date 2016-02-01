package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1169 extends Message{

	public static final int id = 1607;
	public int ASV2014_4344;
	public int _currencyType;
	public int _currencyValue;

	public ASV2014_1169(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4344 = data.readByte();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4344);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1169(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1169 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1607;
//
//        private var ASV2014_5595:int;
//        private var _currencyType:int;
//        private var _currencyValue:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5595 = _arg1.readByte();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5595);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//        }
//
//        public function get ASV2014_4344():int
//        {
//            return (this.ASV2014_5595);
//        }
//
//        public function set ASV2014_4344(_arg1:int):void
//        {
//            this.ASV2014_5595 = _arg1;
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
//        public function get currencyValue():int
//        {
//            return (this._currencyValue);
//        }
//
//        public function set currencyValue(_arg1:int):void
//        {
//            this._currencyValue = _arg1;
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
// ASV2014_1169 = "4#?" (String#10160)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4344 = "[#_" (String#2805)
// ASV2014_5595 = "3!9" (String#2009)
//