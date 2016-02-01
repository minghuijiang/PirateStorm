package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class PiratesChangeLootShareMessage extends Message{

	public static final int id = 1127;
	public int lootShare;

	public PiratesChangeLootShareMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.lootShare = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.lootShare);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new PiratesChangeLootShareMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class PiratesChangeLootShareMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1127;
//
//        private var ASV2014_6483:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6483 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6483);
//        }
//
//        public function get lootShare():int
//        {
//            return (this.ASV2014_6483);
//        }
//
//        public function set lootShare(_arg1:int):void
//        {
//            this.ASV2014_6483 = _arg1;
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
// ASV2014_6483 = "`!p" (String#5850)
//