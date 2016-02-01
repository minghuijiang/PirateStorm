package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildIslandEnterOtherRequestMessage extends Message{

	public static final int id = 1265;
	public int guildId;
	public boolean _attack;

	public GuildIslandEnterOtherRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this._attack = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeBoolean(this._attack);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildIslandEnterOtherRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_863 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1265;
//
//        private var ASV2014_2901:int;
//        private var _attack:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2901 = _arg1.readInt();
//            this._attack = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeBoolean(this._attack);
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
//        public function get attack():Boolean
//        {
//            return (this._attack);
//        }
//
//        public function set attack(_arg1:Boolean):void
//        {
//            this._attack = _arg1;
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
// ASV2014_2901 = " 6" (String#828)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_863 = " \"2" (String#10839)
//