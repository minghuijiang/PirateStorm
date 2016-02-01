package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_144 extends Message{

	public static final int id = 1414;
	public int groupType;
	public int _arenaPoints;
	public MessageList _rewards;

	public ASV2014_144(User user) {
		super(user);
		_rewards = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.groupType = data.readInt();
		this._arenaPoints = data.readInt();
		this._rewards.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.groupType);
		data.writeInt(this._arenaPoints);
		this._rewards.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_144(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_144 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1414;
//
//        private var ASV2014_3836:int;
//        private var _arenaPoints:int;
//        private var _rewards:ASV2014_194;
//
//        public function ASV2014_144()
//        {
//            this._rewards = new ASV2014_194();
//            super();
//            this.rewards = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3836 = _arg1.readInt();
//            this._arenaPoints = _arg1.readInt();
//            this._rewards.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3836);
//            _arg1.writeInt(this._arenaPoints);
//            this._rewards.ASV2014_2336(_arg1);
//        }
//
//        public function get groupType():int
//        {
//            return (this.ASV2014_3836);
//        }
//
//        public function set groupType(_arg1:int):void
//        {
//            this.ASV2014_3836 = _arg1;
//        }
//
//        public function get arenaPoints():int
//        {
//            return (this._arenaPoints);
//        }
//
//        public function set arenaPoints(_arg1:int):void
//        {
//            this._arenaPoints = _arg1;
//        }
//
//        public function get rewards():ASV2014_194
//        {
//            return (this._rewards);
//        }
//
//        public function set rewards(_arg1:ASV2014_194):void
//        {
//            this._rewards = _arg1;
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
// ASV2014_144 = "`!C" (String#8142)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3836 = "8#H" (String#16768)
//