package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class PirateBallGoalPositionsMessage extends Message{

	public static final int id = 1379;
	public int _a1x;
	public int _a1y;
	public int _a2x;
	public int _a2y;
	public int _b1x;
	public int _b1y;
	public int _b2x;
	public int _b2y;

	public PirateBallGoalPositionsMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._a1x = data.readShort();
		this._a1y = data.readShort();
		this._a2x = data.readShort();
		this._a2y = data.readShort();
		this._b1x = data.readShort();
		this._b1y = data.readShort();
		this._b2x = data.readShort();
		this._b2y = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._a1x);
		data.writeShort(this._a1y);
		data.writeShort(this._a2x);
		data.writeShort(this._a2y);
		data.writeShort(this._b1x);
		data.writeShort(this._b1y);
		data.writeShort(this._b2x);
		data.writeShort(this._b2y);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new PirateBallGoalPositionsMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class PirateBallGoalPositionsMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1379;
//
//        private var _a1x:int;
//        private var _a1y:int;
//        private var _a2x:int;
//        private var _a2y:int;
//        private var _b1x:int;
//        private var _b1y:int;
//        private var _b2x:int;
//        private var _b2y:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._a1x = _arg1.readShort();
//            this._a1y = _arg1.readShort();
//            this._a2x = _arg1.readShort();
//            this._a2y = _arg1.readShort();
//            this._b1x = _arg1.readShort();
//            this._b1y = _arg1.readShort();
//            this._b2x = _arg1.readShort();
//            this._b2y = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._a1x);
//            _arg1.writeShort(this._a1y);
//            _arg1.writeShort(this._a2x);
//            _arg1.writeShort(this._a2y);
//            _arg1.writeShort(this._b1x);
//            _arg1.writeShort(this._b1y);
//            _arg1.writeShort(this._b2x);
//            _arg1.writeShort(this._b2y);
//        }
//
//        public function get a1x():int
//        {
//            return (this._a1x);
//        }
//
//        public function set a1x(_arg1:int):void
//        {
//            this._a1x = _arg1;
//        }
//
//        public function get a1y():int
//        {
//            return (this._a1y);
//        }
//
//        public function set a1y(_arg1:int):void
//        {
//            this._a1y = _arg1;
//        }
//
//        public function get a2x():int
//        {
//            return (this._a2x);
//        }
//
//        public function set a2x(_arg1:int):void
//        {
//            this._a2x = _arg1;
//        }
//
//        public function get a2y():int
//        {
//            return (this._a2y);
//        }
//
//        public function set a2y(_arg1:int):void
//        {
//            this._a2y = _arg1;
//        }
//
//        public function get b1x():int
//        {
//            return (this._b1x);
//        }
//
//        public function set b1x(_arg1:int):void
//        {
//            this._b1x = _arg1;
//        }
//
//        public function get b1y():int
//        {
//            return (this._b1y);
//        }
//
//        public function set b1y(_arg1:int):void
//        {
//            this._b1y = _arg1;
//        }
//
//        public function get b2x():int
//        {
//            return (this._b2x);
//        }
//
//        public function set b2x(_arg1:int):void
//        {
//            this._b2x = _arg1;
//        }
//
//        public function get b2y():int
//        {
//            return (this._b2y);
//        }
//
//        public function set b2y(_arg1:int):void
//        {
//            this._b2y = _arg1;
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
//