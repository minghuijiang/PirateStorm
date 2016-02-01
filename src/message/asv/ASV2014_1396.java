package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1396 extends Message{

	public static final int id = 1060;
	public MessageList cannonBalls;
	public MessageList harpoons;
	public MessageList _oneShotItems;

	public ASV2014_1396(User user) {
		super(user);
		_oneShotItems = new MessageList(user);
		harpoons = new MessageList(user);
		cannonBalls = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.cannonBalls.deserialize(data);
		this.harpoons.deserialize(data);
		this._oneShotItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		this.cannonBalls.serialize(data);
		this.harpoons.serialize(data);
		this._oneShotItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1396(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1396 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1060;
//
//        private var ASV2014_6557:ASV2014_194;
//        private var ASV2014_4518:ASV2014_194;
//        private var _oneShotItems:ASV2014_194;
//
//        public function ASV2014_1396()
//        {
//            this.ASV2014_6557 = new ASV2014_194();
//            this.ASV2014_4518 = new ASV2014_194();
//            this._oneShotItems = new ASV2014_194();
//            super();
//            this.cannonBalls = new ASV2014_194();
//            this.harpoons = new ASV2014_194();
//            this.oneShotItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6557.deserialize(_arg1);
//            this.ASV2014_4518.deserialize(_arg1);
//            this._oneShotItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this.ASV2014_6557.ASV2014_2336(_arg1);
//            this.ASV2014_4518.ASV2014_2336(_arg1);
//            this._oneShotItems.ASV2014_2336(_arg1);
//        }
//
//        public function get cannonBalls():ASV2014_194
//        {
//            return (this.ASV2014_6557);
//        }
//
//        public function set cannonBalls(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6557 = _arg1;
//        }
//
//        public function get harpoons():ASV2014_194
//        {
//            return (this.ASV2014_4518);
//        }
//
//        public function set harpoons(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_4518 = _arg1;
//        }
//
//        public function get oneShotItems():ASV2014_194
//        {
//            return (this._oneShotItems);
//        }
//
//        public function set oneShotItems(_arg1:ASV2014_194):void
//        {
//            this._oneShotItems = _arg1;
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
// ASV2014_1396 = "2#-" (String#6538)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4518 = "'\"," (String#7583)
// ASV2014_6557 = "9\"D" (String#15387)
//