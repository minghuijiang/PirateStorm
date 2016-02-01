package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1425 extends Message{

	public static final int id = 1080;
	public int objectId;
	public int ASV2014_3034;
	public int _priority;

	public ASV2014_1425(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.objectId = data.readInt();
		this.ASV2014_3034 = data.readByte();
		this._priority = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.objectId);
		data.writeByte(this.ASV2014_3034);
		data.writeShort(this._priority);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1425(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1425 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1080;
//
//        private var ASV2014_2991:int;
//        private var ASV2014_3787:int;
//        private var _priority:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2991 = _arg1.readInt();
//            this.ASV2014_3787 = _arg1.readByte();
//            this._priority = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2991);
//            _arg1.writeByte(this.ASV2014_3787);
//            _arg1.writeShort(this._priority);
//        }
//
//        public function get objectId():int
//        {
//            return (this.ASV2014_2991);
//        }
//
//        public function set objectId(_arg1:int):void
//        {
//            this.ASV2014_2991 = _arg1;
//        }
//
//        public function get ASV2014_3034():int
//        {
//            return (this.ASV2014_3787);
//        }
//
//        public function set ASV2014_3034(_arg1:int):void
//        {
//            this.ASV2014_3787 = _arg1;
//        }
//
//        public function get priority():int
//        {
//            return (this._priority);
//        }
//
//        public function set priority(_arg1:int):void
//        {
//            this._priority = _arg1;
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
// ASV2014_1425 = "1\"W" (String#12424)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2991 = "=\"l" (String#914)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3034 = "&2" (String#3230)
// ASV2014_3787 = "3!Y" (String#6529)
//