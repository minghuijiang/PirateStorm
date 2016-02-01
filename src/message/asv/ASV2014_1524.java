package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1524 extends Message{

	public static final int id = 1048;
	public int ASV2014_6616;

	public ASV2014_1524(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6616 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_6616);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1524(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1524 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1048;
//
//        private var ASV2014_6615:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6615 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6615);
//        }
//
//        public function get ASV2014_6616():int
//        {
//            return (this.ASV2014_6615);
//        }
//
//        public function set ASV2014_6616(_arg1:int):void
//        {
//            this.ASV2014_6615 = _arg1;
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
// ASV2014_1524 = "7#u" (String#23040)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6615 = "90" (String#18317)
// ASV2014_6616 = "4\"M" (String#28075)
//