package message.guild;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildSearchRequestMessage extends Message{

	public static final int id = 1198;
	public int _category;
	public String _name;
	public MessageList types;
	public int ASV2014_2747;

	public GuildSearchRequestMessage(User user) {
		super(user);
		types = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._category = data.readByte();
		this._name = data.readUTF();
		this.types.deserialize(data);
		this.ASV2014_2747 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._category);
		data.writeUTF(this._name);
		this.types.serialize(data);
		data.writeShort(this.ASV2014_2747);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildSearchRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_850 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1198;
//
//        private var _category:int;
//        private var _name:String;
//        private var ASV2014_5792:ASV2014_194;
//        private var ASV2014_3845:int;
//
//        public function ASV2014_850()
//        {
//            this.ASV2014_5792 = new ASV2014_194();
//            super();
//            this.name = "";
//            this.types = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._category = _arg1.readByte();
//            this._name = _arg1.readUTF();
//            this.ASV2014_5792.deserialize(_arg1);
//            this.ASV2014_3845 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._category);
//            _arg1.writeUTF(this._name);
//            this.ASV2014_5792.ASV2014_2336(_arg1);
//            _arg1.writeShort(this.ASV2014_3845);
//        }
//
//        public function get category():int
//        {
//            return (this._category);
//        }
//
//        public function set category(_arg1:int):void
//        {
//            this._category = _arg1;
//        }
//
//        public function get name():String
//        {
//            return (this._name);
//        }
//
//        public function set name(_arg1:String):void
//        {
//            this._name = _arg1;
//        }
//
//        public function get types():ASV2014_194
//        {
//            return (this.ASV2014_5792);
//        }
//
//        public function set types(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5792 = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2747 = "=x" (String#2620)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3845 = "@\"O" (String#1779)
// ASV2014_5792 = "8t" (String#4844)
// ASV2014_850 = ";\">" (String#11524)
//