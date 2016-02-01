package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_641 extends Message{

	public static final int id = 1453;
	public int ASV2014_3867;

	public ASV2014_641(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3867 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3867);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_641(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_641 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1453;
//
//        private var ASV2014_5330:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5330 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5330);
//        }
//
//        public function get ASV2014_3867():int
//        {
//            return (this.ASV2014_5330);
//        }
//
//        public function set ASV2014_3867(_arg1:int):void
//        {
//            this.ASV2014_5330 = _arg1;
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
// ASV2014_3867 = "@d" (String#2610)
// ASV2014_5330 = "![" (String#1992)
// ASV2014_641 = "^!5" (String#10163)
//