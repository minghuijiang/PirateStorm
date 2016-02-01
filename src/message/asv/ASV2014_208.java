package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_208 extends Message{

	public static final int id = 1433;
	public int _type;
	public int secondsToStart;
	public boolean _readyForMatch;

	public ASV2014_208(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this.secondsToStart = data.readInt();
		this._readyForMatch = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeInt(this.secondsToStart);
		data.writeBoolean(this._readyForMatch);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_208(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_208 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1433;
//
//        private var _type:int;
//        private var ASV2014_3959:int;
//        private var _readyForMatch:Boolean;
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
//            this.ASV2014_3959 = _arg1.readInt();
//            this._readyForMatch = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeInt(this.ASV2014_3959);
//            _arg1.writeBoolean(this._readyForMatch);
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
//        public function get secondsToStart():int
//        {
//            return (this.ASV2014_3959);
//        }
//
//        public function set secondsToStart(_arg1:int):void
//        {
//            this.ASV2014_3959 = _arg1;
//        }
//
//        public function get readyForMatch():Boolean
//        {
//            return (this._readyForMatch);
//        }
//
//        public function set readyForMatch(_arg1:Boolean):void
//        {
//            this._readyForMatch = _arg1;
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
// ASV2014_208 = ";#1" (String#8701)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3959 = ";!A" (String#15857)
//