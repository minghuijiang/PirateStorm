package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1403 extends Message{

	public static final int id = 1538;
	public MessageList portals;
	public Message _travelCurrencyInformation;

	public ASV2014_1403(User user) {
		super(user);
		portals = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.portals.deserialize(data);
		this._travelCurrencyInformation = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		this.portals.serialize(data);
		component.ClientSocket.writeMessage(this._travelCurrencyInformation, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1403(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1403 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1538;
//
//        private var ASV2014_4749:ASV2014_194;
//        private var _travelCurrencyInformation:ASV2014_30;
//
//        public function ASV2014_1403()
//        {
//            this.ASV2014_4749 = new ASV2014_194();
//            super();
//            this.portals = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4749.deserialize(_arg1);
//            this._travelCurrencyInformation = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_4749.ASV2014_2336(_arg1);
//            ASV2014_229.writeMessage(this._travelCurrencyInformation, _arg1);
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
//        public function get travelCurrencyInformation():ASV2014_30
//        {
//            return (this._travelCurrencyInformation);
//        }
//
//        public function set travelCurrencyInformation(_arg1:ASV2014_30):void
//        {
//            this._travelCurrencyInformation = _arg1;
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
// ASV2014_1403 = "'#O" (String#12276)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_4749 = "3#<" (String#5130)
//