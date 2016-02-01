package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_864 extends Message{

	public static final int id = 1234;
	public int ASV2014_2861;
	public String _headline;
	public String _text;
	public int _date;
	public String userName;

	public ASV2014_864(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2861 = data.readInt();
		this._headline = data.readUTF();
		this._text = data.readUTF();
		this._date = data.readInt();
		this.userName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_2861);
		data.writeUTF(this._headline);
		data.writeUTF(this._text);
		data.writeInt(this._date);
		data.writeUTF(this.userName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_864(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_864 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1234;
//
//        private var ASV2014_3957:int;
//        private var _headline:String;
//        private var _text:String;
//        private var _date:int;
//        private var ASV2014_2903:String;
//
//        public function ASV2014_864()
//        {
//            this.headline = "";
//            this.text = "";
//            this.userName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3957 = _arg1.readInt();
//            this._headline = _arg1.readUTF();
//            this._text = _arg1.readUTF();
//            this._date = _arg1.readInt();
//            this.ASV2014_2903 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3957);
//            _arg1.writeUTF(this._headline);
//            _arg1.writeUTF(this._text);
//            _arg1.writeInt(this._date);
//            _arg1.writeUTF(this.ASV2014_2903);
//        }
//
//        public function get ASV2014_2861():int
//        {
//            return (this.ASV2014_3957);
//        }
//
//        public function set ASV2014_2861(_arg1:int):void
//        {
//            this.ASV2014_3957 = _arg1;
//        }
//
//        public function get headline():String
//        {
//            return (this._headline);
//        }
//
//        public function set headline(_arg1:String):void
//        {
//            this._headline = _arg1;
//        }
//
//        public function get text():String
//        {
//            return (this._text);
//        }
//
//        public function set text(_arg1:String):void
//        {
//            this._text = _arg1;
//        }
//
//        public function get date():int
//        {
//            return (this._date);
//        }
//
//        public function set date(_arg1:int):void
//        {
//            this._date = _arg1;
//        }
//
//        public function get userName():String
//        {
//            return (this.ASV2014_2903);
//        }
//
//        public function set userName(_arg1:String):void
//        {
//            this.ASV2014_2903 = _arg1;
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
// ASV2014_2861 = "7#T" (String#4044)
// ASV2014_2903 = "6Z" (String#1373)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3957 = "=!c" (String#2277)
// ASV2014_864 = "3\"K" (String#10851)
//