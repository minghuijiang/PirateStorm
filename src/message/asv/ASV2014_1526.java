package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1526 extends Message{

	public static final int id = 1537;
	public int mapAId;
	public int _mapADirection;
	public int mapBId;
	public int _mapBDirection;

	public ASV2014_1526(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.mapAId = data.readByte();
		this._mapADirection = data.readByte();
		this.mapBId = data.readByte();
		this._mapBDirection = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.mapAId);
		data.writeByte(this._mapADirection);
		data.writeByte(this.mapBId);
		data.writeByte(this._mapBDirection);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1526(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1526 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1537;
//
//        private var ASV2014_6600:int;
//        private var _mapADirection:int;
//        private var ASV2014_6601:int;
//        private var _mapBDirection:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6600 = _arg1.readByte();
//            this._mapADirection = _arg1.readByte();
//            this.ASV2014_6601 = _arg1.readByte();
//            this._mapBDirection = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6600);
//            _arg1.writeByte(this._mapADirection);
//            _arg1.writeByte(this.ASV2014_6601);
//            _arg1.writeByte(this._mapBDirection);
//        }
//
//        public function get mapAId():int
//        {
//            return (this.ASV2014_6600);
//        }
//
//        public function set mapAId(_arg1:int):void
//        {
//            this.ASV2014_6600 = _arg1;
//        }
//
//        public function get mapADirection():int
//        {
//            return (this._mapADirection);
//        }
//
//        public function set mapADirection(_arg1:int):void
//        {
//            this._mapADirection = _arg1;
//        }
//
//        public function get mapBId():int
//        {
//            return (this.ASV2014_6601);
//        }
//
//        public function set mapBId(_arg1:int):void
//        {
//            this.ASV2014_6601 = _arg1;
//        }
//
//        public function get mapBDirection():int
//        {
//            return (this._mapBDirection);
//        }
//
//        public function set mapBDirection(_arg1:int):void
//        {
//            this._mapBDirection = _arg1;
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
// ASV2014_1526 = "5#7" (String#9835)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6600 = "9D" (String#8647)
// ASV2014_6601 = "7E" (String#8632)
//