package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1078 extends Message{

	public static final int id = 1349;
	public int _userId;
	public String userName;
	public int _type;
	public int _countdown;
	public int _avatarId;

	public ASV2014_1078(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.userName = data.readUTF();
		this._type = data.readByte();
		this._countdown = data.readByte();
		this._avatarId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this.userName);
		data.writeByte(this._type);
		data.writeByte(this._countdown);
		data.writeByte(this._avatarId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1078(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1078 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1349;
//
//        private var _userId:int;
//        private var ASV2014_2903:String;
//        private var _type:int;
//        private var _countdown:int;
//        private var _avatarId:int;
//
//        public function ASV2014_1078()
//        {
//            this.userName = "";
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
//            this.ASV2014_2903 = _arg1.readUTF();
//            this._type = _arg1.readByte();
//            this._countdown = _arg1.readByte();
//            this._avatarId = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_2903);
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this._countdown);
//            _arg1.writeByte(this._avatarId);
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
//        public function get countdown():int
//        {
//            return (this._countdown);
//        }
//
//        public function set countdown(_arg1:int):void
//        {
//            this._countdown = _arg1;
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
// ASV2014_1078 = "&#f" (String#12821)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2903 = "6Z" (String#1373)
// ASV2014_30 = ";#V" (String#144)
//