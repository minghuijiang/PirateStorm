package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1149 extends Message{

	public static final int id = 1593;
	public int newProfessionLevel;
	public int ASV2014_4339;
	public MessageList _rewardList;

	public ASV2014_1149(User user) {
		super(user);
		_rewardList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.newProfessionLevel = data.readByte();
		this.ASV2014_4339 = data.readByte();
		this._rewardList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.newProfessionLevel);
		data.writeByte(this.ASV2014_4339);
		this._rewardList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1149(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1149 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1593;
//
//        private var ASV2014_6441:int;
//        private var ASV2014_5609:int;
//        private var _rewardList:ASV2014_194;
//
//        public function ASV2014_1149()
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
//            this.ASV2014_6441 = _arg1.readByte();
//            this.ASV2014_5609 = _arg1.readByte();
//            this._rewardList.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6441);
//            _arg1.writeByte(this.ASV2014_5609);
//            this._rewardList.ASV2014_2336(_arg1);
//        }
//
//        public function get newProfessionLevel():int
//        {
//            return (this.ASV2014_6441);
//        }
//
//        public function set newProfessionLevel(_arg1:int):void
//        {
//            this.ASV2014_6441 = _arg1;
//        }
//
//        public function get ASV2014_4339():int
//        {
//            return (this.ASV2014_5609);
//        }
//
//        public function set ASV2014_4339(_arg1:int):void
//        {
//            this.ASV2014_5609 = _arg1;
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
// ASV2014_1149 = "1n" (String#11599)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4339 = "9\"i" (String#3988)
// ASV2014_5609 = "+#5" (String#2370)
// ASV2014_6441 = "@\">" (String#10920)
//