package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_968 extends Message{

	public static final int id = 1427;
	public int _type;
	public int _userId;
	public String userName;
	public int _date;
	public String _text;

	public ASV2014_968(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._userId = data.readInt();
		this.userName = data.readUTF();
		this._date = data.readInt();
		this._text = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeInt(this._userId);
		data.writeUTF(this.userName);
		data.writeInt(this._date);
		data.writeUTF(this._text);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_968(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_968 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1427;
//
//        private var _type:int;
//        private var _userId:int;
//        private var ASV2014_2903:String;
//        private var _date:int;
//        private var _text:String;
//
//        public function ASV2014_968()
//        {
//            this.userName = "";
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
//            this._type = _arg1.readByte();
//            this._userId = _arg1.readInt();
//            this.ASV2014_2903 = _arg1.readUTF();
//            this._date = _arg1.readInt();
//            this._text = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_2903);
//            _arg1.writeInt(this._date);
//            _arg1.writeUTF(this._text);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
//        }
//
//        public function get userName():String
//        {
//            return (this.ASV2014_2903);
//        }
//
//        public function set userName(_arg1:String):void
//        {
//            this.ASV2014_2903 = _arg1;
//        }
//
//        public function get date():int
//        {
//            return (this._date);
//        }
//
//        public function set date(_arg1:int):void
//        {
//            this._date = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2903 = "6Z" (String#1373)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_968 = "1\"i" (String#12391)
//