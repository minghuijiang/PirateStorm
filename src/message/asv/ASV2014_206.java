package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_206 extends Message{

	public static final int id = 1371;
	public int ASV2014_2861;
	public int _statAssists;
	public int _statKills;
	public int _statDeath;
	public int _statDmgInflicted;
	public int _statDmgReceived;
	public int _statDmgPerShotAvg;
	public int _statScore;
	public MessageList statScoreDetails;
	public Message _details;

	public ASV2014_206(User user) {
		super(user);
		statScoreDetails = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2861 = data.readInt();
		this._statAssists = data.readShort();
		this._statKills = data.readShort();
		this._statDeath = data.readShort();
		this._statDmgInflicted = data.readInt();
		this._statDmgReceived = data.readInt();
		this._statDmgPerShotAvg = data.readShort();
		this._statScore = data.readInt();
		this.statScoreDetails.deserialize(data);
		this._details = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_2861);
		data.writeShort(this._statAssists);
		data.writeShort(this._statKills);
		data.writeShort(this._statDeath);
		data.writeInt(this._statDmgInflicted);
		data.writeInt(this._statDmgReceived);
		data.writeShort(this._statDmgPerShotAvg);
		data.writeInt(this._statScore);
		this.statScoreDetails.serialize(data);
		component.ClientSocket.writeMessage(this._details, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_206(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_206 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1371;
//
//        private var ASV2014_3957:int;
//        private var _statAssists:int;
//        private var _statKills:int;
//        private var _statDeath:int;
//        private var _statDmgInflicted:int;
//        private var _statDmgReceived:int;
//        private var _statDmgPerShotAvg:int;
//        private var _statScore:int;
//        private var ASV2014_3958:ASV2014_194;
//        private var _details:ASV2014_30;
//
//        public function ASV2014_206()
//        {
//            this.ASV2014_3958 = new ASV2014_194();
//            super();
//            this.statScoreDetails = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3957 = _arg1.readInt();
//            this._statAssists = _arg1.readShort();
//            this._statKills = _arg1.readShort();
//            this._statDeath = _arg1.readShort();
//            this._statDmgInflicted = _arg1.readInt();
//            this._statDmgReceived = _arg1.readInt();
//            this._statDmgPerShotAvg = _arg1.readShort();
//            this._statScore = _arg1.readInt();
//            this.ASV2014_3958.deserialize(_arg1);
//            this._details = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3957);
//            _arg1.writeShort(this._statAssists);
//            _arg1.writeShort(this._statKills);
//            _arg1.writeShort(this._statDeath);
//            _arg1.writeInt(this._statDmgInflicted);
//            _arg1.writeInt(this._statDmgReceived);
//            _arg1.writeShort(this._statDmgPerShotAvg);
//            _arg1.writeInt(this._statScore);
//            this.ASV2014_3958.ASV2014_2336(_arg1);
//            ASV2014_229.writeMessage(this._details, _arg1);
//        }
//
//        public function get ASV2014_2861():int
//        {
//            return (this.ASV2014_3957);
//        }
//
//        public function set ASV2014_2861(_arg1:int):void
//        {
//            this.ASV2014_3957 = _arg1;
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
//        public function get statScore():int
//        {
//            return (this._statScore);
//        }
//
//        public function set statScore(_arg1:int):void
//        {
//            this._statScore = _arg1;
//        }
//
//        public function get statScoreDetails():ASV2014_194
//        {
//            return (this.ASV2014_3958);
//        }
//
//        public function set statScoreDetails(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3958 = _arg1;
//        }
//
//        public function get details():ASV2014_30
//        {
//            return (this._details);
//        }
//
//        public function set details(_arg1:ASV2014_30):void
//        {
//            this._details = _arg1;
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
// ASV2014_206 = "5#W" (String#5401)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2861 = "7#T" (String#4044)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3957 = "=!c" (String#2277)
// ASV2014_3958 = "<\"G" (String#14178)
//