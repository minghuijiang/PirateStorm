package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class CurrencyChangeRequestMessage extends Message{

	public static final int id = 1505;
	public int _index;

	public CurrencyChangeRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._index = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._index);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new CurrencyChangeRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_750 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1505;
//
//        private var _index:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._index = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._index);
//        }
//
//        public function get index():int
//        {
//            return (this._index);
//        }
//
//        public function set index(_arg1:int):void
//        {
//            this._index = _arg1;
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
// ASV2014_750 = ",#A" (String#8963)
//