package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1322 extends Message{

	public static final int id = 1254;
	public boolean _guildGoldFulfilled;
	public boolean _harbourFulfilled;
	public boolean _guildLevelFulfilled;
	public boolean _guildLeaderFulfilled;
	public int _guildGoldNeeded;
	public int _guildLevelNeeded;

	public ASV2014_1322(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._guildGoldFulfilled = data.readBoolean();
		this._harbourFulfilled = data.readBoolean();
		this._guildLevelFulfilled = data.readBoolean();
		this._guildLeaderFulfilled = data.readBoolean();
		this._guildGoldNeeded = data.readInt();
		this._guildLevelNeeded = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._guildGoldFulfilled);
		data.writeBoolean(this._harbourFulfilled);
		data.writeBoolean(this._guildLevelFulfilled);
		data.writeBoolean(this._guildLeaderFulfilled);
		data.writeInt(this._guildGoldNeeded);
		data.writeByte(this._guildLevelNeeded);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1322(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1322 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1254;
//
//        private var _guildGoldFulfilled:Boolean;
//        private var _harbourFulfilled:Boolean;
//        private var _guildLevelFulfilled:Boolean;
//        private var _guildLeaderFulfilled:Boolean;
//        private var _guildGoldNeeded:int;
//        private var _guildLevelNeeded:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._guildGoldFulfilled = _arg1.readBoolean();
//            this._harbourFulfilled = _arg1.readBoolean();
//            this._guildLevelFulfilled = _arg1.readBoolean();
//            this._guildLeaderFulfilled = _arg1.readBoolean();
//            this._guildGoldNeeded = _arg1.readInt();
//            this._guildLevelNeeded = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._guildGoldFulfilled);
//            _arg1.writeBoolean(this._harbourFulfilled);
//            _arg1.writeBoolean(this._guildLevelFulfilled);
//            _arg1.writeBoolean(this._guildLeaderFulfilled);
//            _arg1.writeInt(this._guildGoldNeeded);
//            _arg1.writeByte(this._guildLevelNeeded);
//        }
//
//        public function get guildGoldFulfilled():Boolean
//        {
//            return (this._guildGoldFulfilled);
//        }
//
//        public function set guildGoldFulfilled(_arg1:Boolean):void
//        {
//            this._guildGoldFulfilled = _arg1;
//        }
//
//        public function get harbourFulfilled():Boolean
//        {
//            return (this._harbourFulfilled);
//        }
//
//        public function set harbourFulfilled(_arg1:Boolean):void
//        {
//            this._harbourFulfilled = _arg1;
//        }
//
//        public function get guildLevelFulfilled():Boolean
//        {
//            return (this._guildLevelFulfilled);
//        }
//
//        public function set guildLevelFulfilled(_arg1:Boolean):void
//        {
//            this._guildLevelFulfilled = _arg1;
//        }
//
//        public function get guildLeaderFulfilled():Boolean
//        {
//            return (this._guildLeaderFulfilled);
//        }
//
//        public function set guildLeaderFulfilled(_arg1:Boolean):void
//        {
//            this._guildLeaderFulfilled = _arg1;
//        }
//
//        public function get guildGoldNeeded():int
//        {
//            return (this._guildGoldNeeded);
//        }
//
//        public function set guildGoldNeeded(_arg1:int):void
//        {
//            this._guildGoldNeeded = _arg1;
//        }
//
//        public function get guildLevelNeeded():int
//        {
//            return (this._guildLevelNeeded);
//        }
//
//        public function set guildLevelNeeded(_arg1:int):void
//        {
//            this._guildLevelNeeded = _arg1;
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
// ASV2014_1322 = "-#6" (String#7870)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//