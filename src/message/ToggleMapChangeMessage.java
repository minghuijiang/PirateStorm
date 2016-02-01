package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class ToggleMapChangeMessage extends Message{

	public static final int id = 1077;
	public boolean mapChangeAvailable;

	public ToggleMapChangeMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.mapChangeAvailable = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this.mapChangeAvailable);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ToggleMapChangeMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1004 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1077;
//
//        private var ASV2014_6338:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6338 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this.ASV2014_6338);
//        }
//
//        public function get mapChangeAvailable():Boolean
//        {
//            return (this.ASV2014_6338);
//        }
//
//        public function set mapChangeAvailable(_arg1:Boolean):void
//        {
//            this.ASV2014_6338 = _arg1;
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
// ASV2014_1004 = "=u" (String#12635)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6338 = ">G" (String#18977)
//