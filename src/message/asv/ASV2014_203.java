package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_203 extends Message{

	public static final int id = 1373;
	public int _statTakeTheFlag;
	public int statTakeTheFlagScore;
	public int _statPointWithFlag;
	public int statPointWithFlagScore;
	public int _statSinkFlagCarrier;
	public int statSinkFlagCarrierScore;
	public int _statReturnOwnFlag;
	public int statReturnOwnFlagScore;
	public int _statDieWithFlag;
	public int statDieWithFlagScore;

	public ASV2014_203(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statTakeTheFlag = data.readShort();
		this.statTakeTheFlagScore = data.readInt();
		this._statPointWithFlag = data.readShort();
		this.statPointWithFlagScore = data.readInt();
		this._statSinkFlagCarrier = data.readShort();
		this.statSinkFlagCarrierScore = data.readInt();
		this._statReturnOwnFlag = data.readShort();
		this.statReturnOwnFlagScore = data.readInt();
		this._statDieWithFlag = data.readShort();
		this.statDieWithFlagScore = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._statTakeTheFlag);
		data.writeInt(this.statTakeTheFlagScore);
		data.writeShort(this._statPointWithFlag);
		data.writeInt(this.statPointWithFlagScore);
		data.writeShort(this._statSinkFlagCarrier);
		data.writeInt(this.statSinkFlagCarrierScore);
		data.writeShort(this._statReturnOwnFlag);
		data.writeInt(this.statReturnOwnFlagScore);
		data.writeShort(this._statDieWithFlag);
		data.writeInt(this.statDieWithFlagScore);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_203(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_203 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1373;
//
//        private var _statTakeTheFlag:int;
//        private var ASV2014_3950:int;
//        private var _statPointWithFlag:int;
//        private var ASV2014_3951:int;
//        private var _statSinkFlagCarrier:int;
//        private var ASV2014_3952:int;
//        private var _statReturnOwnFlag:int;
//        private var ASV2014_3953:int;
//        private var _statDieWithFlag:int;
//        private var ASV2014_3954:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statTakeTheFlag = _arg1.readShort();
//            this.ASV2014_3950 = _arg1.readInt();
//            this._statPointWithFlag = _arg1.readShort();
//            this.ASV2014_3951 = _arg1.readInt();
//            this._statSinkFlagCarrier = _arg1.readShort();
//            this.ASV2014_3952 = _arg1.readInt();
//            this._statReturnOwnFlag = _arg1.readShort();
//            this.ASV2014_3953 = _arg1.readInt();
//            this._statDieWithFlag = _arg1.readShort();
//            this.ASV2014_3954 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._statTakeTheFlag);
//            _arg1.writeInt(this.ASV2014_3950);
//            _arg1.writeShort(this._statPointWithFlag);
//            _arg1.writeInt(this.ASV2014_3951);
//            _arg1.writeShort(this._statSinkFlagCarrier);
//            _arg1.writeInt(this.ASV2014_3952);
//            _arg1.writeShort(this._statReturnOwnFlag);
//            _arg1.writeInt(this.ASV2014_3953);
//            _arg1.writeShort(this._statDieWithFlag);
//            _arg1.writeInt(this.ASV2014_3954);
//        }
//
//        public function get statTakeTheFlag():int
//        {
//            return (this._statTakeTheFlag);
//        }
//
//        public function set statTakeTheFlag(_arg1:int):void
//        {
//            this._statTakeTheFlag = _arg1;
//        }
//
//        public function get statTakeTheFlagScore():int
//        {
//            return (this.ASV2014_3950);
//        }
//
//        public function set statTakeTheFlagScore(_arg1:int):void
//        {
//            this.ASV2014_3950 = _arg1;
//        }
//
//        public function get statPointWithFlag():int
//        {
//            return (this._statPointWithFlag);
//        }
//
//        public function set statPointWithFlag(_arg1:int):void
//        {
//            this._statPointWithFlag = _arg1;
//        }
//
//        public function get statPointWithFlagScore():int
//        {
//            return (this.ASV2014_3951);
//        }
//
//        public function set statPointWithFlagScore(_arg1:int):void
//        {
//            this.ASV2014_3951 = _arg1;
//        }
//
//        public function get statSinkFlagCarrier():int
//        {
//            return (this._statSinkFlagCarrier);
//        }
//
//        public function set statSinkFlagCarrier(_arg1:int):void
//        {
//            this._statSinkFlagCarrier = _arg1;
//        }
//
//        public function get statSinkFlagCarrierScore():int
//        {
//            return (this.ASV2014_3952);
//        }
//
//        public function set statSinkFlagCarrierScore(_arg1:int):void
//        {
//            this.ASV2014_3952 = _arg1;
//        }
//
//        public function get statReturnOwnFlag():int
//        {
//            return (this._statReturnOwnFlag);
//        }
//
//        public function set statReturnOwnFlag(_arg1:int):void
//        {
//            this._statReturnOwnFlag = _arg1;
//        }
//
//        public function get statReturnOwnFlagScore():int
//        {
//            return (this.ASV2014_3953);
//        }
//
//        public function set statReturnOwnFlagScore(_arg1:int):void
//        {
//            this.ASV2014_3953 = _arg1;
//        }
//
//        public function get statDieWithFlag():int
//        {
//            return (this._statDieWithFlag);
//        }
//
//        public function set statDieWithFlag(_arg1:int):void
//        {
//            this._statDieWithFlag = _arg1;
//        }
//
//        public function get statDieWithFlagScore():int
//        {
//            return (this.ASV2014_3954);
//        }
//
//        public function set statDieWithFlagScore(_arg1:int):void
//        {
//            this.ASV2014_3954 = _arg1;
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
// ASV2014_203 = "+^" (String#8926)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3950 = "5U" (String#16164)
// ASV2014_3951 = "'\"3" (String#17359)
// ASV2014_3952 = "'L" (String#17987)
// ASV2014_3953 = "@#>" (String#16711)
// ASV2014_3954 = "#P" (String#18696)
//