package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1179 extends Message{

	public static final int id = 1341;
	public int tabType;
	public int tabId;
	public int eventCurrencyType;
	public Message _items;

	public ASV2014_1179(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.tabType = data.readByte();
		this.tabId = data.readByte();
		this.eventCurrencyType = data.readByte();
		this._items = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.tabType);
		data.writeByte(this.tabId);
		data.writeByte(this.eventCurrencyType);
		component.ClientSocket.writeMessage(this._items, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1179(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1179 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1341;
//
//        private var ASV2014_4528:int;
//        private var ASV2014_4529:int;
//        private var ASV2014_3876:int;
//        private var _items:ASV2014_30;
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
//            this.ASV2014_3876 = _arg1.readByte();
//            this._items = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4528);
//            _arg1.writeByte(this.ASV2014_4529);
//            _arg1.writeByte(this.ASV2014_3876);
//            ASV2014_229.writeMessage(this._items, _arg1);
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
//        public function get eventCurrencyType():int
//        {
//            return (this.ASV2014_3876);
//        }
//
//        public function set eventCurrencyType(_arg1:int):void
//        {
//            this.ASV2014_3876 = _arg1;
//        }
//
//        public function get items():ASV2014_30
//        {
//            return (this._items);
//        }
//
//        public function set items(_arg1:ASV2014_30):void
//        {
//            this._items = _arg1;
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
// ASV2014_1179 = "1#k" (String#8902)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3876 = "[#v" (String#7996)
// ASV2014_4528 = " \"5" (String#8627)
// ASV2014_4529 = "`h" (String#8726)
//