package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1238 extends Message{

	public static final int id = 1510;
	public int _userId;
	public int _viewDistance;

	public ASV2014_1238(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._viewDistance = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeInt(this._viewDistance);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1238(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1238 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1510;
//
//        private var _userId:int;
//        private var _viewDistance:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._viewDistance = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeInt(this._viewDistance);
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
//        public function get viewDistance():int
//        {
//            return (this._viewDistance);
//        }
//
//        public function set viewDistance(_arg1:int):void
//        {
//            this._viewDistance = _arg1;
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
// ASV2014_1238 = ">!g" (String#11480)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//