package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1331 extends Message{

	public static final int id = 1139;
	public int _reason;
	public int minLevel;

	public ASV2014_1331(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._reason = data.readByte();
		this.minLevel = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._reason);
		data.writeByte(this.minLevel);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1331(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1331 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1139;
//
//        private var _reason:int;
//        private var ASV2014_4439:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._reason = _arg1.readByte();
//            this.ASV2014_4439 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._reason);
//            _arg1.writeByte(this.ASV2014_4439);
//        }
//
//        public function get reason():int
//        {
//            return (this._reason);
//        }
//
//        public function set reason(_arg1:int):void
//        {
//            this._reason = _arg1;
//        }
//
//        public function get minLevel():int
//        {
//            return (this.ASV2014_4439);
//        }
//
//        public function set minLevel(_arg1:int):void
//        {
//            this.ASV2014_4439 = _arg1;
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
// ASV2014_1331 = "?#L" (String#12729)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4439 = "9\"E" (String#3945)
//