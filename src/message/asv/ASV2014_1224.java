package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1224 extends Message{

	public static final int id = 1432;
	public MessageList _battlegrounds;

	public ASV2014_1224(User user) {
		super(user);
		_battlegrounds = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._battlegrounds.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._battlegrounds.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1224(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1224 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1432;
//
//        private var _battlegrounds:ASV2014_194;
//
//        public function ASV2014_1224()
//        {
//            this._battlegrounds = new ASV2014_194();
//            super();
//            this.battlegrounds = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._battlegrounds.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._battlegrounds.ASV2014_2336(_arg1);
//        }
//
//        public function get battlegrounds():ASV2014_194
//        {
//            return (this._battlegrounds);
//        }
//
//        public function set battlegrounds(_arg1:ASV2014_194):void
//        {
//            this._battlegrounds = _arg1;
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
// ASV2014_1224 = ",!z" (String#12407)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//