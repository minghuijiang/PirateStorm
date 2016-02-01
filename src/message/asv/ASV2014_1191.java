package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1191 extends Message{

	public static final int id = 1550;
	public int orderId;
	public int _cooldown;

	public ASV2014_1191(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.orderId = data.readInt();
		this._cooldown = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.orderId);
		data.writeInt(this._cooldown);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1191(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1191 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1550;
//
//        private var ASV2014_5483:int;
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
//            this.ASV2014_5483 = _arg1.readInt();
//            this._cooldown = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5483);
//            _arg1.writeInt(this._cooldown);
//        }
//
//        public function get orderId():int
//        {
//            return (this.ASV2014_5483);
//        }
//
//        public function set orderId(_arg1:int):void
//        {
//            this.ASV2014_5483 = _arg1;
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
// ASV2014_1191 = "%!x" (String#8915)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5483 = "7\"`" (String#2479)
//