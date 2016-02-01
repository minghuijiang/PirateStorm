package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1219 extends Message{

	public static final int id = 1249;
	public boolean ASV2014_3410;

	public ASV2014_1219(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3410 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this.ASV2014_3410);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1219(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1219 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1249;
//
//        private var ASV2014_3402:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3402 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this.ASV2014_3402);
//        }
//
//        public function get ASV2014_3410():Boolean
//        {
//            return (this.ASV2014_3402);
//        }
//
//        public function set ASV2014_3410(_arg1:Boolean):void
//        {
//            this.ASV2014_3402 = _arg1;
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
// ASV2014_1219 = "9#'" (String#11869)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3402 = "8\"L" (String#9966)
// ASV2014_3410 = "`b" (String#18652)
//