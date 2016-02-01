package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class EnemyExitMessage extends Message{

	public static final int id = 1013;
	public int objectId;

	public EnemyExitMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
	}

	public void action(){

		if(user.enemies.remove(objectId)!=null)
			user.log("Enemy exit: "+objectId);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new EnemyExitMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1356 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1013;
//
//        private var ASV2014_2991:int;
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
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
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
//        public function toString():String
//        {
//            return ("");
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1356 = "`#O" (String#7644)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
//