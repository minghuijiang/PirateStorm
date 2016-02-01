package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1404 extends Message{

	public static final int id = 1083;
	public int _buffId;
	public int _duration;
	public MessageList buffValues;

	public ASV2014_1404(User user) {
		super(user);
		buffValues = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._buffId = data.readShort();
		this._duration = data.readInt();
		this.buffValues.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this._buffId);
		data.writeInt(this._duration);
		this.buffValues.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1404(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1404 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1083;
//
//        private var _buffId:int;
//        private var _duration:int;
//        private var ASV2014_6314:ASV2014_194;
//
//        public function ASV2014_1404()
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
//            this._duration = _arg1.readInt();
//            this.ASV2014_6314.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._buffId);
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
// ASV2014_1404 = "3#X" (String#8570)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6314 = ";#A" (String#3683)
//