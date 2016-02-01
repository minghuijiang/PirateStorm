package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1041 extends Message{

	public static final int id = 1250;
	public int ASV2014_6378;
	public int mapTheme;

	public ASV2014_1041(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_6378 = data.readInt();
		this.mapTheme = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_6378);
		data.writeByte(this.mapTheme);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1041(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1041 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1250;
//
//        private var ASV2014_6376:int;
//        private var ASV2014_6377:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6376 = _arg1.readInt();
//            this.ASV2014_6377 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6376);
//            _arg1.writeByte(this.ASV2014_6377);
//        }
//
//        public function get ASV2014_6378():int
//        {
//            return (this.ASV2014_6376);
//        }
//
//        public function set ASV2014_6378(_arg1:int):void
//        {
//            this.ASV2014_6376 = _arg1;
//        }
//
//        public function get mapTheme():int
//        {
//            return (this.ASV2014_6377);
//        }
//
//        public function set mapTheme(_arg1:int):void
//        {
//            this.ASV2014_6377 = _arg1;
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
// ASV2014_1041 = "1#3" (String#12428)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6376 = ">#]" (String#17965)
// ASV2014_6377 = " \"$" (String#15558)
// ASV2014_6378 = ",l" (String#24144)
//