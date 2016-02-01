package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_717 extends Message{

	public static final int id = 1314;
	public int _position;
	public String guildName;
	public String _guildTag;
	public int _raidPoints;

	public ASV2014_717(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._position = data.readInt();
		this.guildName = data.readUTF();
		this._guildTag = data.readUTF();
		this._raidPoints = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._position);
		data.writeUTF(this.guildName);
		data.writeUTF(this._guildTag);
		data.writeInt(this._raidPoints);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_717(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_717 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1314;
//
//        private var _position:int;
//        private var ASV2014_4309:String;
//        private var _guildTag:String;
//        private var _raidPoints:int;
//
//        public function ASV2014_717()
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
//            this._position = _arg1.readInt();
//            this.ASV2014_4309 = _arg1.readUTF();
//            this._guildTag = _arg1.readUTF();
//            this._raidPoints = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._position);
//            _arg1.writeUTF(this.ASV2014_4309);
//            _arg1.writeUTF(this._guildTag);
//            _arg1.writeInt(this._raidPoints);
//        }
//
//        public function get position():int
//        {
//            return (this._position);
//        }
//
//        public function set position(_arg1:int):void
//        {
//            this._position = _arg1;
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
// ASV2014_4309 = "1d" (String#2658)
// ASV2014_717 = ",\"T" (String#8722)
//