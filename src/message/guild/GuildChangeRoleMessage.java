package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildChangeRoleMessage extends Message{

	public static final int id = 1231;
	public int _userId;
	public int role;

	public GuildChangeRoleMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.role = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeByte(this.role);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildChangeRoleMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_842 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1231;
//
//        private var _userId:int;
//        private var ASV2014_6179:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this.ASV2014_6179 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeByte(this.ASV2014_6179);
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
//        public function get role():int
//        {
//            return (this.ASV2014_6179);
//        }
//
//        public function set role(_arg1:int):void
//        {
//            this.ASV2014_6179 = _arg1;
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
// ASV2014_6179 = "0\"u" (String#4425)
// ASV2014_842 = "[\"a" (String#8986)
//