package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_635 extends Message{

	public static final int id = 1616;
	public int itemType;
	public int defaultId;
	public int _criticalUpgradeChance;

	public ASV2014_635(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.itemType = data.readByte();
		this.defaultId = data.readInt();
		this._criticalUpgradeChance = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.itemType);
		data.writeInt(this.defaultId);
		data.writeInt(this._criticalUpgradeChance);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_635(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_635 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1616;
//
//        private var ASV2014_2516:int;
//        private var ASV2014_4905:int;
//        private var _criticalUpgradeChance:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2516 = _arg1.readByte();
//            this.ASV2014_4905 = _arg1.readInt();
//            this._criticalUpgradeChance = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeInt(this.ASV2014_4905);
//            _arg1.writeInt(this._criticalUpgradeChance);
//        }
//
//        public function get itemType():int
//        {
//            return (this.ASV2014_2516);
//        }
//
//        public function set itemType(_arg1:int):void
//        {
//            this.ASV2014_2516 = _arg1;
//        }
//
//        public function get defaultId():int
//        {
//            return (this.ASV2014_4905);
//        }
//
//        public function set defaultId(_arg1:int):void
//        {
//            this.ASV2014_4905 = _arg1;
//        }
//
//        public function get criticalUpgradeChance():int
//        {
//            return (this._criticalUpgradeChance);
//        }
//
//        public function set criticalUpgradeChance(_arg1:int):void
//        {
//            this._criticalUpgradeChance = _arg1;
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
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4905 = "?\"v" (String#1802)
// ASV2014_635 = "!!9" (String#11157)
//