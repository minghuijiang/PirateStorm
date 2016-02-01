package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_622 extends Message{

	public static final int id = 1482;
	public int _userId;
	public String _name;
	public int _relation;
	public boolean _isOnline;
	public int ASV2014_5125;
	public int _level;

	public ASV2014_622(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._name = data.readUTF();
		this._relation = data.readByte();
		this._isOnline = data.readBoolean();
		this.ASV2014_5125 = data.readInt();
		this._level = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this._name);
		data.writeByte(this._relation);
		data.writeBoolean(this._isOnline);
		data.writeInt(this.ASV2014_5125);
		data.writeByte(this._level);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_622(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_622 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1482;
//
//        private var _userId:int;
//        private var _name:String;
//        private var _relation:int;
//        private var _isOnline:Boolean;
//        private var ASV2014_5711:int;
//        private var _level:int;
//
//        public function ASV2014_622()
//        {
//            this.name = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._name = _arg1.readUTF();
//            this._relation = _arg1.readByte();
//            this._isOnline = _arg1.readBoolean();
//            this.ASV2014_5711 = _arg1.readInt();
//            this._level = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this._name);
//            _arg1.writeByte(this._relation);
//            _arg1.writeBoolean(this._isOnline);
//            _arg1.writeInt(this.ASV2014_5711);
//            _arg1.writeByte(this._level);
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
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
//        public function get relation():int
//        {
//            return (this._relation);
//        }
//
//        public function set relation(_arg1:int):void
//        {
//            this._relation = _arg1;
//        }
//
//        public function get isOnline():Boolean
//        {
//            return (this._isOnline);
//        }
//
//        public function set isOnline(_arg1:Boolean):void
//        {
//            this._isOnline = _arg1;
//        }
//
//        public function get ASV2014_5125():int
//        {
//            return (this.ASV2014_5711);
//        }
//
//        public function set ASV2014_5125(_arg1:int):void
//        {
//            this.ASV2014_5711 = _arg1;
//        }
//
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
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
// ASV2014_5125 = ">\"3" (String#15123)
// ASV2014_5711 = "`#<" (String#8316)
// ASV2014_622 = "-\"i" (String#7908)
//