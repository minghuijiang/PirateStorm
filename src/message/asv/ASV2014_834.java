package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_834 extends Message{

	public static final int id = 1212;
	public int _userId;
	public String memberName;
	public int role;
	public boolean _isOnline;
	public int ASV2014_5179;
	public int ASV2014_5125;
	public int guildMemberXp;

	public ASV2014_834(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.memberName = data.readUTF();
		this.role = data.readByte();
		this._isOnline = data.readBoolean();
		this.ASV2014_5179 = data.readInt();
		this.ASV2014_5125 = data.readInt();
		this.guildMemberXp = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeUTF(this.memberName);
		data.writeByte(this.role);
		data.writeBoolean(this._isOnline);
		data.writeInt(this.ASV2014_5179);
		data.writeInt(this.ASV2014_5125);
		data.writeInt(this.guildMemberXp);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_834(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_834 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1212;
//
//        private var _userId:int;
//        private var ASV2014_6178:String;
//        private var ASV2014_6179:int;
//        private var _isOnline:Boolean;
//        private var ASV2014_6180:int;
//        private var ASV2014_5711:int;
//        private var ASV2014_6181:int;
//
//        public function ASV2014_834()
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
//            this._isOnline = _arg1.readBoolean();
//            this.ASV2014_6180 = _arg1.readInt();
//            this.ASV2014_5711 = _arg1.readInt();
//            this.ASV2014_6181 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeUTF(this.ASV2014_6178);
//            _arg1.writeByte(this.ASV2014_6179);
//            _arg1.writeBoolean(this._isOnline);
//            _arg1.writeInt(this.ASV2014_6180);
//            _arg1.writeInt(this.ASV2014_5711);
//            _arg1.writeInt(this.ASV2014_6181);
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
//        public function get ASV2014_5179():int
//        {
//            return (this.ASV2014_6180);
//        }
//
//        public function set ASV2014_5179(_arg1:int):void
//        {
//            this.ASV2014_6180 = _arg1;
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
//        public function get guildMemberXp():int
//        {
//            return (this.ASV2014_6181);
//        }
//
//        public function set guildMemberXp(_arg1:int):void
//        {
//            this.ASV2014_6181 = _arg1;
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
// ASV2014_5179 = "7# " (String#24978)
// ASV2014_5711 = "`#<" (String#8316)
// ASV2014_6178 = "5!T" (String#9133)
// ASV2014_6179 = "0\"u" (String#4425)
// ASV2014_6180 = "=+" (String#15754)
// ASV2014_6181 = "=#S" (String#18501)
// ASV2014_834 = "5#@" (String#13451)
//