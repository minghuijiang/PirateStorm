package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_577 extends Message{

	public static final int id = 1601;
	public Message currentItem;
	public int _status;

	public ASV2014_577(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.currentItem = component.ClientSocket.readMessage(data,user);
		this._status = data.readByte();
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this.currentItem, data);
		data.writeByte(this._status);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_577(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_577 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1601;
//
//        private var ASV2014_5610:ASV2014_30;
//        private var _status:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5610 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._status = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this.ASV2014_5610, _arg1);
//            _arg1.writeByte(this._status);
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
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
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
// ASV2014_5610 = "@!N" (String#4382)
// ASV2014_577 = "%\"l" (String#5592)
//