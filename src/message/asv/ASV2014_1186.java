package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1186 extends Message{

	public static final int id = 1458;
	public int ASV2014_3867;
	public int _status;

	public ASV2014_1186(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3867 = data.readInt();
		this._status = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3867);
		data.writeByte(this._status);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1186(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1186 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1458;
//
//        private var ASV2014_5330:int;
//        private var _status:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5330 = _arg1.readInt();
//            this._status = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5330);
//            _arg1.writeByte(this._status);
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
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
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
// ASV2014_1186 = "3!s" (String#12832)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3867 = "@d" (String#2610)
// ASV2014_5330 = "![" (String#1992)
//