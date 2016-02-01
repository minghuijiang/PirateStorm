package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1065 extends Message{

	public static final int id = 1519;
	public int priceDiamonds;

	public ASV2014_1065(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.priceDiamonds = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.priceDiamonds);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1065(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1065 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1519;
//
//        private var ASV2014_5745:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5745 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5745);
//        }
//
//        public function get priceDiamonds():int
//        {
//            return (this.ASV2014_5745);
//        }
//
//        public function set priceDiamonds(_arg1:int):void
//        {
//            this.ASV2014_5745 = _arg1;
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
// ASV2014_1065 = "8\"$" (String#12048)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5745 = "-Y" (String#8561)
//