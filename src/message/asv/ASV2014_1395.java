package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1395 extends Message{

	public static final int id = 1610;
	public int _functionId;
	public int successLevel;
	public Message currentItem;
	public MessageList _rewards;
	public Message ASV2014_6475;

	public ASV2014_1395(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._functionId = data.readByte();
		this.successLevel = data.readByte();
		this.currentItem = component.ClientSocket.readMessage(data,user);
		this._rewards.deserialize(data);
		this.ASV2014_6475 = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._functionId);
		data.writeByte(this.successLevel);
		component.ClientSocket.writeMessage(this.currentItem, data);
		this._rewards.serialize(data);
		component.ClientSocket.writeMessage(this.ASV2014_6475, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1395(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1395 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1610;
//
//        private var _functionId:int;
//        private var ASV2014_6555:int;
//        private var ASV2014_5610:ASV2014_30;
//        private var _rewards:ASV2014_194;
//        private var ASV2014_6556:ASV2014_30;
//
//        public function ASV2014_1395()
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
//            this._functionId = _arg1.readByte();
//            this.ASV2014_6555 = _arg1.readByte();
//            this.ASV2014_5610 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._rewards.deserialize(_arg1);
//            this.ASV2014_6556 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._functionId);
//            _arg1.writeByte(this.ASV2014_6555);
//            ASV2014_229.writeMessage(this.ASV2014_5610, _arg1);
//            this._rewards.ASV2014_2336(_arg1);
//            ASV2014_229.writeMessage(this.ASV2014_6556, _arg1);
//        }
//
//        public function get functionId():int
//        {
//            return (this._functionId);
//        }
//
//        public function set functionId(_arg1:int):void
//        {
//            this._functionId = _arg1;
//        }
//
//        public function get successLevel():int
//        {
//            return (this.ASV2014_6555);
//        }
//
//        public function set successLevel(_arg1:int):void
//        {
//            this.ASV2014_6555 = _arg1;
//        }
//
//        public function get currentItem():ASV2014_30
//        {
//            return (this.ASV2014_5610);
//        }
//
//        public function set currentItem(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_5610 = _arg1;
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
//        public function get ASV2014_6475():ASV2014_30
//        {
//            return (this.ASV2014_6556);
//        }
//
//        public function set ASV2014_6475(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6556 = _arg1;
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
// ASV2014_1395 = "+!" (String#13093)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_5610 = "@!N" (String#4382)
// ASV2014_6475 = "1!T" (String#24637)
// ASV2014_6555 = " #D" (String#10821)
// ASV2014_6556 = "0#q" (String#18284)
//