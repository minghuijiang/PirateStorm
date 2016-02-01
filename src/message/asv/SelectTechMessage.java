package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class SelectTechMessage extends Message{

	public static final int id = 1602;
	public int _functionId;
	public Message currentItem;

	public SelectTechMessage(User user) {
		super(user);
	}
	
	public SelectTechMessage(User user, int function, Message item) {
		this(user);
		_functionId=function;
		currentItem = item;
	}

	public void deserialize(ByteArray data){
		this._functionId = data.readByte();
		this.currentItem = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._functionId);
		component.ClientSocket.writeMessage(this.currentItem, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SelectTechMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1480 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1602;
//
//        private var _functionId:int;
//        private var ASV2014_5610:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._functionId = _arg1.readByte();
//            this.ASV2014_5610 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._functionId);
//            ASV2014_229.writeMessage(this.ASV2014_5610, _arg1);
//        }
//
//        public function get functionId():int
//        {
//            return (this._functionId);
//        }
//
//        public function set functionId(_arg1:int):void
//        {
//            this._functionId = _arg1;
//        }
//
//        public function get currentItem():ASV2014_30
//        {
//            return (this.ASV2014_5610);
//        }
//
//        public function set currentItem(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_5610 = _arg1;
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
// ASV2014_1480 = " \"u" (String#12720)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_5610 = "@!N" (String#4382)
//