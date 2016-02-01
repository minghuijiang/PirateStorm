package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1124 extends Message{

	public static final int id = 1447;
	public int _teamId;
	public int score;

	public ASV2014_1124(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readByte();
		this.score = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._teamId);
		data.writeShort(this.score);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1124(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1124 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1447;
//
//        private var _teamId:int;
//        private var ASV2014_6417:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._teamId = _arg1.readByte();
//            this.ASV2014_6417 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._teamId);
//            _arg1.writeShort(this.ASV2014_6417);
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
//        public function get score():int
//        {
//            return (this.ASV2014_6417);
//        }
//
//        public function set score(_arg1:int):void
//        {
//            this.ASV2014_6417 = _arg1;
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
// ASV2014_1124 = "!x" (String#9765)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6417 = "^#W" (String#16297)
//