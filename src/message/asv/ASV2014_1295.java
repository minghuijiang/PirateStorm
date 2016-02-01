package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1295 extends Message{

	public static final int id = 1464;
	public int ASV2014_6506;
	public int ASV2014_6507;
	public MessageList _skills;

	public ASV2014_1295(User user) {
		super(user);
		_skills = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6506 = data.readInt();
		this.ASV2014_6507 = data.readInt();
		this._skills.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_6506);
		data.writeInt(this.ASV2014_6507);
		this._skills.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1295(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1295 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1464;
//
//        private var ASV2014_6504:int;
//        private var ASV2014_6505:int;
//        private var _skills:ASV2014_194;
//
//        public function ASV2014_1295()
//        {
//            this._skills = new ASV2014_194();
//            super();
//            this.skills = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6504 = _arg1.readInt();
//            this.ASV2014_6505 = _arg1.readInt();
//            this._skills.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6504);
//            _arg1.writeInt(this.ASV2014_6505);
//            this._skills.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_6506():int
//        {
//            return (this.ASV2014_6504);
//        }
//
//        public function set ASV2014_6506(_arg1:int):void
//        {
//            this.ASV2014_6504 = _arg1;
//        }
//
//        public function get ASV2014_6507():int
//        {
//            return (this.ASV2014_6505);
//        }
//
//        public function set ASV2014_6507(_arg1:int):void
//        {
//            this.ASV2014_6505 = _arg1;
//        }
//
//        public function get skills():ASV2014_194
//        {
//            return (this._skills);
//        }
//
//        public function set skills(_arg1:ASV2014_194):void
//        {
//            this._skills = _arg1;
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
// ASV2014_1295 = "%#D" (String#11896)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6504 = ",\"u" (String#18003)
// ASV2014_6505 = "4=" (String#18758)
// ASV2014_6506 = "%#^" (String#25882)
// ASV2014_6507 = "&\"h" (String#24226)
//