package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1416 extends Message{

	public static final int id = 1095;
	public int inviterId;
	public String inviterName;

	public ASV2014_1416(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.inviterId = data.readInt();
		this.inviterName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.inviterId);
		data.writeUTF(this.inviterName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1416(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1416 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1095;
//
//        private var ASV2014_6057:int;
//        private var ASV2014_6565:String;
//
//        public function ASV2014_1416()
//        {
//            this.inviterName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6057 = _arg1.readInt();
//            this.ASV2014_6565 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6057);
//            _arg1.writeUTF(this.ASV2014_6565);
//        }
//
//        public function get inviterId():int
//        {
//            return (this.ASV2014_6057);
//        }
//
//        public function set inviterId(_arg1:int):void
//        {
//            this.ASV2014_6057 = _arg1;
//        }
//
//        public function get inviterName():String
//        {
//            return (this.ASV2014_6565);
//        }
//
//        public function set inviterName(_arg1:String):void
//        {
//            this.ASV2014_6565 = _arg1;
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
// ASV2014_1416 = "%d" (String#11878)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6057 = "0\"e" (String#6062)
// ASV2014_6565 = "]#D" (String#16211)
//