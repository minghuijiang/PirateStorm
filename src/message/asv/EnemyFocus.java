package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class EnemyFocus extends Message{

	public static final int id = 1012;
	public int objectId;
	public int ASV2014_3031;

	public EnemyFocus(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_3031 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeByte(this.ASV2014_3031);
	}

	public void action(){
		user.log("Change state: "+objectId+"  "+ASV2014_3031);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new EnemyFocus(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1144 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1012;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_3003:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_3003 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeByte(this.ASV2014_3003);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get ASV2014_3031():int
//        {
//            return (this.ASV2014_3003);
//        }
//
//        public function set ASV2014_3031(_arg1:int):void
//        {
//            this.ASV2014_3003 = _arg1;
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
// ASV2014_1144 = "!#l" (String#12359)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3003 = "#[" (String#4703)
// ASV2014_3031 = "5I" (String#7035)
//