package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_854 extends Message{

	public static final int id = 1262;
	public int guildId;
	public String guildName;
	public String _guildTag;
	public int _raidPoints;
	public int guildIslandState;
	public int _stateSecondsLeft;
	public boolean _isWhitelisted;

	public ASV2014_854(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this.guildName = data.readUTF();
		this._guildTag = data.readUTF();
		this._raidPoints = data.readInt();
		this.guildIslandState = data.readByte();
		this._stateSecondsLeft = data.readInt();
		this._isWhitelisted = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeUTF(this.guildName);
		data.writeUTF(this._guildTag);
		data.writeInt(this._raidPoints);
		data.writeByte(this.guildIslandState);
		data.writeInt(this._stateSecondsLeft);
		data.writeBoolean(this._isWhitelisted);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_854(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_854 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1262;
//
//        private var ASV2014_2901:int;
//        private var ASV2014_4309:String;
//        private var _guildTag:String;
//        private var _raidPoints:int;
//        private var ASV2014_6185:int;
//        private var _stateSecondsLeft:int;
//        private var _isWhitelisted:Boolean;
//
//        public function ASV2014_854()
//        {
//            this.guildName = "";
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
//            this.ASV2014_2901 = _arg1.readInt();
//            this.ASV2014_4309 = _arg1.readUTF();
//            this._guildTag = _arg1.readUTF();
//            this._raidPoints = _arg1.readInt();
//            this.ASV2014_6185 = _arg1.readByte();
//            this._stateSecondsLeft = _arg1.readInt();
//            this._isWhitelisted = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeUTF(this.ASV2014_4309);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeInt(this._raidPoints);
//            _arg1.writeByte(this.ASV2014_6185);
//            _arg1.writeInt(this._stateSecondsLeft);
//            _arg1.writeBoolean(this._isWhitelisted);
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
//        public function get guildIslandState():int
//        {
//            return (this.ASV2014_6185);
//        }
//
//        public function set guildIslandState(_arg1:int):void
//        {
//            this.ASV2014_6185 = _arg1;
//        }
//
//        public function get stateSecondsLeft():int
//        {
//            return (this._stateSecondsLeft);
//        }
//
//        public function set stateSecondsLeft(_arg1:int):void
//        {
//            this._stateSecondsLeft = _arg1;
//        }
//
//        public function get isWhitelisted():Boolean
//        {
//            return (this._isWhitelisted);
//        }
//
//        public function set isWhitelisted(_arg1:Boolean):void
//        {
//            this._isWhitelisted = _arg1;
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
// ASV2014_6185 = "\"\"P" (String#9103)
// ASV2014_854 = "=\"a" (String#13301)
//