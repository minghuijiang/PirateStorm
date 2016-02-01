package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_400 extends Message{

	public static final int id = 1053;
	public int elementId;
	public int _value1;
	public int _value2;
	public int _positionIndex;

	public ASV2014_400(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.elementId = data.readShort();
		this._value1 = data.readShort();
		this._value2 = data.readShort();
		this._positionIndex = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.elementId);
		data.writeShort(this._value1);
		data.writeShort(this._value2);
		data.writeShort(this._positionIndex);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_400(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_400 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1053;
//
//        private var ASV2014_4923:int;
//        private var _value1:int;
//        private var _value2:int;
//        private var _positionIndex:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4923 = _arg1.readShort();
//            this._value1 = _arg1.readShort();
//            this._value2 = _arg1.readShort();
//            this._positionIndex = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_4923);
//            _arg1.writeShort(this._value1);
//            _arg1.writeShort(this._value2);
//            _arg1.writeShort(this._positionIndex);
//        }
//
//        public function get elementId():int
//        {
//            return (this.ASV2014_4923);
//        }
//
//        public function set elementId(_arg1:int):void
//        {
//            this.ASV2014_4923 = _arg1;
//        }
//
//        public function get value1():int
//        {
//            return (this._value1);
//        }
//
//        public function set value1(_arg1:int):void
//        {
//            this._value1 = _arg1;
//        }
//
//        public function get value2():int
//        {
//            return (this._value2);
//        }
//
//        public function set value2(_arg1:int):void
//        {
//            this._value2 = _arg1;
//        }
//
//        public function get positionIndex():int
//        {
//            return (this._positionIndex);
//        }
//
//        public function set positionIndex(_arg1:int):void
//        {
//            this._positionIndex = _arg1;
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
// ASV2014_400 = "?Q" (String#6847)
// ASV2014_4923 = "-\"P" (String#15831)
//