package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_67 extends Message{

	public static final int id = 1367;
	public int _teamId;
	public String teamName;

	public ASV2014_67(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readByte();
		this.teamName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._teamId);
		data.writeUTF(this.teamName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_67(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_67 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1367;
//
//        private var _teamId:int;
//        private var ASV2014_2887:String;
//
//        public function ASV2014_67()
//        {
//            this.teamName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._teamId = _arg1.readByte();
//            this.ASV2014_2887 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._teamId);
//            _arg1.writeUTF(this.ASV2014_2887);
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
//        public function get teamName():String
//        {
//            return (this.ASV2014_2887);
//        }
//
//        public function set teamName(_arg1:String):void
//        {
//            this.ASV2014_2887 = _arg1;
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
// ASV2014_2887 = "!#w" (String#4128)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_67 = "`\"B" (String#4974)
//