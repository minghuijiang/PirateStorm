package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_895 extends Message{

	public static final int id = 1528;
	public int sectionId;

	public ASV2014_895(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.sectionId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.sectionId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_895(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_895 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1528;
//
//        private var ASV2014_5611:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5611 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5611);
//        }
//
//        public function get sectionId():int
//        {
//            return (this.ASV2014_5611);
//        }
//
//        public function set sectionId(_arg1:int):void
//        {
//            this.ASV2014_5611 = _arg1;
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
// ASV2014_5611 = "7h" (String#3387)
// ASV2014_895 = "\"5" (String#10788)
//