package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1483 extends Message{

	public static final int id = 1025;
	public int targetId;
	public int _flags;

	public ASV2014_1483(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.targetId = data.readInt();
		this._flags = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.targetId);
		data.writeByte(this._flags);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1483(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1483 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1025;
//
//        private var ASV2014_6539:int;
//        private var _flags:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6539 = _arg1.readInt();
//            this._flags = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6539);
//            _arg1.writeByte(this._flags);
//        }
//
//        public function get targetId():int
//        {
//            return (this.ASV2014_6539);
//        }
//
//        public function set targetId(_arg1:int):void
//        {
//            this.ASV2014_6539 = _arg1;
//        }
//
//        public function get flags():int
//        {
//            return (this._flags);
//        }
//
//        public function set flags(_arg1:int):void
//        {
//            this._flags = _arg1;
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
// ASV2014_1483 = "0A" (String#21925)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6539 = "'\"S" (String#8391)
//