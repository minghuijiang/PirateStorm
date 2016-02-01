package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_60 extends Message{

	public static final int id = 1507;
	public String ASV2014_2839;
	public int ASV2014_2171;
	public int battlegroundType;
	public int battlegroundTokenAmount;
	public MessageList _lostItems;

	public ASV2014_60(User user) {
		super(user);
		_lostItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2839 = data.readUTF();
		this.ASV2014_2171 = data.readByte();
		this.battlegroundType = data.readByte();
		this.battlegroundTokenAmount = data.readByte();
		this._lostItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.ASV2014_2839);
		data.writeByte(this.ASV2014_2171);
		data.writeByte(this.battlegroundType);
		data.writeByte(this.battlegroundTokenAmount);
		this._lostItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_60(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_60 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1507;
//
//        private var ASV2014_2838:String;
//        private var ASV2014_2840:int;
//        private var ASV2014_2841:int;
//        private var ASV2014_2842:int;
//        private var _lostItems:ASV2014_194;
//
//        public function ASV2014_60()
//        {
//            this._lostItems = new ASV2014_194();
//            super();
//            this.ASV2014_2839 = "";
//            this.lostItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2838 = _arg1.readUTF();
//            this.ASV2014_2840 = _arg1.readByte();
//            this.ASV2014_2841 = _arg1.readByte();
//            this.ASV2014_2842 = _arg1.readByte();
//            this._lostItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_2838);
//            _arg1.writeByte(this.ASV2014_2840);
//            _arg1.writeByte(this.ASV2014_2841);
//            _arg1.writeByte(this.ASV2014_2842);
//            this._lostItems.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_2839():String
//        {
//            return (this.ASV2014_2838);
//        }
//
//        public function set ASV2014_2839(_arg1:String):void
//        {
//            this.ASV2014_2838 = _arg1;
//        }
//
//        public function get ASV2014_2171():int
//        {
//            return (this.ASV2014_2840);
//        }
//
//        public function set ASV2014_2171(_arg1:int):void
//        {
//            this.ASV2014_2840 = _arg1;
//        }
//
//        public function get battlegroundType():int
//        {
//            return (this.ASV2014_2841);
//        }
//
//        public function set battlegroundType(_arg1:int):void
//        {
//            this.ASV2014_2841 = _arg1;
//        }
//
//        public function get battlegroundTokenAmount():int
//        {
//            return (this.ASV2014_2842);
//        }
//
//        public function set battlegroundTokenAmount(_arg1:int):void
//        {
//            this.ASV2014_2842 = _arg1;
//        }
//
//        public function get lostItems():ASV2014_194
//        {
//            return (this._lostItems);
//        }
//
//        public function set lostItems(_arg1:ASV2014_194):void
//        {
//            this._lostItems = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2171 = "?\"[" (String#8226)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2838 = "@#j" (String#4415)
// ASV2014_2839 = "<\"V" (String#4585)
// ASV2014_2840 = ";!B" (String#9071)
// ASV2014_2841 = "^\"!" (String#18904)
// ASV2014_2842 = "7#N" (String#15809)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_60 = "'\"u" (String#7692)
//