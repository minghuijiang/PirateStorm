package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class PiratesDataMessage extends Message{

	public static final int id = 1126;
	public int morale;
	public int lootShare;
	public int _reloadEffect;
	public int ASV2014_6485;

	public PiratesDataMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.morale = data.readByte();
		this.lootShare = data.readByte();
		this._reloadEffect = data.readByte();
		this.ASV2014_6485 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.morale);
		data.writeByte(this.lootShare);
		data.writeByte(this._reloadEffect);
		data.writeByte(this.ASV2014_6485);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new PiratesDataMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class PiratesDataMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1126;
//
//        private var ASV2014_6482:int;
//        private var ASV2014_6483:int;
//        private var _reloadEffect:int;
//        private var ASV2014_6484:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6482 = _arg1.readByte();
//            this.ASV2014_6483 = _arg1.readByte();
//            this._reloadEffect = _arg1.readByte();
//            this.ASV2014_6484 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6482);
//            _arg1.writeByte(this.ASV2014_6483);
//            _arg1.writeByte(this._reloadEffect);
//            _arg1.writeByte(this.ASV2014_6484);
//        }
//
//        public function get morale():int
//        {
//            return (this.ASV2014_6482);
//        }
//
//        public function set morale(_arg1:int):void
//        {
//            this.ASV2014_6482 = _arg1;
//        }
//
//        public function get lootShare():int
//        {
//            return (this.ASV2014_6483);
//        }
//
//        public function set lootShare(_arg1:int):void
//        {
//            this.ASV2014_6483 = _arg1;
//        }
//
//        public function get reloadEffect():int
//        {
//            return (this._reloadEffect);
//        }
//
//        public function set reloadEffect(_arg1:int):void
//        {
//            this._reloadEffect = _arg1;
//        }
//
//        public function get ASV2014_6485():int
//        {
//            return (this.ASV2014_6484);
//        }
//
//        public function set ASV2014_6485(_arg1:int):void
//        {
//            this.ASV2014_6484 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6482 = "0!4" (String#9041)
// ASV2014_6483 = "`!p" (String#5850)
// ASV2014_6484 = "%N" (String#19016)
// ASV2014_6485 = "!#1" (String#34341)
//