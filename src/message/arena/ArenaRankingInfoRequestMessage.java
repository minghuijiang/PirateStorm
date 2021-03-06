package message.arena;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ArenaRankingInfoRequestMessage extends Message{

	public static final int id = 1409;
	public int _type;
	public int ASV2014_2751;
	public int _filter;
	public int ASV2014_2747;

	public ArenaRankingInfoRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this.ASV2014_2751 = data.readByte();
		this._filter = data.readByte();
		this.ASV2014_2747 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeByte(this.ASV2014_2751);
		data.writeByte(this._filter);
		data.writeShort(this.ASV2014_2747);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ArenaRankingInfoRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_149 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1409;
//
//        private var _type:int;
//        private var ASV2014_3844:int;
//        private var _filter:int;
//        private var ASV2014_3845:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this.ASV2014_3844 = _arg1.readByte();
//            this._filter = _arg1.readByte();
//            this.ASV2014_3845 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeByte(this.ASV2014_3844);
//            _arg1.writeByte(this._filter);
//            _arg1.writeShort(this.ASV2014_3845);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
//        }
//
//        public function get ASV2014_2751():int
//        {
//            return (this.ASV2014_3844);
//        }
//
//        public function set ASV2014_2751(_arg1:int):void
//        {
//            this.ASV2014_3844 = _arg1;
//        }
//
//        public function get filter():int
//        {
//            return (this._filter);
//        }
//
//        public function set filter(_arg1:int):void
//        {
//            this._filter = _arg1;
//        }
//
//        public function get ASV2014_2747():int
//        {
//            return (this.ASV2014_3845);
//        }
//
//        public function set ASV2014_2747(_arg1:int):void
//        {
//            this.ASV2014_3845 = _arg1;
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
// ASV2014_149 = "?#&" (String#12161)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2747 = "=x" (String#2620)
// ASV2014_2751 = ";!Q" (String#25804)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3844 = "<M" (String#16703)
// ASV2014_3845 = "@\"O" (String#1779)
//