package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1368 extends Message{

	public static final int id = 1619;
	public int _availableMovies;
	public int nextPossibleViewInSeconds;
	public boolean ASV2014_4449;

	public ASV2014_1368(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._availableMovies = data.readByte();
		this.nextPossibleViewInSeconds = data.readInt();
		this.ASV2014_4449 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._availableMovies);
		data.writeInt(this.nextPossibleViewInSeconds);
		data.writeBoolean(this.ASV2014_4449);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1368(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1368 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1619;
//
//        private var _availableMovies:int;
//        private var ASV2014_5696:int;
//        private var ASV2014_5697:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._availableMovies = _arg1.readByte();
//            this.ASV2014_5696 = _arg1.readInt();
//            this.ASV2014_5697 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._availableMovies);
//            _arg1.writeInt(this.ASV2014_5696);
//            _arg1.writeBoolean(this.ASV2014_5697);
//        }
//
//        public function get availableMovies():int
//        {
//            return (this._availableMovies);
//        }
//
//        public function set availableMovies(_arg1:int):void
//        {
//            this._availableMovies = _arg1;
//        }
//
//        public function get nextPossibleViewInSeconds():int
//        {
//            return (this.ASV2014_5696);
//        }
//
//        public function set nextPossibleViewInSeconds(_arg1:int):void
//        {
//            this.ASV2014_5696 = _arg1;
//        }
//
//        public function get ASV2014_4449():Boolean
//        {
//            return (this.ASV2014_5697);
//        }
//
//        public function set ASV2014_4449(_arg1:Boolean):void
//        {
//            this.ASV2014_5697 = _arg1;
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
// ASV2014_1368 = "8\"m" (String#12458)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4449 = "4!w" (String#14569)
// ASV2014_5696 = "9#1" (String#10999)
// ASV2014_5697 = "!\"H" (String#11070)
//