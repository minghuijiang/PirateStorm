package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_872 extends Message{

	public static final int id = 1289;
	public int ASV2014_5162;
	public int _pageIndex;
	public int maxTruces;
	public MessageList truces;
	public MessageList _result;

	public ASV2014_872(User user) {
		super(user);
		_result = new MessageList(user);
		truces = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_5162 = data.readInt();
		this._pageIndex = data.readByte();
		this.maxTruces = data.readByte();
		this.truces.deserialize(data);
		this._result.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_5162);
		data.writeByte(this._pageIndex);
		data.writeByte(this.maxTruces);
		this.truces.serialize(data);
		this._result.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_872(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_872 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1289;
//
//        private var ASV2014_6183:int;
//        private var _pageIndex:int;
//        private var ASV2014_4612:int;
//        private var ASV2014_6188:ASV2014_194;
//        private var _result:ASV2014_194;
//
//        public function ASV2014_872()
//        {
//            this.ASV2014_6188 = new ASV2014_194();
//            this._result = new ASV2014_194();
//            super();
//            this.truces = new ASV2014_194();
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
//            this.ASV2014_6183 = _arg1.readInt();
//            this._pageIndex = _arg1.readByte();
//            this.ASV2014_4612 = _arg1.readByte();
//            this.ASV2014_6188.deserialize(_arg1);
//            this._result.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6183);
//            _arg1.writeByte(this._pageIndex);
//            _arg1.writeByte(this.ASV2014_4612);
//            this.ASV2014_6188.ASV2014_2336(_arg1);
//            this._result.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_5162():int
//        {
//            return (this.ASV2014_6183);
//        }
//
//        public function set ASV2014_5162(_arg1:int):void
//        {
//            this.ASV2014_6183 = _arg1;
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
//        public function get maxTruces():int
//        {
//            return (this.ASV2014_4612);
//        }
//
//        public function set maxTruces(_arg1:int):void
//        {
//            this.ASV2014_4612 = _arg1;
//        }
//
//        public function get truces():ASV2014_194
//        {
//            return (this.ASV2014_6188);
//        }
//
//        public function set truces(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6188 = _arg1;
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
// ASV2014_4612 = "-\"#" (String#11225)
// ASV2014_5162 = "<#v" (String#3623)
// ASV2014_6183 = ">#o" (String#2226)
// ASV2014_6188 = "4#v" (String#14652)
// ASV2014_872 = "`!-" (String#8535)
//