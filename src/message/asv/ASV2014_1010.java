package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1010 extends Message{

	public static final int id = 1029;
	public int objectId;
	public int _graphicId;

	public ASV2014_1010(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readShort();
		this._graphicId = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.objectId);
		data.writeShort(this._graphicId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1010(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1010 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1029;
//
//        private var ASV2014_2991:int;
//        private var _graphicId:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readShort();
//            this._graphicId = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_2991);
//            _arg1.writeShort(this._graphicId);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get graphicId():int
//        {
//            return (this._graphicId);
//        }
//
//        public function set graphicId(_arg1:int):void
//        {
//            this._graphicId = _arg1;
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
// ASV2014_1010 = "?\"V" (String#12076)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
//