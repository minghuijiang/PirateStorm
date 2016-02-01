package message.arena;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ArenaTeamFoundationRequestMessage extends Message{

	public static final int id = 1399;
	public String teamName;
	public int _type;

	public ArenaTeamFoundationRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.teamName = data.readUTF();
		this._type = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.teamName);
		data.writeByte(this._type);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ArenaTeamFoundationRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1463 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1399;
//
//        private var ASV2014_2887:String;
//        private var _type:int;
//
//        public function ASV2014_1463()
//        {
//            this.teamName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2887 = _arg1.readUTF();
//            this._type = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_2887);
//            _arg1.writeByte(this._type);
//        }
//
//        public function get teamName():String
//        {
//            return (this.ASV2014_2887);
//        }
//
//        public function set teamName(_arg1:String):void
//        {
//            this.ASV2014_2887 = _arg1;
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1463 = "3##" (String#10826)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2887 = "!#w" (String#4128)
// ASV2014_30 = ";#V" (String#144)
//