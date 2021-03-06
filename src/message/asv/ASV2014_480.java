package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_480 extends Message{

	public static final int id = 1365;
	public MessageList _stats;
	public MessageList ASV2014_2859;
	public Message ASV2014_3843;
	public int winTeamId;
	public int _winReason;

	public ASV2014_480(User user) {
		super(user);
		ASV2014_2859 = new MessageList(user);
		_stats = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._stats.deserialize(data);
		this.ASV2014_2859.deserialize(data);
		this.ASV2014_3843 = component.ClientSocket.readMessage(data,user);
		this.winTeamId = data.readByte();
		this._winReason = data.readByte();
	}

	public void serialize(ByteArray data){
		this._stats.serialize(data);
		this.ASV2014_2859.serialize(data);
		component.ClientSocket.writeMessage(this.ASV2014_3843, data);
		data.writeByte(this.winTeamId);
		data.writeByte(this._winReason);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_480(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_480 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1365;
//
//        private var _stats:ASV2014_194;
//        private var ASV2014_3933:ASV2014_194;
//        private var ASV2014_5323:ASV2014_30;
//        private var ASV2014_3934:int;
//        private var _winReason:int;
//
//        public function ASV2014_480()
//        {
//            this._stats = new ASV2014_194();
//            this.ASV2014_3933 = new ASV2014_194();
//            super();
//            this.stats = new ASV2014_194();
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
//            this._stats.deserialize(_arg1);
//            this.ASV2014_3933.deserialize(_arg1);
//            this.ASV2014_5323 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_3934 = _arg1.readByte();
//            this._winReason = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._stats.ASV2014_2336(_arg1);
//            this.ASV2014_3933.ASV2014_2336(_arg1);
//            ASV2014_229.writeMessage(this.ASV2014_5323, _arg1);
//            _arg1.writeByte(this.ASV2014_3934);
//            _arg1.writeByte(this._winReason);
//        }
//
//        public function get stats():ASV2014_194
//        {
//            return (this._stats);
//        }
//
//        public function set stats(_arg1:ASV2014_194):void
//        {
//            this._stats = _arg1;
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
//        public function get ASV2014_3843():ASV2014_30
//        {
//            return (this.ASV2014_5323);
//        }
//
//        public function set ASV2014_3843(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_5323 = _arg1;
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
// ASV2014_2859 = "'T" (String#6946)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3843 = "?!q" (String#15067)
// ASV2014_3933 = "]#A" (String#5044)
// ASV2014_3934 = "?#F" (String#3194)
// ASV2014_480 = " !R" (String#7849)
// ASV2014_5323 = "'\"d" (String#8228)
//