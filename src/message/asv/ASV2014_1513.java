package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1513 extends Message{

	public static final int id = 1045;
	public int objectId;
	public boolean ASV2014_6614;
	public int _x;
	public int _y;

	public ASV2014_1513(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_6614 = data.readBoolean();
		this._x = data.readShort();
		this._y = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeBoolean(this.ASV2014_6614);
		data.writeShort(this._x);
		data.writeShort(this._y);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1513(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1513 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1045;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_6613:Boolean;
//        private var _x:int;
//        private var _y:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_6613 = _arg1.readBoolean();
//            this._x = _arg1.readShort();
//            this._y = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeBoolean(this.ASV2014_6613);
//            _arg1.writeShort(this._x);
//            _arg1.writeShort(this._y);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get ASV2014_6614():Boolean
//        {
//            return (this.ASV2014_6613);
//        }
//
//        public function set ASV2014_6614(_arg1:Boolean):void
//        {
//            this.ASV2014_6613 = _arg1;
//        }
//
//        public function get x():int
//        {
//            return (this._x);
//        }
//
//        public function set x(_arg1:int):void
//        {
//            this._x = _arg1;
//        }
//
//        public function get y():int
//        {
//            return (this._y);
//        }
//
//        public function set y(_arg1:int):void
//        {
//            this._y = _arg1;
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
// ASV2014_1513 = "5\"Q" (String#22979)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6613 = "'!C" (String#8435)
// ASV2014_6614 = "&!#" (String#20966)
//