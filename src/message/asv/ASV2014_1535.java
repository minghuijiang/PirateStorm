package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1535 extends Message{

	public static final int id = 1038;
	public int typeId;
	public boolean isDone;
	public int mapId;
	public int _x;
	public int _y;
	public int ASV2014_3373;

	public ASV2014_1535(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.typeId = data.readInt();
		this.isDone = data.readBoolean();
		this.mapId = data.readInt();
		this._x = data.readInt();
		this._y = data.readInt();
		this.ASV2014_3373 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.typeId);
		data.writeBoolean(this.isDone);
		data.writeInt(this.mapId);
		data.writeInt(this._x);
		data.writeInt(this._y);
		data.writeInt(this.ASV2014_3373);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1535(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1535 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1038;
//
//        private var ASV2014_5424:int;
//        private var ASV2014_6620:Boolean;
//        private var ASV2014_2515:int;
//        private var _x:int;
//        private var _y:int;
//        private var ASV2014_4580:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5424 = _arg1.readInt();
//            this.ASV2014_6620 = _arg1.readBoolean();
//            this.ASV2014_2515 = _arg1.readInt();
//            this._x = _arg1.readInt();
//            this._y = _arg1.readInt();
//            this.ASV2014_4580 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5424);
//            _arg1.writeBoolean(this.ASV2014_6620);
//            _arg1.writeInt(this.ASV2014_2515);
//            _arg1.writeInt(this._x);
//            _arg1.writeInt(this._y);
//            _arg1.writeInt(this.ASV2014_4580);
//        }
//
//        public function get typeId():int
//        {
//            return (this.ASV2014_5424);
//        }
//
//        public function set typeId(_arg1:int):void
//        {
//            this.ASV2014_5424 = _arg1;
//        }
//
//        public function get isDone():Boolean
//        {
//            return (this.ASV2014_6620);
//        }
//
//        public function set isDone(_arg1:Boolean):void
//        {
//            this.ASV2014_6620 = _arg1;
//        }
//
//        public function get mapId():int
//        {
//            return (this.ASV2014_2515);
//        }
//
//        public function set mapId(_arg1:int):void
//        {
//            this.ASV2014_2515 = _arg1;
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
//        public function get ASV2014_3373():int
//        {
//            return (this.ASV2014_4580);
//        }
//
//        public function set ASV2014_3373(_arg1:int):void
//        {
//            this.ASV2014_4580 = _arg1;
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
// ASV2014_1535 = "[-" (String#21977)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2515 = ",!8" (String#2039)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3373 = "]!T" (String#14125)
// ASV2014_4580 = "^U" (String#8733)
// ASV2014_5424 = "3h" (String#3435)
// ASV2014_6620 = "#\"a" (String#16859)
//