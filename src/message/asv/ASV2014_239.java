package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_239 extends Message{

	public static final int id = 1108;
	public int valueId;
	public int ASV2014_3244;
	public int _value;

	public ASV2014_239(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.valueId = data.readByte();
		this.ASV2014_3244 = data.readByte();
		this._value = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.valueId);
		data.writeByte(this.ASV2014_3244);
		data.writeInt(this._value);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_239(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_239 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1108;
//
//        private var ASV2014_4223:int;
//        private var ASV2014_4224:int;
//        private var _value:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4223 = _arg1.readByte();
//            this.ASV2014_4224 = _arg1.readByte();
//            this._value = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4223);
//            _arg1.writeByte(this.ASV2014_4224);
//            _arg1.writeInt(this._value);
//        }
//
//        public function get valueId():int
//        {
//            return (this.ASV2014_4223);
//        }
//
//        public function set valueId(_arg1:int):void
//        {
//            this.ASV2014_4223 = _arg1;
//        }
//
//        public function get ASV2014_3244():int
//        {
//            return (this.ASV2014_4224);
//        }
//
//        public function set ASV2014_3244(_arg1:int):void
//        {
//            this.ASV2014_4224 = _arg1;
//        }
//
//        public function get value():int
//        {
//            return (this._value);
//        }
//
//        public function set value(_arg1:int):void
//        {
//            this._value = _arg1;
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
// ASV2014_239 = "6##" (String#1881)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3244 = "\"!`" (String#4020)
// ASV2014_4223 = "+!P" (String#3487)
// ASV2014_4224 = "\"\"W" (String#4578)
//