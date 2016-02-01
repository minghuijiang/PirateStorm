package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_967 extends Message{

	public static final int id = 1402;
	public int _status;
	public int _teamId;
	public int _currencyValue;
	public int _currencyType;

	public ASV2014_967(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._status = data.readByte();
		this._teamId = data.readInt();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._status);
		data.writeInt(this._teamId);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_967(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_967 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1402;
//
//        private var _status:int;
//        private var _teamId:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._status = _arg1.readByte();
//            this._teamId = _arg1.readInt();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._status);
//            _arg1.writeInt(this._teamId);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//        }
//
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
//        }
//
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
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
// ASV2014_967 = "[\"e" (String#12009)
//