package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class SpecialItemMessage extends Message{

	public static final int id = 1128;
	public int _itemId;

	public SpecialItemMessage(User user) {
		super(user);
	}

	/**
	 * 
	 * @param user
	 * @param id  
	 *     2 加速
	 */
	public SpecialItemMessage(User user, int id) {
		this(user);
		_itemId = id;
	}
	
	public void deserialize(ByteArray data){
		this._itemId = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._itemId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SpecialItemMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_538 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1128;
//
//        private var _itemId:int;
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
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._itemId);
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
// ASV2014_538 = ">#_" (String#11749)
//