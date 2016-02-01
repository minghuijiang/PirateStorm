package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1464 extends Message{

	public static final int id = 1146;
	public int questId;
	public int questTaskId;
	public boolean running;

	public ASV2014_1464(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this.questTaskId = data.readInt();
		this.running = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		data.writeInt(this.questTaskId);
		data.writeBoolean(this.running);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1464(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1464 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1146;
//
//        private var ASV2014_4731:int;
//        private var ASV2014_5591:int;
//        private var ASV2014_2562:Boolean;
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
//            this.ASV2014_5591 = _arg1.readInt();
//            this.ASV2014_2562 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            _arg1.writeInt(this.ASV2014_5591);
//            _arg1.writeBoolean(this.ASV2014_2562);
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
//        public function get questTaskId():int
//        {
//            return (this.ASV2014_5591);
//        }
//
//        public function set questTaskId(_arg1:int):void
//        {
//            this.ASV2014_5591 = _arg1;
//        }
//
//        public function get running():Boolean
//        {
//            return (this.ASV2014_2562);
//        }
//
//        public function set running(_arg1:Boolean):void
//        {
//            this.ASV2014_2562 = _arg1;
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
// ASV2014_1464 = "-\"r" (String#23039)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2562 = ">#7" (String#4134)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4731 = "!!C" (String#1122)
// ASV2014_5591 = "3b" (String#8911)
//