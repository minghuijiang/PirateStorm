package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildIslandRankingInfoRequestMessage extends Message{

	public static final int id = 1312;
	public int _month;
	public int _year;
	public int ASV2014_2747;

	public GuildIslandRankingInfoRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._month = data.readByte();
		this._year = data.readShort();
		this.ASV2014_2747 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._month);
		data.writeShort(this._year);
		data.writeShort(this.ASV2014_2747);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildIslandRankingInfoRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1522 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1312;
//
//        private var _month:int;
//        private var _year:int;
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
//            this._month = _arg1.readByte();
//            this._year = _arg1.readShort();
//            this.ASV2014_3845 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._month);
//            _arg1.writeShort(this._year);
//            _arg1.writeShort(this.ASV2014_3845);
//        }
//
//        public function get month():int
//        {
//            return (this._month);
//        }
//
//        public function set month(_arg1:int):void
//        {
//            this._month = _arg1;
//        }
//
//        public function get year():int
//        {
//            return (this._year);
//        }
//
//        public function set year(_arg1:int):void
//        {
//            this._year = _arg1;
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
// ASV2014_1522 = "<\"%" (String#13508)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2747 = "=x" (String#2620)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3845 = "@\"O" (String#1779)
//