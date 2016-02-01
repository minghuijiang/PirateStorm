package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class ProfessionInfo extends Message{

	public static final int id = 1595;
	public int currentProfessionLevel;
	public int ASV2014_4339;
	public int maxProfessionXp;
	public int currentProfessionXp;
	public int ASV2014_4340;

	public ProfessionInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.currentProfessionLevel = data.readByte();
		this.ASV2014_4339 = data.readByte();
		this.maxProfessionXp = data.readInt();
		this.currentProfessionXp = data.readInt();
		this.ASV2014_4340 = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.currentProfessionLevel);
		data.writeByte(this.ASV2014_4339);
		data.writeInt(this.maxProfessionXp);
		data.writeInt(this.currentProfessionXp);
		data.writeByte(this.ASV2014_4340);
	}

	public void action(){
		user.xp= currentProfessionXp;
		user.log("Profession XP: "+user.xp);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ProfessionInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_576 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1595;
//
//        private var ASV2014_5604:int;
//        private var ASV2014_5609:int;
//        private var ASV2014_5605:int;
//        private var ASV2014_5606:int;
//        private var ASV2014_5607:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5604 = _arg1.readByte();
//            this.ASV2014_5609 = _arg1.readByte();
//            this.ASV2014_5605 = _arg1.readInt();
//            this.ASV2014_5606 = _arg1.readInt();
//            this.ASV2014_5607 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5604);
//            _arg1.writeByte(this.ASV2014_5609);
//            _arg1.writeInt(this.ASV2014_5605);
//            _arg1.writeInt(this.ASV2014_5606);
//            _arg1.writeByte(this.ASV2014_5607);
//        }
//
//        public function get currentProfessionLevel():int
//        {
//            return (this.ASV2014_5604);
//        }
//
//        public function set currentProfessionLevel(_arg1:int):void
//        {
//            this.ASV2014_5604 = _arg1;
//        }
//
//        public function get ASV2014_4339():int
//        {
//            return (this.ASV2014_5609);
//        }
//
//        public function set ASV2014_4339(_arg1:int):void
//        {
//            this.ASV2014_5609 = _arg1;
//        }
//
//        public function get maxProfessionXp():int
//        {
//            return (this.ASV2014_5605);
//        }
//
//        public function set maxProfessionXp(_arg1:int):void
//        {
//            this.ASV2014_5605 = _arg1;
//        }
//
//        public function get currentProfessionXp():int
//        {
//            return (this.ASV2014_5606);
//        }
//
//        public function set currentProfessionXp(_arg1:int):void
//        {
//            this.ASV2014_5606 = _arg1;
//        }
//
//        public function get ASV2014_4340():int
//        {
//            return (this.ASV2014_5607);
//        }
//
//        public function set ASV2014_4340(_arg1:int):void
//        {
//            this.ASV2014_5607 = _arg1;
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
// ASV2014_4339 = "9\"i" (String#3988)
// ASV2014_4340 = "'!F" (String#12208)
// ASV2014_5604 = "^!m" (String#10140)
// ASV2014_5605 = "%#`" (String#11486)
// ASV2014_5606 = "8#t" (String#10758)
// ASV2014_5607 = "#!_" (String#11343)
// ASV2014_5609 = "+#5" (String#2370)
// ASV2014_576 = "7#]" (String#10949)
//