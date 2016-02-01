package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1146 extends Message{

	public static final int id = 1019;
	public int ASV2014_5978;
	public int ASV2014_5979;

	public ASV2014_1146(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_5978 = data.readByte();
		this.ASV2014_5979 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_5978);
		data.writeShort(this.ASV2014_5979);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1146(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1146 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1019;
//
//        private var ASV2014_6437:int;
//        private var ASV2014_3972:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6437 = _arg1.readByte();
//            this.ASV2014_3972 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6437);
//            _arg1.writeShort(this.ASV2014_3972);
//        }
//
//        public function get ASV2014_5978():int
//        {
//            return (this.ASV2014_6437);
//        }
//
//        public function set ASV2014_5978(_arg1:int):void
//        {
//            this.ASV2014_6437 = _arg1;
//        }
//
//        public function get ASV2014_5979():int
//        {
//            return (this.ASV2014_3972);
//        }
//
//        public function set ASV2014_5979(_arg1:int):void
//        {
//            this.ASV2014_3972 = _arg1;
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
// ASV2014_1146 = "'\"&" (String#8517)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3972 = "`!v" (String#8102)
// ASV2014_5978 = ";\"3" (String#17656)
// ASV2014_5979 = "5!s" (String#23029)
// ASV2014_6437 = "&!^" (String#18425)
//