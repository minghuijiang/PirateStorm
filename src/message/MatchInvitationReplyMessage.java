package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class MatchInvitationReplyMessage extends Message{

	public static final int id = 1353;
	public int _type;
	public boolean _accept;

	public MatchInvitationReplyMessage(User user) {
		super(user);
		_accept=true;
	}
	
	public MatchInvitationReplyMessage(User user, int type) {
		this(user);
		_type=type;
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._accept = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeBoolean(this._accept);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new MatchInvitationReplyMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_798 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1353;
//
//        private var _type:int;
//        private var _accept:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this._accept = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeBoolean(this._accept);
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
//        public function get accept():Boolean
//        {
//            return (this._accept);
//        }
//
//        public function set accept(_arg1:Boolean):void
//        {
//            this._accept = _arg1;
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
// ASV2014_798 = "4!#" (String#12871)
//