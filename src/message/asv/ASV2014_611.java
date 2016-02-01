package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_611 extends Message{

	public static final int id = 1456;
	public int ASV2014_3867;
	public int currentCurrencyValue;
	public int ASV2014_4445;
	public String ASV2014_5241;
	public int _timeLeft;

	public ASV2014_611(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3867 = data.readInt();
		this.currentCurrencyValue = data.readInt();
		this.ASV2014_4445 = data.readInt();
		this.ASV2014_5241 = data.readUTF();
		this._timeLeft = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3867);
		data.writeInt(this.currentCurrencyValue);
		data.writeInt(this.ASV2014_4445);
		data.writeUTF(this.ASV2014_5241);
		data.writeInt(this._timeLeft);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_611(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_611 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1456;
//
//        private var ASV2014_5330:int;
//        private var ASV2014_5693:int;
//        private var ASV2014_5238:int;
//        private var ASV2014_5239:String;
//        private var _timeLeft:int;
//
//        public function ASV2014_611()
//        {
//            this.ASV2014_5241 = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5330 = _arg1.readInt();
//            this.ASV2014_5693 = _arg1.readInt();
//            this.ASV2014_5238 = _arg1.readInt();
//            this.ASV2014_5239 = _arg1.readUTF();
//            this._timeLeft = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5330);
//            _arg1.writeInt(this.ASV2014_5693);
//            _arg1.writeInt(this.ASV2014_5238);
//            _arg1.writeUTF(this.ASV2014_5239);
//            _arg1.writeInt(this._timeLeft);
//        }
//
//        public function get ASV2014_3867():int
//        {
//            return (this.ASV2014_5330);
//        }
//
//        public function set ASV2014_3867(_arg1:int):void
//        {
//            this.ASV2014_5330 = _arg1;
//        }
//
//        public function get currentCurrencyValue():int
//        {
//            return (this.ASV2014_5693);
//        }
//
//        public function set currentCurrencyValue(_arg1:int):void
//        {
//            this.ASV2014_5693 = _arg1;
//        }
//
//        public function get ASV2014_4445():int
//        {
//            return (this.ASV2014_5238);
//        }
//
//        public function set ASV2014_4445(_arg1:int):void
//        {
//            this.ASV2014_5238 = _arg1;
//        }
//
//        public function get ASV2014_5241():String
//        {
//            return (this.ASV2014_5239);
//        }
//
//        public function set ASV2014_5241(_arg1:String):void
//        {
//            this.ASV2014_5239 = _arg1;
//        }
//
//        public function get timeLeft():int
//        {
//            return (this._timeLeft);
//        }
//
//        public function set timeLeft(_arg1:int):void
//        {
//            this._timeLeft = _arg1;
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
// ASV2014_3867 = "@d" (String#2610)
// ASV2014_4445 = ";\"a" (String#6843)
// ASV2014_5238 = "<\"?" (String#4304)
// ASV2014_5239 = "=S" (String#4188)
// ASV2014_5241 = " G" (String#6137)
// ASV2014_5330 = "![" (String#1992)
// ASV2014_5693 = ";!_" (String#5691)
// ASV2014_611 = ";!n" (String#7098)
//