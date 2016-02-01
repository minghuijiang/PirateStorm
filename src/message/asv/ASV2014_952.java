package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_952 extends Message{

	public static final int id = 1151;
	public int ASV2014_3482;
	public int mapId;
	public int coordX;
	public int coordY;

	public ASV2014_952(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3482 = data.readInt();
		this.mapId = data.readShort();
		this.coordX = data.readShort();
		this.coordY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_3482);
		data.writeShort(this.mapId);
		data.writeShort(this.coordX);
		data.writeShort(this.coordY);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_952(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_952 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1151;
//
//        private var ASV2014_6271:int;
//        private var ASV2014_2515:int;
//        private var ASV2014_6303:int;
//        private var ASV2014_6304:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6271 = _arg1.readInt();
//            this.ASV2014_2515 = _arg1.readShort();
//            this.ASV2014_6303 = _arg1.readShort();
//            this.ASV2014_6304 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6271);
//            _arg1.writeShort(this.ASV2014_2515);
//            _arg1.writeShort(this.ASV2014_6303);
//            _arg1.writeShort(this.ASV2014_6304);
//        }
//
//        public function get ASV2014_3482():int
//        {
//            return (this.ASV2014_6271);
//        }
//
//        public function set ASV2014_3482(_arg1:int):void
//        {
//            this.ASV2014_6271 = _arg1;
//        }
//
//        public function get mapId():int
//        {
//            return (this.ASV2014_2515);
//        }
//
//        public function set mapId(_arg1:int):void
//        {
//            this.ASV2014_2515 = _arg1;
//        }
//
//        public function get coordX():int
//        {
//            return (this.ASV2014_6303);
//        }
//
//        public function set coordX(_arg1:int):void
//        {
//            this.ASV2014_6303 = _arg1;
//        }
//
//        public function get coordY():int
//        {
//            return (this.ASV2014_6304);
//        }
//
//        public function set coordY(_arg1:int):void
//        {
//            this.ASV2014_6304 = _arg1;
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
// ASV2014_2515 = ",!8" (String#2039)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3482 = "4#\"" (String#1396)
// ASV2014_6271 = "+\"J" (String#771)
// ASV2014_6303 = "5!g" (String#18170)
// ASV2014_6304 = "'q" (String#17075)
// ASV2014_952 = "2y" (String#8106)
//