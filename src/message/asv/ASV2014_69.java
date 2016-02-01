package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_69 extends Message{

	public static final int id = 1364;
	public int _userId;
	public String userName;
	public int _teamId;

	public ASV2014_69(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.userName = data.readUTF();
		this._teamId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this.userName);
		data.writeByte(this._teamId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_69(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_69 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1364;
//
//        private var _userId:int;
//        private var ASV2014_2903:String;
//        private var _teamId:int;
//
//        public function ASV2014_69()
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
//            this._teamId = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_2903);
//            _arg1.writeByte(this._teamId);
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
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
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
// ASV2014_69 = "2!H" (String#5096)
//