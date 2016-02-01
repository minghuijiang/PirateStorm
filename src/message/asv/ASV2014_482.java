package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_482 extends Message{

	public static final int id = 1393;
	public int _teamId;
	public String teamName;
	public int leaderId;
	public int _type;
	public int _usersReadyForMatch;
	public int ASV2014_3842;
	public int usersInTeam;
	public boolean _playerReadyForMatch;
	public int secondsTillNextMatchmaking;

	public ASV2014_482(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readInt();
		this.teamName = data.readUTF();
		this.leaderId = data.readInt();
		this._type = data.readByte();
		this._usersReadyForMatch = data.readByte();
		this.ASV2014_3842 = data.readByte();
		this.usersInTeam = data.readByte();
		this._playerReadyForMatch = data.readBoolean();
		this.secondsTillNextMatchmaking = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._teamId);
		data.writeUTF(this.teamName);
		data.writeInt(this.leaderId);
		data.writeByte(this._type);
		data.writeByte(this._usersReadyForMatch);
		data.writeByte(this.ASV2014_3842);
		data.writeByte(this.usersInTeam);
		data.writeBoolean(this._playerReadyForMatch);
		data.writeShort(this.secondsTillNextMatchmaking);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_482(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_482 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1393;
//
//        private var _teamId:int;
//        private var ASV2014_2887:String;
//        private var ASV2014_5324:int;
//        private var _type:int;
//        private var _usersReadyForMatch:int;
//        private var ASV2014_5325:int;
//        private var ASV2014_5326:int;
//        private var _playerReadyForMatch:Boolean;
//        private var ASV2014_5327:int;
//
//        public function ASV2014_482()
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
//            this._teamId = _arg1.readInt();
//            this.ASV2014_2887 = _arg1.readUTF();
//            this.ASV2014_5324 = _arg1.readInt();
//            this._type = _arg1.readByte();
//            this._usersReadyForMatch = _arg1.readByte();
//            this.ASV2014_5325 = _arg1.readByte();
//            this.ASV2014_5326 = _arg1.readByte();
//            this._playerReadyForMatch = _arg1.readBoolean();
//            this.ASV2014_5327 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this.ASV2014_2887);
//            _arg1.writeInt(this.ASV2014_5324);
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this._usersReadyForMatch);
//            _arg1.writeByte(this.ASV2014_5325);
//            _arg1.writeByte(this.ASV2014_5326);
//            _arg1.writeBoolean(this._playerReadyForMatch);
//            _arg1.writeShort(this.ASV2014_5327);
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
//        public function get leaderId():int
//        {
//            return (this.ASV2014_5324);
//        }
//
//        public function set leaderId(_arg1:int):void
//        {
//            this.ASV2014_5324 = _arg1;
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
//        public function get usersReadyForMatch():int
//        {
//            return (this._usersReadyForMatch);
//        }
//
//        public function set usersReadyForMatch(_arg1:int):void
//        {
//            this._usersReadyForMatch = _arg1;
//        }
//
//        public function get ASV2014_3842():int
//        {
//            return (this.ASV2014_5325);
//        }
//
//        public function set ASV2014_3842(_arg1:int):void
//        {
//            this.ASV2014_5325 = _arg1;
//        }
//
//        public function get usersInTeam():int
//        {
//            return (this.ASV2014_5326);
//        }
//
//        public function set usersInTeam(_arg1:int):void
//        {
//            this.ASV2014_5326 = _arg1;
//        }
//
//        public function get playerReadyForMatch():Boolean
//        {
//            return (this._playerReadyForMatch);
//        }
//
//        public function set playerReadyForMatch(_arg1:Boolean):void
//        {
//            this._playerReadyForMatch = _arg1;
//        }
//
//        public function get secondsTillNextMatchmaking():int
//        {
//            return (this.ASV2014_5327);
//        }
//
//        public function set secondsTillNextMatchmaking(_arg1:int):void
//        {
//            this.ASV2014_5327 = _arg1;
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
// ASV2014_2887 = "!#w" (String#4128)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3842 = "?\";" (String#15016)
// ASV2014_482 = "<\"-" (String#9618)
// ASV2014_5324 = "=\"K" (String#18476)
// ASV2014_5325 = "7!;" (String#17234)
// ASV2014_5326 = "-L" (String#17114)
// ASV2014_5327 = ">\"z" (String#17923)
//