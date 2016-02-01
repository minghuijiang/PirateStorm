package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1105 extends Message{

	public static final int id = 1380;
	public int spotId;
	public int _teamId;
	public int _scorePoints;

	public ASV2014_1105(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.spotId = data.readByte();
		this._teamId = data.readByte();
		this._scorePoints = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.spotId);
		data.writeByte(this._teamId);
		data.writeShort(this._scorePoints);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1105(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1105 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1380;
//
//        private var ASV2014_6394:int;
//        private var _teamId:int;
//        private var _scorePoints:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6394 = _arg1.readByte();
//            this._teamId = _arg1.readByte();
//            this._scorePoints = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6394);
//            _arg1.writeByte(this._teamId);
//            _arg1.writeShort(this._scorePoints);
//        }
//
//        public function get spotId():int
//        {
//            return (this.ASV2014_6394);
//        }
//
//        public function set spotId(_arg1:int):void
//        {
//            this.ASV2014_6394 = _arg1;
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
//        public function get scorePoints():int
//        {
//            return (this._scorePoints);
//        }
//
//        public function set scorePoints(_arg1:int):void
//        {
//            this._scorePoints = _arg1;
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
// ASV2014_1105 = "<\"F" (String#12466)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6394 = "0v" (String#4523)
//