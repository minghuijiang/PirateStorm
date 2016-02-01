package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1470 extends Message{

	public static final int id = 1088;
	public int _type;
	public int specialistId;
	public MessageList buffValues;

	public ASV2014_1470(User user) {
		super(user);
		buffValues = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this.specialistId = data.readByte();
		this.buffValues.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeByte(this.specialistId);
		this.buffValues.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1470(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1470 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1088;
//
//        private var _type:int;
//        private var ASV2014_6602:int;
//        private var ASV2014_6314:ASV2014_194;
//
//        public function ASV2014_1470()
//        {
//            this.ASV2014_6314 = new ASV2014_194();
//            super();
//            this.buffValues = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this.ASV2014_6602 = _arg1.readByte();
//            this.ASV2014_6314.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this.ASV2014_6602);
//            this.ASV2014_6314.ASV2014_2336(_arg1);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
//        }
//
//        public function get specialistId():int
//        {
//            return (this.ASV2014_6602);
//        }
//
//        public function set specialistId(_arg1:int):void
//        {
//            this.ASV2014_6602 = _arg1;
//        }
//
//        public function get buffValues():ASV2014_194
//        {
//            return (this.ASV2014_6314);
//        }
//
//        public function set buffValues(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6314 = _arg1;
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
// ASV2014_1470 = "'\"c" (String#17200)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6314 = ";#A" (String#3683)
// ASV2014_6602 = "\"\"7" (String#16964)
//