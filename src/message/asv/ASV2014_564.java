package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_564 extends Message{

	public static final int id = 1140;
	public int ASV2014_4735;
	public int ASV2014_4734;

	public ASV2014_564(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4735 = data.readByte();
		this.ASV2014_4734 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4735);
		data.writeByte(this.ASV2014_4734);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_564(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_564 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1140;
//
//        private var ASV2014_5575:int;
//        private var ASV2014_5576:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5575 = _arg1.readByte();
//            this.ASV2014_5576 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5575);
//            _arg1.writeByte(this.ASV2014_5576);
//        }
//
//        public function get ASV2014_4735():int
//        {
//            return (this.ASV2014_5575);
//        }
//
//        public function set ASV2014_4735(_arg1:int):void
//        {
//            this.ASV2014_5575 = _arg1;
//        }
//
//        public function get ASV2014_4734():int
//        {
//            return (this.ASV2014_5576);
//        }
//
//        public function set ASV2014_4734(_arg1:int):void
//        {
//            this.ASV2014_5576 = _arg1;
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
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4734 = "!\"u" (String#14227)
// ASV2014_4735 = "0z" (String#17792)
// ASV2014_5575 = "@!a" (String#9513)
// ASV2014_5576 = "5!I" (String#10070)
// ASV2014_564 = "6#&" (String#10265)
//