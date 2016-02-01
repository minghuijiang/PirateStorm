package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ShopBuyShipMessage extends Message{

	public static final int id = 1111;
	public int _itemId;
	public boolean moveEquipment;
	public int _currencyType;
	public int _currencyValue;

	public ShopBuyShipMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._itemId = data.readByte();
		this.moveEquipment = data.readBoolean();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._itemId);
		data.writeBoolean(this.moveEquipment);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ShopBuyShipMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_757 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1111;
//
//        private var _itemId:int;
//        private var ASV2014_5725:Boolean;
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
//            this._itemId = _arg1.readByte();
//            this.ASV2014_5725 = _arg1.readBoolean();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._itemId);
//            _arg1.writeBoolean(this.ASV2014_5725);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//        }
//
//        public function get itemId():int
//        {
//            return (this._itemId);
//        }
//
//        public function set itemId(_arg1:int):void
//        {
//            this._itemId = _arg1;
//        }
//
//        public function get moveEquipment():Boolean
//        {
//            return (this.ASV2014_5725);
//        }
//
//        public function set moveEquipment(_arg1:Boolean):void
//        {
//            this.ASV2014_5725 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5725 = " #i" (String#4544)
// ASV2014_757 = "-O" (String#12344)
//