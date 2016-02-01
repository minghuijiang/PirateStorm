package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1533 extends Message{

	public static final int id = 1087;
	public int _type;
	public int _amount;
	public int maxAmount;

	public ASV2014_1533(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._amount = data.readShort();
		this.maxAmount = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeShort(this._amount);
		data.writeShort(this.maxAmount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1533(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1533 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1087;
//
//        private var _type:int;
//        private var _amount:int;
//        private var ASV2014_6619:int;
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
//            this._amount = _arg1.readShort();
//            this.ASV2014_6619 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeShort(this._amount);
//            _arg1.writeShort(this.ASV2014_6619);
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
//        public function get maxAmount():int
//        {
//            return (this.ASV2014_6619);
//        }
//
//        public function set maxAmount(_arg1:int):void
//        {
//            this.ASV2014_6619 = _arg1;
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
// ASV2014_1533 = "`\"Z" (String#22025)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6619 = ",\"w" (String#16990)
//