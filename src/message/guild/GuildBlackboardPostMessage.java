package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildBlackboardPostMessage extends Message{

	public static final int id = 1232;
	public String _headline;
	public String _text;

	public GuildBlackboardPostMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._headline = data.readUTF();
		this._text = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._headline);
		data.writeUTF(this._text);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildBlackboardPostMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_833 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1232;
//
//        private var _headline:String;
//        private var _text:String;
//
//        public function ASV2014_833()
//        {
//            this.headline = "";
//            this.text = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._headline = _arg1.readUTF();
//            this._text = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._headline);
//            _arg1.writeUTF(this._text);
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
// ASV2014_833 = "3\"F" (String#10732)
//