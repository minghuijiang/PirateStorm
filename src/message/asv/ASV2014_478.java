package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_478 extends Message{

	public static final int id = 1392;
	public int _type;
	public int _currencyValue;
	public int _currencyType;
	public int minLevel;
	public int teamCreationDelay;

	public ASV2014_478(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
		this.minLevel = data.readByte();
		this.teamCreationDelay = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
		data.writeByte(this.minLevel);
		data.writeInt(this.teamCreationDelay);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_478(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_478 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1392;
//
//        private var _type:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//        private var ASV2014_4439:int;
//        private var ASV2014_5322:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//            this.ASV2014_4439 = _arg1.readByte();
//            this.ASV2014_5322 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeByte(this.ASV2014_4439);
//            _arg1.writeInt(this.ASV2014_5322);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
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
//        public function get minLevel():int
//        {
//            return (this.ASV2014_4439);
//        }
//
//        public function set minLevel(_arg1:int):void
//        {
//            this.ASV2014_4439 = _arg1;
//        }
//
//        public function get teamCreationDelay():int
//        {
//            return (this.ASV2014_5322);
//        }
//
//        public function set teamCreationDelay(_arg1:int):void
//        {
//            this.ASV2014_5322 = _arg1;
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
// ASV2014_4439 = "9\"E" (String#3945)
// ASV2014_478 = "6#@" (String#9682)
// ASV2014_5322 = "4!m" (String#9398)
//