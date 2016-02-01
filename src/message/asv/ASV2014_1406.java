package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1406 extends Message{

	public static final int id = 1164;
	public int typeId;
	public int _itemId;
	public int _amount;

	public ASV2014_1406(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.typeId = data.readByte();
		this._itemId = data.readByte();
		this._amount = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.typeId);
		data.writeByte(this._itemId);
		data.writeShort(this._amount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1406(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1406 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1164;
//
//        private var ASV2014_5424:int;
//        private var _itemId:int;
//        private var _amount:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5424 = _arg1.readByte();
//            this._itemId = _arg1.readByte();
//            this._amount = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5424);
//            _arg1.writeByte(this._itemId);
//            _arg1.writeShort(this._amount);
//        }
//
//        public function get typeId():int
//        {
//            return (this.ASV2014_5424);
//        }
//
//        public function set typeId(_arg1:int):void
//        {
//            this.ASV2014_5424 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1406 = "+g" (String#12762)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5424 = "3h" (String#3435)
//