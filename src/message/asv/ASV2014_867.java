package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_867 extends Message{

	public static final int id = 1292;
	public int guildId;
	public int _foundDateSec;
	public String founderName;
	public String leaderName;
	public int memberCount;
	public int memberMaxCount;
	public String guildText;

	public ASV2014_867(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this._foundDateSec = data.readInt();
		this.founderName = data.readUTF();
		this.leaderName = data.readUTF();
		this.memberCount = data.readShort();
		this.memberMaxCount = data.readShort();
		this.guildText = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeInt(this._foundDateSec);
		data.writeUTF(this.founderName);
		data.writeUTF(this.leaderName);
		data.writeShort(this.memberCount);
		data.writeShort(this.memberMaxCount);
		data.writeUTF(this.guildText);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_867(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_867 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1292;
//
//        private var ASV2014_2901:int;
//        private var _foundDateSec:int;
//        private var ASV2014_5946:String;
//        private var ASV2014_5947:String;
//        private var ASV2014_5948:int;
//        private var ASV2014_5949:int;
//        private var ASV2014_5791:String;
//
//        public function ASV2014_867()
//        {
//            this.founderName = "";
//            this.leaderName = "";
//            this.guildText = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2901 = _arg1.readInt();
//            this._foundDateSec = _arg1.readInt();
//            this.ASV2014_5946 = _arg1.readUTF();
//            this.ASV2014_5947 = _arg1.readUTF();
//            this.ASV2014_5948 = _arg1.readShort();
//            this.ASV2014_5949 = _arg1.readShort();
//            this.ASV2014_5791 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeInt(this._foundDateSec);
//            _arg1.writeUTF(this.ASV2014_5946);
//            _arg1.writeUTF(this.ASV2014_5947);
//            _arg1.writeShort(this.ASV2014_5948);
//            _arg1.writeShort(this.ASV2014_5949);
//            _arg1.writeUTF(this.ASV2014_5791);
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
//        public function get foundDateSec():int
//        {
//            return (this._foundDateSec);
//        }
//
//        public function set foundDateSec(_arg1:int):void
//        {
//            this._foundDateSec = _arg1;
//        }
//
//        public function get founderName():String
//        {
//            return (this.ASV2014_5946);
//        }
//
//        public function set founderName(_arg1:String):void
//        {
//            this.ASV2014_5946 = _arg1;
//        }
//
//        public function get leaderName():String
//        {
//            return (this.ASV2014_5947);
//        }
//
//        public function set leaderName(_arg1:String):void
//        {
//            this.ASV2014_5947 = _arg1;
//        }
//
//        public function get memberCount():int
//        {
//            return (this.ASV2014_5948);
//        }
//
//        public function set memberCount(_arg1:int):void
//        {
//            this.ASV2014_5948 = _arg1;
//        }
//
//        public function get memberMaxCount():int
//        {
//            return (this.ASV2014_5949);
//        }
//
//        public function set memberMaxCount(_arg1:int):void
//        {
//            this.ASV2014_5949 = _arg1;
//        }
//
//        public function get guildText():String
//        {
//            return (this.ASV2014_5791);
//        }
//
//        public function set guildText(_arg1:String):void
//        {
//            this.ASV2014_5791 = _arg1;
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
// ASV2014_2901 = " 6" (String#828)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5791 = "7#f" (String#4406)
// ASV2014_5946 = "6#Y" (String#8319)
// ASV2014_5947 = "[n" (String#8900)
// ASV2014_5948 = "8Y" (String#4407)
// ASV2014_5949 = "&6" (String#5906)
// ASV2014_867 = "?\"@" (String#8607)
//