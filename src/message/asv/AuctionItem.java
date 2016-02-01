package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class AuctionItem extends Message{

	public static final int id = 1452;
	public int itemID;
	public int currentCurrencyValue;
	public int currentCurrencyType;
	public int _bidCurrencyValue;
	public int _bidCurrencyType;
	public int ASV2014_4445;
	public String bidderName;
	public int _timeLeft;
	public int itemType;
	public int itemDefaultId;
	public int _itemAmount;
	public int itemSettings;

	public AuctionItem(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.itemID = data.readInt();
		this.currentCurrencyValue = data.readInt();
		this.currentCurrencyType = data.readByte();
		this._bidCurrencyValue = data.readInt();
		this._bidCurrencyType = data.readByte();
		this.ASV2014_4445 = data.readInt();
		this.bidderName = data.readUTF();
		this._timeLeft = data.readInt();
		this.itemType = data.readByte();
		this.itemDefaultId = data.readByte();
		this._itemAmount = data.readShort();
		this.itemSettings = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.itemID);
		data.writeInt(this.currentCurrencyValue);
		data.writeByte(this.currentCurrencyType);
		data.writeInt(this._bidCurrencyValue);
		data.writeByte(this._bidCurrencyType);
		data.writeInt(this.ASV2014_4445);
		data.writeUTF(this.bidderName);
		data.writeInt(this._timeLeft);
		data.writeByte(this.itemType);
		data.writeByte(this.itemDefaultId);
		data.writeShort(this._itemAmount);
		data.writeByte(this.itemSettings);
	}

	public void action(){
		if(user.bidItem.contains(itemID)){
			
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new AuctionItem(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_609 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1452;
//
//        private var ASV2014_5330:int;
//        private var ASV2014_5693:int;
//        private var ASV2014_5694:int;
//        private var _bidCurrencyValue:int;
//        private var _bidCurrencyType:int;
//        private var ASV2014_5238:int;
//        private var ASV2014_5239:String;
//        private var _timeLeft:int;
//        private var ASV2014_2516:int;
//        private var ASV2014_2843:int;
//        private var _itemAmount:int;
//        private var ASV2014_5695:int;
//
//        public function ASV2014_609()
//        {
//            this.ASV2014_5241 = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5330 = _arg1.readInt();
//            this.ASV2014_5693 = _arg1.readInt();
//            this.ASV2014_5694 = _arg1.readByte();
//            this._bidCurrencyValue = _arg1.readInt();
//            this._bidCurrencyType = _arg1.readByte();
//            this.ASV2014_5238 = _arg1.readInt();
//            this.ASV2014_5239 = _arg1.readUTF();
//            this._timeLeft = _arg1.readInt();
//            this.ASV2014_2516 = _arg1.readByte();
//            this.ASV2014_2843 = _arg1.readByte();
//            this._itemAmount = _arg1.readShort();
//            this.ASV2014_5695 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5330);
//            _arg1.writeInt(this.ASV2014_5693);
//            _arg1.writeByte(this.ASV2014_5694);
//            _arg1.writeInt(this._bidCurrencyValue);
//            _arg1.writeByte(this._bidCurrencyType);
//            _arg1.writeInt(this.ASV2014_5238);
//            _arg1.writeUTF(this.ASV2014_5239);
//            _arg1.writeInt(this._timeLeft);
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeShort(this._itemAmount);
//            _arg1.writeByte(this.ASV2014_5695);
//        }
//
//        public function get ASV2014_3867():int
//        {
//            return (this.ASV2014_5330);
//        }
//
//        public function set ASV2014_3867(_arg1:int):void
//        {
//            this.ASV2014_5330 = _arg1;
//        }
//
//        public function get currentCurrencyValue():int
//        {
//            return (this.ASV2014_5693);
//        }
//
//        public function set currentCurrencyValue(_arg1:int):void
//        {
//            this.ASV2014_5693 = _arg1;
//        }
//
//        public function get currentCurrencyType():int
//        {
//            return (this.ASV2014_5694);
//        }
//
//        public function set currentCurrencyType(_arg1:int):void
//        {
//            this.ASV2014_5694 = _arg1;
//        }
//
//        public function get bidCurrencyValue():int
//        {
//            return (this._bidCurrencyValue);
//        }
//
//        public function set bidCurrencyValue(_arg1:int):void
//        {
//            this._bidCurrencyValue = _arg1;
//        }
//
//        public function get bidCurrencyType():int
//        {
//            return (this._bidCurrencyType);
//        }
//
//        public function set bidCurrencyType(_arg1:int):void
//        {
//            this._bidCurrencyType = _arg1;
//        }
//
//        public function get ASV2014_4445():int
//        {
//            return (this.ASV2014_5238);
//        }
//
//        public function set ASV2014_4445(_arg1:int):void
//        {
//            this.ASV2014_5238 = _arg1;
//        }
//
//        public function get ASV2014_5241():String
//        {
//            return (this.ASV2014_5239);
//        }
//
//        public function set ASV2014_5241(_arg1:String):void
//        {
//            this.ASV2014_5239 = _arg1;
//        }
//
//        public function get timeLeft():int
//        {
//            return (this._timeLeft);
//        }
//
//        public function set timeLeft(_arg1:int):void
//        {
//            this._timeLeft = _arg1;
//        }
//
//        public function get itemType():int
//        {
//            return (this.ASV2014_2516);
//        }
//
//        public function set itemType(_arg1:int):void
//        {
//            this.ASV2014_2516 = _arg1;
//        }
//
//        public function get itemDefaultId():int
//        {
//            return (this.ASV2014_2843);
//        }
//
//        public function set itemDefaultId(_arg1:int):void
//        {
//            this.ASV2014_2843 = _arg1;
//        }
//
//        public function get itemAmount():int
//        {
//            return (this._itemAmount);
//        }
//
//        public function set itemAmount(_arg1:int):void
//        {
//            this._itemAmount = _arg1;
//        }
//
//        public function get itemSettings():int
//        {
//            return (this.ASV2014_5695);
//        }
//
//        public function set itemSettings(_arg1:int):void
//        {
//            this.ASV2014_5695 = _arg1;
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
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3867 = "@d" (String#2610)
// ASV2014_4445 = ";\"a" (String#6843)
// ASV2014_5238 = "<\"?" (String#4304)
// ASV2014_5239 = "=S" (String#4188)
// ASV2014_5241 = " G" (String#6137)
// ASV2014_5330 = "![" (String#1992)
// ASV2014_5693 = ";!_" (String#5691)
// ASV2014_5694 = "[![" (String#18447)
// ASV2014_5695 = " \">" (String#15553)
// ASV2014_609 = "7\"@" (String#5311)
//