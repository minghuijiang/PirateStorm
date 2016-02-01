package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_186 extends Message{

	public static final int id = 1169;
	public Message reward;
	public int _price;

	public ASV2014_186(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.reward = component.ClientSocket.readMessage(data,user);
		this._price = data.readInt();
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this.reward, data);
		data.writeInt(this._price);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_186(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_186 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1169;
//
//        private var ASV2014_3908:ASV2014_30;
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
//            this.ASV2014_3908 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this._price = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this.ASV2014_3908, _arg1);
//            _arg1.writeInt(this._price);
//        }
//
//        public function get reward():ASV2014_30
//        {
//            return (this.ASV2014_3908);
//        }
//
//        public function set reward(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_3908 = _arg1;
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
// ASV2014_186 = "9\";" (String#7518)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3908 = "6\"J" (String#18348)
//