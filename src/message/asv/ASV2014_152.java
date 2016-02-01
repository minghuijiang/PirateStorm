package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_152 extends Message{

	public static final int id = 1420;
	public int _teamId;
	public String _leader;
	public int _foundationDate;
	public int _currentRank;
	public int _maxRank;
	public int seasonalPlayedMatches;
	public int seasonalWonMatches;
	public int overallPlayedMatches;
	public int overallWonMatches;
	public MessageList _members;
	public int freeSlots;

	public ASV2014_152(User user) {
		super(user);
		_members = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readInt();
		this._leader = data.readUTF();
		this._foundationDate = data.readInt();
		this._currentRank = data.readInt();
		this._maxRank = data.readInt();
		this.seasonalPlayedMatches = data.readShort();
		this.seasonalWonMatches = data.readShort();
		this.overallPlayedMatches = data.readInt();
		this.overallWonMatches = data.readInt();
		this._members.deserialize(data);
		this.freeSlots = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._teamId);
		data.writeUTF(this._leader);
		data.writeInt(this._foundationDate);
		data.writeInt(this._currentRank);
		data.writeInt(this._maxRank);
		data.writeShort(this.seasonalPlayedMatches);
		data.writeShort(this.seasonalWonMatches);
		data.writeInt(this.overallPlayedMatches);
		data.writeInt(this.overallWonMatches);
		this._members.serialize(data);
		data.writeByte(this.freeSlots);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_152(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_152 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1420;
//
//        private var _teamId:int;
//        private var _leader:String;
//        private var _foundationDate:int;
//        private var _currentRank:int;
//        private var _maxRank:int;
//        private var ASV2014_3852:int;
//        private var ASV2014_3853:int;
//        private var ASV2014_3854:int;
//        private var ASV2014_3855:int;
//        private var _members:ASV2014_194;
//        private var ASV2014_3857:int;
//
//        public function ASV2014_152()
//        {
//            this._members = new ASV2014_194();
//            super();
//            this.leader = "";
//            this.members = new ASV2014_194();
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
//            this._leader = _arg1.readUTF();
//            this._foundationDate = _arg1.readInt();
//            this._currentRank = _arg1.readInt();
//            this._maxRank = _arg1.readInt();
//            this.ASV2014_3852 = _arg1.readShort();
//            this.ASV2014_3853 = _arg1.readShort();
//            this.ASV2014_3854 = _arg1.readInt();
//            this.ASV2014_3855 = _arg1.readInt();
//            this._members.deserialize(_arg1);
//            this.ASV2014_3857 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this._leader);
//            _arg1.writeInt(this._foundationDate);
//            _arg1.writeInt(this._currentRank);
//            _arg1.writeInt(this._maxRank);
//            _arg1.writeShort(this.ASV2014_3852);
//            _arg1.writeShort(this.ASV2014_3853);
//            _arg1.writeInt(this.ASV2014_3854);
//            _arg1.writeInt(this.ASV2014_3855);
//            this._members.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_3857);
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
//        public function get leader():String
//        {
//            return (this._leader);
//        }
//
//        public function set leader(_arg1:String):void
//        {
//            this._leader = _arg1;
//        }
//
//        public function get foundationDate():int
//        {
//            return (this._foundationDate);
//        }
//
//        public function set foundationDate(_arg1:int):void
//        {
//            this._foundationDate = _arg1;
//        }
//
//        public function get currentRank():int
//        {
//            return (this._currentRank);
//        }
//
//        public function set currentRank(_arg1:int):void
//        {
//            this._currentRank = _arg1;
//        }
//
//        public function get maxRank():int
//        {
//            return (this._maxRank);
//        }
//
//        public function set maxRank(_arg1:int):void
//        {
//            this._maxRank = _arg1;
//        }
//
//        public function get seasonalPlayedMatches():int
//        {
//            return (this.ASV2014_3852);
//        }
//
//        public function set seasonalPlayedMatches(_arg1:int):void
//        {
//            this.ASV2014_3852 = _arg1;
//        }
//
//        public function get seasonalWonMatches():int
//        {
//            return (this.ASV2014_3853);
//        }
//
//        public function set seasonalWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3853 = _arg1;
//        }
//
//        public function get overallPlayedMatches():int
//        {
//            return (this.ASV2014_3854);
//        }
//
//        public function set overallPlayedMatches(_arg1:int):void
//        {
//            this.ASV2014_3854 = _arg1;
//        }
//
//        public function get overallWonMatches():int
//        {
//            return (this.ASV2014_3855);
//        }
//
//        public function set overallWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3855 = _arg1;
//        }
//
//        public function get members():ASV2014_194
//        {
//            return (this._members);
//        }
//
//        public function set members(_arg1:ASV2014_194):void
//        {
//            this._members = _arg1;
//        }
//
//        public function get freeSlots():int
//        {
//            return (this.ASV2014_3857);
//        }
//
//        public function set freeSlots(_arg1:int):void
//        {
//            this.ASV2014_3857 = _arg1;
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
// ASV2014_152 = "8\"J" (String#9135)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3852 = "^#9" (String#5985)
// ASV2014_3853 = "!#T" (String#5721)
// ASV2014_3854 = ",!I" (String#5915)
// ASV2014_3855 = "!8" (String#4551)
// ASV2014_3857 = "7!k" (String#5709)
//