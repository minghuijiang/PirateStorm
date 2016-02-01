package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class MatchUserReadyMessage extends Message{

	public static final int id = 1356;
	public boolean _ready;
	public int _type;

	public MatchUserReadyMessage(User user) {
		super(user);
		_ready= true;
	}
	public MatchUserReadyMessage(User user,int type,boolean ready) {
		this(user);
		_type=type;
		_ready= ready;
	}
	public void deserialize(ByteArray data){
		this._ready = data.readBoolean();
		this._type = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._ready);
		data.writeByte(this._type);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new MatchUserReadyMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_139 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1356;
//
//        private var _ready:Boolean;
//        private var _type:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._ready = _arg1.readBoolean();
//            this._type = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._ready);
//            _arg1.writeByte(this._type);
//        }
//
//        public function get ready():Boolean
//        {
//            return (this._ready);
//        }
//
//        public function set ready(_arg1:Boolean):void
//        {
//            this._ready = _arg1;
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
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
// ASV2014_139 = "6I" (String#10552)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//