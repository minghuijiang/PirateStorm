package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_707 extends Message{

	public static final int id = 0x0404;
	public int objectId;
	public int _graphicId;
	public int objectType;
	public int posX;
	public int posY;

	public ASV2014_707(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readShort();
		this._graphicId = data.readShort();
		this.objectType = data.readByte();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.objectId);
		data.writeShort(this._graphicId);
		data.writeByte(this.objectType);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_707(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_707 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0x0404;
//
//        private var ASV2014_2991:int;
//        private var _graphicId:int;
//        private var ASV2014_5471:int;
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readShort();
//            this._graphicId = _arg1.readShort();
//            this.ASV2014_5471 = _arg1.readByte();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_2991);
//            _arg1.writeShort(this._graphicId);
//            _arg1.writeByte(this.ASV2014_5471);
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get graphicId():int
//        {
//            return (this._graphicId);
//        }
//
//        public function set graphicId(_arg1:int):void
//        {
//            this._graphicId = _arg1;
//        }
//
//        public function get objectType():int
//        {
//            return (this.ASV2014_5471);
//        }
//
//        public function set objectType(_arg1:int):void
//        {
//            this.ASV2014_5471 = _arg1;
//        }
//
//        public function get posX():int
//        {
//            return (this.ASV2014_4037);
//        }
//
//        public function set posX(_arg1:int):void
//        {
//            this.ASV2014_4037 = _arg1;
//        }
//
//        public function get posY():int
//        {
//            return (this.ASV2014_4038);
//        }
//
//        public function set posY(_arg1:int):void
//        {
//            this.ASV2014_4038 = _arg1;
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
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
// ASV2014_5471 = "?H" (String#6869)
// ASV2014_707 = "6#n" (String#8376)
//