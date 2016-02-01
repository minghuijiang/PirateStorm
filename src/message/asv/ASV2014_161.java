package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_161 extends Message{

	public static final int id = 1398;
	public int _userId;
	public String userName;
	public int _avatarId;
	public int overallWonMatches;
	public int kickCurrencyValue;
	public int kickCurrencyType;
	public int _teamJoinDelay;

	public ASV2014_161(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.userName = data.readUTF();
		this._avatarId = data.readByte();
		this.overallWonMatches = data.readInt();
		this.kickCurrencyValue = data.readInt();
		this.kickCurrencyType = data.readByte();
		this._teamJoinDelay = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this.userName);
		data.writeByte(this._avatarId);
		data.writeInt(this.overallWonMatches);
		data.writeInt(this.kickCurrencyValue);
		data.writeByte(this.kickCurrencyType);
		data.writeInt(this._teamJoinDelay);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_161(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_161 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1398;
//
//        private var _userId:int;
//        private var ASV2014_2903:String;
//        private var _avatarId:int;
//        private var ASV2014_3855:int;
//        private var ASV2014_3862:int;
//        private var ASV2014_3863:int;
//        private var _teamJoinDelay:int;
//
//        public function ASV2014_161()
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
//            this._userId = _arg1.readInt();
//            this.ASV2014_2903 = _arg1.readUTF();
//            this._avatarId = _arg1.readByte();
//            this.ASV2014_3855 = _arg1.readInt();
//            this.ASV2014_3862 = _arg1.readInt();
//            this.ASV2014_3863 = _arg1.readByte();
//            this._teamJoinDelay = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_2903);
//            _arg1.writeByte(this._avatarId);
//            _arg1.writeInt(this.ASV2014_3855);
//            _arg1.writeInt(this.ASV2014_3862);
//            _arg1.writeByte(this.ASV2014_3863);
//            _arg1.writeInt(this._teamJoinDelay);
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
//        public function get avatarId():int
//        {
//            return (this._avatarId);
//        }
//
//        public function set avatarId(_arg1:int):void
//        {
//            this._avatarId = _arg1;
//        }
//
//        public function get overallWonMatches():int
//        {
//            return (this.ASV2014_3855);
//        }
//
//        public function set overallWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3855 = _arg1;
//        }
//
//        public function get kickCurrencyValue():int
//        {
//            return (this.ASV2014_3862);
//        }
//
//        public function set kickCurrencyValue(_arg1:int):void
//        {
//            this.ASV2014_3862 = _arg1;
//        }
//
//        public function get kickCurrencyType():int
//        {
//            return (this.ASV2014_3863);
//        }
//
//        public function set kickCurrencyType(_arg1:int):void
//        {
//            this.ASV2014_3863 = _arg1;
//        }
//
//        public function get teamJoinDelay():int
//        {
//            return (this._teamJoinDelay);
//        }
//
//        public function set teamJoinDelay(_arg1:int):void
//        {
//            this._teamJoinDelay = _arg1;
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
// ASV2014_161 = "]\"V" (String#7775)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2903 = "6Z" (String#1373)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3855 = "!8" (String#4551)
// ASV2014_3862 = "?\"A" (String#11413)
// ASV2014_3863 = "##D" (String#11449)
//