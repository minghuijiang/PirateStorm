package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1259 extends Message{

	public static final int id = 1534;
	public MessageList maps;
	public MessageList portals;
	public MessageList _transitions;

	public ASV2014_1259(User user) {
		super(user);
		_transitions = new MessageList(user);
		portals = new MessageList(user);
		maps = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.maps.deserialize(data);
		this.portals.deserialize(data);
		this._transitions.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.maps.serialize(data);
		this.portals.serialize(data);
		this._transitions.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1259(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1259 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1534;
//
//        private var ASV2014_6480:ASV2014_194;
//        private var ASV2014_4749:ASV2014_194;
//        private var _transitions:ASV2014_194;
//
//        public function ASV2014_1259()
//        {
//            this.ASV2014_6480 = new ASV2014_194();
//            this.ASV2014_4749 = new ASV2014_194();
//            this._transitions = new ASV2014_194();
//            super();
//            this.maps = new ASV2014_194();
//            this.portals = new ASV2014_194();
//            this.transitions = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6480.deserialize(_arg1);
//            this.ASV2014_4749.deserialize(_arg1);
//            this._transitions.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6480.ASV2014_2336(_arg1);
//            this.ASV2014_4749.ASV2014_2336(_arg1);
//            this._transitions.ASV2014_2336(_arg1);
//        }
//
//        public function get maps():ASV2014_194
//        {
//            return (this.ASV2014_6480);
//        }
//
//        public function set maps(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6480 = _arg1;
//        }
//
//        public function get portals():ASV2014_194
//        {
//            return (this.ASV2014_4749);
//        }
//
//        public function set portals(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_4749 = _arg1;
//        }
//
//        public function get transitions():ASV2014_194
//        {
//            return (this._transitions);
//        }
//
//        public function set transitions(_arg1:ASV2014_194):void
//        {
//            this._transitions = _arg1;
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
// ASV2014_1259 = "=\"]" (String#13285)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4749 = "3#<" (String#5130)
// ASV2014_6480 = "0!k" (String#13776)
//