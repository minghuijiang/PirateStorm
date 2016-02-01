package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_875 extends Message{

	public static final int id = 1211;
	public int memberCount;
	public int memberMaxCount;
	public int _pageIndex;
	public int ASV2014_5178;
	public MessageList _result;

	public ASV2014_875(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.memberCount = data.readShort();
		this.memberMaxCount = data.readShort();
		this._pageIndex = data.readByte();
		this.ASV2014_5178 = data.readByte();
		this._result.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this.memberCount);
		data.writeShort(this.memberMaxCount);
		data.writeByte(this._pageIndex);
		data.writeByte(this.ASV2014_5178);
		this._result.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_875(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_875 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1211;
//
//        private var ASV2014_5948:int;
//        private var ASV2014_5949:int;
//        private var _pageIndex:int;
//        private var ASV2014_6187:int;
//        private var _result:ASV2014_194;
//
//        public function ASV2014_875()
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
//            this.ASV2014_5948 = _arg1.readShort();
//            this.ASV2014_5949 = _arg1.readShort();
//            this._pageIndex = _arg1.readByte();
//            this.ASV2014_6187 = _arg1.readByte();
//            this._result.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_5948);
//            _arg1.writeShort(this.ASV2014_5949);
//            _arg1.writeByte(this._pageIndex);
//            _arg1.writeByte(this.ASV2014_6187);
//            this._result.ASV2014_2336(_arg1);
//        }
//
//        public function get memberCount():int
//        {
//            return (this.ASV2014_5948);
//        }
//
//        public function set memberCount(_arg1:int):void
//        {
//            this.ASV2014_5948 = _arg1;
//        }
//
//        public function get memberMaxCount():int
//        {
//            return (this.ASV2014_5949);
//        }
//
//        public function set memberMaxCount(_arg1:int):void
//        {
//            this.ASV2014_5949 = _arg1;
//        }
//
//        public function get pageIndex():int
//        {
//            return (this._pageIndex);
//        }
//
//        public function set pageIndex(_arg1:int):void
//        {
//            this._pageIndex = _arg1;
//        }
//
//        public function get ASV2014_5178():int
//        {
//            return (this.ASV2014_6187);
//        }
//
//        public function set ASV2014_5178(_arg1:int):void
//        {
//            this.ASV2014_6187 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5178 = "+#+" (String#14050)
// ASV2014_5948 = "8Y" (String#4407)
// ASV2014_5949 = "&6" (String#5906)
// ASV2014_6187 = "@\"d" (String#8663)
// ASV2014_875 = "=!" (String#8480)
//