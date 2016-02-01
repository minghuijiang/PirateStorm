package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_570 extends Message{

	public static final int id = 1598;
	public int ASV2014_4344;
	public int ASV2014_4345;
	public Message _slotContent;
	public int _remainingTimeToFinishSec;

	public ASV2014_570(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4344 = data.readByte();
		this.ASV2014_4345 = data.readByte();
		this._slotContent = component.ClientSocket.readMessage(data,user);
		this._remainingTimeToFinishSec = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4344);
		data.writeByte(this.ASV2014_4345);
		component.ClientSocket.writeMessage(this._slotContent, data);
		data.writeInt(this._remainingTimeToFinishSec);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_570(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_570 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1598;
//
//        private var ASV2014_5595:int;
//        private var ASV2014_5596:int;
//        private var _slotContent:ASV2014_30;
//        private var _remainingTimeToFinishSec:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5595 = _arg1.readByte();
//            this.ASV2014_5596 = _arg1.readByte();
//            this._slotContent = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._remainingTimeToFinishSec = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5595);
//            _arg1.writeByte(this.ASV2014_5596);
//            ASV2014_229.writeMessage(this._slotContent, _arg1);
//            _arg1.writeInt(this._remainingTimeToFinishSec);
//        }
//
//        public function get ASV2014_4344():int
//        {
//            return (this.ASV2014_5595);
//        }
//
//        public function set ASV2014_4344(_arg1:int):void
//        {
//            this.ASV2014_5595 = _arg1;
//        }
//
//        public function get ASV2014_4345():int
//        {
//            return (this.ASV2014_5596);
//        }
//
//        public function set ASV2014_4345(_arg1:int):void
//        {
//            this.ASV2014_5596 = _arg1;
//        }
//
//        public function get slotContent():ASV2014_30
//        {
//            return (this._slotContent);
//        }
//
//        public function set slotContent(_arg1:ASV2014_30):void
//        {
//            this._slotContent = _arg1;
//        }
//
//        public function get remainingTimeToFinishSec():int
//        {
//            return (this._remainingTimeToFinishSec);
//        }
//
//        public function set remainingTimeToFinishSec(_arg1:int):void
//        {
//            this._remainingTimeToFinishSec = _arg1;
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
// ASV2014_4344 = "[#_" (String#2805)
// ASV2014_4345 = "4#O" (String#10139)
// ASV2014_5595 = "3!9" (String#2009)
// ASV2014_5596 = "[u" (String#8369)
// ASV2014_570 = "7m" (String#7470)
//