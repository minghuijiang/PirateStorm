package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SocialBenefitDetailInfoRequestMessage extends Message{

	public static final int id = 1488;
	public int ASV2014_3905;
	public int ASV2014_4489;

	public SocialBenefitDetailInfoRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3905 = data.readByte();
		this.ASV2014_4489 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_3905);
		data.writeByte(this.ASV2014_4489);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SocialBenefitDetailInfoRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_618 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1488;
//
//        private var ASV2014_3904:int;
//        private var ASV2014_5710:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3904 = _arg1.readByte();
//            this.ASV2014_5710 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3904);
//            _arg1.writeByte(this.ASV2014_5710);
//        }
//
//        public function get ASV2014_3905():int
//        {
//            return (this.ASV2014_3904);
//        }
//
//        public function set ASV2014_3905(_arg1:int):void
//        {
//            this.ASV2014_3904 = _arg1;
//        }
//
//        public function get ASV2014_4489():int
//        {
//            return (this.ASV2014_5710);
//        }
//
//        public function set ASV2014_4489(_arg1:int):void
//        {
//            this.ASV2014_5710 = _arg1;
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
// ASV2014_3904 = "^\"\"" (String#3043)
// ASV2014_3905 = "<!4" (String#4894)
// ASV2014_4489 = "<!S" (String#7167)
// ASV2014_5710 = "4\"K" (String#4521)
// ASV2014_618 = "@!B" (String#12676)
//