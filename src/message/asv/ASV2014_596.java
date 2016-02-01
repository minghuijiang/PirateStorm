package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_596 extends Message{

	public static final int id = 1238;
	public int userGuildLevel;
	public Message nextReward;
	public MessageList currentRewardList;

	public ASV2014_596(User user) {
		super(user);
		currentRewardList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.userGuildLevel = data.readByte();
		this.nextReward = component.ClientSocket.readMessage(data,user);
		this.currentRewardList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.userGuildLevel);
		component.ClientSocket.writeMessage(this.nextReward, data);
		this.currentRewardList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_596(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_596 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1238;
//
//        private var ASV2014_5675:int;
//        private var ASV2014_3907:ASV2014_30;
//        private var ASV2014_5676:ASV2014_194;
//
//        public function ASV2014_596()
//        {
//            this.ASV2014_5676 = new ASV2014_194();
//            super();
//            this.currentRewardList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5675 = _arg1.readByte();
//            this.ASV2014_3907 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_5676.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5675);
//            ASV2014_229.writeMessage(this.ASV2014_3907, _arg1);
//            this.ASV2014_5676.ASV2014_2336(_arg1);
//        }
//
//        public function get userGuildLevel():int
//        {
//            return (this.ASV2014_5675);
//        }
//
//        public function set userGuildLevel(_arg1:int):void
//        {
//            this.ASV2014_5675 = _arg1;
//        }
//
//        public function get nextReward():ASV2014_30
//        {
//            return (this.ASV2014_3907);
//        }
//
//        public function set nextReward(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_3907 = _arg1;
//        }
//
//        public function get currentRewardList():ASV2014_194
//        {
//            return (this.ASV2014_5676);
//        }
//
//        public function set currentRewardList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5676 = _arg1;
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
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3907 = "-!D" (String#8806)
// ASV2014_5675 = "+#" (String#16643)
// ASV2014_5676 = "&!@" (String#13640)
// ASV2014_596 = "^!q" (String#10197)
//