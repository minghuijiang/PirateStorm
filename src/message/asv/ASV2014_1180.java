package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1180 extends Message{

	public static final int id = 1311;
	public int ASV2014_5998;
	public int ASV2014_5999;
	public int ASV2014_5996;
	public int ASV2014_5997;

	public ASV2014_1180(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_5998 = data.readByte();
		this.ASV2014_5999 = data.readShort();
		this.ASV2014_5996 = data.readByte();
		this.ASV2014_5997 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_5998);
		data.writeShort(this.ASV2014_5999);
		data.writeByte(this.ASV2014_5996);
		data.writeShort(this.ASV2014_5997);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1180(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1180 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1311;
//
//        private var ASV2014_6447:int;
//        private var ASV2014_6448:int;
//        private var ASV2014_6449:int;
//        private var ASV2014_6450:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6447 = _arg1.readByte();
//            this.ASV2014_6448 = _arg1.readShort();
//            this.ASV2014_6449 = _arg1.readByte();
//            this.ASV2014_6450 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_6447);
//            _arg1.writeShort(this.ASV2014_6448);
//            _arg1.writeByte(this.ASV2014_6449);
//            _arg1.writeShort(this.ASV2014_6450);
//        }
//
//        public function get ASV2014_5998():int
//        {
//            return (this.ASV2014_6447);
//        }
//
//        public function set ASV2014_5998(_arg1:int):void
//        {
//            this.ASV2014_6447 = _arg1;
//        }
//
//        public function get ASV2014_5999():int
//        {
//            return (this.ASV2014_6448);
//        }
//
//        public function set ASV2014_5999(_arg1:int):void
//        {
//            this.ASV2014_6448 = _arg1;
//        }
//
//        public function get ASV2014_5996():int
//        {
//            return (this.ASV2014_6449);
//        }
//
//        public function set ASV2014_5996(_arg1:int):void
//        {
//            this.ASV2014_6449 = _arg1;
//        }
//
//        public function get ASV2014_5997():int
//        {
//            return (this.ASV2014_6450);
//        }
//
//        public function set ASV2014_5997(_arg1:int):void
//        {
//            this.ASV2014_6450 = _arg1;
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
// ASV2014_1180 = "?!t" (String#8350)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_5996 = "6R" (String#26647)
// ASV2014_5997 = "<!$" (String#24223)
// ASV2014_5998 = "+\"u" (String#24316)
// ASV2014_5999 = "'#f" (String#24949)
// ASV2014_6447 = "'!w" (String#17175)
// ASV2014_6448 = ",#S" (String#18004)
// ASV2014_6449 = "^#$" (String#16313)
// ASV2014_6450 = ">!a" (String#18445)
//