package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildRightsUpdateMessage extends Message{

	public static final int id = 1209;
	public int _rank2;
	public int _rank3;
	public int _rank4;
	public int _rank5;

	public GuildRightsUpdateMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._rank2 = data.readInt();
		this._rank3 = data.readInt();
		this._rank4 = data.readInt();
		this._rank5 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._rank2);
		data.writeInt(this._rank3);
		data.writeInt(this._rank4);
		data.writeInt(this._rank5);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildRightsUpdateMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_701 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1209;
//
//        private var _rank2:int;
//        private var _rank3:int;
//        private var _rank4:int;
//        private var _rank5:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._rank2 = _arg1.readInt();
//            this._rank3 = _arg1.readInt();
//            this._rank4 = _arg1.readInt();
//            this._rank5 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._rank2);
//            _arg1.writeInt(this._rank3);
//            _arg1.writeInt(this._rank4);
//            _arg1.writeInt(this._rank5);
//        }
//
//        public function get rank2():int
//        {
//            return (this._rank2);
//        }
//
//        public function set rank2(_arg1:int):void
//        {
//            this._rank2 = _arg1;
//        }
//
//        public function get rank3():int
//        {
//            return (this._rank3);
//        }
//
//        public function set rank3(_arg1:int):void
//        {
//            this._rank3 = _arg1;
//        }
//
//        public function get rank4():int
//        {
//            return (this._rank4);
//        }
//
//        public function set rank4(_arg1:int):void
//        {
//            this._rank4 = _arg1;
//        }
//
//        public function get rank5():int
//        {
//            return (this._rank5);
//        }
//
//        public function set rank5(_arg1:int):void
//        {
//            this._rank5 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_701 = "`\"R" (String#8295)
//