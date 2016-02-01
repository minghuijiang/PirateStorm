package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class NameInfo extends Message{

	public static final int id = 1116;
	public String _name;
	public int _avatarId;

	public NameInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._name = data.readUTF();
		this._avatarId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._name);
		data.writeByte(this._avatarId);
	}

	public void action(){
		user.userName=_name;
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new NameInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1269 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1116;
//
//        private var _name:String;
//        private var _avatarId:int;
//
//        public function ASV2014_1269()
//        {
//            this.name = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._name = _arg1.readUTF();
//            this._avatarId = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._name);
//            _arg1.writeByte(this._avatarId);
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1269 = "[\"2" (String#12553)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//