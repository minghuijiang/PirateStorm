package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1211 extends Message{

	public static final int id = 1268;
	public boolean _isActive;

	public ASV2014_1211(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._isActive = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._isActive);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1211(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1211 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1268;
//
//        private var _isActive:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._isActive = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._isActive);
//        }
//
//        public function get ASV2014_2326():Boolean
//        {
//            return (this._isActive);
//        }
//
//        public function set ASV2014_2326(_arg1:Boolean):void
//        {
//            this._isActive = _arg1;
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
// ASV2014_1211 = "0!j" (String#13491)
// ASV2014_2326 = "`#f" (String#2896)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//