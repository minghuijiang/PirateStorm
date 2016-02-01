package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_664 extends Message{

	public static final int id = 1513;
	public int priceDiamonds;
	public boolean ASV2014_3383;
	public int _joker;
	public int freedives;
	public MessageList maptileList;
	public int probabilityMaptile;
	public int probabilityAmmo;
	public int probabilityEquipment;
	public int probabilityMisc;

	public ASV2014_664(User user) {
		super(user);
		maptileList = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.priceDiamonds = data.readByte();
		this.ASV2014_3383 = data.readBoolean();
		this._joker = data.readByte();
		this.freedives = data.readShort();
		this.maptileList.deserialize(data);
		this.probabilityMaptile = data.readByte();
		this.probabilityAmmo = data.readByte();
		this.probabilityEquipment = data.readByte();
		this.probabilityMisc = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.priceDiamonds);
		data.writeBoolean(this.ASV2014_3383);
		data.writeByte(this._joker);
		data.writeShort(this.freedives);
		this.maptileList.serialize(data);
		data.writeByte(this.probabilityMaptile);
		data.writeByte(this.probabilityAmmo);
		data.writeByte(this.probabilityEquipment);
		data.writeByte(this.probabilityMisc);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_664(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_664 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1513;
//
//        private var ASV2014_5745:int;
//        private var ASV2014_5746:Boolean;
//        private var _joker:int;
//        private var ASV2014_5747:int;
//        private var ASV2014_5748:ASV2014_194;
//        private var ASV2014_5749:int;
//        private var ASV2014_5750:int;
//        private var ASV2014_5751:int;
//        private var ASV2014_5752:int;
//
//        public function ASV2014_664()
//        {
//            this.ASV2014_5748 = new ASV2014_194();
//            super();
//            this.maptileList = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5745 = _arg1.readByte();
//            this.ASV2014_5746 = _arg1.readBoolean();
//            this._joker = _arg1.readByte();
//            this.ASV2014_5747 = _arg1.readShort();
//            this.ASV2014_5748.deserialize(_arg1);
//            this.ASV2014_5749 = _arg1.readByte();
//            this.ASV2014_5750 = _arg1.readByte();
//            this.ASV2014_5751 = _arg1.readByte();
//            this.ASV2014_5752 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5745);
//            _arg1.writeBoolean(this.ASV2014_5746);
//            _arg1.writeByte(this._joker);
//            _arg1.writeShort(this.ASV2014_5747);
//            this.ASV2014_5748.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_5749);
//            _arg1.writeByte(this.ASV2014_5750);
//            _arg1.writeByte(this.ASV2014_5751);
//            _arg1.writeByte(this.ASV2014_5752);
//        }
//
//        public function get priceDiamonds():int
//        {
//            return (this.ASV2014_5745);
//        }
//
//        public function set priceDiamonds(_arg1:int):void
//        {
//            this.ASV2014_5745 = _arg1;
//        }
//
//        public function get ASV2014_3383():Boolean
//        {
//            return (this.ASV2014_5746);
//        }
//
//        public function set ASV2014_3383(_arg1:Boolean):void
//        {
//            this.ASV2014_5746 = _arg1;
//        }
//
//        public function get joker():int
//        {
//            return (this._joker);
//        }
//
//        public function set joker(_arg1:int):void
//        {
//            this._joker = _arg1;
//        }
//
//        public function get freedives():int
//        {
//            return (this.ASV2014_5747);
//        }
//
//        public function set freedives(_arg1:int):void
//        {
//            this.ASV2014_5747 = _arg1;
//        }
//
//        public function get maptileList():ASV2014_194
//        {
//            return (this.ASV2014_5748);
//        }
//
//        public function set maptileList(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5748 = _arg1;
//        }
//
//        public function get probabilityMaptile():int
//        {
//            return (this.ASV2014_5749);
//        }
//
//        public function set probabilityMaptile(_arg1:int):void
//        {
//            this.ASV2014_5749 = _arg1;
//        }
//
//        public function get probabilityAmmo():int
//        {
//            return (this.ASV2014_5750);
//        }
//
//        public function set probabilityAmmo(_arg1:int):void
//        {
//            this.ASV2014_5750 = _arg1;
//        }
//
//        public function get probabilityEquipment():int
//        {
//            return (this.ASV2014_5751);
//        }
//
//        public function set probabilityEquipment(_arg1:int):void
//        {
//            this.ASV2014_5751 = _arg1;
//        }
//
//        public function get probabilityMisc():int
//        {
//            return (this.ASV2014_5752);
//        }
//
//        public function set probabilityMisc(_arg1:int):void
//        {
//            this.ASV2014_5752 = _arg1;
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
// ASV2014_3383 = "<#V" (String#9040)
// ASV2014_5745 = "-Y" (String#8561)
// ASV2014_5746 = "&!y" (String#8717)
// ASV2014_5747 = " #-" (String#15580)
// ASV2014_5748 = "9#U" (String#15402)
// ASV2014_5749 = "0\"1" (String#18206)
// ASV2014_5750 = "?\"N" (String#16879)
// ASV2014_5751 = "!\"R" (String#17745)
// ASV2014_5752 = "[!V" (String#18423)
// ASV2014_664 = ">!&" (String#9018)
//