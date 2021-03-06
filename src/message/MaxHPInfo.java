package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class MaxHPInfo extends Message{

	public static final int id = 1136;
	public int _userId;
	public int maxHp;

	public MaxHPInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.maxHp = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeInt(this.maxHp);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new MaxHPInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_983 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1136;
//
//        private var _userId:int;
//        private var ASV2014_6320:int;
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
//            this.ASV2014_6320 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeInt(this.ASV2014_6320);
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
//        public function get maxHp():int
//        {
//            return (this.ASV2014_6320);
//        }
//
//        public function set maxHp(_arg1:int):void
//        {
//            this.ASV2014_6320 = _arg1;
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
// ASV2014_6320 = ">!M" (String#8821)
// ASV2014_983 = ",8" (String#8179)
//