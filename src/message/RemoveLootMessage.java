package message;

import com.mingJiang.as.ByteArray;

import component.Loot;
import component.User;

public class RemoveLootMessage extends Message{

	public static final int id = 1066;
	public int objectId;

	public RemoveLootMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
	}

	public void action(){
	//Loot l = ;
//		if(user.targetLoot==objectId){
//			user.lootNum++;
//		}
	//		user.setMsg("remove loot: "+objectId);
		user.getLoots().remove(objectId);
		
		
			
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new RemoveLootMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_784 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1066;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_784 = "6!Y" (String#8765)
//