package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1362 extends Message{

	public static final int id = 1229;
	public boolean _success;
	public int _userId;

	public ASV2014_1362(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._success = data.readBoolean();
		this._userId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._success);
		data.writeInt(this._userId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1362(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1362 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1229;
//
//        private var _success:Boolean;
//        private var _userId:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._success = _arg1.readBoolean();
//            this._userId = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._success);
//            _arg1.writeInt(this._userId);
//        }
//
//        public function get success():Boolean
//        {
//            return (this._success);
//        }
//
//        public function set success(_arg1:Boolean):void
//        {
//            this._success = _arg1;
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
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
// ASV2014_1362 = "5!U" (String#13448)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//