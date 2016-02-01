package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_677 extends Message{

	public static final int id = 1194;
	public int minLevel;
	public int _price;
	public int ASV2014_4594;
	public int maxNameLength;
	public int ASV2014_4595;
	public int maxTagLength;

	public ASV2014_677(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.minLevel = data.readByte();
		this._price = data.readInt();
		this.ASV2014_4594 = data.readByte();
		this.maxNameLength = data.readByte();
		this.ASV2014_4595 = data.readByte();
		this.maxTagLength = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.minLevel);
		data.writeInt(this._price);
		data.writeByte(this.ASV2014_4594);
		data.writeByte(this.maxNameLength);
		data.writeByte(this.ASV2014_4595);
		data.writeByte(this.maxTagLength);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_677(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_677 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1194;
//
//        private var ASV2014_4439:int;
//        private var _price:int;
//        private var ASV2014_5777:int;
//        private var ASV2014_5778:int;
//        private var ASV2014_5779:int;
//        private var ASV2014_5780:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4439 = _arg1.readByte();
//            this._price = _arg1.readInt();
//            this.ASV2014_5777 = _arg1.readByte();
//            this.ASV2014_5778 = _arg1.readByte();
//            this.ASV2014_5779 = _arg1.readByte();
//            this.ASV2014_5780 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4439);
//            _arg1.writeInt(this._price);
//            _arg1.writeByte(this.ASV2014_5777);
//            _arg1.writeByte(this.ASV2014_5778);
//            _arg1.writeByte(this.ASV2014_5779);
//            _arg1.writeByte(this.ASV2014_5780);
//        }
//
//        public function get minLevel():int
//        {
//            return (this.ASV2014_4439);
//        }
//
//        public function set minLevel(_arg1:int):void
//        {
//            this.ASV2014_4439 = _arg1;
//        }
//
//        public function get price():int
//        {
//            return (this._price);
//        }
//
//        public function set price(_arg1:int):void
//        {
//            this._price = _arg1;
//        }
//
//        public function get ASV2014_4594():int
//        {
//            return (this.ASV2014_5777);
//        }
//
//        public function set ASV2014_4594(_arg1:int):void
//        {
//            this.ASV2014_5777 = _arg1;
//        }
//
//        public function get maxNameLength():int
//        {
//            return (this.ASV2014_5778);
//        }
//
//        public function set maxNameLength(_arg1:int):void
//        {
//            this.ASV2014_5778 = _arg1;
//        }
//
//        public function get ASV2014_4595():int
//        {
//            return (this.ASV2014_5779);
//        }
//
//        public function set ASV2014_4595(_arg1:int):void
//        {
//            this.ASV2014_5779 = _arg1;
//        }
//
//        public function get maxTagLength():int
//        {
//            return (this.ASV2014_5780);
//        }
//
//        public function set maxTagLength(_arg1:int):void
//        {
//            this.ASV2014_5780 = _arg1;
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
// ASV2014_4439 = "9\"E" (String#3945)
// ASV2014_4594 = "+#@" (String#24263)
// ASV2014_4595 = "%!," (String#25901)
// ASV2014_5777 = "0\"w" (String#18414)
// ASV2014_5778 = "1#c" (String#18536)
// ASV2014_5779 = "3P" (String#16982)
// ASV2014_5780 = "]\"M" (String#16194)
// ASV2014_677 = "6H" (String#8347)
//