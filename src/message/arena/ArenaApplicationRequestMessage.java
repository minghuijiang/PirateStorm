package message.arena;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ArenaApplicationRequestMessage extends Message{

	public static final int id = 1421;
	public int _teamId;
	public String _text;

	public ArenaApplicationRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readInt();
		this._text = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._teamId);
		data.writeUTF(this._text);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ArenaApplicationRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_147 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1421;
//
//        private var _teamId:int;
//        private var _text:String;
//
//        public function ASV2014_147()
//        {
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
//            this._teamId = _arg1.readInt();
//            this._text = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this._text);
//        }
//
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
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
// ASV2014_147 = ";#f" (String#12024)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//