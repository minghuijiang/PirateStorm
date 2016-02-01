package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class UserProfileSwitchAvatarMessage extends Message{

	public static final int id = 1114;
	public int _avatarId;

	public UserProfileSwitchAvatarMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._avatarId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._avatarId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new UserProfileSwitchAvatarMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_889 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1114;
//
//        private var _avatarId:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._avatarId = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._avatarId);
//        }
//
//        public function get avatarId():int
//        {
//            return (this._avatarId);
//        }
//
//        public function set avatarId(_arg1:int):void
//        {
//            this._avatarId = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_889 = "5\"S" (String#10223)
//