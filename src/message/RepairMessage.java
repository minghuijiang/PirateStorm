package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class RepairMessage extends Message{

	public static final int id = 1135;
	public int _userId;
	public int _hp;
	public boolean displayFloatingNumbers;

	public RepairMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._hp = data.readInt();
		this.displayFloatingNumbers = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeInt(this._hp);
		data.writeBoolean(this.displayFloatingNumbers);
	}

	public void action(){
		if(_userId==user.userId){
			user.hp=_hp;
		//	user.setMsg("Hp change: "+user.hp+ " ammo: "+user.ammo[0]+" weapon: "+user.weapon[0]);
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new RepairMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1050 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1135;
//
//        private var _userId:int;
//        private var _hp:int;
//        private var ASV2014_6382:Boolean;
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
//            this._hp = _arg1.readInt();
//            this.ASV2014_6382 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeInt(this._hp);
//            _arg1.writeBoolean(this.ASV2014_6382);
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
//        public function get displayFloatingNumbers():Boolean
//        {
//            return (this.ASV2014_6382);
//        }
//
//        public function set displayFloatingNumbers(_arg1:Boolean):void
//        {
//            this.ASV2014_6382 = _arg1;
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
// ASV2014_1050 = "-\"U" (String#6576)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6382 = "]\"<" (String#16630)
//