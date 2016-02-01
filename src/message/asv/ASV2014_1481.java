package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1481 extends Message{

	public static final int id = 1191;
	public int categoryId;
	public MessageList _category;

	public ASV2014_1481(User user) {
		super(user);
		_category = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.categoryId = data.readByte();
		this._category.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.categoryId);
		this._category.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1481(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1481 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1191;
//
//        private var ASV2014_5618:int;
//        private var _category:ASV2014_194;
//
//        public function ASV2014_1481()
//        {
//            this._category = new ASV2014_194();
//            super();
//            this.category = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5618 = _arg1.readByte();
//            this._category.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5618);
//            this._category.ASV2014_2336(_arg1);
//        }
//
//        public function get categoryId():int
//        {
//            return (this.ASV2014_5618);
//        }
//
//        public function set categoryId(_arg1:int):void
//        {
//            this.ASV2014_5618 = _arg1;
//        }
//
//        public function get category():ASV2014_194
//        {
//            return (this._category);
//        }
//
//        public function set category(_arg1:ASV2014_194):void
//        {
//            this._category = _arg1;
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
// ASV2014_1481 = "2!-" (String#18609)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5618 = "<!k" (String#4142)
//