package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerGuildIslandEnemyEnterAlliedMessage extends Message{

	public static final int id = 1335;
	public String _attackerGuildTag;
	public String _defenderGuildTag;

	public SystemInnerGuildIslandEnemyEnterAlliedMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._attackerGuildTag = data.readUTF();
		this._defenderGuildTag = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._attackerGuildTag);
		data.writeUTF(this._defenderGuildTag);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerGuildIslandEnemyEnterAlliedMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerGuildIslandEnemyEnterAlliedMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1335;
//
//        private var _attackerGuildTag:String;
//        private var _defenderGuildTag:String;
//
//        public function SystemInnerGuildIslandEnemyEnterAlliedMessage()
//        {
//            this.attackerGuildTag = "";
//            this.defenderGuildTag = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._attackerGuildTag = _arg1.readUTF();
//            this._defenderGuildTag = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._attackerGuildTag);
//            _arg1.writeUTF(this._defenderGuildTag);
//        }
//
//        public function get attackerGuildTag():String
//        {
//            return (this._attackerGuildTag);
//        }
//
//        public function set attackerGuildTag(_arg1:String):void
//        {
//            this._attackerGuildTag = _arg1;
//        }
//
//        public function get defenderGuildTag():String
//        {
//            return (this._defenderGuildTag);
//        }
//
//        public function set defenderGuildTag(_arg1:String):void
//        {
//            this._defenderGuildTag = _arg1;
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