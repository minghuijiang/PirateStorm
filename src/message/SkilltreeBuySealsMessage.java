package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SkilltreeBuySealsMessage extends Message{

	public static final int id = 1473;
	public int _amount;

	public SkilltreeBuySealsMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._amount = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._amount);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SkilltreeBuySealsMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_484 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1473;
//
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
//            this._amount = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._amount);
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_484 = "'!d" (String#7261)
//