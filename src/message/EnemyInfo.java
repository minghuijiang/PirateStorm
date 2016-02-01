package message;

import com.mingJiang.as.ByteArray;

import component.Enemy;
import component.User;

public class EnemyInfo extends Message{

	public static final int id = 1011;
	public int objectId;
	public int typeId;
	public int ASV2014_2635;
	public int _avatarId;
	public int _currentHitpoints;
	public int _maxHitpoints;
	public String displayName;
	public int _locaId;
	public int _flags;
	public int rank;
	public int ASV2014_3031;
	public String _guildTag;
	public int _level;
	public int posX;
	public int posY;

	public EnemyInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.typeId = data.readShort();
		this.ASV2014_2635 = data.readShort();
		this._avatarId = data.readByte();
		this._currentHitpoints = data.readInt();
		this._maxHitpoints = data.readInt();
		this.displayName = data.readUTF();
		this._locaId = data.readShort();
		this._flags = data.readByte();
		this.rank = data.readByte();
		this.ASV2014_3031 = data.readByte();
		this._guildTag = data.readUTF();
		this._level = data.readShort();
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeShort(this.typeId);
		data.writeShort(this.ASV2014_2635);
		data.writeByte(this._avatarId);
		data.writeInt(this._currentHitpoints);
		data.writeInt(this._maxHitpoints);
		data.writeUTF(this.displayName);
		data.writeShort(this._locaId);
		data.writeByte(this._flags);
		data.writeByte(this.rank);
		data.writeByte(this.ASV2014_3031);
		data.writeUTF(this._guildTag);
		data.writeShort(this._level);
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
	//	user.log("New enemy: "+objectId+" "+displayName+ " ("+posX+","+posY+")");
	//	if(objectId>=1000000000){
		//	if(this._currentHitpoints<500)
			if(typeId!=1)
			{

				if(user.enemies.put(objectId, new Enemy(this))==null){
				//	user.setMsg("New enemy: "+objectId+" "+displayName+ " ("+posX+","+posY+")");

				}
			}
		//	else{
		//		user.log("Monster: hp: "+this._currentHitpoints+" "+objectId+" Not fight");
		//	}
	//	}
	//	else{
		//	user.log("player: "+objectId+" Not fight");
	//	}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new EnemyInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_508 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1011;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_5424:int;
//        private var ASV2014_3010:int;
//        private var _avatarId:int;
//        private var _currentHitpoints:int;
//        private var _maxHitpoints:int;
//        private var ASV2014_2993:String;
//        private var _locaId:int;
//        private var _flags:int;
//        private var ASV2014_3011:int;
//        private var ASV2014_3003:int;
//        private var _guildTag:String;
//        private var _level:int;
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
//
//        public function ASV2014_508()
//        {
//            this.displayName = "";
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
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_5424 = _arg1.readShort();
//            this.ASV2014_3010 = _arg1.readShort();
//            this._avatarId = _arg1.readByte();
//            this._currentHitpoints = _arg1.readInt();
//            this._maxHitpoints = _arg1.readInt();
//            this.ASV2014_2993 = _arg1.readUTF();
//            this._locaId = _arg1.readShort();
//            this._flags = _arg1.readByte();
//            this.ASV2014_3011 = _arg1.readByte();
//            this.ASV2014_3003 = _arg1.readByte();
//            this._guildTag = _arg1.readUTF();
//            this._level = _arg1.readShort();
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeShort(this.ASV2014_5424);
//            _arg1.writeShort(this.ASV2014_3010);
//            _arg1.writeByte(this._avatarId);
//            _arg1.writeInt(this._currentHitpoints);
//            _arg1.writeInt(this._maxHitpoints);
//            _arg1.writeUTF(this.ASV2014_2993);
//            _arg1.writeShort(this._locaId);
//            _arg1.writeByte(this._flags);
//            _arg1.writeByte(this.ASV2014_3011);
//            _arg1.writeByte(this.ASV2014_3003);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeShort(this._level);
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
//        public function get typeId():int
//        {
//            return (this.ASV2014_5424);
//        }
//
//        public function set typeId(_arg1:int):void
//        {
//            this.ASV2014_5424 = _arg1;
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
//        public function get avatarId():int
//        {
//            return (this._avatarId);
//        }
//
//        public function set avatarId(_arg1:int):void
//        {
//            this._avatarId = _arg1;
//        }
//
//        public function get currentHitpoints():int
//        {
//            return (this._currentHitpoints);
//        }
//
//        public function set currentHitpoints(_arg1:int):void
//        {
//            this._currentHitpoints = _arg1;
//        }
//
//        public function get maxHitpoints():int
//        {
//            return (this._maxHitpoints);
//        }
//
//        public function set maxHitpoints(_arg1:int):void
//        {
//            this._maxHitpoints = _arg1;
//        }
//
//        public function get displayName():String
//        {
//            return (this.ASV2014_2993);
//        }
//
//        public function set displayName(_arg1:String):void
//        {
//            this.ASV2014_2993 = _arg1;
//        }
//
//        public function get locaId():int
//        {
//            return (this._locaId);
//        }
//
//        public function set locaId(_arg1:int):void
//        {
//            this._locaId = _arg1;
//        }
//
//        public function get flags():int
//        {
//            return (this._flags);
//        }
//
//        public function set flags(_arg1:int):void
//        {
//            this._flags = _arg1;
//        }
//
//        public function get rank():int
//        {
//            return (this.ASV2014_3011);
//        }
//
//        public function set rank(_arg1:int):void
//        {
//            this.ASV2014_3011 = _arg1;
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
//        public function get level():int
//        {
//            return (this._level);
//        }
//
//        public function set level(_arg1:int):void
//        {
//            this._level = _arg1;
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
// ASV2014_2993 = "%!m" (String#7863)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3003 = "#[" (String#4703)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_3011 = "5#0" (String#1515)
// ASV2014_3031 = "5I" (String#7035)
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
// ASV2014_508 = "]o" (String#6298)
// ASV2014_5424 = "3h" (String#3435)
//