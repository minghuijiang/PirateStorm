package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_198 extends Message{

	public static final int id = 1375;
	public int _statDealMostDamage;
	public int statDealMostDamageScore;
	public int _statDamageTower;
	public int statDamageTowerScore;
	public int _statDamagePlayer;
	public int statDamagePlayerScore;
	public int _statFirstHitTower;
	public int statFirstHitTowerScore;
	public int _statLastHitTower;
	public int statLastHitTowerScore;

	public ASV2014_198(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statDealMostDamage = data.readShort();
		this.statDealMostDamageScore = data.readInt();
		this._statDamageTower = data.readShort();
		this.statDamageTowerScore = data.readInt();
		this._statDamagePlayer = data.readShort();
		this.statDamagePlayerScore = data.readInt();
		this._statFirstHitTower = data.readShort();
		this.statFirstHitTowerScore = data.readInt();
		this._statLastHitTower = data.readShort();
		this.statLastHitTowerScore = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._statDealMostDamage);
		data.writeInt(this.statDealMostDamageScore);
		data.writeShort(this._statDamageTower);
		data.writeInt(this.statDamageTowerScore);
		data.writeShort(this._statDamagePlayer);
		data.writeInt(this.statDamagePlayerScore);
		data.writeShort(this._statFirstHitTower);
		data.writeInt(this.statFirstHitTowerScore);
		data.writeShort(this._statLastHitTower);
		data.writeInt(this.statLastHitTowerScore);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_198(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_198 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1375;
//
//        private var _statDealMostDamage:int;
//        private var ASV2014_3937:int;
//        private var _statDamageTower:int;
//        private var ASV2014_3938:int;
//        private var _statDamagePlayer:int;
//        private var ASV2014_3939:int;
//        private var _statFirstHitTower:int;
//        private var ASV2014_3940:int;
//        private var _statLastHitTower:int;
//        private var ASV2014_3941:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statDealMostDamage = _arg1.readShort();
//            this.ASV2014_3937 = _arg1.readInt();
//            this._statDamageTower = _arg1.readShort();
//            this.ASV2014_3938 = _arg1.readInt();
//            this._statDamagePlayer = _arg1.readShort();
//            this.ASV2014_3939 = _arg1.readInt();
//            this._statFirstHitTower = _arg1.readShort();
//            this.ASV2014_3940 = _arg1.readInt();
//            this._statLastHitTower = _arg1.readShort();
//            this.ASV2014_3941 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._statDealMostDamage);
//            _arg1.writeInt(this.ASV2014_3937);
//            _arg1.writeShort(this._statDamageTower);
//            _arg1.writeInt(this.ASV2014_3938);
//            _arg1.writeShort(this._statDamagePlayer);
//            _arg1.writeInt(this.ASV2014_3939);
//            _arg1.writeShort(this._statFirstHitTower);
//            _arg1.writeInt(this.ASV2014_3940);
//            _arg1.writeShort(this._statLastHitTower);
//            _arg1.writeInt(this.ASV2014_3941);
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
//        public function get statDamageTower():int
//        {
//            return (this._statDamageTower);
//        }
//
//        public function set statDamageTower(_arg1:int):void
//        {
//            this._statDamageTower = _arg1;
//        }
//
//        public function get statDamageTowerScore():int
//        {
//            return (this.ASV2014_3938);
//        }
//
//        public function set statDamageTowerScore(_arg1:int):void
//        {
//            this.ASV2014_3938 = _arg1;
//        }
//
//        public function get statDamagePlayer():int
//        {
//            return (this._statDamagePlayer);
//        }
//
//        public function set statDamagePlayer(_arg1:int):void
//        {
//            this._statDamagePlayer = _arg1;
//        }
//
//        public function get statDamagePlayerScore():int
//        {
//            return (this.ASV2014_3939);
//        }
//
//        public function set statDamagePlayerScore(_arg1:int):void
//        {
//            this.ASV2014_3939 = _arg1;
//        }
//
//        public function get statFirstHitTower():int
//        {
//            return (this._statFirstHitTower);
//        }
//
//        public function set statFirstHitTower(_arg1:int):void
//        {
//            this._statFirstHitTower = _arg1;
//        }
//
//        public function get statFirstHitTowerScore():int
//        {
//            return (this.ASV2014_3940);
//        }
//
//        public function set statFirstHitTowerScore(_arg1:int):void
//        {
//            this.ASV2014_3940 = _arg1;
//        }
//
//        public function get statLastHitTower():int
//        {
//            return (this._statLastHitTower);
//        }
//
//        public function set statLastHitTower(_arg1:int):void
//        {
//            this._statLastHitTower = _arg1;
//        }
//
//        public function get statLastHitTowerScore():int
//        {
//            return (this.ASV2014_3941);
//        }
//
//        public function set statLastHitTowerScore(_arg1:int):void
//        {
//            this.ASV2014_3941 = _arg1;
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
// ASV2014_198 = ">\"Z" (String#8540)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3937 = "+\"i" (String#8935)
// ASV2014_3938 = "<\">" (String#8727)
// ASV2014_3939 = "'#'" (String#17193)
// ASV2014_3940 = "5#!" (String#18238)
// ASV2014_3941 = "@=" (String#18625)
//