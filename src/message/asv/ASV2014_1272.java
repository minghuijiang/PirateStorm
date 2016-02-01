package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1272 extends Message{

	public static final int id = 1243;
	public int xpChange;

	public ASV2014_1272(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.xpChange = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.xpChange);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1272(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1272 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1243;
//
//        private var ASV2014_6489:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6489 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6489);
//        }
//
//        public function get xpChange():int
//        {
//            return (this.ASV2014_6489);
//        }
//
//        public function set xpChange(_arg1:int):void
//        {
//            this.ASV2014_6489 = _arg1;
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
// ASV2014_1272 = ">!^" (String#12956)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6489 = "&!0" (String#18951)
//