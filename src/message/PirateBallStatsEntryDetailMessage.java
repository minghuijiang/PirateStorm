package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class PirateBallStatsEntryDetailMessage extends Message{

	public static final int id = 1376;
	public int _statDamageBall;
	public int statDamageBallScore;
	public int _statDealMostDamage;
	public int statDealMostDamageScore;
	public int _statHitPlayer;
	public int statHitPlayerScore;
	public int _statKillPlayer;
	public int statKillPlayerScore;
	public int _statGoalHit;
	public int statGoalHitScore;

	public PirateBallStatsEntryDetailMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statDamageBall = data.readShort();
		this.statDamageBallScore = data.readInt();
		this._statDealMostDamage = data.readShort();
		this.statDealMostDamageScore = data.readInt();
		this._statHitPlayer = data.readShort();
		this.statHitPlayerScore = data.readInt();
		this._statKillPlayer = data.readShort();
		this.statKillPlayerScore = data.readInt();
		this._statGoalHit = data.readShort();
		this.statGoalHitScore = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._statDamageBall);
		data.writeInt(this.statDamageBallScore);
		data.writeShort(this._statDealMostDamage);
		data.writeInt(this.statDealMostDamageScore);
		data.writeShort(this._statHitPlayer);
		data.writeInt(this.statHitPlayerScore);
		data.writeShort(this._statKillPlayer);
		data.writeInt(this.statKillPlayerScore);
		data.writeShort(this._statGoalHit);
		data.writeInt(this.statGoalHitScore);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new PirateBallStatsEntryDetailMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class PirateBallStatsEntryDetailMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1376;
//
//        private var _statDamageBall:int;
//        private var ASV2014_3942:int;
//        private var _statDealMostDamage:int;
//        private var ASV2014_3937:int;
//        private var _statHitPlayer:int;
//        private var ASV2014_3943:int;
//        private var _statKillPlayer:int;
//        private var ASV2014_3944:int;
//        private var _statGoalHit:int;
//        private var ASV2014_3945:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statDamageBall = _arg1.readShort();
//            this.ASV2014_3942 = _arg1.readInt();
//            this._statDealMostDamage = _arg1.readShort();
//            this.ASV2014_3937 = _arg1.readInt();
//            this._statHitPlayer = _arg1.readShort();
//            this.ASV2014_3943 = _arg1.readInt();
//            this._statKillPlayer = _arg1.readShort();
//            this.ASV2014_3944 = _arg1.readInt();
//            this._statGoalHit = _arg1.readShort();
//            this.ASV2014_3945 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._statDamageBall);
//            _arg1.writeInt(this.ASV2014_3942);
//            _arg1.writeShort(this._statDealMostDamage);
//            _arg1.writeInt(this.ASV2014_3937);
//            _arg1.writeShort(this._statHitPlayer);
//            _arg1.writeInt(this.ASV2014_3943);
//            _arg1.writeShort(this._statKillPlayer);
//            _arg1.writeInt(this.ASV2014_3944);
//            _arg1.writeShort(this._statGoalHit);
//            _arg1.writeInt(this.ASV2014_3945);
//        }
//
//        public function get statDamageBall():int
//        {
//            return (this._statDamageBall);
//        }
//
//        public function set statDamageBall(_arg1:int):void
//        {
//            this._statDamageBall = _arg1;
//        }
//
//        public function get statDamageBallScore():int
//        {
//            return (this.ASV2014_3942);
//        }
//
//        public function set statDamageBallScore(_arg1:int):void
//        {
//            this.ASV2014_3942 = _arg1;
//        }
//
//        public function get statDealMostDamage():int
//        {
//            return (this._statDealMostDamage);
//        }
//
//        public function set statDealMostDamage(_arg1:int):void
//        {
//            this._statDealMostDamage = _arg1;
//        }
//
//        public function get statDealMostDamageScore():int
//        {
//            return (this.ASV2014_3937);
//        }
//
//        public function set statDealMostDamageScore(_arg1:int):void
//        {
//            this.ASV2014_3937 = _arg1;
//        }
//
//        public function get statHitPlayer():int
//        {
//            return (this._statHitPlayer);
//        }
//
//        public function set statHitPlayer(_arg1:int):void
//        {
//            this._statHitPlayer = _arg1;
//        }
//
//        public function get statHitPlayerScore():int
//        {
//            return (this.ASV2014_3943);
//        }
//
//        public function set statHitPlayerScore(_arg1:int):void
//        {
//            this.ASV2014_3943 = _arg1;
//        }
//
//        public function get statKillPlayer():int
//        {
//            return (this._statKillPlayer);
//        }
//
//        public function set statKillPlayer(_arg1:int):void
//        {
//            this._statKillPlayer = _arg1;
//        }
//
//        public function get statKillPlayerScore():int
//        {
//            return (this.ASV2014_3944);
//        }
//
//        public function set statKillPlayerScore(_arg1:int):void
//        {
//            this.ASV2014_3944 = _arg1;
//        }
//
//        public function get statGoalHit():int
//        {
//            return (this._statGoalHit);
//        }
//
//        public function set statGoalHit(_arg1:int):void
//        {
//            this._statGoalHit = _arg1;
//        }
//
//        public function get statGoalHitScore():int
//        {
//            return (this.ASV2014_3945);
//        }
//
//        public function set statGoalHitScore(_arg1:int):void
//        {
//            this.ASV2014_3945 = _arg1;
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
// ASV2014_3937 = "+\"i" (String#8935)
// ASV2014_3942 = "?\"g" (String#16198)
// ASV2014_3943 = "6#5" (String#19048)
// ASV2014_3944 = "^\"+" (String#16327)
// ASV2014_3945 = "7#>" (String#16787)
//