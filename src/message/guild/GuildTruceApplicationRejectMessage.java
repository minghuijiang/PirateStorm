package message.guild;

import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class GuildTruceApplicationRejectMessage extends Message{

	public static final int id = 1282;
	public int sourceGuildId;

	public GuildTruceApplicationRejectMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.sourceGuildId = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.sourceGuildId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new GuildTruceApplicationRejectMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_848 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1282;
//
//        private var ASV2014_6182:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6182 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6182);
//        }
//
//        public function get sourceGuildId():int
//        {
//            return (this.ASV2014_6182);
//        }
//
//        public function set sourceGuildId(_arg1:int):void
//        {
//            this.ASV2014_6182 = _arg1;
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
// ASV2014_6182 = "1#U" (String#4540)
// ASV2014_848 = "0#?" (String#10587)
//