package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1477 extends Message{

	public static final int id = 1539;
	public int destinationMapId;
	public int _costs;

	public ASV2014_1477(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.destinationMapId = data.readByte();
		this._costs = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.destinationMapId);
		data.writeByte(this._costs);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1477(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1477 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1539;
//
//        private var ASV2014_5464:int;
//        private var _costs:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5464 = _arg1.readByte();
//            this._costs = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5464);
//            _arg1.writeByte(this._costs);
//        }
//
//        public function get destinationMapId():int
//        {
//            return (this.ASV2014_5464);
//        }
//
//        public function set destinationMapId(_arg1:int):void
//        {
//            this.ASV2014_5464 = _arg1;
//        }
//
//        public function get costs():int
//        {
//            return (this._costs);
//        }
//
//        public function set costs(_arg1:int):void
//        {
//            this._costs = _arg1;
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
// ASV2014_1477 = "?\"8" (String#11489)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5464 = "4A" (String#6811)
//