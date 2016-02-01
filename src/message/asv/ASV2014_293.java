package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_293 extends Message{

	public static final int id = 1340;
	public int tabType;
	public int tabId;

	public ASV2014_293(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.tabType = data.readByte();
		this.tabId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.tabType);
		data.writeByte(this.tabId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_293(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_293 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1340;
//
//        private var ASV2014_4528:int;
//        private var ASV2014_4529:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4528 = _arg1.readByte();
//            this.ASV2014_4529 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4528);
//            _arg1.writeByte(this.ASV2014_4529);
//        }
//
//        public function get tabType():int
//        {
//            return (this.ASV2014_4528);
//        }
//
//        public function set tabType(_arg1:int):void
//        {
//            this.ASV2014_4528 = _arg1;
//        }
//
//        public function get tabId():int
//        {
//            return (this.ASV2014_4529);
//        }
//
//        public function set tabId(_arg1:int):void
//        {
//            this.ASV2014_4529 = _arg1;
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
// ASV2014_293 = "5C" (String#7893)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4528 = " \"5" (String#8627)
// ASV2014_4529 = "`h" (String#8726)
//