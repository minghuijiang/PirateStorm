package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerGuildIslandEnemyAttackMessage extends Message{

	public static final int id = 1337;
	public String _guildTag;

	public SystemInnerGuildIslandEnemyAttackMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._guildTag = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._guildTag);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerGuildIslandEnemyAttackMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerGuildIslandEnemyAttackMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1337;
//
//        private var _guildTag:String;
//
//        public function SystemInnerGuildIslandEnemyAttackMessage()
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
//            this._guildTag = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._guildTag);
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
// ASV2014_30 = ";#V" (String#144)
//