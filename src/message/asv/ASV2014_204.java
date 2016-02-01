package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_204 extends Message{

	public static final int id = 1434;
	public int _type;
	public int _daysLeft;

	public ASV2014_204(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._daysLeft = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeByte(this._daysLeft);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_204(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_204 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1434;
//
//        private var _type:int;
//        private var _daysLeft:int;
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
//            this._daysLeft = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this._daysLeft);
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
//        public function get daysLeft():int
//        {
//            return (this._daysLeft);
//        }
//
//        public function set daysLeft(_arg1:int):void
//        {
//            this._daysLeft = _arg1;
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
// ASV2014_204 = "7#=" (String#8662)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//