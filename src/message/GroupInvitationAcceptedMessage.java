package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GroupInvitationAcceptedMessage extends Message{

	public static final int id = 1091;
	public int inviterId;

	public GroupInvitationAcceptedMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.inviterId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.inviterId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GroupInvitationAcceptedMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_799 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1091;
//
//        private var ASV2014_6057:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6057 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6057);
//        }
//
//        public function get inviterId():int
//        {
//            return (this.ASV2014_6057);
//        }
//
//        public function set inviterId(_arg1:int):void
//        {
//            this.ASV2014_6057 = _arg1;
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
// ASV2014_6057 = "0\"e" (String#6062)
// ASV2014_799 = "+\"+" (String#12880)
//