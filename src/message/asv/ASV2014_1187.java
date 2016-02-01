package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1187 extends Message{

	public static final int id = 1556;
	public int _time;

	public ASV2014_1187(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._time = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._time);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1187(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1187 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1556;
//
//        private var _time:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._time = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._time);
//        }
//
//        public function get time():int
//        {
//            return (this._time);
//        }
//
//        public function set time(_arg1:int):void
//        {
//            this._time = _arg1;
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
// ASV2014_1187 = "2U" (String#12140)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//