package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1020 extends Message{

	public static final int id = 1430;
	public boolean _active;
	public boolean _isBattlegroundWeek;
	public int matchTypeId;

	public ASV2014_1020(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._active = data.readBoolean();
		this._isBattlegroundWeek = data.readBoolean();
		this.matchTypeId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._active);
		data.writeBoolean(this._isBattlegroundWeek);
		data.writeByte(this.matchTypeId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1020(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1020 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1430;
//
//        private var _active:Boolean;
//        private var _isBattlegroundWeek:Boolean;
//        private var ASV2014_6346:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._active = _arg1.readBoolean();
//            this._isBattlegroundWeek = _arg1.readBoolean();
//            this.ASV2014_6346 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._active);
//            _arg1.writeBoolean(this._isBattlegroundWeek);
//            _arg1.writeByte(this.ASV2014_6346);
//        }
//
//        public function get active():Boolean
//        {
//            return (this._active);
//        }
//
//        public function set active(_arg1:Boolean):void
//        {
//            this._active = _arg1;
//        }
//
//        public function get isBattlegroundWeek():Boolean
//        {
//            return (this._isBattlegroundWeek);
//        }
//
//        public function set isBattlegroundWeek(_arg1:Boolean):void
//        {
//            this._isBattlegroundWeek = _arg1;
//        }
//
//        public function get matchTypeId():int
//        {
//            return (this.ASV2014_6346);
//        }
//
//        public function set matchTypeId(_arg1:int):void
//        {
//            this.ASV2014_6346 = _arg1;
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
// ASV2014_1020 = "3!K" (String#12610)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6346 = "]!Y" (String#16631)
//