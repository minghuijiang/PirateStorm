package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1248 extends Message{

	public static final int id = 1134;
	public int _userId;
	public int ASV2014_2635;
	public int _hp;
	public int maxHp;

	public ASV2014_1248(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this.ASV2014_2635 = data.readByte();
		this._hp = data.readInt();
		this.maxHp = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeByte(this.ASV2014_2635);
		data.writeInt(this._hp);
		data.writeInt(this.maxHp);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1248(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1248 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1134;
//
//        private var _userId:int;
//        private var ASV2014_3010:int;
//        private var _hp:int;
//        private var ASV2014_6320:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this.ASV2014_3010 = _arg1.readByte();
//            this._hp = _arg1.readInt();
//            this.ASV2014_6320 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeByte(this.ASV2014_3010);
//            _arg1.writeInt(this._hp);
//            _arg1.writeInt(this.ASV2014_6320);
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
//        }
//
//        public function get ASV2014_2635():int
//        {
//            return (this.ASV2014_3010);
//        }
//
//        public function set ASV2014_2635(_arg1:int):void
//        {
//            this.ASV2014_3010 = _arg1;
//        }
//
//        public function get hp():int
//        {
//            return (this._hp);
//        }
//
//        public function set hp(_arg1:int):void
//        {
//            this._hp = _arg1;
//        }
//
//        public function get maxHp():int
//        {
//            return (this.ASV2014_6320);
//        }
//
//        public function set maxHp(_arg1:int):void
//        {
//            this.ASV2014_6320 = _arg1;
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
// ASV2014_1248 = "=!g" (String#13584)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2635 = "4H" (String#1418)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3010 = "\"!h" (String#1585)
// ASV2014_6320 = ">!M" (String#8821)
//