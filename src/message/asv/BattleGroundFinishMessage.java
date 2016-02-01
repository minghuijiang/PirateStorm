package message.asv;

import message.MatchLeaveMessage;
import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;

import component.User;

public class BattleGroundFinishMessage extends Message{

	public static final int id = 1370;
	public Message _killed;
	public MessageList statsTeam;
	public MessageList statsUser;
	public MessageList ASV2014_2859;
	public int winTeamId;
	public int _winReason;
	public int ASV2014_2171;
	public int battlegroundTokens;
	public int ASV2014_3731;
	public int _type;

	public BattleGroundFinishMessage(User user) {
		super(user);
		ASV2014_2859 = new MessageList(user);
		statsUser = new MessageList(user);
		statsTeam = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._killed = component.ClientSocket.readMessage(data,user);
		this.statsTeam.deserialize(data);
		this.statsUser.deserialize(data);
		this.ASV2014_2859.deserialize(data);
		this.winTeamId = data.readByte();
		this._winReason = data.readByte();
		this.ASV2014_2171 = data.readByte();
		this.battlegroundTokens = data.readByte();
		this.ASV2014_3731 = data.readShort();
		this._type = data.readByte();
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this._killed, data);
		this.statsTeam.serialize(data);
		this.statsUser.serialize(data);
		this.ASV2014_2859.serialize(data);
		data.writeByte(this.winTeamId);
		data.writeByte(this._winReason);
		data.writeByte(this.ASV2014_2171);
		data.writeByte(this.battlegroundTokens);
		data.writeShort(this.ASV2014_3731);
		data.writeByte(this._type);
	}

	public void action(){
		user.setMsg("Token gain:  ==============="+battlegroundTokens);
		user.isBG=false;
		user.enemies.clear();
		user.target.clear();
		user.send(new MatchLeaveMessage(user));
		user.departure();

	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new BattleGroundFinishMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_197 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1370;
//
//        private var _killed:ASV2014_30;
//        private var ASV2014_3931:ASV2014_194;
//        private var ASV2014_3932:ASV2014_194;
//        private var ASV2014_3933:ASV2014_194;
//        private var ASV2014_3934:int;
//        private var _winReason:int;
//        private var ASV2014_2840:int;
//        private var ASV2014_3935:int;
//        private var ASV2014_3936:int;
//        private var _type:int;
//
//        public function ASV2014_197()
//        {
//            this.ASV2014_3931 = new ASV2014_194();
//            this.ASV2014_3932 = new ASV2014_194();
//            this.ASV2014_3933 = new ASV2014_194();
//            super();
//            this.statsTeam = new ASV2014_194();
//            this.statsUser = new ASV2014_194();
//            this.ASV2014_2859 = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._killed = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_3931.deserialize(_arg1);
//            this.ASV2014_3932.deserialize(_arg1);
//            this.ASV2014_3933.deserialize(_arg1);
//            this.ASV2014_3934 = _arg1.readByte();
//            this._winReason = _arg1.readByte();
//            this.ASV2014_2840 = _arg1.readByte();
//            this.ASV2014_3935 = _arg1.readByte();
//            this.ASV2014_3936 = _arg1.readShort();
//            this._type = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this._killed, _arg1);
//            this.ASV2014_3931.ASV2014_2336(_arg1);
//            this.ASV2014_3932.ASV2014_2336(_arg1);
//            this.ASV2014_3933.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_3934);
//            _arg1.writeByte(this._winReason);
//            _arg1.writeByte(this.ASV2014_2840);
//            _arg1.writeByte(this.ASV2014_3935);
//            _arg1.writeShort(this.ASV2014_3936);
//            _arg1.writeByte(this._type);
//        }
//
//        public function get killed():ASV2014_30
//        {
//            return (this._killed);
//        }
//
//        public function set killed(_arg1:ASV2014_30):void
//        {
//            this._killed = _arg1;
//        }
//
//        public function get statsTeam():ASV2014_194
//        {
//            return (this.ASV2014_3931);
//        }
//
//        public function set statsTeam(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3931 = _arg1;
//        }
//
//        public function get statsUser():ASV2014_194
//        {
//            return (this.ASV2014_3932);
//        }
//
//        public function set statsUser(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3932 = _arg1;
//        }
//
//        public function get ASV2014_2859():ASV2014_194
//        {
//            return (this.ASV2014_3933);
//        }
//
//        public function set ASV2014_2859(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3933 = _arg1;
//        }
//
//        public function get winTeamId():int
//        {
//            return (this.ASV2014_3934);
//        }
//
//        public function set winTeamId(_arg1:int):void
//        {
//            this.ASV2014_3934 = _arg1;
//        }
//
//        public function get winReason():int
//        {
//            return (this._winReason);
//        }
//
//        public function set winReason(_arg1:int):void
//        {
//            this._winReason = _arg1;
//        }
//
//        public function get ASV2014_2171():int
//        {
//            return (this.ASV2014_2840);
//        }
//
//        public function set ASV2014_2171(_arg1:int):void
//        {
//            this.ASV2014_2840 = _arg1;
//        }
//
//        public function get battlegroundTokens():int
//        {
//            return (this.ASV2014_3935);
//        }
//
//        public function set battlegroundTokens(_arg1:int):void
//        {
//            this.ASV2014_3935 = _arg1;
//        }
//
//        public function get ASV2014_3731():int
//        {
//            return (this.ASV2014_3936);
//        }
//
//        public function set ASV2014_3731(_arg1:int):void
//        {
//            this.ASV2014_3936 = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_197 = "#\"&" (String#6371)
// ASV2014_2171 = "?\"[" (String#8226)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2840 = ";!B" (String#9071)
// ASV2014_2859 = "'T" (String#6946)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3731 = "^#k" (String#4208)
// ASV2014_3931 = "2\"V" (String#5014)
// ASV2014_3932 = "[!;" (String#5013)
// ASV2014_3933 = "]#A" (String#5044)
// ASV2014_3934 = "?#F" (String#3194)
// ASV2014_3935 = "&\"s" (String#18934)
// ASV2014_3936 = "=K" (String#3197)
//