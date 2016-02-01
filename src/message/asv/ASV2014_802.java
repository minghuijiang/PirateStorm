package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_802 extends Message{

	public static final int id = 1350;
	public boolean _accept;

	public ASV2014_802(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._accept = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._accept);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_802(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_802 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1350;
//
//        private var _accept:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._accept = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._accept);
//        }
//
//        public function get accept():Boolean
//        {
//            return (this._accept);
//        }
//
//        public function set accept(_arg1:Boolean):void
//        {
//            this._accept = _arg1;
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
// ASV2014_802 = "!\"c" (String#12308)
//