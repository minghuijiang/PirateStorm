package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1428 extends Message{

	public static final int id = 1484;
	public int _userId;
	public String _name;
	public String _text;
	public int _avatarId;
	public int _level;
	public int rank;
	public int _lastLogin;

	public ASV2014_1428(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._name = data.readUTF();
		this._text = data.readUTF();
		this._avatarId = data.readByte();
		this._level = data.readByte();
		this.rank = data.readByte();
		this._lastLogin = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this._name);
		data.writeUTF(this._text);
		data.writeByte(this._avatarId);
		data.writeByte(this._level);
		data.writeByte(this.rank);
		data.writeInt(this._lastLogin);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1428(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1428 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1484;
//
//        private var _userId:int;
//        private var _name:String;
//        private var _text:String;
//        private var _avatarId:int;
//        private var _level:int;
//        private var ASV2014_3011:int;
//        private var _lastLogin:int;
//
//        public function ASV2014_1428()
//        {
//            this.name = "";
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
//            this._userId = _arg1.readInt();
//            this._name = _arg1.readUTF();
//            this._text = _arg1.readUTF();
//            this._avatarId = _arg1.readByte();
//            this._level = _arg1.readByte();
//            this.ASV2014_3011 = _arg1.readByte();
//            this._lastLogin = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this._name);
//            _arg1.writeUTF(this._text);
//            _arg1.writeByte(this._avatarId);
//            _arg1.writeByte(this._level);
//            _arg1.writeByte(this.ASV2014_3011);
//            _arg1.writeInt(this._lastLogin);
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
//        public function get name():String
//        {
//            return (this._name);
//        }
//
//        public function set name(_arg1:String):void
//        {
//            this._name = _arg1;
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
//        public function get avatarId():int
//        {
//            return (this._avatarId);
//        }
//
//        public function set avatarId(_arg1:int):void
//        {
//            this._avatarId = _arg1;
//        }
//
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
//        }
//
//        public function get rank():int
//        {
//            return (this.ASV2014_3011);
//        }
//
//        public function set rank(_arg1:int):void
//        {
//            this.ASV2014_3011 = _arg1;
//        }
//
//        public function get lastLogin():int
//        {
//            return (this._lastLogin);
//        }
//
//        public function set lastLogin(_arg1:int):void
//        {
//            this._lastLogin = _arg1;
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
// ASV2014_1428 = "[$" (String#13506)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3011 = "5#0" (String#1515)
//