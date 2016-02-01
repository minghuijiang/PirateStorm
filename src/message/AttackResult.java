package message;

import message.asv.InitRepairMessage;
import message.asv.ReviveMsg;

import com.mingJiang.as.ByteArray;

import component.Enemy;
import component.User;

public class AttackResult extends Message{

	public static final int id = 0x0400;
	public int sourceId;
	public int targetId;
	public int typeId;
	public int ASV2014_4253;
	public int ASV2014_6329;
	public int _hitpoints;
	public int _flags;

	public AttackResult(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.sourceId = data.readInt();
		this.targetId = data.readInt();
		this.typeId = data.readByte();
		this.ASV2014_4253 = data.readShort();
		this.ASV2014_6329 = data.readByte();
		this._hitpoints = data.readInt();
		this._flags = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.sourceId);
		data.writeInt(this.targetId);
		data.writeByte(this.typeId);
		data.writeShort(this.ASV2014_4253);
		data.writeByte(this.ASV2014_6329);
		data.writeInt(this._hitpoints);
		data.writeByte(this._flags);
	}

	public void action(){
		if(user.userId==this.targetId){
			if(!user.target.contains(sourceId))
				user.target.add(sourceId);
			user.hp=_hitpoints;
			Enemy attacker = user.enemies.get(sourceId);
			user.setMsg("Being Attacked by: "+(attacker==null?sourceId:attacker.getName())+ " remain hp: "+this._hitpoints);
			if(user.hp==0){
				user.killer=sourceId;
				user.setMsg("Sunk by: "+(attacker==null?sourceId:attacker.getName()));
			}
		}else{


			Enemy e =user.enemies.get(targetId);
			if(sourceId==user.userId)
				user.setMsg("Attacked "+(e==null?targetId:e.getName())+" remain hp: "+this._hitpoints);
			if(e!=null){
				e.currentHp=_hitpoints;
				if(e.currentHp==0){
					user.enemies.remove(targetId);
					if(this.sourceId==user.userId){
						user.setMsg("Destory: "+targetId);	
						user.destoryNum++;
					}
				//	user.log("Destory, hp=0: "+targetId);
				}
			}
					
		}
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new AttackResult(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1363 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0x0400;
//
//        private var ASV2014_6538:int;
//        private var ASV2014_6539:int;
//        private var ASV2014_5424:int;
//        private var ASV2014_5512:int;
//        private var ASV2014_6540:int;
//        private var _hitpoints:int;
//        private var _flags:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6538 = _arg1.readInt();
//            this.ASV2014_6539 = _arg1.readInt();
//            this.ASV2014_5424 = _arg1.readByte();
//            this.ASV2014_5512 = _arg1.readShort();
//            this.ASV2014_6540 = _arg1.readByte();
//            this._hitpoints = _arg1.readInt();
//            this._flags = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6538);
//            _arg1.writeInt(this.ASV2014_6539);
//            _arg1.writeByte(this.ASV2014_5424);
//            _arg1.writeShort(this.ASV2014_5512);
//            _arg1.writeByte(this.ASV2014_6540);
//            _arg1.writeInt(this._hitpoints);
//            _arg1.writeByte(this._flags);
//        }
//
//        public function get sourceId():int
//        {
//            return (this.ASV2014_6538);
//        }
//
//        public function set sourceId(_arg1:int):void
//        {
//            this.ASV2014_6538 = _arg1;
//        }
//
//        public function get targetId():int
//        {
//            return (this.ASV2014_6539);
//        }
//
//        public function set targetId(_arg1:int):void
//        {
//            this.ASV2014_6539 = _arg1;
//        }
//
//        public function get typeId():int
//        {
//            return (this.ASV2014_5424);
//        }
//
//        public function set typeId(_arg1:int):void
//        {
//            this.ASV2014_5424 = _arg1;
//        }
//
//        public function get ASV2014_4253():int
//        {
//            return (this.ASV2014_5512);
//        }
//
//        public function set ASV2014_4253(_arg1:int):void
//        {
//            this.ASV2014_5512 = _arg1;
//        }
//
//        public function get ASV2014_6329():int
//        {
//            return (this.ASV2014_6540);
//        }
//
//        public function set ASV2014_6329(_arg1:int):void
//        {
//            this.ASV2014_6540 = _arg1;
//        }
//
//        public function get hitpoints():int
//        {
//            return (this._hitpoints);
//        }
//
//        public function set hitpoints(_arg1:int):void
//        {
//            this._hitpoints = _arg1;
//        }
//
//        public function get flags():int
//        {
//            return (this._flags);
//        }
//
//        public function set flags(_arg1:int):void
//        {
//            this._flags = _arg1;
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
// ASV2014_1363 = "^\"x" (String#8749)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4253 = "+#N" (String#5263)
// ASV2014_5424 = "3h" (String#3435)
// ASV2014_5512 = "8#J" (String#5711)
// ASV2014_6329 = "2#3" (String#24397)
// ASV2014_6538 = "!!z" (String#17758)
// ASV2014_6539 = "'\"S" (String#8391)
// ASV2014_6540 = "\"\"H" (String#16816)
//