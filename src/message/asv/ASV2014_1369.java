package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1369 extends Message{

	public static final int id = 1468;
	public int ASV2014_4460;
	public int ASV2014_6326;
	public int currentBenefitAmount;
	public int nextBenefitAmount;
	public int ASV2014_6327;
	public int upgradeCosts;

	public ASV2014_1369(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4460 = data.readByte();
		this.ASV2014_6326 = data.readByte();
		this.currentBenefitAmount = data.readShort();
		this.nextBenefitAmount = data.readShort();
		this.ASV2014_6327 = data.readByte();
		this.upgradeCosts = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4460);
		data.writeByte(this.ASV2014_6326);
		data.writeShort(this.currentBenefitAmount);
		data.writeShort(this.nextBenefitAmount);
		data.writeByte(this.ASV2014_6327);
		data.writeShort(this.upgradeCosts);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1369(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1369 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1468;
//
//        private var ASV2014_5698:int;
//        private var ASV2014_6542:int;
//        private var ASV2014_6543:int;
//        private var ASV2014_6544:int;
//        private var ASV2014_6545:int;
//        private var ASV2014_6546:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5698 = _arg1.readByte();
//            this.ASV2014_6542 = _arg1.readByte();
//            this.ASV2014_6543 = _arg1.readShort();
//            this.ASV2014_6544 = _arg1.readShort();
//            this.ASV2014_6545 = _arg1.readByte();
//            this.ASV2014_6546 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5698);
//            _arg1.writeByte(this.ASV2014_6542);
//            _arg1.writeShort(this.ASV2014_6543);
//            _arg1.writeShort(this.ASV2014_6544);
//            _arg1.writeByte(this.ASV2014_6545);
//            _arg1.writeShort(this.ASV2014_6546);
//        }
//
//        public function get ASV2014_4460():int
//        {
//            return (this.ASV2014_5698);
//        }
//
//        public function set ASV2014_4460(_arg1:int):void
//        {
//            this.ASV2014_5698 = _arg1;
//        }
//
//        public function get ASV2014_6326():int
//        {
//            return (this.ASV2014_6542);
//        }
//
//        public function set ASV2014_6326(_arg1:int):void
//        {
//            this.ASV2014_6542 = _arg1;
//        }
//
//        public function get currentBenefitAmount():int
//        {
//            return (this.ASV2014_6543);
//        }
//
//        public function set currentBenefitAmount(_arg1:int):void
//        {
//            this.ASV2014_6543 = _arg1;
//        }
//
//        public function get nextBenefitAmount():int
//        {
//            return (this.ASV2014_6544);
//        }
//
//        public function set nextBenefitAmount(_arg1:int):void
//        {
//            this.ASV2014_6544 = _arg1;
//        }
//
//        public function get ASV2014_6327():int
//        {
//            return (this.ASV2014_6545);
//        }
//
//        public function set ASV2014_6327(_arg1:int):void
//        {
//            this.ASV2014_6545 = _arg1;
//        }
//
//        public function get upgradeCosts():int
//        {
//            return (this.ASV2014_6546);
//        }
//
//        public function set upgradeCosts(_arg1:int):void
//        {
//            this.ASV2014_6546 = _arg1;
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
// ASV2014_1369 = "?\"y" (String#7958)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4460 = "^\"J" (String#2497)
// ASV2014_5698 = "8!-" (String#2108)
// ASV2014_6326 = "[\"Y" (String#19413)
// ASV2014_6327 = "9! " (String#19613)
// ASV2014_6542 = "@\"m" (String#15801)
// ASV2014_6543 = "\"#E" (String#16795)
// ASV2014_6544 = "!\"_" (String#17762)
// ASV2014_6545 = "%\"v" (String#17490)
// ASV2014_6546 = "0=" (String#15986)
//