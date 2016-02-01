package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_496 extends Message{

	public static final int id = 1494;
	public int itemType;
	public int defaultId;
	public int _amount;
	public int _currencyType;
	public int _currencyValue;
	public int _settings;

	public ASV2014_496(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this.defaultId = data.readByte();
		this._amount = data.readShort();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
		this._settings = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		data.writeByte(this.defaultId);
		data.writeShort(this._amount);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
		data.writeByte(this._settings);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_496(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_496 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1494;
//
//        private var ASV2014_2516:int;
//        private var ASV2014_4905:int;
//        private var _amount:int;
//        private var _currencyType:int;
//        private var _currencyValue:int;
//        private var _settings:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2516 = _arg1.readByte();
//            this.ASV2014_4905 = _arg1.readByte();
//            this._amount = _arg1.readShort();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._settings = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_4905);
//            _arg1.writeShort(this._amount);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeByte(this._settings);
//        }
//
//        public function get itemType():int
//        {
//            return (this.ASV2014_2516);
//        }
//
//        public function set itemType(_arg1:int):void
//        {
//            this.ASV2014_2516 = _arg1;
//        }
//
//        public function get defaultId():int
//        {
//            return (this.ASV2014_4905);
//        }
//
//        public function set defaultId(_arg1:int):void
//        {
//            this.ASV2014_4905 = _arg1;
//        }
//
//        public function get amount():int
//        {
//            return (this._amount);
//        }
//
//        public function set amount(_arg1:int):void
//        {
//            this._amount = _arg1;
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
//        public function get settings():int
//        {
//            return (this._settings);
//        }
//
//        public function set settings(_arg1:int):void
//        {
//            this._settings = _arg1;
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
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4905 = "?\"v" (String#1802)
// ASV2014_496 = " !Z" (String#10834)
//