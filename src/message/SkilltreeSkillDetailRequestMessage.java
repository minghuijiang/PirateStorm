package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SkilltreeSkillDetailRequestMessage extends Message{

	public static final int id = 1467;
	public int ASV2014_4460;

	public SkilltreeSkillDetailRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4460 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4460);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SkilltreeSkillDetailRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1521 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1467;
//
//        private var ASV2014_5698:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5698 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5698);
//        }
//
//        public function get ASV2014_4460():int
//        {
//            return (this.ASV2014_5698);
//        }
//
//        public function set ASV2014_4460(_arg1:int):void
//        {
//            this.ASV2014_5698 = _arg1;
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
// ASV2014_1521 = " #B" (String#11211)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4460 = "^\"J" (String#2497)
// ASV2014_5698 = "8!-" (String#2108)
//