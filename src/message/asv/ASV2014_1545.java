package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1545 extends Message{

	public static final int id = 1046;
	public int objectId;
	public boolean ASV2014_6614;

	public ASV2014_1545(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_6614 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeBoolean(this.ASV2014_6614);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1545(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1545 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1046;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_6613:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_6613 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeBoolean(this.ASV2014_6613);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get ASV2014_6614():Boolean
//        {
//            return (this.ASV2014_6613);
//        }
//
//        public function set ASV2014_6614(_arg1:Boolean):void
//        {
//            this.ASV2014_6613 = _arg1;
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
// ASV2014_1545 = "]!q" (String#22528)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6613 = "'!C" (String#8435)
// ASV2014_6614 = "&!#" (String#20966)
//