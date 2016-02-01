package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_201 extends Message{

	public static final int id = 1377;
	public int _statGetFortunaBuff;
	public int statGetFortunaBuffScore;
	public int _statKillNpc;
	public int statKillNpcScore;
	public int _statCollectBoxes;
	public int statCollectBoxesScore;
	public int _statKillFortunaPlayer;
	public int statKillFortunaPlayerScore;
	public int _statDamageTower;
	public int statDamageTowerScore;

	public ASV2014_201(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statGetFortunaBuff = data.readShort();
		this.statGetFortunaBuffScore = data.readInt();
		this._statKillNpc = data.readShort();
		this.statKillNpcScore = data.readInt();
		this._statCollectBoxes = data.readShort();
		this.statCollectBoxesScore = data.readInt();
		this._statKillFortunaPlayer = data.readShort();
		this.statKillFortunaPlayerScore = data.readInt();
		this._statDamageTower = data.readShort();
		this.statDamageTowerScore = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeShort(this._statGetFortunaBuff);
		data.writeInt(this.statGetFortunaBuffScore);
		data.writeShort(this._statKillNpc);
		data.writeInt(this.statKillNpcScore);
		data.writeShort(this._statCollectBoxes);
		data.writeInt(this.statCollectBoxesScore);
		data.writeShort(this._statKillFortunaPlayer);
		data.writeInt(this.statKillFortunaPlayerScore);
		data.writeShort(this._statDamageTower);
		data.writeInt(this.statDamageTowerScore);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_201(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_201 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1377;
//
//        private var _statGetFortunaBuff:int;
//        private var ASV2014_3946:int;
//        private var _statKillNpc:int;
//        private var ASV2014_3947:int;
//        private var _statCollectBoxes:int;
//        private var ASV2014_3948:int;
//        private var _statKillFortunaPlayer:int;
//        private var ASV2014_3949:int;
//        private var _statDamageTower:int;
//        private var ASV2014_3938:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statGetFortunaBuff = _arg1.readShort();
//            this.ASV2014_3946 = _arg1.readInt();
//            this._statKillNpc = _arg1.readShort();
//            this.ASV2014_3947 = _arg1.readInt();
//            this._statCollectBoxes = _arg1.readShort();
//            this.ASV2014_3948 = _arg1.readInt();
//            this._statKillFortunaPlayer = _arg1.readShort();
//            this.ASV2014_3949 = _arg1.readInt();
//            this._statDamageTower = _arg1.readShort();
//            this.ASV2014_3938 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this._statGetFortunaBuff);
//            _arg1.writeInt(this.ASV2014_3946);
//            _arg1.writeShort(this._statKillNpc);
//            _arg1.writeInt(this.ASV2014_3947);
//            _arg1.writeShort(this._statCollectBoxes);
//            _arg1.writeInt(this.ASV2014_3948);
//            _arg1.writeShort(this._statKillFortunaPlayer);
//            _arg1.writeInt(this.ASV2014_3949);
//            _arg1.writeShort(this._statDamageTower);
//            _arg1.writeInt(this.ASV2014_3938);
//        }
//
//        public function get statGetFortunaBuff():int
//        {
//            return (this._statGetFortunaBuff);
//        }
//
//        public function set statGetFortunaBuff(_arg1:int):void
//        {
//            this._statGetFortunaBuff = _arg1;
//        }
//
//        public function get statGetFortunaBuffScore():int
//        {
//            return (this.ASV2014_3946);
//        }
//
//        public function set statGetFortunaBuffScore(_arg1:int):void
//        {
//            this.ASV2014_3946 = _arg1;
//        }
//
//        public function get statKillNpc():int
//        {
//            return (this._statKillNpc);
//        }
//
//        public function set statKillNpc(_arg1:int):void
//        {
//            this._statKillNpc = _arg1;
//        }
//
//        public function get statKillNpcScore():int
//        {
//            return (this.ASV2014_3947);
//        }
//
//        public function set statKillNpcScore(_arg1:int):void
//        {
//            this.ASV2014_3947 = _arg1;
//        }
//
//        public function get statCollectBoxes():int
//        {
//            return (this._statCollectBoxes);
//        }
//
//        public function set statCollectBoxes(_arg1:int):void
//        {
//            this._statCollectBoxes = _arg1;
//        }
//
//        public function get statCollectBoxesScore():int
//        {
//            return (this.ASV2014_3948);
//        }
//
//        public function set statCollectBoxesScore(_arg1:int):void
//        {
//            this.ASV2014_3948 = _arg1;
//        }
//
//        public function get statKillFortunaPlayer():int
//        {
//            return (this._statKillFortunaPlayer);
//        }
//
//        public function set statKillFortunaPlayer(_arg1:int):void
//        {
//            this._statKillFortunaPlayer = _arg1;
//        }
//
//        public function get statKillFortunaPlayerScore():int
//        {
//            return (this.ASV2014_3949);
//        }
//
//        public function set statKillFortunaPlayerScore(_arg1:int):void
//        {
//            this.ASV2014_3949 = _arg1;
//        }
//
//        public function get statDamageTower():int
//        {
//            return (this._statDamageTower);
//        }
//
//        public function set statDamageTower(_arg1:int):void
//        {
//            this._statDamageTower = _arg1;
//        }
//
//        public function get statDamageTowerScore():int
//        {
//            return (this.ASV2014_3938);
//        }
//
//        public function set statDamageTowerScore(_arg1:int):void
//        {
//            this.ASV2014_3938 = _arg1;
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
// ASV2014_201 = "4!V" (String#8697)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3938 = "<\">" (String#8727)
// ASV2014_3946 = "9K" (String#16569)
// ASV2014_3947 = "5#d" (String#18103)
// ASV2014_3948 = "5!M" (String#18153)
// ASV2014_3949 = "7!7" (String#17230)
//