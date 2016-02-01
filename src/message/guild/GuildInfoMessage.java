package message.guild;

import message.Message;
import message.MessageList;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildInfoMessage extends Message{

	public static final int id = 1200;
	public int guildId;
	public String guildName;
	public String _guildTag;
	public MessageList guildTypes;
	public int guildLevel;

	public GuildInfoMessage(User user) {
		super(user);
		guildTypes = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this.guildName = data.readUTF();
		this._guildTag = data.readUTF();
		this.guildTypes.deserialize(data);
		this.guildLevel = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeUTF(this.guildName);
		data.writeUTF(this._guildTag);
		this.guildTypes.serialize(data);
		data.writeByte(this.guildLevel);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildInfoMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_763 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1200;
//
//        private var ASV2014_2901:int;
//        private var ASV2014_4309:String;
//        private var _guildTag:String;
//        private var ASV2014_5952:ASV2014_194;
//        private var ASV2014_5953:int;
//
//        public function ASV2014_763()
//        {
//            this.ASV2014_5952 = new ASV2014_194();
//            super();
//            this.guildName = "";
//            this.guildTag = "";
//            this.guildTypes = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2901 = _arg1.readInt();
//            this.ASV2014_4309 = _arg1.readUTF();
//            this._guildTag = _arg1.readUTF();
//            this.ASV2014_5952.deserialize(_arg1);
//            this.ASV2014_5953 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeUTF(this.ASV2014_4309);
//            _arg1.writeUTF(this._guildTag);
//            this.ASV2014_5952.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_5953);
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
//        public function get guildName():String
//        {
//            return (this.ASV2014_4309);
//        }
//
//        public function set guildName(_arg1:String):void
//        {
//            this.ASV2014_4309 = _arg1;
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
//        public function get guildTypes():ASV2014_194
//        {
//            return (this.ASV2014_5952);
//        }
//
//        public function set guildTypes(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5952 = _arg1;
//        }
//
//        public function get guildLevel():int
//        {
//            return (this.ASV2014_5953);
//        }
//
//        public function set guildLevel(_arg1:int):void
//        {
//            this.ASV2014_5953 = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2901 = " 6" (String#828)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4309 = "1d" (String#2658)
// ASV2014_5952 = "#\"G" (String#14334)
// ASV2014_5953 = "'#]" (String#4408)
// ASV2014_763 = "@\"y" (String#5954)
//