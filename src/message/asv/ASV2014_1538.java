package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1538 extends Message{

	public static final int id = 1082;
	public int _buffId;
	public int _level;
	public boolean ASV2014_5989;
	public int _duration;
	public MessageList buffValues;

	public ASV2014_1538(User user) {
		super(user);
		buffValues = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._buffId = data.readShort();
		this._level = data.readByte();
		this.ASV2014_5989 = data.readBoolean();
		this._duration = data.readInt();
		this.buffValues.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this._buffId);
		data.writeByte(this._level);
		data.writeBoolean(this.ASV2014_5989);
		data.writeInt(this._duration);
		this.buffValues.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1538(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1538 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1082;
//
//        private var _buffId:int;
//        private var _level:int;
//        private var ASV2014_6313:Boolean;
//        private var _duration:int;
//        private var ASV2014_6314:ASV2014_194;
//
//        public function ASV2014_1538()
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
//            this._buffId = _arg1.readShort();
//            this._level = _arg1.readByte();
//            this.ASV2014_6313 = _arg1.readBoolean();
//            this._duration = _arg1.readInt();
//            this.ASV2014_6314.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._buffId);
//            _arg1.writeByte(this._level);
//            _arg1.writeBoolean(this.ASV2014_6313);
//            _arg1.writeInt(this._duration);
//            this.ASV2014_6314.ASV2014_2336(_arg1);
//        }
//
//        public function get buffId():int
//        {
//            return (this._buffId);
//        }
//
//        public function set buffId(_arg1:int):void
//        {
//            this._buffId = _arg1;
//        }
//
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
//        }
//
//        public function get ASV2014_5989():Boolean
//        {
//            return (this.ASV2014_6313);
//        }
//
//        public function set ASV2014_5989(_arg1:Boolean):void
//        {
//            this.ASV2014_6313 = _arg1;
//        }
//
//        public function get duration():int
//        {
//            return (this._duration);
//        }
//
//        public function set duration(_arg1:int):void
//        {
//            this._duration = _arg1;
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
// ASV2014_1538 = "[#S" (String#18175)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5989 = "^" (String#16264)
// ASV2014_6313 = "@#," (String#8470)
// ASV2014_6314 = ";#A" (String#3683)
//