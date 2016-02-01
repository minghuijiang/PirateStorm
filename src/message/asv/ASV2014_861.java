package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_861 extends Message{

	public static final int id = 1276;
	public int ASV2014_3361;
	public int guildIslandState;
	public int _stateSecondsLeft;

	public ASV2014_861(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3361 = data.readByte();
		this.guildIslandState = data.readByte();
		this._stateSecondsLeft = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_3361);
		data.writeByte(this.guildIslandState);
		data.writeInt(this._stateSecondsLeft);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_861(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_861 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1276;
//
//        private var ASV2014_4570:int;
//        private var ASV2014_6185:int;
//        private var _stateSecondsLeft:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4570 = _arg1.readByte();
//            this.ASV2014_6185 = _arg1.readByte();
//            this._stateSecondsLeft = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4570);
//            _arg1.writeByte(this.ASV2014_6185);
//            _arg1.writeInt(this._stateSecondsLeft);
//        }
//
//        public function get ASV2014_3361():int
//        {
//            return (this.ASV2014_4570);
//        }
//
//        public function set ASV2014_3361(_arg1:int):void
//        {
//            this.ASV2014_4570 = _arg1;
//        }
//
//        public function get guildIslandState():int
//        {
//            return (this.ASV2014_6185);
//        }
//
//        public function set guildIslandState(_arg1:int):void
//        {
//            this.ASV2014_6185 = _arg1;
//        }
//
//        public function get stateSecondsLeft():int
//        {
//            return (this._stateSecondsLeft);
//        }
//
//        public function set stateSecondsLeft(_arg1:int):void
//        {
//            this._stateSecondsLeft = _arg1;
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
// ASV2014_3361 = "&h" (String#5281)
// ASV2014_4570 = "\"#q" (String#3188)
// ASV2014_6185 = "\"\"P" (String#9103)
// ASV2014_861 = "7#X" (String#13222)
//