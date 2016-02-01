package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_843 extends Message{

	public static final int id = 1290;
	public int guildId;
	public String guildName;
	public String _guildTag;
	public String guildLeaderName;
	public int _raidPoints;
	public boolean _pendingApplication;

	public ASV2014_843(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this.guildName = data.readUTF();
		this._guildTag = data.readUTF();
		this.guildLeaderName = data.readUTF();
		this._raidPoints = data.readInt();
		this._pendingApplication = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeUTF(this.guildName);
		data.writeUTF(this._guildTag);
		data.writeUTF(this.guildLeaderName);
		data.writeInt(this._raidPoints);
		data.writeBoolean(this._pendingApplication);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_843(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_843 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1290;
//
//        private var ASV2014_2901:int;
//        private var ASV2014_4309:String;
//        private var _guildTag:String;
//        private var ASV2014_4610:String;
//        private var _raidPoints:int;
//        private var _pendingApplication:Boolean;
//
//        public function ASV2014_843()
//        {
//            this.guildName = "";
//            this.guildTag = "";
//            this.guildLeaderName = "";
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
//            this.ASV2014_4610 = _arg1.readUTF();
//            this._raidPoints = _arg1.readInt();
//            this._pendingApplication = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeUTF(this.ASV2014_4309);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeUTF(this.ASV2014_4610);
//            _arg1.writeInt(this._raidPoints);
//            _arg1.writeBoolean(this._pendingApplication);
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
//        public function get guildLeaderName():String
//        {
//            return (this.ASV2014_4610);
//        }
//
//        public function set guildLeaderName(_arg1:String):void
//        {
//            this.ASV2014_4610 = _arg1;
//        }
//
//        public function get raidPoints():int
//        {
//            return (this._raidPoints);
//        }
//
//        public function set raidPoints(_arg1:int):void
//        {
//            this._raidPoints = _arg1;
//        }
//
//        public function get pendingApplication():Boolean
//        {
//            return (this._pendingApplication);
//        }
//
//        public function set pendingApplication(_arg1:Boolean):void
//        {
//            this._pendingApplication = _arg1;
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
// ASV2014_4309 = "1d" (String#2658)
// ASV2014_4610 = "^!3" (String#7929)
// ASV2014_843 = ">#+" (String#11589)
//