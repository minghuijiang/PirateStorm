package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_855 extends Message{

	public static final int id = 1199;
	public boolean _hasApplication;
	public int ASV2014_5162;
	public int _pageIndex;
	public MessageList _result;

	public ASV2014_855(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._hasApplication = data.readBoolean();
		this.ASV2014_5162 = data.readInt();
		this._pageIndex = data.readShort();
		this._result.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._hasApplication);
		data.writeInt(this.ASV2014_5162);
		data.writeShort(this._pageIndex);
		this._result.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_855(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_855 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1199;
//
//        private var _hasApplication:Boolean;
//        private var ASV2014_6183:int;
//        private var _pageIndex:int;
//        private var _result:ASV2014_194;
//
//        public function ASV2014_855()
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
//            this._hasApplication = _arg1.readBoolean();
//            this.ASV2014_6183 = _arg1.readInt();
//            this._pageIndex = _arg1.readShort();
//            this._result.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._hasApplication);
//            _arg1.writeInt(this.ASV2014_6183);
//            _arg1.writeShort(this._pageIndex);
//            this._result.ASV2014_2336(_arg1);
//        }
//
//        public function get hasApplication():Boolean
//        {
//            return (this._hasApplication);
//        }
//
//        public function set hasApplication(_arg1:Boolean):void
//        {
//            this._hasApplication = _arg1;
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
// ASV2014_5162 = "<#v" (String#3623)
// ASV2014_6183 = ">#o" (String#2226)
// ASV2014_855 = "?\"T" (String#8299)
//