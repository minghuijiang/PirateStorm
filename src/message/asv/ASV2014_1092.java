package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1092 extends Message{

	public static final int id = 1587;
	public int eventId;
	public int startDateInSeconds;
	public Message _winner;
	public Message ASV2014_6319;
	public MessageList _rewardList;

	public ASV2014_1092(User user) {
		super(user);
		_rewardList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.eventId = data.readShort();
		this.startDateInSeconds = data.readInt();
		this._winner = component.ClientSocket.readMessage(data,user);
		this.ASV2014_6319 = component.ClientSocket.readMessage(data,user);
		this._rewardList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this.eventId);
		data.writeInt(this.startDateInSeconds);
		component.ClientSocket.writeMessage(this._winner, data);
		component.ClientSocket.writeMessage(this.ASV2014_6319, data);
		this._rewardList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1092(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1092 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1587;
//
//        private var ASV2014_3728:int;
//        private var ASV2014_5254:int;
//        private var _winner:ASV2014_30;
//        private var ASV2014_6390:ASV2014_30;
//        private var _rewardList:ASV2014_194;
//
//        public function ASV2014_1092()
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
//            this.ASV2014_3728 = _arg1.readShort();
//            this.ASV2014_5254 = _arg1.readInt();
//            this._winner = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_6390 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._rewardList.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_3728);
//            _arg1.writeInt(this.ASV2014_5254);
//            ASV2014_229.writeMessage(this._winner, _arg1);
//            ASV2014_229.writeMessage(this.ASV2014_6390, _arg1);
//            this._rewardList.ASV2014_2336(_arg1);
//        }
//
//        public function get eventId():int
//        {
//            return (this.ASV2014_3728);
//        }
//
//        public function set eventId(_arg1:int):void
//        {
//            this.ASV2014_3728 = _arg1;
//        }
//
//        public function get startDateInSeconds():int
//        {
//            return (this.ASV2014_5254);
//        }
//
//        public function set startDateInSeconds(_arg1:int):void
//        {
//            this.ASV2014_5254 = _arg1;
//        }
//
//        public function get winner():ASV2014_30
//        {
//            return (this._winner);
//        }
//
//        public function set winner(_arg1:ASV2014_30):void
//        {
//            this._winner = _arg1;
//        }
//
//        public function get ASV2014_6319():ASV2014_30
//        {
//            return (this.ASV2014_6390);
//        }
//
//        public function set ASV2014_6319(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6390 = _arg1;
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
// ASV2014_1092 = "1!?" (String#11944)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3728 = "[!_" (String#2158)
// ASV2014_5254 = "<\"Z" (String#5411)
// ASV2014_6319 = "++" (String#13500)
// ASV2014_6390 = "0\"j" (String#7570)
//