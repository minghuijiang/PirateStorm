package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1268 extends Message{

	public static final int id = 1382;
	public int _captureMinPoints;
	public int _captureMaxPoints;
	public MessageList ASV2014_6343;
	public MessageList destroyedWalls;
	public int ASV2014_6342;

	public ASV2014_1268(User user) {
		super(user);
		destroyedWalls = new MessageList(user);
		ASV2014_6343 = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this._captureMinPoints = data.readByte();
		this._captureMaxPoints = data.readByte();
		this.ASV2014_6343.deserialize(data);
		this.destroyedWalls.deserialize(data);
		this.ASV2014_6342 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._captureMinPoints);
		data.writeByte(this._captureMaxPoints);
		this.ASV2014_6343.serialize(data);
		this.destroyedWalls.serialize(data);
		data.writeByte(this.ASV2014_6342);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1268(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1268 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1382;
//
//        private var _captureMinPoints:int;
//        private var _captureMaxPoints:int;
//        private var ASV2014_6486:ASV2014_194;
//        private var ASV2014_6487:ASV2014_194;
//        private var ASV2014_6488:int;
//
//        public function ASV2014_1268()
//        {
//            this.ASV2014_6486 = new ASV2014_194();
//            this.ASV2014_6487 = new ASV2014_194();
//            super();
//            this.ASV2014_6343 = new ASV2014_194();
//            this.destroyedWalls = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._captureMinPoints = _arg1.readByte();
//            this._captureMaxPoints = _arg1.readByte();
//            this.ASV2014_6486.deserialize(_arg1);
//            this.ASV2014_6487.deserialize(_arg1);
//            this.ASV2014_6488 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._captureMinPoints);
//            _arg1.writeByte(this._captureMaxPoints);
//            this.ASV2014_6486.ASV2014_2336(_arg1);
//            this.ASV2014_6487.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_6488);
//        }
//
//        public function get captureMinPoints():int
//        {
//            return (this._captureMinPoints);
//        }
//
//        public function set captureMinPoints(_arg1:int):void
//        {
//            this._captureMinPoints = _arg1;
//        }
//
//        public function get captureMaxPoints():int
//        {
//            return (this._captureMaxPoints);
//        }
//
//        public function set captureMaxPoints(_arg1:int):void
//        {
//            this._captureMaxPoints = _arg1;
//        }
//
//        public function get ASV2014_6343():ASV2014_194
//        {
//            return (this.ASV2014_6486);
//        }
//
//        public function set ASV2014_6343(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6486 = _arg1;
//        }
//
//        public function get destroyedWalls():ASV2014_194
//        {
//            return (this.ASV2014_6487);
//        }
//
//        public function set destroyedWalls(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_6487 = _arg1;
//        }
//
//        public function get ASV2014_6342():int
//        {
//            return (this.ASV2014_6488);
//        }
//
//        public function set ASV2014_6342(_arg1:int):void
//        {
//            this.ASV2014_6488 = _arg1;
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
// ASV2014_1268 = " \"!" (String#12738)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6342 = "-\"'" (String#25298)
// ASV2014_6343 = ";&" (String#20579)
// ASV2014_6486 = "5@" (String#13782)
// ASV2014_6487 = ",Z" (String#14261)
// ASV2014_6488 = "8#E" (String#16819)
//