package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1494 extends Message{

	public static final int id = 1035;
	public int currentQuests;
	public int maxQuests;

	public ASV2014_1494(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.currentQuests = data.readInt();
		this.maxQuests = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.currentQuests);
		data.writeInt(this.maxQuests);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1494(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1494 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1035;
//
//        private var ASV2014_6607:int;
//        private var ASV2014_6608:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6607 = _arg1.readInt();
//            this.ASV2014_6608 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6607);
//            _arg1.writeInt(this.ASV2014_6608);
//        }
//
//        public function get currentQuests():int
//        {
//            return (this.ASV2014_6607);
//        }
//
//        public function set currentQuests(_arg1:int):void
//        {
//            this.ASV2014_6607 = _arg1;
//        }
//
//        public function get maxQuests():int
//        {
//            return (this.ASV2014_6608);
//        }
//
//        public function set maxQuests(_arg1:int):void
//        {
//            this.ASV2014_6608 = _arg1;
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
// ASV2014_1494 = "[l" (String#19877)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6607 = "6\"e" (String#18266)
// ASV2014_6608 = "5#'" (String#18160)
//