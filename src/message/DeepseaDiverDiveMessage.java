package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class DeepseaDiverDiveMessage extends Message{

	public static final int id = 1515;
	public boolean _autodive;

	public DeepseaDiverDiveMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._autodive = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._autodive);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new DeepseaDiverDiveMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_669 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1515;
//
//        private var _autodive:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._autodive = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._autodive);
//        }
//
//        public function get autodive():Boolean
//        {
//            return (this._autodive);
//        }
//
//        public function set autodive(_arg1:Boolean):void
//        {
//            this._autodive = _arg1;
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
// ASV2014_669 = "?#\"" (String#12074)
//