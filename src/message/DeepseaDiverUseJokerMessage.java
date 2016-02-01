package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class DeepseaDiverUseJokerMessage extends Message{

	public static final int id = 1517;
	public boolean ASV2014_3383;

	public DeepseaDiverUseJokerMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3383 = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this.ASV2014_3383);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new DeepseaDiverUseJokerMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_670 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1517;
//
//        private var ASV2014_5746:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5746 = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this.ASV2014_5746);
//        }
//
//        public function get ASV2014_3383():Boolean
//        {
//            return (this.ASV2014_5746);
//        }
//
//        public function set ASV2014_3383(_arg1:Boolean):void
//        {
//            this.ASV2014_5746 = _arg1;
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
// ASV2014_3383 = "<#V" (String#9040)
// ASV2014_5746 = "&!y" (String#8717)
// ASV2014_670 = "!\"q" (String#8680)
//