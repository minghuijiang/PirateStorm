package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_621 extends Message{

	public static final int id = 1479;
	public int _userId;
	public int _avatarId;
	public String _name;

	public ASV2014_621(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._avatarId = data.readByte();
		this._name = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeByte(this._avatarId);
		data.writeUTF(this._name);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_621(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_621 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1479;
//
//        private var _userId:int;
//        private var _avatarId:int;
//        private var _name:String;
//
//        public function ASV2014_621()
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
//            this._userId = _arg1.readInt();
//            this._avatarId = _arg1.readByte();
//            this._name = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeByte(this._avatarId);
//            _arg1.writeUTF(this._name);
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
// ASV2014_621 = "8!Y" (String#5380)
//