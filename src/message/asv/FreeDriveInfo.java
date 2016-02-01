package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class FreeDriveInfo extends Message{

	public static final int id = 1511;
	public int _key;
	public int _value;
	public boolean initValue;

	public FreeDriveInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._key = data.readByte();
		this._value = data.readInt();
		this.initValue = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._key);
		data.writeInt(this._value);
		data.writeBoolean(this.initValue);
	}

	public void action(){
		if(_key==1){
			user.freeDive = _value;
		}
		//user.setMsg("Free drive: "+_value);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new FreeDriveInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_977 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1511;
//
//        private var _key:int;
//        private var _value:int;
//        private var ASV2014_6317:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._key = _arg1.readByte();
//            this._value = _arg1.readInt();
//            this.ASV2014_6317 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._key);
//            _arg1.writeInt(this._value);
//            _arg1.writeBoolean(this.ASV2014_6317);
//        }
//
//        public function get key():int
//        {
//            return (this._key);
//        }
//
//        public function set key(_arg1:int):void
//        {
//            this._key = _arg1;
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
//        public function get initValue():Boolean
//        {
//            return (this.ASV2014_6317);
//        }
//
//        public function set initValue(_arg1:Boolean):void
//        {
//            this.ASV2014_6317 = _arg1;
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
// ASV2014_6317 = "&!_" (String#18350)
// ASV2014_977 = "+!B" (String#12909)
//