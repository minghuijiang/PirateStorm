package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1311 extends Message{

	public static final int id = 1244;
	public int guildLevel;
	public String guildName;

	public ASV2014_1311(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildLevel = data.readByte();
		this.guildName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.guildLevel);
		data.writeUTF(this.guildName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1311(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1311 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1244;
//
//        private var ASV2014_5953:int;
//        private var ASV2014_4309:String;
//
//        public function ASV2014_1311()
//        {
//            this.guildName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5953 = _arg1.readByte();
//            this.ASV2014_4309 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5953);
//            _arg1.writeUTF(this.ASV2014_4309);
//        }
//
//        public function get guildLevel():int
//        {
//            return (this.ASV2014_5953);
//        }
//
//        public function set guildLevel(_arg1:int):void
//        {
//            this.ASV2014_5953 = _arg1;
//        }
//
//        public function get guildName():String
//        {
//            return (this.ASV2014_4309);
//        }
//
//        public function set guildName(_arg1:String):void
//        {
//            this.ASV2014_4309 = _arg1;
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
// ASV2014_1311 = "&!-" (String#11513)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4309 = "1d" (String#2658)
// ASV2014_5953 = "'#]" (String#4408)
//