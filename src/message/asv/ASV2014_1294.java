package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1294 extends Message{

	public static final int id = 1129;
	public int _itemId;
	public int _reason;

	public ASV2014_1294(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._itemId = data.readShort();
		this._reason = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._itemId);
		data.writeByte(this._reason);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1294(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1294 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1129;
//
//        private var _itemId:int;
//        private var _reason:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._itemId = _arg1.readShort();
//            this._reason = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._itemId);
//            _arg1.writeByte(this._reason);
//        }
//
//        public function get itemId():int
//        {
//            return (this._itemId);
//        }
//
//        public function set itemId(_arg1:int):void
//        {
//            this._itemId = _arg1;
//        }
//
//        public function get reason():int
//        {
//            return (this._reason);
//        }
//
//        public function set reason(_arg1:int):void
//        {
//            this._reason = _arg1;
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
// ASV2014_1294 = "5!&" (String#13192)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//