package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1242 extends Message{

	public static final int id = 1334;
	public String guildTagAttacker;
	public String guildTagVictim;

	public ASV2014_1242(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildTagAttacker = data.readUTF();
		this.guildTagVictim = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.guildTagAttacker);
		data.writeUTF(this.guildTagVictim);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1242(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1242 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1334;
//
//        private var ASV2014_6465:String;
//        private var ASV2014_6466:String;
//
//        public function ASV2014_1242()
//        {
//            this.guildTagAttacker = "";
//            this.guildTagVictim = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6465 = _arg1.readUTF();
//            this.ASV2014_6466 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_6465);
//            _arg1.writeUTF(this.ASV2014_6466);
//        }
//
//        public function get guildTagAttacker():String
//        {
//            return (this.ASV2014_6465);
//        }
//
//        public function set guildTagAttacker(_arg1:String):void
//        {
//            this.ASV2014_6465 = _arg1;
//        }
//
//        public function get guildTagVictim():String
//        {
//            return (this.ASV2014_6466);
//        }
//
//        public function set guildTagVictim(_arg1:String):void
//        {
//            this.ASV2014_6466 = _arg1;
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
// ASV2014_1242 = "6\"V" (String#12123)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6465 = "9#C" (String#17956)
// ASV2014_6466 = "%#1" (String#17936)
//