package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1239 extends Message{

	public static final int id = 1577;
	public boolean _active;

	public ASV2014_1239(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._active = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._active);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1239(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1239 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1577;
//
//        private var _active:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._active = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._active);
//        }
//
//        public function get active():Boolean
//        {
//            return (this._active);
//        }
//
//        public function set active(_arg1:Boolean):void
//        {
//            this._active = _arg1;
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
// ASV2014_1239 = "!\"x" (String#12315)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//