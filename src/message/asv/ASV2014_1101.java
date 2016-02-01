package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1101 extends Message{

	public static final int id = 1462;
	public int ASV2014_4442;
	public Message _item;

	public ASV2014_1101(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4442 = data.readByte();
		this._item = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4442);
		component.ClientSocket.writeMessage(this._item, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1101(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1101 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1462;
//
//        private var ASV2014_5692:int;
//        private var _item:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5692 = _arg1.readByte();
//            this._item = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5692);
//            ASV2014_229.writeMessage(this._item, _arg1);
//        }
//
//        public function get ASV2014_4442():int
//        {
//            return (this.ASV2014_5692);
//        }
//
//        public function set ASV2014_4442(_arg1:int):void
//        {
//            this.ASV2014_5692 = _arg1;
//        }
//
//        public function get item():ASV2014_30
//        {
//            return (this._item);
//        }
//
//        public function set item(_arg1:ASV2014_30):void
//        {
//            this._item = _arg1;
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
// ASV2014_1101 = "9!o" (String#15413)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_4442 = "[!v" (String#6664)
// ASV2014_5692 = "#\"@" (String#4932)
//