package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SaveOptionMessage extends Message{

	public static final int id = 1051;
	public int ASV2014_2533;
	public int _value;

	public SaveOptionMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2533 = data.readShort();
		this._value = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.ASV2014_2533);
		data.writeInt(this._value);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SaveOptionMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_84 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1051;
//
//        private var ASV2014_3325:int;
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
//            this.ASV2014_3325 = _arg1.readShort();
//            this._value = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_3325);
//            _arg1.writeInt(this._value);
//        }
//
//        public function get ASV2014_2533():int
//        {
//            return (this.ASV2014_3325);
//        }
//
//        public function set ASV2014_2533(_arg1:int):void
//        {
//            this.ASV2014_3325 = _arg1;
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
// ASV2014_2533 = "6!r" (String#4063)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3325 = "9\"d" (String#8914)
// ASV2014_84 = "4B" (String#2574)
//