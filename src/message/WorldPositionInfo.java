package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class WorldPositionInfo extends Message{

	public static final int id = 1004;
	public int ASV2014_2635;
	public int guildId;
	public String _guildTag;
	public int posX;
	public int posY;

	public WorldPositionInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2635 = data.readByte();
		this.guildId = data.readInt();
		this._guildTag = data.readUTF();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_2635);
		data.writeInt(this.guildId);
		data.writeUTF(this._guildTag);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		user.location.setX(posX);
		user.location.setY(posY);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new WorldPositionInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1308 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1004;
//
//        private var ASV2014_3010:int;
//        private var ASV2014_2901:int;
//        private var _guildTag:String;
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
//
//        public function ASV2014_1308()
//        {
//            this.guildTag = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3010 = _arg1.readByte();
//            this.ASV2014_2901 = _arg1.readInt();
//            this._guildTag = _arg1.readUTF();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3010);
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
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
//        public function get guildTag():String
//        {
//            return (this._guildTag);
//        }
//
//        public function set guildTag(_arg1:String):void
//        {
//            this._guildTag = _arg1;
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
// ASV2014_1308 = "^!&" (String#8230)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_2901 = " 6" (String#828)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
//