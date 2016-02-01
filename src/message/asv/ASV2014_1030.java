package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1030 extends Message{

	public static final int id = 1258;
	public boolean _notInFightFulfilled;
	public int ASV2014_5927;
	public boolean _underAttack;

	public ASV2014_1030(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._notInFightFulfilled = data.readBoolean();
		this.ASV2014_5927 = data.readInt();
		this._underAttack = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._notInFightFulfilled);
		data.writeInt(this.ASV2014_5927);
		data.writeBoolean(this._underAttack);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1030(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1030 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1258;
//
//        private var _notInFightFulfilled:Boolean;
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
//            this._notInFightFulfilled = _arg1.readBoolean();
//            this.ASV2014_6365 = _arg1.readInt();
//            this._underAttack = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._notInFightFulfilled);
//            _arg1.writeInt(this.ASV2014_6365);
//            _arg1.writeBoolean(this._underAttack);
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
// ASV2014_1030 = "2\"G" (String#7962)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5927 = "]!4" (String#5695)
// ASV2014_6365 = "'!o" (String#4366)
//