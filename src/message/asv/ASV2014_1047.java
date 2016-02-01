package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1047 extends Message{

	public static final int id = 1532;
	public int ASV2014_4350;
	public int sectionId;
	public int ASV2014_4354;
	public int _level;
	public int maxLevel;
	public int categoryId;
	public MessageList _rewards;

	public ASV2014_1047(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4350 = data.readShort();
		this.sectionId = data.readByte();
		this.ASV2014_4354 = data.readInt();
		this._level = data.readByte();
		this.maxLevel = data.readByte();
		this.categoryId = data.readByte();
		this._rewards.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this.ASV2014_4350);
		data.writeByte(this.sectionId);
		data.writeInt(this.ASV2014_4354);
		data.writeByte(this._level);
		data.writeByte(this.maxLevel);
		data.writeByte(this.categoryId);
		this._rewards.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1047(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1047 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1532;
//
//        private var ASV2014_5612:int;
//        private var ASV2014_5611:int;
//        private var ASV2014_5620:int;
//        private var _level:int;
//        private var ASV2014_5614:int;
//        private var ASV2014_5618:int;
//        private var _rewards:ASV2014_194;
//
//        public function ASV2014_1047()
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
//            this.ASV2014_5612 = _arg1.readShort();
//            this.ASV2014_5611 = _arg1.readByte();
//            this.ASV2014_5620 = _arg1.readInt();
//            this._level = _arg1.readByte();
//            this.ASV2014_5614 = _arg1.readByte();
//            this.ASV2014_5618 = _arg1.readByte();
//            this._rewards.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_5612);
//            _arg1.writeByte(this.ASV2014_5611);
//            _arg1.writeInt(this.ASV2014_5620);
//            _arg1.writeByte(this._level);
//            _arg1.writeByte(this.ASV2014_5614);
//            _arg1.writeByte(this.ASV2014_5618);
//            this._rewards.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_4350():int
//        {
//            return (this.ASV2014_5612);
//        }
//
//        public function set ASV2014_4350(_arg1:int):void
//        {
//            this.ASV2014_5612 = _arg1;
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
//        public function get ASV2014_4354():int
//        {
//            return (this.ASV2014_5620);
//        }
//
//        public function set ASV2014_4354(_arg1:int):void
//        {
//            this.ASV2014_5620 = _arg1;
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
//        public function get maxLevel():int
//        {
//            return (this.ASV2014_5614);
//        }
//
//        public function set maxLevel(_arg1:int):void
//        {
//            this.ASV2014_5614 = _arg1;
//        }
//
//        public function get categoryId():int
//        {
//            return (this.ASV2014_5618);
//        }
//
//        public function set categoryId(_arg1:int):void
//        {
//            this.ASV2014_5618 = _arg1;
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
// ASV2014_1047 = "'\"W" (String#12493)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4350 = "`!P" (String#3128)
// ASV2014_4354 = "]T" (String#5504)
// ASV2014_5611 = "7h" (String#3387)
// ASV2014_5612 = ",!3" (String#3040)
// ASV2014_5614 = "5\"N" (String#2726)
// ASV2014_5618 = "<!k" (String#4142)
// ASV2014_5620 = "-\"Y" (String#5678)
//