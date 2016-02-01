package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1432 extends Message{

	public static final int id = 1273;
	public Message _killed;
	public MessageList statsTeam;
	public MessageList statsUser;
	public int winTeamId;
	public int defenderTeamId;
	public int ASV2014_3361;
	public int _invationpoints;

	public ASV2014_1432(User user) {
		super(user);
		statsUser = new MessageList(user);
		statsTeam = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._killed = component.ClientSocket.readMessage(data,user);
		this.statsTeam.deserialize(data);
		this.statsUser.deserialize(data);
		this.winTeamId = data.readByte();
		this.defenderTeamId = data.readByte();
		this.ASV2014_3361 = data.readByte();
		this._invationpoints = data.readShort();
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this._killed, data);
		this.statsTeam.serialize(data);
		this.statsUser.serialize(data);
		data.writeByte(this.winTeamId);
		data.writeByte(this.defenderTeamId);
		data.writeByte(this.ASV2014_3361);
		data.writeShort(this._invationpoints);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1432(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1432 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1273;
//
//        private var _killed:ASV2014_30;
//        private var ASV2014_3931:ASV2014_194;
//        private var ASV2014_3932:ASV2014_194;
//        private var ASV2014_3934:int;
//        private var ASV2014_4552:int;
//        private var ASV2014_4570:int;
//        private var _invationpoints:int;
//
//        public function ASV2014_1432()
//        {
//            this.ASV2014_3931 = new ASV2014_194();
//            this.ASV2014_3932 = new ASV2014_194();
//            super();
//            this.statsTeam = new ASV2014_194();
//            this.statsUser = new ASV2014_194();
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
//            this.ASV2014_3934 = _arg1.readByte();
//            this.ASV2014_4552 = _arg1.readByte();
//            this.ASV2014_4570 = _arg1.readByte();
//            this._invationpoints = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this._killed, _arg1);
//            this.ASV2014_3931.ASV2014_2336(_arg1);
//            this.ASV2014_3932.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_3934);
//            _arg1.writeByte(this.ASV2014_4552);
//            _arg1.writeByte(this.ASV2014_4570);
//            _arg1.writeShort(this._invationpoints);
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
//        public function get defenderTeamId():int
//        {
//            return (this.ASV2014_4552);
//        }
//
//        public function set defenderTeamId(_arg1:int):void
//        {
//            this.ASV2014_4552 = _arg1;
//        }
//
//        public function get ASV2014_3361():int
//        {
//            return (this.ASV2014_4570);
//        }
//
//        public function set ASV2014_3361(_arg1:int):void
//        {
//            this.ASV2014_4570 = _arg1;
//        }
//
//        public function get invationpoints():int
//        {
//            return (this._invationpoints);
//        }
//
//        public function set invationpoints(_arg1:int):void
//        {
//            this._invationpoints = _arg1;
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
// ASV2014_1432 = "0B" (String#12596)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3361 = "&h" (String#5281)
// ASV2014_3931 = "2\"V" (String#5014)
// ASV2014_3932 = "[!;" (String#5013)
// ASV2014_3934 = "?#F" (String#3194)
// ASV2014_4552 = "^#1" (String#6928)
// ASV2014_4570 = "\"#q" (String#3188)
//