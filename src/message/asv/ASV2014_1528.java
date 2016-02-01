package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1528 extends Message{

	public static final int id = 1578;
	public int _errorCode;
	public String _text;

	public ASV2014_1528(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._errorCode = data.readShort();
		this._text = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._errorCode);
		data.writeUTF(this._text);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1528(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1528 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1578;
//
//        private var _errorCode:int;
//        private var _text:String;
//
//        public function ASV2014_1528()
//        {
//            this.text = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._errorCode = _arg1.readShort();
//            this._text = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._errorCode);
//            _arg1.writeUTF(this._text);
//        }
//
//        public function get errorCode():int
//        {
//            return (this._errorCode);
//        }
//
//        public function set errorCode(_arg1:int):void
//        {
//            this._errorCode = _arg1;
//        }
//
//        public function get text():String
//        {
//            return (this._text);
//        }
//
//        public function set text(_arg1:String):void
//        {
//            this._text = _arg1;
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
// ASV2014_1528 = "#\"1" (String#12289)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//