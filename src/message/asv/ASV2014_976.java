package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_976 extends Message{

	public static final int id = 1182;
	public int _level;
	public int damageRelative;
	public int hitpointsRelative;
	public MessageList _rewardList;

	public ASV2014_976(User user) {
		super(user);
		_rewardList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._level = data.readByte();
		this.damageRelative = data.readByte();
		this.hitpointsRelative = data.readByte();
		this._rewardList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._level);
		data.writeByte(this.damageRelative);
		data.writeByte(this.hitpointsRelative);
		this._rewardList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_976(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_976 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1182;
//
//        private var _level:int;
//        private var ASV2014_4903:int;
//        private var ASV2014_4904:int;
//        private var _rewardList:ASV2014_194;
//
//        public function ASV2014_976()
//        {
//            this._rewardList = new ASV2014_194();
//            super();
//            this.rewardList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._level = _arg1.readByte();
//            this.ASV2014_4903 = _arg1.readByte();
//            this.ASV2014_4904 = _arg1.readByte();
//            this._rewardList.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._level);
//            _arg1.writeByte(this.ASV2014_4903);
//            _arg1.writeByte(this.ASV2014_4904);
//            this._rewardList.ASV2014_2336(_arg1);
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
//        public function get rewardList():ASV2014_194
//        {
//            return (this._rewardList);
//        }
//
//        public function set rewardList(_arg1:ASV2014_194):void
//        {
//            this._rewardList = _arg1;
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
// ASV2014_4903 = ">\"M" (String#8464)
// ASV2014_4904 = "'\"r" (String#8461)
// ASV2014_976 = "9\"F" (String#11494)
//