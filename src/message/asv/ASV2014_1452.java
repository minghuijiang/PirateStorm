package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1452 extends Message{

	public static final int id = 1036;
	public int questId;
	public boolean ASV2014_6599;

	public ASV2014_1452(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this.ASV2014_6599 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		data.writeBoolean(this.ASV2014_6599);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1452(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1452 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1036;
//
//        private var ASV2014_4731:int;
//        private var ASV2014_6598:Boolean;
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
//            this.ASV2014_6598 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            _arg1.writeBoolean(this.ASV2014_6598);
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
//        public function get ASV2014_6599():Boolean
//        {
//            return (this.ASV2014_6598);
//        }
//
//        public function set ASV2014_6599(_arg1:Boolean):void
//        {
//            this.ASV2014_6598 = _arg1;
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
// ASV2014_1452 = "9\"+" (String#19905)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4731 = "!!C" (String#1122)
// ASV2014_6598 = "7!'" (String#17217)
// ASV2014_6599 = "'!L" (String#34516)
//