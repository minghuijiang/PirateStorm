package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_394 extends Message{

	public static final int id = 1130;
	public int _itemId;
	public int _level;
	public int _amount;
	public int _cooldown;
	public int _type;

	public ASV2014_394(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._itemId = data.readShort();
		this._level = data.readByte();
		this._amount = data.readInt();
		this._cooldown = data.readInt();
		this._type = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._itemId);
		data.writeByte(this._level);
		data.writeInt(this._amount);
		data.writeInt(this._cooldown);
		data.writeByte(this._type);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_394(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_394 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1130;
//
//        private var _itemId:int;
//        private var _level:int;
//        private var _amount:int;
//        private var _cooldown:int;
//        private var _type:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._itemId = _arg1.readShort();
//            this._level = _arg1.readByte();
//            this._amount = _arg1.readInt();
//            this._cooldown = _arg1.readInt();
//            this._type = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._itemId);
//            _arg1.writeByte(this._level);
//            _arg1.writeInt(this._amount);
//            _arg1.writeInt(this._cooldown);
//            _arg1.writeByte(this._type);
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
//        public function get cooldown():int
//        {
//            return (this._cooldown);
//        }
//
//        public function set cooldown(_arg1:int):void
//        {
//            this._cooldown = _arg1;
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
// ASV2014_394 = "&!n" (String#6023)
//