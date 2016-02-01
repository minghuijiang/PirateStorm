package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1355 extends Message{

	public static final int id = 1300;
	public MessageList _result;
	public int ASV2014_5927;
	public int ASV2014_4879;
	public int ASV2014_5926;
	public boolean ASV2014_5924;
	public boolean _parleyLocked;

	public ASV2014_1355(User user) {
		super(user);
		_result = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._result.deserialize(data);
		this.ASV2014_5927 = data.readInt();
		this.ASV2014_4879 = data.readInt();
		this.ASV2014_5926 = data.readInt();
		this.ASV2014_5924 = data.readBoolean();
		this._parleyLocked = data.readBoolean();
	}

	public void serialize(ByteArray data){
		this._result.serialize(data);
		data.writeInt(this.ASV2014_5927);
		data.writeInt(this.ASV2014_4879);
		data.writeInt(this.ASV2014_5926);
		data.writeBoolean(this.ASV2014_5924);
		data.writeBoolean(this._parleyLocked);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1355(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1355 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1300;
//
//        private var _result:ASV2014_194;
//        private var ASV2014_6365:int;
//        private var ASV2014_5920:int;
//        private var ASV2014_6525:int;
//        private var ASV2014_6526:Boolean;
//        private var _parleyLocked:Boolean;
//
//        public function ASV2014_1355()
//        {
//            this._result = new ASV2014_194();
//            super();
//            this.result = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._result.deserialize(_arg1);
//            this.ASV2014_6365 = _arg1.readInt();
//            this.ASV2014_5920 = _arg1.readInt();
//            this.ASV2014_6525 = _arg1.readInt();
//            this.ASV2014_6526 = _arg1.readBoolean();
//            this._parleyLocked = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            this._result.ASV2014_2336(_arg1);
//            _arg1.writeInt(this.ASV2014_6365);
//            _arg1.writeInt(this.ASV2014_5920);
//            _arg1.writeInt(this.ASV2014_6525);
//            _arg1.writeBoolean(this.ASV2014_6526);
//            _arg1.writeBoolean(this._parleyLocked);
//        }
//
//        public function get result():ASV2014_194
//        {
//            return (this._result);
//        }
//
//        public function set result(_arg1:ASV2014_194):void
//        {
//            this._result = _arg1;
//        }
//
//        public function get ASV2014_5927():int
//        {
//            return (this.ASV2014_6365);
//        }
//
//        public function set ASV2014_5927(_arg1:int):void
//        {
//            this.ASV2014_6365 = _arg1;
//        }
//
//        public function get ASV2014_4879():int
//        {
//            return (this.ASV2014_5920);
//        }
//
//        public function set ASV2014_4879(_arg1:int):void
//        {
//            this.ASV2014_5920 = _arg1;
//        }
//
//        public function get ASV2014_5926():int
//        {
//            return (this.ASV2014_6525);
//        }
//
//        public function set ASV2014_5926(_arg1:int):void
//        {
//            this.ASV2014_6525 = _arg1;
//        }
//
//        public function get ASV2014_5924():Boolean
//        {
//            return (this.ASV2014_6526);
//        }
//
//        public function set ASV2014_5924(_arg1:Boolean):void
//        {
//            this.ASV2014_6526 = _arg1;
//        }
//
//        public function get parleyLocked():Boolean
//        {
//            return (this._parleyLocked);
//        }
//
//        public function set parleyLocked(_arg1:Boolean):void
//        {
//            this._parleyLocked = _arg1;
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
// ASV2014_1355 = "9!s" (String#9579)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4879 = "]!9" (String#11419)
// ASV2014_5920 = "5!J" (String#5206)
// ASV2014_5924 = "+\"5" (String#13970)
// ASV2014_5926 = "!!_" (String#27383)
// ASV2014_5927 = "]!4" (String#5695)
// ASV2014_6365 = "'!o" (String#4366)
// ASV2014_6525 = "%E" (String#18367)
// ASV2014_6526 = "]#+" (String#8469)
//