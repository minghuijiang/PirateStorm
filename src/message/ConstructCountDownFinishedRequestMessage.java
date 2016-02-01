package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ConstructCountDownFinishedRequestMessage extends Message{

	public static final int id = 1297;
	public int constructionInstanceID;

	public ConstructCountDownFinishedRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.constructionInstanceID = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.constructionInstanceID);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ConstructCountDownFinishedRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1534 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1297;
//
//        private var ASV2014_5844:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5844 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5844);
//        }
//
//        public function get constructionInstanceID():int
//        {
//            return (this.ASV2014_5844);
//        }
//
//        public function set constructionInstanceID(_arg1:int):void
//        {
//            this.ASV2014_5844 = _arg1;
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
// ASV2014_1534 = "-\">" (String#13207)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5844 = "\"&" (String#8824)
//