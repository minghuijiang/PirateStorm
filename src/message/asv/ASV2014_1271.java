package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1271 extends Message{

	public static final int id = 1344;
	public int _userId;
	public int posX;
	public int posY;

	public ASV2014_1271(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1271(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1271 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1344;
//
//        private var _userId:int;
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
//            this._userId = _arg1.readInt();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
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
// ASV2014_1271 = "9\"," (String#11807)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
//