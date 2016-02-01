package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_70 extends Message{

	public static final int id = 1363;
	public MessageList comradeInfos;
	public Message comradeTeamInfo;
	public int _type;
	public int ASV2014_2399;
	public int ASV2014_2400;
	public int autoRespawnSeconds;

	public ASV2014_70(User user) {
		super(user);
		comradeInfos = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.comradeInfos.deserialize(data);
		this.comradeTeamInfo = component.ClientSocket.readMessage(data,user);
		this._type = data.readByte();
		this.ASV2014_2399 = data.readShort();
		this.ASV2014_2400 = data.readShort();
		this.autoRespawnSeconds = data.readShort();
	}

	public void serialize(ByteArray data){
		this.comradeInfos.serialize(data);
		component.ClientSocket.writeMessage(this.comradeTeamInfo, data);
		data.writeByte(this._type);
		data.writeShort(this.ASV2014_2399);
		data.writeShort(this.ASV2014_2400);
		data.writeShort(this.autoRespawnSeconds);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_70(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_70 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1363;
//
//        private var ASV2014_3044:ASV2014_194;
//        private var ASV2014_3045:ASV2014_30;
//        private var _type:int;
//        private var ASV2014_3046:int;
//        private var ASV2014_3047:int;
//        private var ASV2014_3048:int;
//
//        public function ASV2014_70()
//        {
//            this.ASV2014_3044 = new ASV2014_194();
//            super();
//            this.comradeInfos = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3044.deserialize(_arg1);
//            this.ASV2014_3045 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._type = _arg1.readByte();
//            this.ASV2014_3046 = _arg1.readShort();
//            this.ASV2014_3047 = _arg1.readShort();
//            this.ASV2014_3048 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_3044.ASV2014_2336(_arg1);
//            ASV2014_229.writeMessage(this.ASV2014_3045, _arg1);
//            _arg1.writeByte(this._type);
//            _arg1.writeShort(this.ASV2014_3046);
//            _arg1.writeShort(this.ASV2014_3047);
//            _arg1.writeShort(this.ASV2014_3048);
//        }
//
//        public function get comradeInfos():ASV2014_194
//        {
//            return (this.ASV2014_3044);
//        }
//
//        public function set comradeInfos(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3044 = _arg1;
//        }
//
//        public function get comradeTeamInfo():ASV2014_30
//        {
//            return (this.ASV2014_3045);
//        }
//
//        public function set comradeTeamInfo(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_3045 = _arg1;
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
//        public function get ASV2014_2399():int
//        {
//            return (this.ASV2014_3046);
//        }
//
//        public function set ASV2014_2399(_arg1:int):void
//        {
//            this.ASV2014_3046 = _arg1;
//        }
//
//        public function get ASV2014_2400():int
//        {
//            return (this.ASV2014_3047);
//        }
//
//        public function set ASV2014_2400(_arg1:int):void
//        {
//            this.ASV2014_3047 = _arg1;
//        }
//
//        public function get autoRespawnSeconds():int
//        {
//            return (this.ASV2014_3048);
//        }
//
//        public function set autoRespawnSeconds(_arg1:int):void
//        {
//            this.ASV2014_3048 = _arg1;
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
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2399 = "'#5" (String#12447)
// ASV2014_2400 = "%\"6" (String#9580)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3044 = "@g" (String#15386)
// ASV2014_3045 = "@#G" (String#15537)
// ASV2014_3046 = "`i" (String#18199)
// ASV2014_3047 = "`@" (String#16782)
// ASV2014_3048 = "`#H" (String#16520)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_70 = "=\"4" (String#9174)
//