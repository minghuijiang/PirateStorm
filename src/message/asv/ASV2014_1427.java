package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1427 extends Message{

	public static final int id = 1445;
	public int _pentarPoints;
	public int _kirusPoints;
	public int _buthuPoints;
	public int _sobekPoints;
	public int _lodosPoints;
	public int _anansiPoints;
	public MessageList _rewards;

	public ASV2014_1427(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._pentarPoints = data.readInt();
		this._kirusPoints = data.readInt();
		this._buthuPoints = data.readInt();
		this._sobekPoints = data.readInt();
		this._lodosPoints = data.readInt();
		this._anansiPoints = data.readInt();
		this._rewards.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this._pentarPoints);
		data.writeInt(this._kirusPoints);
		data.writeInt(this._buthuPoints);
		data.writeInt(this._sobekPoints);
		data.writeInt(this._lodosPoints);
		data.writeInt(this._anansiPoints);
		this._rewards.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1427(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1427 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1445;
//
//        private var _pentarPoints:int;
//        private var _kirusPoints:int;
//        private var _buthuPoints:int;
//        private var _sobekPoints:int;
//        private var _lodosPoints:int;
//        private var _anansiPoints:int;
//        private var _rewards:ASV2014_194;
//
//        public function ASV2014_1427()
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
//            this._pentarPoints = _arg1.readInt();
//            this._kirusPoints = _arg1.readInt();
//            this._buthuPoints = _arg1.readInt();
//            this._sobekPoints = _arg1.readInt();
//            this._lodosPoints = _arg1.readInt();
//            this._anansiPoints = _arg1.readInt();
//            this._rewards.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._pentarPoints);
//            _arg1.writeInt(this._kirusPoints);
//            _arg1.writeInt(this._buthuPoints);
//            _arg1.writeInt(this._sobekPoints);
//            _arg1.writeInt(this._lodosPoints);
//            _arg1.writeInt(this._anansiPoints);
//            this._rewards.ASV2014_2336(_arg1);
//        }
//
//        public function get pentarPoints():int
//        {
//            return (this._pentarPoints);
//        }
//
//        public function set pentarPoints(_arg1:int):void
//        {
//            this._pentarPoints = _arg1;
//        }
//
//        public function get kirusPoints():int
//        {
//            return (this._kirusPoints);
//        }
//
//        public function set kirusPoints(_arg1:int):void
//        {
//            this._kirusPoints = _arg1;
//        }
//
//        public function get buthuPoints():int
//        {
//            return (this._buthuPoints);
//        }
//
//        public function set buthuPoints(_arg1:int):void
//        {
//            this._buthuPoints = _arg1;
//        }
//
//        public function get sobekPoints():int
//        {
//            return (this._sobekPoints);
//        }
//
//        public function set sobekPoints(_arg1:int):void
//        {
//            this._sobekPoints = _arg1;
//        }
//
//        public function get lodosPoints():int
//        {
//            return (this._lodosPoints);
//        }
//
//        public function set lodosPoints(_arg1:int):void
//        {
//            this._lodosPoints = _arg1;
//        }
//
//        public function get anansiPoints():int
//        {
//            return (this._anansiPoints);
//        }
//
//        public function set anansiPoints(_arg1:int):void
//        {
//            this._anansiPoints = _arg1;
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
// ASV2014_1427 = " !j" (String#13392)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//