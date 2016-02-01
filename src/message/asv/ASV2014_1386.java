package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1386 extends Message{

	public static final int id = 1100;
	public int groupUserId;
	public int _currentHitpoints;
	public int _maxHitpoints;

	public ASV2014_1386(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.groupUserId = data.readInt();
		this._currentHitpoints = data.readInt();
		this._maxHitpoints = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.groupUserId);
		data.writeInt(this._currentHitpoints);
		data.writeInt(this._maxHitpoints);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1386(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1386 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1100;
//
//        private var ASV2014_6056:int;
//        private var _currentHitpoints:int;
//        private var _maxHitpoints:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6056 = _arg1.readInt();
//            this._currentHitpoints = _arg1.readInt();
//            this._maxHitpoints = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6056);
//            _arg1.writeInt(this._currentHitpoints);
//            _arg1.writeInt(this._maxHitpoints);
//        }
//
//        public function get groupUserId():int
//        {
//            return (this.ASV2014_6056);
//        }
//
//        public function set groupUserId(_arg1:int):void
//        {
//            this.ASV2014_6056 = _arg1;
//        }
//
//        public function get currentHitpoints():int
//        {
//            return (this._currentHitpoints);
//        }
//
//        public function set currentHitpoints(_arg1:int):void
//        {
//            this._currentHitpoints = _arg1;
//        }
//
//        public function get maxHitpoints():int
//        {
//            return (this._maxHitpoints);
//        }
//
//        public function set maxHitpoints(_arg1:int):void
//        {
//            this._maxHitpoints = _arg1;
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
// ASV2014_1386 = "9#-" (String#8884)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6056 = "`\"a" (String#3421)
//