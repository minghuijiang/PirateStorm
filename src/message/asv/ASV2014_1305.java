package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1305 extends Message{

	public static final int id = 1256;
	public int ASV2014_6316;
	public int ASV2014_6512;
	public boolean _notInFightFulfilled;
	public boolean _harbourFulfilled;
	public int ASV2014_5927;
	public boolean _underAttack;

	public ASV2014_1305(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6316 = data.readInt();
		this.ASV2014_6512 = data.readByte();
		this._notInFightFulfilled = data.readBoolean();
		this._harbourFulfilled = data.readBoolean();
		this.ASV2014_5927 = data.readInt();
		this._underAttack = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_6316);
		data.writeByte(this.ASV2014_6512);
		data.writeBoolean(this._notInFightFulfilled);
		data.writeBoolean(this._harbourFulfilled);
		data.writeInt(this.ASV2014_5927);
		data.writeBoolean(this._underAttack);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1305(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1305 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1256;
//
//        private var ASV2014_6500:int;
//        private var ASV2014_6511:int;
//        private var _notInFightFulfilled:Boolean;
//        private var _harbourFulfilled:Boolean;
//        private var ASV2014_6365:int;
//        private var _underAttack:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6500 = _arg1.readInt();
//            this.ASV2014_6511 = _arg1.readByte();
//            this._notInFightFulfilled = _arg1.readBoolean();
//            this._harbourFulfilled = _arg1.readBoolean();
//            this.ASV2014_6365 = _arg1.readInt();
//            this._underAttack = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6500);
//            _arg1.writeByte(this.ASV2014_6511);
//            _arg1.writeBoolean(this._notInFightFulfilled);
//            _arg1.writeBoolean(this._harbourFulfilled);
//            _arg1.writeInt(this.ASV2014_6365);
//            _arg1.writeBoolean(this._underAttack);
//        }
//
//        public function get ASV2014_6316():int
//        {
//            return (this.ASV2014_6500);
//        }
//
//        public function set ASV2014_6316(_arg1:int):void
//        {
//            this.ASV2014_6500 = _arg1;
//        }
//
//        public function get ASV2014_6512():int
//        {
//            return (this.ASV2014_6511);
//        }
//
//        public function set ASV2014_6512(_arg1:int):void
//        {
//            this.ASV2014_6511 = _arg1;
//        }
//
//        public function get notInFightFulfilled():Boolean
//        {
//            return (this._notInFightFulfilled);
//        }
//
//        public function set notInFightFulfilled(_arg1:Boolean):void
//        {
//            this._notInFightFulfilled = _arg1;
//        }
//
//        public function get harbourFulfilled():Boolean
//        {
//            return (this._harbourFulfilled);
//        }
//
//        public function set harbourFulfilled(_arg1:Boolean):void
//        {
//            this._harbourFulfilled = _arg1;
//        }
//
//        public function get ASV2014_5927():int
//        {
//            return (this.ASV2014_6365);
//        }
//
//        public function set ASV2014_5927(_arg1:int):void
//        {
//            this.ASV2014_6365 = _arg1;
//        }
//
//        public function get underAttack():Boolean
//        {
//            return (this._underAttack);
//        }
//
//        public function set underAttack(_arg1:Boolean):void
//        {
//            this._underAttack = _arg1;
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
// ASV2014_1305 = " #e" (String#7737)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5927 = "]!4" (String#5695)
// ASV2014_6316 = "-\"7" (String#13911)
// ASV2014_6365 = "'!o" (String#4366)
// ASV2014_6500 = "96" (String#8322)
// ASV2014_6511 = "^!j" (String#16283)
// ASV2014_6512 = "]!o" (String#22522)
//