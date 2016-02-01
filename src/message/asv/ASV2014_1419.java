package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1419 extends Message{

	public static final int id = 1049;
	public MessageList _options;
	public MessageList keyBindings;
	public MessageList _elements;

	public ASV2014_1419(User user) {
		super(user);
		_elements = new MessageList(user);
		keyBindings = new MessageList(user);
		_options = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._options.deserialize(data);
		this.keyBindings.deserialize(data);
		this._elements.deserialize(data);
	}

	public void serialize(ByteArray data){
		this._options.serialize(data);
		this.keyBindings.serialize(data);
		this._elements.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1419(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1419 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1049;
//
//        private var _options:ASV2014_194;
//        private var ASV2014_6566:ASV2014_194;
//        private var _elements:ASV2014_194;
//
//        public function ASV2014_1419()
//        {
//            this._options = new ASV2014_194();
//            this.ASV2014_6566 = new ASV2014_194();
//            this._elements = new ASV2014_194();
//            super();
//            this.options = new ASV2014_194();
//            this.keyBindings = new ASV2014_194();
//            this.elements = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._options.deserialize(_arg1);
//            this.ASV2014_6566.deserialize(_arg1);
//            this._elements.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._options.ASV2014_2336(_arg1);
//            this.ASV2014_6566.ASV2014_2336(_arg1);
//            this._elements.ASV2014_2336(_arg1);
//        }
//
//        public function get options():ASV2014_194
//        {
//            return (this._options);
//        }
//
//        public function set options(_arg1:ASV2014_194):void
//        {
//            this._options = _arg1;
//        }
//
//        public function get keyBindings():ASV2014_194
//        {
//            return (this.ASV2014_6566);
//        }
//
//        public function set keyBindings(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6566 = _arg1;
//        }
//
//        public function get elements():ASV2014_194
//        {
//            return (this._elements);
//        }
//
//        public function set elements(_arg1:ASV2014_194):void
//        {
//            this._elements = _arg1;
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
// ASV2014_1419 = "8u" (String#12657)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6566 = "+!K" (String#13987)
//