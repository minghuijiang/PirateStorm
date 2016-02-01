package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ContinueMessage extends Message{

	public static final int id = 1177;
	public boolean continueMap;

	public ContinueMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.continueMap = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this.continueMap);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ContinueMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_191 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1177;
//
//        private var ASV2014_3911:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3911 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this.ASV2014_3911);
//        }
//
//        public function get continueMap():Boolean
//        {
//            return (this.ASV2014_3911);
//        }
//
//        public function set continueMap(_arg1:Boolean):void
//        {
//            this.ASV2014_3911 = _arg1;
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
// ASV2014_191 = "]#9" (String#13107)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3911 = "-\"5" (String#15887)
//