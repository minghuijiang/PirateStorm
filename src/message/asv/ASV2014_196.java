package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_196 extends Message{

	public static final int id = 1374;
	public int _statCaptureSpot;
	public int statCaptureSpotScore;
	public int _statDamageWall;
	public int statDamageWallScore;
	public int _statNeutralizeSpot;
	public int statNeutralizeSpotScore;
	public int _statSinkEnemyInSpot;
	public int statSinkEnemyInSpotScore;
	public int _statDieInSpot;
	public int statDieInSpotScore;

	public ASV2014_196(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statCaptureSpot = data.readShort();
		this.statCaptureSpotScore = data.readInt();
		this._statDamageWall = data.readShort();
		this.statDamageWallScore = data.readInt();
		this._statNeutralizeSpot = data.readShort();
		this.statNeutralizeSpotScore = data.readInt();
		this._statSinkEnemyInSpot = data.readShort();
		this.statSinkEnemyInSpotScore = data.readInt();
		this._statDieInSpot = data.readShort();
		this.statDieInSpotScore = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._statCaptureSpot);
		data.writeInt(this.statCaptureSpotScore);
		data.writeShort(this._statDamageWall);
		data.writeInt(this.statDamageWallScore);
		data.writeShort(this._statNeutralizeSpot);
		data.writeInt(this.statNeutralizeSpotScore);
		data.writeShort(this._statSinkEnemyInSpot);
		data.writeInt(this.statSinkEnemyInSpotScore);
		data.writeShort(this._statDieInSpot);
		data.writeInt(this.statDieInSpotScore);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_196(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_196 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1374;
//
//        private var _statCaptureSpot:int;
//        private var ASV2014_3926:int;
//        private var _statDamageWall:int;
//        private var ASV2014_3927:int;
//        private var _statNeutralizeSpot:int;
//        private var ASV2014_3928:int;
//        private var _statSinkEnemyInSpot:int;
//        private var ASV2014_3929:int;
//        private var _statDieInSpot:int;
//        private var ASV2014_3930:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statCaptureSpot = _arg1.readShort();
//            this.ASV2014_3926 = _arg1.readInt();
//            this._statDamageWall = _arg1.readShort();
//            this.ASV2014_3927 = _arg1.readInt();
//            this._statNeutralizeSpot = _arg1.readShort();
//            this.ASV2014_3928 = _arg1.readInt();
//            this._statSinkEnemyInSpot = _arg1.readShort();
//            this.ASV2014_3929 = _arg1.readInt();
//            this._statDieInSpot = _arg1.readShort();
//            this.ASV2014_3930 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._statCaptureSpot);
//            _arg1.writeInt(this.ASV2014_3926);
//            _arg1.writeShort(this._statDamageWall);
//            _arg1.writeInt(this.ASV2014_3927);
//            _arg1.writeShort(this._statNeutralizeSpot);
//            _arg1.writeInt(this.ASV2014_3928);
//            _arg1.writeShort(this._statSinkEnemyInSpot);
//            _arg1.writeInt(this.ASV2014_3929);
//            _arg1.writeShort(this._statDieInSpot);
//            _arg1.writeInt(this.ASV2014_3930);
//        }
//
//        public function get statCaptureSpot():int
//        {
//            return (this._statCaptureSpot);
//        }
//
//        public function set statCaptureSpot(_arg1:int):void
//        {
//            this._statCaptureSpot = _arg1;
//        }
//
//        public function get statCaptureSpotScore():int
//        {
//            return (this.ASV2014_3926);
//        }
//
//        public function set statCaptureSpotScore(_arg1:int):void
//        {
//            this.ASV2014_3926 = _arg1;
//        }
//
//        public function get statDamageWall():int
//        {
//            return (this._statDamageWall);
//        }
//
//        public function set statDamageWall(_arg1:int):void
//        {
//            this._statDamageWall = _arg1;
//        }
//
//        public function get statDamageWallScore():int
//        {
//            return (this.ASV2014_3927);
//        }
//
//        public function set statDamageWallScore(_arg1:int):void
//        {
//            this.ASV2014_3927 = _arg1;
//        }
//
//        public function get statNeutralizeSpot():int
//        {
//            return (this._statNeutralizeSpot);
//        }
//
//        public function set statNeutralizeSpot(_arg1:int):void
//        {
//            this._statNeutralizeSpot = _arg1;
//        }
//
//        public function get statNeutralizeSpotScore():int
//        {
//            return (this.ASV2014_3928);
//        }
//
//        public function set statNeutralizeSpotScore(_arg1:int):void
//        {
//            this.ASV2014_3928 = _arg1;
//        }
//
//        public function get statSinkEnemyInSpot():int
//        {
//            return (this._statSinkEnemyInSpot);
//        }
//
//        public function set statSinkEnemyInSpot(_arg1:int):void
//        {
//            this._statSinkEnemyInSpot = _arg1;
//        }
//
//        public function get statSinkEnemyInSpotScore():int
//        {
//            return (this.ASV2014_3929);
//        }
//
//        public function set statSinkEnemyInSpotScore(_arg1:int):void
//        {
//            this.ASV2014_3929 = _arg1;
//        }
//
//        public function get statDieInSpot():int
//        {
//            return (this._statDieInSpot);
//        }
//
//        public function set statDieInSpot(_arg1:int):void
//        {
//            this._statDieInSpot = _arg1;
//        }
//
//        public function get statDieInSpotScore():int
//        {
//            return (this.ASV2014_3930);
//        }
//
//        public function set statDieInSpotScore(_arg1:int):void
//        {
//            this.ASV2014_3930 = _arg1;
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
// ASV2014_196 = "^\"a" (String#9083)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3926 = "=\"s" (String#17062)
// ASV2014_3927 = "&!d" (String#18218)
// ASV2014_3928 = "4U" (String#18369)
// ASV2014_3929 = "5#M" (String#18687)
// ASV2014_3930 = "!!g" (String#17731)
//