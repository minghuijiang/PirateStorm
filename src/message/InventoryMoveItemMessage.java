package message;

import com.mingJiang.as.ByteArray;

import component.Main;
import component.User;

public class InventoryMoveItemMessage extends Message{

	public static final int id = 1122;
	public int itemType;
	public int itemDefaultId;
	public int itemLevel;
	public int _amount;

	public InventoryMoveItemMessage(User user) {
		super(user);
	}
	
	/**
	 * 
	 * @param user
	 * @param type   
	 * 			20 install 
	 * 			7 uninstall
	 * @param id
	 * @param level
	 * @param amount
	 */
	public InventoryMoveItemMessage(User user,int type, int id, int level, int amount) {
		this(user);
		itemType=type;
		itemDefaultId= id;
		itemLevel= level;
		_amount = amount;
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this.itemDefaultId = data.readByte();
		this.itemLevel = data.readByte();
		this._amount = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		data.writeByte(this.itemDefaultId);
		data.writeByte(this.itemLevel);
		data.writeInt(this._amount);
	}

	public void action(){
	//	Main.canUpgrade=true;
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new InventoryMoveItemMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_295 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1122;
//
//        private var ASV2014_2516:int;
//        private var ASV2014_2843:int;
//        private var ASV2014_2844:int;
//        private var _amount:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2516 = _arg1.readByte();
//            this.ASV2014_2843 = _arg1.readByte();
//            this.ASV2014_2844 = _arg1.readByte();
//            this._amount = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_2843);
//            _arg1.writeByte(this.ASV2014_2844);
//            _arg1.writeInt(this._amount);
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
//        public function get itemLevel():int
//        {
//            return (this.ASV2014_2844);
//        }
//
//        public function set itemLevel(_arg1:int):void
//        {
//            this.ASV2014_2844 = _arg1;
//        }
//
//        public function get amount():int
//        {
//            return (this._amount);
//        }
//
//        public function set amount(_arg1:int):void
//        {
//            this._amount = _arg1;
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
// ASV2014_2844 = "0!H" (String#1902)
// ASV2014_295 = "6\"S" (String#9101)
// ASV2014_30 = ";#V" (String#144)
//