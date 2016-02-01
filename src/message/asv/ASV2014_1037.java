package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1037 extends Message{

	public static final int id = 1226;
	public String userName;
	public int guildId;
	public int _status;

	public ASV2014_1037(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.userName = data.readUTF();
		this.guildId = data.readInt();
		this._status = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.userName);
		data.writeInt(this.guildId);
		data.writeByte(this._status);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1037(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1037 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1226;
//
//        private var ASV2014_2903:String;
//        private var ASV2014_2901:int;
//        private var _status:int;
//
//        public function ASV2014_1037()
//        {
//            this.userName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2903 = _arg1.readUTF();
//            this.ASV2014_2901 = _arg1.readInt();
//            this._status = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_2903);
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeByte(this._status);
//        }
//
//        public function get userName():String
//        {
//            return (this.ASV2014_2903);
//        }
//
//        public function set userName(_arg1:String):void
//        {
//            this.ASV2014_2903 = _arg1;
//        }
//
//        public function get guildId():int
//        {
//            return (this.ASV2014_2901);
//        }
//
//        public function set guildId(_arg1:int):void
//        {
//            this.ASV2014_2901 = _arg1;
//        }
//
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
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
// ASV2014_1037 = "\"!_" (String#12155)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2901 = " 6" (String#828)
// ASV2014_2903 = "6Z" (String#1373)
// ASV2014_30 = ";#V" (String#144)
//