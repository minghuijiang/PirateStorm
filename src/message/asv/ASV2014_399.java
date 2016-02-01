package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_399 extends Message{

	public static final int id = 1345;
	public int eventId;
	public int _itemId;
	public int _stepAmount;
	public int currentStep;
	public MessageList discountList;

	public ASV2014_399(User user) {
		super(user);
		discountList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.eventId = data.readInt();
		this._itemId = data.readInt();
		this._stepAmount = data.readByte();
		this.currentStep = data.readByte();
		this.discountList.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.eventId);
		data.writeInt(this._itemId);
		data.writeByte(this._stepAmount);
		data.writeByte(this.currentStep);
		this.discountList.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_399(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_399 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1345;
//
//        private var ASV2014_3728:int;
//        private var _itemId:int;
//        private var _stepAmount:int;
//        private var ASV2014_4921:int;
//        private var ASV2014_4922:ASV2014_194;
//
//        public function ASV2014_399()
//        {
//            this.ASV2014_4922 = new ASV2014_194();
//            super();
//            this.discountList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3728 = _arg1.readInt();
//            this._itemId = _arg1.readInt();
//            this._stepAmount = _arg1.readByte();
//            this.ASV2014_4921 = _arg1.readByte();
//            this.ASV2014_4922.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3728);
//            _arg1.writeInt(this._itemId);
//            _arg1.writeByte(this._stepAmount);
//            _arg1.writeByte(this.ASV2014_4921);
//            this.ASV2014_4922.ASV2014_2336(_arg1);
//        }
//
//        public function get eventId():int
//        {
//            return (this.ASV2014_3728);
//        }
//
//        public function set eventId(_arg1:int):void
//        {
//            this.ASV2014_3728 = _arg1;
//        }
//
//        public function get itemId():int
//        {
//            return (this._itemId);
//        }
//
//        public function set itemId(_arg1:int):void
//        {
//            this._itemId = _arg1;
//        }
//
//        public function get stepAmount():int
//        {
//            return (this._stepAmount);
//        }
//
//        public function set stepAmount(_arg1:int):void
//        {
//            this._stepAmount = _arg1;
//        }
//
//        public function get currentStep():int
//        {
//            return (this.ASV2014_4921);
//        }
//
//        public function set currentStep(_arg1:int):void
//        {
//            this.ASV2014_4921 = _arg1;
//        }
//
//        public function get discountList():ASV2014_194
//        {
//            return (this.ASV2014_4922);
//        }
//
//        public function set discountList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_4922 = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3728 = "[!_" (String#2158)
// ASV2014_399 = "&# " (String#8252)
// ASV2014_4921 = "?\"'" (String#9856)
// ASV2014_4922 = ";\"U" (String#13898)
//