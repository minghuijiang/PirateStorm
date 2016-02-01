package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1466 extends Message{

	public static final int id = 1246;
	public int _userId;
	public int _teamId;
	public String _name;
	public int _statAssists;
	public int _statKills;
	public int _statDeath;
	public int _statDmgInflicted;
	public int _statDmgReceived;
	public int _statDmgPerShotAvg;
	public String _guildTag;
	public String guildName;

	public ASV2014_1466(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._teamId = data.readByte();
		this._name = data.readUTF();
		this._statAssists = data.readShort();
		this._statKills = data.readShort();
		this._statDeath = data.readShort();
		this._statDmgInflicted = data.readInt();
		this._statDmgReceived = data.readInt();
		this._statDmgPerShotAvg = data.readShort();
		this._guildTag = data.readUTF();
		this.guildName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeByte(this._teamId);
		data.writeUTF(this._name);
		data.writeShort(this._statAssists);
		data.writeShort(this._statKills);
		data.writeShort(this._statDeath);
		data.writeInt(this._statDmgInflicted);
		data.writeInt(this._statDmgReceived);
		data.writeShort(this._statDmgPerShotAvg);
		data.writeUTF(this._guildTag);
		data.writeUTF(this.guildName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1466(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1466 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1246;
//
//        private var _userId:int;
//        private var _teamId:int;
//        private var _name:String;
//        private var _statAssists:int;
//        private var _statKills:int;
//        private var _statDeath:int;
//        private var _statDmgInflicted:int;
//        private var _statDmgReceived:int;
//        private var _statDmgPerShotAvg:int;
//        private var _guildTag:String;
//        private var ASV2014_4309:String;
//
//        public function ASV2014_1466()
//        {
//            this.name = "";
//            this.guildTag = "";
//            this.guildName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._teamId = _arg1.readByte();
//            this._name = _arg1.readUTF();
//            this._statAssists = _arg1.readShort();
//            this._statKills = _arg1.readShort();
//            this._statDeath = _arg1.readShort();
//            this._statDmgInflicted = _arg1.readInt();
//            this._statDmgReceived = _arg1.readInt();
//            this._statDmgPerShotAvg = _arg1.readShort();
//            this._guildTag = _arg1.readUTF();
//            this.ASV2014_4309 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeByte(this._teamId);
//            _arg1.writeUTF(this._name);
//            _arg1.writeShort(this._statAssists);
//            _arg1.writeShort(this._statKills);
//            _arg1.writeShort(this._statDeath);
//            _arg1.writeInt(this._statDmgInflicted);
//            _arg1.writeInt(this._statDmgReceived);
//            _arg1.writeShort(this._statDmgPerShotAvg);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeUTF(this.ASV2014_4309);
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
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
//        }
//
//        public function get name():String
//        {
//            return (this._name);
//        }
//
//        public function set name(_arg1:String):void
//        {
//            this._name = _arg1;
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
//        public function get guildTag():String
//        {
//            return (this._guildTag);
//        }
//
//        public function set guildTag(_arg1:String):void
//        {
//            this._guildTag = _arg1;
//        }
//
//        public function get guildName():String
//        {
//            return (this.ASV2014_4309);
//        }
//
//        public function set guildName(_arg1:String):void
//        {
//            this.ASV2014_4309 = _arg1;
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
// ASV2014_1466 = "?\"f" (String#8441)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4309 = "1d" (String#2658)
//