package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class ProfileUpdateMessage extends Message{

	public static final int id = 1205;
	public Message guildInfoMessage;
	public Message guildInfoDetailMessage;

	public ProfileUpdateMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildInfoMessage = component.ClientSocket.readMessage(data,user);
		this.guildInfoDetailMessage = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this.guildInfoMessage, data);
		component.ClientSocket.writeMessage(this.guildInfoDetailMessage, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ProfileUpdateMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1142 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1205;
//
//        private var ASV2014_6435:ASV2014_30;
//        private var ASV2014_6436:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6435 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_6436 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this.ASV2014_6435, _arg1);
//            ASV2014_229.writeMessage(this.ASV2014_6436, _arg1);
//        }
//
//        public function get guildInfoMessage():ASV2014_30
//        {
//            return (this.ASV2014_6435);
//        }
//
//        public function set guildInfoMessage(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6435 = _arg1;
//        }
//
//        public function get guildInfoDetailMessage():ASV2014_30
//        {
//            return (this.ASV2014_6436);
//        }
//
//        public function set guildInfoDetailMessage(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6436 = _arg1;
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
// ASV2014_1142 = "1!D" (String#14543)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_6435 = "1\"J" (String#18380)
// ASV2014_6436 = "`#_" (String#16533)
//