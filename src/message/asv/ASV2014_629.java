package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_629 extends Message{

	public static final int id = 1002;
	public int _value;

	public ASV2014_629(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._value = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._value);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_629(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_629 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1002;
//
//        private var _value:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._value = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._value);
//        }
//
//        public function get value():int
//        {
//            return (this._value);
//        }
//
//        public function set value(_arg1:int):void
//        {
//            this._value = _arg1;
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
// ASV2014_629 = "-!]" (String#5726)
//