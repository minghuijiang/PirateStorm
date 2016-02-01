package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1081 extends Message{

	public static final int id = 1252;
	public int headquartersLevel;
	public int ASV2014_5927;
	public int _guildGold;

	public ASV2014_1081(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.headquartersLevel = data.readByte();
		this.ASV2014_5927 = data.readInt();
		this._guildGold = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.headquartersLevel);
		data.writeInt(this.ASV2014_5927);
		data.writeInt(this._guildGold);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1081(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1081 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1252;
//
//        private var ASV2014_6387:int;
//        private var ASV2014_6365:int;
//        private var _guildGold:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6387 = _arg1.readByte();
//            this.ASV2014_6365 = _arg1.readInt();
//            this._guildGold = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6387);
//            _arg1.writeInt(this.ASV2014_6365);
//            _arg1.writeInt(this._guildGold);
//        }
//
//        public function get headquartersLevel():int
//        {
//            return (this.ASV2014_6387);
//        }
//
//        public function set headquartersLevel(_arg1:int):void
//        {
//            this.ASV2014_6387 = _arg1;
//        }
//
//        public function get ASV2014_5927():int
//        {
//            return (this.ASV2014_6365);
//        }
//
//        public function set ASV2014_5927(_arg1:int):void
//        {
//            this.ASV2014_6365 = _arg1;
//        }
//
//        public function get guildGold():int
//        {
//            return (this._guildGold);
//        }
//
//        public function set guildGold(_arg1:int):void
//        {
//            this._guildGold = _arg1;
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
// ASV2014_1081 = "\"\"l" (String#12071)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5927 = "]!4" (String#5695)
// ASV2014_6365 = "'!o" (String#4366)
// ASV2014_6387 = "&7" (String#18513)
//