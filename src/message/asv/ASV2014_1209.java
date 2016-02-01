package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1209 extends Message{

	public static final int id = 1390;
	public int seasonDate;
	public int seasonStatus;
	public MessageList _teams;
	public MessageList _arenas;

	public ASV2014_1209(User user) {
		super(user);
		_arenas = new MessageList(user);
		_teams = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.seasonDate = data.readInt();
		this.seasonStatus = data.readByte();
		this._teams.deserialize(data);
		this._arenas.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.seasonDate);
		data.writeByte(this.seasonStatus);
		this._teams.serialize(data);
		this._arenas.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1209(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1209 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1390;
//
//        private var ASV2014_3839:int;
//        private var ASV2014_3840:int;
//        private var _teams:ASV2014_194;
//        private var _arenas:ASV2014_194;
//
//        public function ASV2014_1209()
//        {
//            this._teams = new ASV2014_194();
//            this._arenas = new ASV2014_194();
//            super();
//            this.teams = new ASV2014_194();
//            this.arenas = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3839 = _arg1.readInt();
//            this.ASV2014_3840 = _arg1.readByte();
//            this._teams.deserialize(_arg1);
//            this._arenas.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3839);
//            _arg1.writeByte(this.ASV2014_3840);
//            this._teams.ASV2014_2336(_arg1);
//            this._arenas.ASV2014_2336(_arg1);
//        }
//
//        public function get seasonDate():int
//        {
//            return (this.ASV2014_3839);
//        }
//
//        public function set seasonDate(_arg1:int):void
//        {
//            this.ASV2014_3839 = _arg1;
//        }
//
//        public function get seasonStatus():int
//        {
//            return (this.ASV2014_3840);
//        }
//
//        public function set seasonStatus(_arg1:int):void
//        {
//            this.ASV2014_3840 = _arg1;
//        }
//
//        public function get teams():ASV2014_194
//        {
//            return (this._teams);
//        }
//
//        public function set teams(_arg1:ASV2014_194):void
//        {
//            this._teams = _arg1;
//        }
//
//        public function get arenas():ASV2014_194
//        {
//            return (this._arenas);
//        }
//
//        public function set arenas(_arg1:ASV2014_194):void
//        {
//            this._arenas = _arg1;
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
// ASV2014_1209 = ",#T" (String#12390)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3839 = "7! " (String#11412)
// ASV2014_3840 = "[!P" (String#6486)
//