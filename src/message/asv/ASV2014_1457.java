package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1457 extends Message{

	public static final int id = 1034;
	public int questId;
	public int _pid;

	public ASV2014_1457(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this._pid = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		data.writeInt(this._pid);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1457(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1457 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1034;
//
//        private var ASV2014_4731:int;
//        private var _pid:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4731 = _arg1.readInt();
//            this._pid = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            _arg1.writeInt(this._pid);
//        }
//
//        public function get questId():int
//        {
//            return (this.ASV2014_4731);
//        }
//
//        public function set questId(_arg1:int):void
//        {
//            this.ASV2014_4731 = _arg1;
//        }
//
//        public function get pid():int
//        {
//            return (this._pid);
//        }
//
//        public function set pid(_arg1:int):void
//        {
//            this._pid = _arg1;
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
// ASV2014_1457 = "[8" (String#21985)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4731 = "!!C" (String#1122)
//