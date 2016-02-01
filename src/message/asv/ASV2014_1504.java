package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1504 extends Message{

	public static final int id = 1588;
	public int _userId;
	public String _name;
	public int _avatarId;
	public int ASV2014_4271;
	public int rank;

	public ASV2014_1504(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._name = data.readUTF();
		this._avatarId = data.readByte();
		this.ASV2014_4271 = data.readInt();
		this.rank = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this._name);
		data.writeByte(this._avatarId);
		data.writeInt(this.ASV2014_4271);
		data.writeInt(this.rank);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1504(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1504 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1588;
//
//        private var _userId:int;
//        private var _name:String;
//        private var _avatarId:int;
//        private var ASV2014_4268:int;
//        private var ASV2014_3011:int;
//
//        public function ASV2014_1504()
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
//            this._name = _arg1.readUTF();
//            this._avatarId = _arg1.readByte();
//            this.ASV2014_4268 = _arg1.readInt();
//            this.ASV2014_3011 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this._name);
//            _arg1.writeByte(this._avatarId);
//            _arg1.writeInt(this.ASV2014_4268);
//            _arg1.writeInt(this.ASV2014_3011);
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
//        public function get ASV2014_4271():int
//        {
//            return (this.ASV2014_4268);
//        }
//
//        public function set ASV2014_4271(_arg1:int):void
//        {
//            this.ASV2014_4268 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1504 = "`n" (String#3598)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3011 = "5#0" (String#1515)
// ASV2014_4268 = "4#k" (String#5140)
// ASV2014_4271 = "8!3" (String#6060)
//