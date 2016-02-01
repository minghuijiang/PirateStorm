package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SocialFriendListRequestMessage extends Message{

	public static final int id = 1480;
	public int _pageIndex;

	public SocialFriendListRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._pageIndex = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._pageIndex);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SocialFriendListRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1475 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1480;
//
//        private var _pageIndex:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._pageIndex = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._pageIndex);
//        }
//
//        public function get pageIndex():int
//        {
//            return (this._pageIndex);
//        }
//
//        public function set pageIndex(_arg1:int):void
//        {
//            this._pageIndex = _arg1;
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
// ASV2014_1475 = "!#=" (String#12320)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//