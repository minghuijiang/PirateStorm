package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1024 extends Message{

	public static final int id = 1361;
	public int _secondsLeft;

	public ASV2014_1024(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._secondsLeft = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._secondsLeft);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1024(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1024 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1361;
//
//        private var _secondsLeft:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._secondsLeft = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._secondsLeft);
//        }
//
//        public function get secondsLeft():int
//        {
//            return (this._secondsLeft);
//        }
//
//        public function set secondsLeft(_arg1:int):void
//        {
//            this._secondsLeft = _arg1;
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
// ASV2014_1024 = "!!V" (String#12422)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//