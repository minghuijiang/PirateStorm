package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_205 extends Message{

	public static final int id = 1372;
	public int ASV2014_2864;
	public int ASV2014_2863;

	public ASV2014_205(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_2864 = data.readByte();
		this.ASV2014_2863 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_2864);
		data.writeInt(this.ASV2014_2863);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_205(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_205 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1372;
//
//        private var ASV2014_3955:int;
//        private var ASV2014_3956:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3955 = _arg1.readByte();
//            this.ASV2014_3956 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3955);
//            _arg1.writeInt(this.ASV2014_3956);
//        }
//
//        public function get ASV2014_2864():int
//        {
//            return (this.ASV2014_3955);
//        }
//
//        public function set ASV2014_2864(_arg1:int):void
//        {
//            this.ASV2014_3955 = _arg1;
//        }
//
//        public function get ASV2014_2863():int
//        {
//            return (this.ASV2014_3956);
//        }
//
//        public function set ASV2014_2863(_arg1:int):void
//        {
//            this.ASV2014_3956 = _arg1;
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
// ASV2014_205 = "-\"V" (String#11122)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2863 = ",#0" (String#20962)
// ASV2014_2864 = "`\"4" (String#21954)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3955 = "?n" (String#17417)
// ASV2014_3956 = "<!h" (String#16985)
//