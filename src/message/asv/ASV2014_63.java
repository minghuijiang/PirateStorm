package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_63 extends Message{

	public static final int id = 1369;
	public int ASV2014_2860;
	public MessageList _lostItems;

	public ASV2014_63(User user) {
		super(user);
		_lostItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2860 = data.readInt();
		this._lostItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_2860);
		this._lostItems.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_63(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_63 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1369;
//
//        private var ASV2014_2866:int;
//        private var _lostItems:ASV2014_194;
//
//        public function ASV2014_63()
//        {
//            this._lostItems = new ASV2014_194();
//            super();
//            this.lostItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2866 = _arg1.readInt();
//            this._lostItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2866);
//            this._lostItems.ASV2014_2336(_arg1);
//        }
//
//        public function get ASV2014_2860():int
//        {
//            return (this.ASV2014_2866);
//        }
//
//        public function set ASV2014_2860(_arg1:int):void
//        {
//            this.ASV2014_2866 = _arg1;
//        }
//
//        public function get lostItems():ASV2014_194
//        {
//            return (this._lostItems);
//        }
//
//        public function set lostItems(_arg1:ASV2014_194):void
//        {
//            this._lostItems = _arg1;
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
// ASV2014_2860 = "^\"k" (String#14023)
// ASV2014_2866 = "!#Q" (String#17843)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_63 = ",^" (String#4327)
//