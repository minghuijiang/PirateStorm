package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_630 extends Message{

	public static final int id = 1600;
	public Message currentItem;
	public int nextItemLevel;
	public int _currencyType;
	public int _currencyValue;
	public int _timeToFinishSec;
	public int professionXpGain;
	public int neededProfessionLevel;
	public int _sortingIndex;
	public MessageList neededMaterials;

	public ASV2014_630(User user) {
		super(user);
		neededMaterials = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.currentItem = component.ClientSocket.readMessage(data,user);
		this.nextItemLevel = data.readByte();
		this._currencyType = data.readByte();
		this._currencyValue = data.readInt();
		this._timeToFinishSec = data.readInt();
		this.professionXpGain = data.readInt();
		this.neededProfessionLevel = data.readByte();
		this._sortingIndex = data.readInt();
		this.neededMaterials.deserialize(data);
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this.currentItem, data);
		data.writeByte(this.nextItemLevel);
		data.writeByte(this._currencyType);
		data.writeInt(this._currencyValue);
		data.writeInt(this._timeToFinishSec);
		data.writeInt(this.professionXpGain);
		data.writeByte(this.neededProfessionLevel);
		data.writeInt(this._sortingIndex);
		this.neededMaterials.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_630(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_630 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1600;
//
//        private var ASV2014_5610:ASV2014_30;
//        private var ASV2014_5598:int;
//        private var _currencyType:int;
//        private var _currencyValue:int;
//        private var _timeToFinishSec:int;
//        private var ASV2014_5599:int;
//        private var ASV2014_5600:int;
//        private var _sortingIndex:int;
//        private var ASV2014_5601:ASV2014_194;
//
//        public function ASV2014_630()
//        {
//            this.ASV2014_5601 = new ASV2014_194();
//            super();
//            this.neededMaterials = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5610 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_5598 = _arg1.readByte();
//            this._currencyType = _arg1.readByte();
//            this._currencyValue = _arg1.readInt();
//            this._timeToFinishSec = _arg1.readInt();
//            this.ASV2014_5599 = _arg1.readInt();
//            this.ASV2014_5600 = _arg1.readByte();
//            this._sortingIndex = _arg1.readInt();
//            this.ASV2014_5601.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this.ASV2014_5610, _arg1);
//            _arg1.writeByte(this.ASV2014_5598);
//            _arg1.writeByte(this._currencyType);
//            _arg1.writeInt(this._currencyValue);
//            _arg1.writeInt(this._timeToFinishSec);
//            _arg1.writeInt(this.ASV2014_5599);
//            _arg1.writeByte(this.ASV2014_5600);
//            _arg1.writeInt(this._sortingIndex);
//            this.ASV2014_5601.ASV2014_2336(_arg1);
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
//        public function get nextItemLevel():int
//        {
//            return (this.ASV2014_5598);
//        }
//
//        public function set nextItemLevel(_arg1:int):void
//        {
//            this.ASV2014_5598 = _arg1;
//        }
//
//        public function get currencyType():int
//        {
//            return (this._currencyType);
//        }
//
//        public function set currencyType(_arg1:int):void
//        {
//            this._currencyType = _arg1;
//        }
//
//        public function get currencyValue():int
//        {
//            return (this._currencyValue);
//        }
//
//        public function set currencyValue(_arg1:int):void
//        {
//            this._currencyValue = _arg1;
//        }
//
//        public function get timeToFinishSec():int
//        {
//            return (this._timeToFinishSec);
//        }
//
//        public function set timeToFinishSec(_arg1:int):void
//        {
//            this._timeToFinishSec = _arg1;
//        }
//
//        public function get professionXpGain():int
//        {
//            return (this.ASV2014_5599);
//        }
//
//        public function set professionXpGain(_arg1:int):void
//        {
//            this.ASV2014_5599 = _arg1;
//        }
//
//        public function get neededProfessionLevel():int
//        {
//            return (this.ASV2014_5600);
//        }
//
//        public function set neededProfessionLevel(_arg1:int):void
//        {
//            this.ASV2014_5600 = _arg1;
//        }
//
//        public function get sortingIndex():int
//        {
//            return (this._sortingIndex);
//        }
//
//        public function set sortingIndex(_arg1:int):void
//        {
//            this._sortingIndex = _arg1;
//        }
//
//        public function get neededMaterials():ASV2014_194
//        {
//            return (this.ASV2014_5601);
//        }
//
//        public function set neededMaterials(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5601 = _arg1;
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
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_5598 = "0-" (String#11008)
// ASV2014_5599 = "'n" (String#11441)
// ASV2014_5600 = "2=" (String#11141)
// ASV2014_5601 = ">#A" (String#9961)
// ASV2014_5610 = "@!N" (String#4382)
// ASV2014_630 = "&!x" (String#6607)
//