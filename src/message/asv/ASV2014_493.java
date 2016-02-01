package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_493 extends Message{

	public static final int id = 1496;
	public int itemType;
	public int defaultId;
	public int _amount;
	public int _originalPrice;
	public int _discount;
	public int _reducedPrice;
	public int _settings;

	public ASV2014_493(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this.defaultId = data.readByte();
		this._amount = data.readShort();
		this._originalPrice = data.readInt();
		this._discount = data.readByte();
		this._reducedPrice = data.readInt();
		this._settings = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		data.writeByte(this.defaultId);
		data.writeShort(this._amount);
		data.writeInt(this._originalPrice);
		data.writeByte(this._discount);
		data.writeInt(this._reducedPrice);
		data.writeByte(this._settings);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_493(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_493 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1496;
//
//        private var ASV2014_2516:int;
//        private var ASV2014_4905:int;
//        private var _amount:int;
//        private var _originalPrice:int;
//        private var _discount:int;
//        private var _reducedPrice:int;
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
//            this._originalPrice = _arg1.readInt();
//            this._discount = _arg1.readByte();
//            this._reducedPrice = _arg1.readInt();
//            this._settings = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_4905);
//            _arg1.writeShort(this._amount);
//            _arg1.writeInt(this._originalPrice);
//            _arg1.writeByte(this._discount);
//            _arg1.writeInt(this._reducedPrice);
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
//        public function get originalPrice():int
//        {
//            return (this._originalPrice);
//        }
//
//        public function set originalPrice(_arg1:int):void
//        {
//            this._originalPrice = _arg1;
//        }
//
//        public function get discount():int
//        {
//            return (this._discount);
//        }
//
//        public function set discount(_arg1:int):void
//        {
//            this._discount = _arg1;
//        }
//
//        public function get reducedPrice():int
//        {
//            return (this._reducedPrice);
//        }
//
//        public function set reducedPrice(_arg1:int):void
//        {
//            this._reducedPrice = _arg1;
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
// ASV2014_493 = "\"\"J" (String#7422)
//