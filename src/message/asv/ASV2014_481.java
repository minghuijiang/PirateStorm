package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_481 extends Message{

	public static final int id = 1368;
	public int _userId;
	public int _statAssists;
	public int _statKills;
	public int _statDeath;
	public int _statDmgInflicted;
	public int _statDmgReceived;
	public int _statDmgPerShotAvg;

	public ASV2014_481(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._statAssists = data.readByte();
		this._statKills = data.readByte();
		this._statDeath = data.readByte();
		this._statDmgInflicted = data.readInt();
		this._statDmgReceived = data.readInt();
		this._statDmgPerShotAvg = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeByte(this._statAssists);
		data.writeByte(this._statKills);
		data.writeByte(this._statDeath);
		data.writeInt(this._statDmgInflicted);
		data.writeInt(this._statDmgReceived);
		data.writeShort(this._statDmgPerShotAvg);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_481(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_481 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1368;
//
//        private var _userId:int;
//        private var _statAssists:int;
//        private var _statKills:int;
//        private var _statDeath:int;
//        private var _statDmgInflicted:int;
//        private var _statDmgReceived:int;
//        private var _statDmgPerShotAvg:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._statAssists = _arg1.readByte();
//            this._statKills = _arg1.readByte();
//            this._statDeath = _arg1.readByte();
//            this._statDmgInflicted = _arg1.readInt();
//            this._statDmgReceived = _arg1.readInt();
//            this._statDmgPerShotAvg = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeByte(this._statAssists);
//            _arg1.writeByte(this._statKills);
//            _arg1.writeByte(this._statDeath);
//            _arg1.writeInt(this._statDmgInflicted);
//            _arg1.writeInt(this._statDmgReceived);
//            _arg1.writeShort(this._statDmgPerShotAvg);
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
//        }
//
//        public function get statAssists():int
//        {
//            return (this._statAssists);
//        }
//
//        public function set statAssists(_arg1:int):void
//        {
//            this._statAssists = _arg1;
//        }
//
//        public function get statKills():int
//        {
//            return (this._statKills);
//        }
//
//        public function set statKills(_arg1:int):void
//        {
//            this._statKills = _arg1;
//        }
//
//        public function get statDeath():int
//        {
//            return (this._statDeath);
//        }
//
//        public function set statDeath(_arg1:int):void
//        {
//            this._statDeath = _arg1;
//        }
//
//        public function get statDmgInflicted():int
//        {
//            return (this._statDmgInflicted);
//        }
//
//        public function set statDmgInflicted(_arg1:int):void
//        {
//            this._statDmgInflicted = _arg1;
//        }
//
//        public function get statDmgReceived():int
//        {
//            return (this._statDmgReceived);
//        }
//
//        public function set statDmgReceived(_arg1:int):void
//        {
//            this._statDmgReceived = _arg1;
//        }
//
//        public function get statDmgPerShotAvg():int
//        {
//            return (this._statDmgPerShotAvg);
//        }
//
//        public function set statDmgPerShotAvg(_arg1:int):void
//        {
//            this._statDmgPerShotAvg = _arg1;
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
// ASV2014_481 = "3#b" (String#13103)
//