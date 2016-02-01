package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_387 extends Message{

	public static final int id = 1181;
	public int _damageAbsolute;
	public int damageRelative;
	public int _hitpointsAbsolute;
	public int hitpointsRelative;
	public MessageList _rewards;

	public ASV2014_387(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._damageAbsolute = data.readShort();
		this.damageRelative = data.readByte();
		this._hitpointsAbsolute = data.readShort();
		this.hitpointsRelative = data.readByte();
		this._rewards.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this._damageAbsolute);
		data.writeByte(this.damageRelative);
		data.writeShort(this._hitpointsAbsolute);
		data.writeByte(this.hitpointsRelative);
		this._rewards.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_387(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_387 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1181;
//
//        private var _damageAbsolute:int;
//        private var ASV2014_4903:int;
//        private var _hitpointsAbsolute:int;
//        private var ASV2014_4904:int;
//        private var _rewards:ASV2014_194;
//
//        public function ASV2014_387()
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
//            this._damageAbsolute = _arg1.readShort();
//            this.ASV2014_4903 = _arg1.readByte();
//            this._hitpointsAbsolute = _arg1.readShort();
//            this.ASV2014_4904 = _arg1.readByte();
//            this._rewards.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._damageAbsolute);
//            _arg1.writeByte(this.ASV2014_4903);
//            _arg1.writeShort(this._hitpointsAbsolute);
//            _arg1.writeByte(this.ASV2014_4904);
//            this._rewards.ASV2014_2336(_arg1);
//        }
//
//        public function get damageAbsolute():int
//        {
//            return (this._damageAbsolute);
//        }
//
//        public function set damageAbsolute(_arg1:int):void
//        {
//            this._damageAbsolute = _arg1;
//        }
//
//        public function get damageRelative():int
//        {
//            return (this.ASV2014_4903);
//        }
//
//        public function set damageRelative(_arg1:int):void
//        {
//            this.ASV2014_4903 = _arg1;
//        }
//
//        public function get hitpointsAbsolute():int
//        {
//            return (this._hitpointsAbsolute);
//        }
//
//        public function set hitpointsAbsolute(_arg1:int):void
//        {
//            this._hitpointsAbsolute = _arg1;
//        }
//
//        public function get hitpointsRelative():int
//        {
//            return (this.ASV2014_4904);
//        }
//
//        public function set hitpointsRelative(_arg1:int):void
//        {
//            this.ASV2014_4904 = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_387 = "3\"B" (String#9761)
// ASV2014_4903 = ">\"M" (String#8464)
// ASV2014_4904 = "'\"r" (String#8461)
//