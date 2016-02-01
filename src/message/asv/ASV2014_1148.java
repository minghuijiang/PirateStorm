package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1148 extends Message{

	public static final int id = 1481;
	public int _pageIndex;
	public int friendCount;
	public int friendMaxCount;
	public int lastSyncDate;
	public MessageList _result;

	public ASV2014_1148(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._pageIndex = data.readShort();
		this.friendCount = data.readShort();
		this.friendMaxCount = data.readShort();
		this.lastSyncDate = data.readInt();
		this._result.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeShort(this._pageIndex);
		data.writeShort(this.friendCount);
		data.writeShort(this.friendMaxCount);
		data.writeInt(this.lastSyncDate);
		this._result.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1148(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1148 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1481;
//
//        private var _pageIndex:int;
//        private var ASV2014_6438:int;
//        private var ASV2014_6439:int;
//        private var ASV2014_6440:int;
//        private var _result:ASV2014_194;
//
//        public function ASV2014_1148()
//        {
//            this._result = new ASV2014_194();
//            super();
//            this.result = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._pageIndex = _arg1.readShort();
//            this.ASV2014_6438 = _arg1.readShort();
//            this.ASV2014_6439 = _arg1.readShort();
//            this.ASV2014_6440 = _arg1.readInt();
//            this._result.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._pageIndex);
//            _arg1.writeShort(this.ASV2014_6438);
//            _arg1.writeShort(this.ASV2014_6439);
//            _arg1.writeInt(this.ASV2014_6440);
//            this._result.ASV2014_2336(_arg1);
//        }
//
//        public function get pageIndex():int
//        {
//            return (this._pageIndex);
//        }
//
//        public function set pageIndex(_arg1:int):void
//        {
//            this._pageIndex = _arg1;
//        }
//
//        public function get friendCount():int
//        {
//            return (this.ASV2014_6438);
//        }
//
//        public function set friendCount(_arg1:int):void
//        {
//            this.ASV2014_6438 = _arg1;
//        }
//
//        public function get friendMaxCount():int
//        {
//            return (this.ASV2014_6439);
//        }
//
//        public function set friendMaxCount(_arg1:int):void
//        {
//            this.ASV2014_6439 = _arg1;
//        }
//
//        public function get lastSyncDate():int
//        {
//            return (this.ASV2014_6440);
//        }
//
//        public function set lastSyncDate(_arg1:int):void
//        {
//            this.ASV2014_6440 = _arg1;
//        }
//
//        public function get result():ASV2014_194
//        {
//            return (this._result);
//        }
//
//        public function set result(_arg1:ASV2014_194):void
//        {
//            this._result = _arg1;
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
// ASV2014_1148 = "-\"l" (String#13552)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6438 = "%`" (String#15917)
// ASV2014_6439 = "@# " (String#16572)
// ASV2014_6440 = "`!n" (String#16524)
//