package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_187 extends Message{

	public static final int id = 1166;
	public int bonusMapId;
	public int ASV2014_2824;
	public int _costs;

	public ASV2014_187(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.bonusMapId = data.readByte();
		this.ASV2014_2824 = data.readByte();
		this._costs = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.bonusMapId);
		data.writeByte(this.ASV2014_2824);
		data.writeInt(this._costs);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_187(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_187 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1166;
//
//        private var ASV2014_3906:int;
//        private var ASV2014_3909:int;
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
//            this.ASV2014_3906 = _arg1.readByte();
//            this.ASV2014_3909 = _arg1.readByte();
//            this._costs = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3906);
//            _arg1.writeByte(this.ASV2014_3909);
//            _arg1.writeInt(this._costs);
//        }
//
//        public function get bonusMapId():int
//        {
//            return (this.ASV2014_3906);
//        }
//
//        public function set bonusMapId(_arg1:int):void
//        {
//            this.ASV2014_3906 = _arg1;
//        }
//
//        public function get ASV2014_2824():int
//        {
//            return (this.ASV2014_3909);
//        }
//
//        public function set ASV2014_2824(_arg1:int):void
//        {
//            this.ASV2014_3909 = _arg1;
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
// ASV2014_187 = "^\"V" (String#9064)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2824 = "%_" (String#25163)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3906 = "5\"\"" (String#1970)
// ASV2014_3909 = ">\"N" (String#18444)
//