package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_498 extends Message{

	public static final int id = 1504;
	public int currencyAmount;
	public int _price;

	public ASV2014_498(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.currencyAmount = data.readInt();
		this._price = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.currencyAmount);
		data.writeInt(this._price);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_498(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_498 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1504;
//
//        private var ASV2014_5405:int;
//        private var _price:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5405 = _arg1.readInt();
//            this._price = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5405);
//            _arg1.writeInt(this._price);
//        }
//
//        public function get currencyAmount():int
//        {
//            return (this.ASV2014_5405);
//        }
//
//        public function set currencyAmount(_arg1:int):void
//        {
//            this.ASV2014_5405 = _arg1;
//        }
//
//        public function get price():int
//        {
//            return (this._price);
//        }
//
//        public function set price(_arg1:int):void
//        {
//            this._price = _arg1;
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
// ASV2014_498 = "3!f" (String#10844)
// ASV2014_5405 = "`!2" (String#3927)
//