package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1062 extends Message{

	public static final int id = 1520;
	public int objectId;
	public int _userInsignias;
	public int _guildInsignias;
	public int userIndicators;

	public ASV2014_1062(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this._userInsignias = data.readInt();
		this._guildInsignias = data.readInt();
		this.userIndicators = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeInt(this._userInsignias);
		data.writeInt(this._guildInsignias);
		data.writeInt(this.userIndicators);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1062(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1062 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1520;
//
//        private var ASV2014_2991:int;
//        private var _userInsignias:int;
//        private var _guildInsignias:int;
//        private var ASV2014_6383:int;
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
//            this._userInsignias = _arg1.readInt();
//            this._guildInsignias = _arg1.readInt();
//            this.ASV2014_6383 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeInt(this._userInsignias);
//            _arg1.writeInt(this._guildInsignias);
//            _arg1.writeInt(this.ASV2014_6383);
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
//        public function get userInsignias():int
//        {
//            return (this._userInsignias);
//        }
//
//        public function set userInsignias(_arg1:int):void
//        {
//            this._userInsignias = _arg1;
//        }
//
//        public function get guildInsignias():int
//        {
//            return (this._guildInsignias);
//        }
//
//        public function set guildInsignias(_arg1:int):void
//        {
//            this._guildInsignias = _arg1;
//        }
//
//        public function get userIndicators():int
//        {
//            return (this.ASV2014_6383);
//        }
//
//        public function set userIndicators(_arg1:int):void
//        {
//            this.ASV2014_6383 = _arg1;
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
// ASV2014_1062 = "8\"f" (String#12169)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6383 = "`\"k" (String#16522)
//