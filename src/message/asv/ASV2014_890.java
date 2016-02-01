package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_890 extends Message{

	public static final int id = 1113;
	public int itemDefaultId;
	public int _currencyValue;
	public int _currencyType;
	public int state;
	public int _level;

	public ASV2014_890(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.itemDefaultId = data.readByte();
		this._currencyValue = data.readInt();
		this._currencyType = data.readByte();
		this.state = data.readByte();
		this._level = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemDefaultId);
		data.writeInt(this._currencyValue);
		data.writeByte(this._currencyType);
		data.writeByte(this.state);
		data.writeShort(this._level);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_890(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_890 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1113;
//
//        private var ASV2014_2843:int;
//        private var _currencyValue:int;
//        private var _currencyType:int;
//        private var ASV2014_6210:int;
//        private var _level:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2843 = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._currencyType = _arg1.readByte();
//            this.ASV2014_6210 = _arg1.readByte();
//            this._level = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeByte(this.ASV2014_6210);
//            _arg1.writeShort(this._level);
//        }
//
//        public function get itemDefaultId():int
//        {
//            return (this.ASV2014_2843);
//        }
//
//        public function set itemDefaultId(_arg1:int):void
//        {
//            this.ASV2014_2843 = _arg1;
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
//        public function get state():int
//        {
//            return (this.ASV2014_6210);
//        }
//
//        public function set state(_arg1:int):void
//        {
//            this.ASV2014_6210 = _arg1;
//        }
//
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
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
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6210 = ",!T" (String#18035)
// ASV2014_890 = "+!d" (String#12958)
//