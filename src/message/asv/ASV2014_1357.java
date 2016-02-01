package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1357 extends Message{

	public static final int id = 1583;
	public MessageList _rewardList;

	public ASV2014_1357(User user) {
		super(user);
		_rewardList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._rewardList.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._rewardList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1357(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1357 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1583;
//
//        private var _rewardList:ASV2014_194;
//
//        public function ASV2014_1357()
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
//            this._rewardList.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._rewardList.ASV2014_2336(_arg1);
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
// ASV2014_1357 = "`!I" (String#12694)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//