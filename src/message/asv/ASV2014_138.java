package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_138 extends Message{

	public static final int id = 1508;
	public boolean ASV2014_2732;

	public ASV2014_138(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2732 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this.ASV2014_2732);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_138(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_138 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1508;
//
//        private var ASV2014_3806:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3806 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this.ASV2014_3806);
//        }
//
//        public function get ASV2014_2732():Boolean
//        {
//            return (this.ASV2014_3806);
//        }
//
//        public function set ASV2014_2732(_arg1:Boolean):void
//        {
//            this.ASV2014_3806 = _arg1;
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
// ASV2014_138 = ",!d" (String#11294)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2732 = "8\"b" (String#15043)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3806 = " \"D" (String#15640)
//