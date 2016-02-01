package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1194 extends Message{

	public static final int id = 1298;
	public MessageList _result;
	public int constructionType;

	public ASV2014_1194(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._result.deserialize(data);
		this.constructionType = data.readByte();
	}

	public void serialize(ByteArray data){
		this._result.serialize(data);
		data.writeByte(this.constructionType);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1194(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1194 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1298;
//
//        private var _result:ASV2014_194;
//        private var ASV2014_5845:int;
//
//        public function ASV2014_1194()
//        {
//            this._result = new ASV2014_194();
//            super();
//            this.result = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._result.deserialize(_arg1);
//            this.ASV2014_5845 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._result.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_5845);
//        }
//
//        public function get result():ASV2014_194
//        {
//            return (this._result);
//        }
//
//        public function set result(_arg1:ASV2014_194):void
//        {
//            this._result = _arg1;
//        }
//
//        public function get constructionType():int
//        {
//            return (this.ASV2014_5845);
//        }
//
//        public function set constructionType(_arg1:int):void
//        {
//            this.ASV2014_5845 = _arg1;
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
// ASV2014_1194 = "]!u" (String#8309)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5845 = "1\"V" (String#3776)
//