package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_595 extends Message{

	public static final int id = 1239;
	public int ASV2014_4373;
	public Message ASV2014_4372;

	public ASV2014_595(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4373 = data.readByte();
		this.ASV2014_4372 = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4373);
		component.ClientSocket.writeMessage(this.ASV2014_4372, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_595(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_595 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1239;
//
//        private var ASV2014_5666:int;
//        private var ASV2014_5674:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5666 = _arg1.readByte();
//            this.ASV2014_5674 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5666);
//            ASV2014_229.writeMessage(this.ASV2014_5674, _arg1);
//        }
//
//        public function get ASV2014_4373():int
//        {
//            return (this.ASV2014_5666);
//        }
//
//        public function set ASV2014_4373(_arg1:int):void
//        {
//            this.ASV2014_5666 = _arg1;
//        }
//
//        public function get ASV2014_4372():ASV2014_30
//        {
//            return (this.ASV2014_5674);
//        }
//
//        public function set ASV2014_4372(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_5674 = _arg1;
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
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_4372 = "]!-" (String#25426)
// ASV2014_4373 = "0!q" (String#18349)
// ASV2014_5666 = ">q" (String#10392)
// ASV2014_5674 = "'\"I" (String#17197)
// ASV2014_595 = "%!a" (String#11402)
//