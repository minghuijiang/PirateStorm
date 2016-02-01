package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1495 extends Message{

	public static final int id = 1001;
	public String _value;

	public ASV2014_1495(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._value = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._value);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1495(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1495 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1001;
//
//        private var _value:String;
//
//        public function ASV2014_1495()
//        {
//            this.value = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._value = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._value);
//        }
//
//        public function get value():String
//        {
//            return (this._value);
//        }
//
//        public function set value(_arg1:String):void
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
// ASV2014_1495 = "?\"?" (String#15159)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//