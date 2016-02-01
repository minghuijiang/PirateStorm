package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_189 extends Message{

	public static final int id = 1168;
	public MessageList ASV2014_2822;
	public MessageList _rewards;
	public int _initialPrice;

	public ASV2014_189(User user) {
		super(user);
		_rewards = new MessageList(user);
		ASV2014_2822 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2822.deserialize(data);
		this._rewards.deserialize(data);
		this._initialPrice = data.readInt();
	}

	public void serialize(ByteArray data){
		this.ASV2014_2822.serialize(data);
		this._rewards.serialize(data);
		data.writeInt(this._initialPrice);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_189(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_189 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1168;
//
//        private var ASV2014_3910:ASV2014_194;
//        private var _rewards:ASV2014_194;
//        private var _initialPrice:int;
//
//        public function ASV2014_189()
//        {
//            this.ASV2014_3910 = new ASV2014_194();
//            this._rewards = new ASV2014_194();
//            super();
//            this.ASV2014_2822 = new ASV2014_194();
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
//            this.ASV2014_3910.deserialize(_arg1);
//            this._rewards.deserialize(_arg1);
//            this._initialPrice = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_3910.ASV2014_2336(_arg1);
//            this._rewards.ASV2014_2336(_arg1);
//            _arg1.writeInt(this._initialPrice);
//        }
//
//        public function get ASV2014_2822():ASV2014_194
//        {
//            return (this.ASV2014_3910);
//        }
//
//        public function set ASV2014_2822(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_3910 = _arg1;
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
//        public function get initialPrice():int
//        {
//            return (this._initialPrice);
//        }
//
//        public function set initialPrice(_arg1:int):void
//        {
//            this._initialPrice = _arg1;
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
// ASV2014_189 = "`!_" (String#10004)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2822 = "=\"S" (String#23510)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3910 = "6?" (String#14015)
//