package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1117 extends Message{

	public static final int id = 1270;
	public int _invasionPoints;
	public MessageList _rewards;

	public ASV2014_1117(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._invasionPoints = data.readInt();
		this._rewards.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this._invasionPoints);
		this._rewards.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1117(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1117 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1270;
//
//        private var _invasionPoints:int;
//        private var _rewards:ASV2014_194;
//
//        public function ASV2014_1117()
//        {
//            this._rewards = new ASV2014_194();
//            super();
//            this.rewards = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._invasionPoints = _arg1.readInt();
//            this._rewards.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._invasionPoints);
//            this._rewards.ASV2014_2336(_arg1);
//        }
//
//        public function get invasionPoints():int
//        {
//            return (this._invasionPoints);
//        }
//
//        public function set invasionPoints(_arg1:int):void
//        {
//            this._invasionPoints = _arg1;
//        }
//
//        public function get rewards():ASV2014_194
//        {
//            return (this._rewards);
//        }
//
//        public function set rewards(_arg1:ASV2014_194):void
//        {
//            this._rewards = _arg1;
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
// ASV2014_1117 = ">r" (String#12031)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//