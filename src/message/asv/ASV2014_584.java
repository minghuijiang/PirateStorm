package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_584 extends Message{

	public static final int id = 1529;
	public int sectionId;
	public Message ASV2014_4353;
	public MessageList _achievements;

	public ASV2014_584(User user) {
		super(user);
		_achievements = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.sectionId = data.readByte();
		this.ASV2014_4353 = component.ClientSocket.readMessage(data,user);
		this._achievements.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.sectionId);
		component.ClientSocket.writeMessage(this.ASV2014_4353, data);
		this._achievements.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_584(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_584 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1529;
//
//        private var ASV2014_5611:int;
//        private var ASV2014_5623:ASV2014_30;
//        private var _achievements:ASV2014_194;
//
//        public function ASV2014_584()
//        {
//            this._achievements = new ASV2014_194();
//            super();
//            this.achievements = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5611 = _arg1.readByte();
//            this.ASV2014_5623 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._achievements.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5611);
//            ASV2014_229.writeMessage(this.ASV2014_5623, _arg1);
//            this._achievements.ASV2014_2336(_arg1);
//        }
//
//        public function get sectionId():int
//        {
//            return (this.ASV2014_5611);
//        }
//
//        public function set sectionId(_arg1:int):void
//        {
//            this.ASV2014_5611 = _arg1;
//        }
//
//        public function get ASV2014_4353():ASV2014_30
//        {
//            return (this.ASV2014_5623);
//        }
//
//        public function set ASV2014_4353(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_5623 = _arg1;
//        }
//
//        public function get achievements():ASV2014_194
//        {
//            return (this._achievements);
//        }
//
//        public function set achievements(_arg1:ASV2014_194):void
//        {
//            this._achievements = _arg1;
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
// ASV2014_4353 = "6!y" (String#20626)
// ASV2014_5611 = "7h" (String#3387)
// ASV2014_5623 = "4#d" (String#16340)
// ASV2014_584 = "%#O" (String#11553)
//