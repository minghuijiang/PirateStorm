package message;

import com.mingJiang.as.ByteArray;

import component.Loot;
import component.User;

public class LootInfo extends Message{

	public static final int id = 1065;
	public int objectId;
	public int ASV2014_2635;
	public int posX;
	public int posY;

	public LootInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_2635 = data.readByte();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeByte(this.ASV2014_2635);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		if(!user.getLoots().containsKey(this.objectId)){
		//	user.log("New Loot: "+objectId+" ("+posX+","+posY+") type: "+ASV2014_2635);
			user.getLoots().put(objectId, new Loot(this));
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new LootInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_786 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1065;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_3010:int;
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
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
//            this.ASV2014_3010 = _arg1.readByte();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeByte(this.ASV2014_3010);
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
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
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
//        }
//
//        public function get posX():int
//        {
//            return (this.ASV2014_4037);
//        }
//
//        public function set posX(_arg1:int):void
//        {
//            this.ASV2014_4037 = _arg1;
//        }
//
//        public function get posY():int
//        {
//            return (this.ASV2014_4038);
//        }
//
//        public function set posY(_arg1:int):void
//        {
//            this.ASV2014_4038 = _arg1;
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
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
// ASV2014_786 = "<\"m" (String#8235)
//