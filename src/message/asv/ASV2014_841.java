package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_841 extends Message{

	public static final int id = 1295;
	public int _userId;
	public String memberName;
	public int role;
	public int _goldEarned;

	public ASV2014_841(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.memberName = data.readUTF();
		this.role = data.readByte();
		this._goldEarned = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this.memberName);
		data.writeByte(this.role);
		data.writeInt(this._goldEarned);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_841(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_841 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1295;
//
//        private var _userId:int;
//        private var ASV2014_6178:String;
//        private var ASV2014_6179:int;
//        private var _goldEarned:int;
//
//        public function ASV2014_841()
//        {
//            this.memberName = "";
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
//            this.ASV2014_6178 = _arg1.readUTF();
//            this.ASV2014_6179 = _arg1.readByte();
//            this._goldEarned = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_6178);
//            _arg1.writeByte(this.ASV2014_6179);
//            _arg1.writeInt(this._goldEarned);
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
//        public function get memberName():String
//        {
//            return (this.ASV2014_6178);
//        }
//
//        public function set memberName(_arg1:String):void
//        {
//            this.ASV2014_6178 = _arg1;
//        }
//
//        public function get role():int
//        {
//            return (this.ASV2014_6179);
//        }
//
//        public function set role(_arg1:int):void
//        {
//            this.ASV2014_6179 = _arg1;
//        }
//
//        public function get goldEarned():int
//        {
//            return (this._goldEarned);
//        }
//
//        public function set goldEarned(_arg1:int):void
//        {
//            this._goldEarned = _arg1;
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
// ASV2014_6178 = "5!T" (String#9133)
// ASV2014_6179 = "0\"u" (String#4425)
// ASV2014_841 = "1\"s" (String#12021)
//