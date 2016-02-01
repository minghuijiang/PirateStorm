package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ItemCoolDownMessage extends Message{

	public static final int id = 1132;
	public int _itemId;
	public int _cooldown;

	public ItemCoolDownMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._itemId = data.readShort();
		this._cooldown = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._itemId);
		data.writeInt(this._cooldown);
	}

	public void action(){
		user.addCoolDown(_itemId,_cooldown);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ItemCoolDownMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_393 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1132;
//
//        private var _itemId:int;
//        private var _cooldown:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._itemId = _arg1.readShort();
//            this._cooldown = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._itemId);
//            _arg1.writeInt(this._cooldown);
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
//        public function get cooldown():int
//        {
//            return (this._cooldown);
//        }
//
//        public function set cooldown(_arg1:int):void
//        {
//            this._cooldown = _arg1;
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
// ASV2014_30 = ";#V" (String#144)
// ASV2014_393 = "]!\"" (String#8159)
//