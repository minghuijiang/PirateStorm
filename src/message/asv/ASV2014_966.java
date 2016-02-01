package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_966 extends Message{

	public static final int id = 1622;
	public int layerId;

	public ASV2014_966(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.layerId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.layerId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_966(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_966 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1622;
//
//        private var ASV2014_6308:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6308 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6308);
//        }
//
//        public function get layerId():int
//        {
//            return (this.ASV2014_6308);
//        }
//
//        public function set layerId(_arg1:int):void
//        {
//            this.ASV2014_6308 = _arg1;
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
// ASV2014_6308 = "8#M" (String#10736)
// ASV2014_966 = ";!z" (String#13350)
//