package message.asv;

import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_287 extends Message{

	public static final int id = 1186;
	public int shipyardSlotCount;
	public int activeShipStockId;
	public MessageList shipyardShips;

	public ASV2014_287(User user) {
		super(user);
		shipyardShips = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.shipyardSlotCount = data.readByte();
		this.activeShipStockId = data.readInt();
		this.shipyardShips.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.shipyardSlotCount);
		data.writeInt(this.activeShipStockId);
		this.shipyardShips.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_287(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_287 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1186;
//
//        private var ASV2014_1968:int;
//        private var ASV2014_4511:int;
//        private var ASV2014_4512:ASV2014_194;
//
//        public function ASV2014_287()
//        {
//            this.ASV2014_4512 = new ASV2014_194();
//            super();
//            this.shipyardShips = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_1968 = _arg1.readByte();
//            this.ASV2014_4511 = _arg1.readInt();
//            this.ASV2014_4512.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_1968);
//            _arg1.writeInt(this.ASV2014_4511);
//            this.ASV2014_4512.ASV2014_2336(_arg1);
//        }
//
//        public function get shipyardSlotCount():int
//        {
//            return (this.ASV2014_1968);
//        }
//
//        public function set shipyardSlotCount(_arg1:int):void
//        {
//            this.ASV2014_1968 = _arg1;
//        }
//
//        public function get activeShipStockId():int
//        {
//            return (this.ASV2014_4511);
//        }
//
//        public function set activeShipStockId(_arg1:int):void
//        {
//            this.ASV2014_4511 = _arg1;
//        }
//
//        public function get shipyardShips():ASV2014_194
//        {
//            return (this.ASV2014_4512);
//        }
//
//        public function set shipyardShips(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_4512 = _arg1;
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
// ASV2014_1968 = "%" (String#3474)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_287 = "2O" (String#9415)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4511 = "\"!$" (String#16920)
// ASV2014_4512 = "1\"R" (String#14474)
//