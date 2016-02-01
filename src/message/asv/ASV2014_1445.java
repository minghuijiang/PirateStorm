package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1445 extends Message{

	public static final int id = 1535;
	public int mapId;
	public int ASV2014_3496;

	public ASV2014_1445(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.mapId = data.readByte();
		this.ASV2014_3496 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.mapId);
		data.writeByte(this.ASV2014_3496);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1445(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1445 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1535;
//
//        private var ASV2014_2515:int;
//        private var ASV2014_4855:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2515 = _arg1.readByte();
//            this.ASV2014_4855 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2515);
//            _arg1.writeByte(this.ASV2014_4855);
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
//        public function get ASV2014_3496():int
//        {
//            return (this.ASV2014_4855);
//        }
//
//        public function set ASV2014_3496(_arg1:int):void
//        {
//            this.ASV2014_4855 = _arg1;
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
// ASV2014_1445 = "4c" (String#9634)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2515 = ",!8" (String#2039)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3496 = "\"!O" (String#6464)
// ASV2014_4855 = "[#O" (String#10438)
//