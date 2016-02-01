package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_289 extends Message{

	public static final int id = 1133;
	public int ASV2014_3308;
	public int ASV2014_2635;
	public int _hitpoints;
	public int hitpointsMax;
	public int _speed;
	public int speedMax;
	public int cannons;
	public int cannonsMax;
	public int harpoons;
	public int harpoonsMax;
	public int decks;
	public int decksMax;
	public int _settings;

	public ASV2014_289(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3308 = data.readInt();
		this.ASV2014_2635 = data.readByte();
		this._hitpoints = data.readInt();
		this.hitpointsMax = data.readInt();
		this._speed = data.readShort();
		this.speedMax = data.readShort();
		this.cannons = data.readShort();
		this.cannonsMax = data.readShort();
		this.harpoons = data.readShort();
		this.harpoonsMax = data.readShort();
		this.decks = data.readByte();
		this.decksMax = data.readByte();
		this._settings = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3308);
		data.writeByte(this.ASV2014_2635);
		data.writeInt(this._hitpoints);
		data.writeInt(this.hitpointsMax);
		data.writeShort(this._speed);
		data.writeShort(this.speedMax);
		data.writeShort(this.cannons);
		data.writeShort(this.cannonsMax);
		data.writeShort(this.harpoons);
		data.writeShort(this.harpoonsMax);
		data.writeByte(this.decks);
		data.writeByte(this.decksMax);
		data.writeByte(this._settings);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_289(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_289 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1133;
//
//        private var ASV2014_4513:int;
//        private var ASV2014_3010:int;
//        private var _hitpoints:int;
//        private var ASV2014_4514:int;
//        private var _speed:int;
//        private var ASV2014_4515:int;
//        private var ASV2014_4516:int;
//        private var ASV2014_4517:int;
//        private var ASV2014_4518:int;
//        private var ASV2014_4519:int;
//        private var ASV2014_4520:int;
//        private var ASV2014_4521:int;
//        private var _settings:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4513 = _arg1.readInt();
//            this.ASV2014_3010 = _arg1.readByte();
//            this._hitpoints = _arg1.readInt();
//            this.ASV2014_4514 = _arg1.readInt();
//            this._speed = _arg1.readShort();
//            this.ASV2014_4515 = _arg1.readShort();
//            this.ASV2014_4516 = _arg1.readShort();
//            this.ASV2014_4517 = _arg1.readShort();
//            this.ASV2014_4518 = _arg1.readShort();
//            this.ASV2014_4519 = _arg1.readShort();
//            this.ASV2014_4520 = _arg1.readByte();
//            this.ASV2014_4521 = _arg1.readByte();
//            this._settings = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4513);
//            _arg1.writeByte(this.ASV2014_3010);
//            _arg1.writeInt(this._hitpoints);
//            _arg1.writeInt(this.ASV2014_4514);
//            _arg1.writeShort(this._speed);
//            _arg1.writeShort(this.ASV2014_4515);
//            _arg1.writeShort(this.ASV2014_4516);
//            _arg1.writeShort(this.ASV2014_4517);
//            _arg1.writeShort(this.ASV2014_4518);
//            _arg1.writeShort(this.ASV2014_4519);
//            _arg1.writeByte(this.ASV2014_4520);
//            _arg1.writeByte(this.ASV2014_4521);
//            _arg1.writeByte(this._settings);
//        }
//
//        public function get ASV2014_3308():int
//        {
//            return (this.ASV2014_4513);
//        }
//
//        public function set ASV2014_3308(_arg1:int):void
//        {
//            this.ASV2014_4513 = _arg1;
//        }
//
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
//        }
//
//        public function get hitpoints():int
//        {
//            return (this._hitpoints);
//        }
//
//        public function set hitpoints(_arg1:int):void
//        {
//            this._hitpoints = _arg1;
//        }
//
//        public function get hitpointsMax():int
//        {
//            return (this.ASV2014_4514);
//        }
//
//        public function set hitpointsMax(_arg1:int):void
//        {
//            this.ASV2014_4514 = _arg1;
//        }
//
//        public function get speed():int
//        {
//            return (this._speed);
//        }
//
//        public function set speed(_arg1:int):void
//        {
//            this._speed = _arg1;
//        }
//
//        public function get speedMax():int
//        {
//            return (this.ASV2014_4515);
//        }
//
//        public function set speedMax(_arg1:int):void
//        {
//            this.ASV2014_4515 = _arg1;
//        }
//
//        public function get cannons():int
//        {
//            return (this.ASV2014_4516);
//        }
//
//        public function set cannons(_arg1:int):void
//        {
//            this.ASV2014_4516 = _arg1;
//        }
//
//        public function get cannonsMax():int
//        {
//            return (this.ASV2014_4517);
//        }
//
//        public function set cannonsMax(_arg1:int):void
//        {
//            this.ASV2014_4517 = _arg1;
//        }
//
//        public function get harpoons():int
//        {
//            return (this.ASV2014_4518);
//        }
//
//        public function set harpoons(_arg1:int):void
//        {
//            this.ASV2014_4518 = _arg1;
//        }
//
//        public function get harpoonsMax():int
//        {
//            return (this.ASV2014_4519);
//        }
//
//        public function set harpoonsMax(_arg1:int):void
//        {
//            this.ASV2014_4519 = _arg1;
//        }
//
//        public function get decks():int
//        {
//            return (this.ASV2014_4520);
//        }
//
//        public function set decks(_arg1:int):void
//        {
//            this.ASV2014_4520 = _arg1;
//        }
//
//        public function get decksMax():int
//        {
//            return (this.ASV2014_4521);
//        }
//
//        public function set decksMax(_arg1:int):void
//        {
//            this.ASV2014_4521 = _arg1;
//        }
//
//        public function get settings():int
//        {
//            return (this._settings);
//        }
//
//        public function set settings(_arg1:int):void
//        {
//            this._settings = _arg1;
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
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_289 = "\"W" (String#5697)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_3308 = "8!V" (String#12486)
// ASV2014_4513 = "!\"3" (String#17742)
// ASV2014_4514 = "41" (String#16972)
// ASV2014_4515 = "3#K" (String#15792)
// ASV2014_4516 = "@\"1" (String#16433)
// ASV2014_4517 = "`#u" (String#16538)
// ASV2014_4518 = "'\"," (String#7583)
// ASV2014_4519 = "6\"9" (String#18407)
// ASV2014_4520 = "%J" (String#18079)
// ASV2014_4521 = ",@" (String#18743)
//