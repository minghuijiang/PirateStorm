package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GroupKickUserMessage extends Message{

	public static final int id = 1094;
	public int groupUserId;

	public GroupKickUserMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.groupUserId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.groupUserId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GroupKickUserMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_793 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1094;
//
//        private var ASV2014_6056:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6056 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6056);
//        }
//
//        public function get groupUserId():int
//        {
//            return (this.ASV2014_6056);
//        }
//
//        public function set groupUserId(_arg1:int):void
//        {
//            this.ASV2014_6056 = _arg1;
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
// ASV2014_6056 = "`\"a" (String#3421)
// ASV2014_793 = "##E" (String#8176)
//