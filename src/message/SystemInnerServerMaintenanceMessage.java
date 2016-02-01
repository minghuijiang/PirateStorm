package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerServerMaintenanceMessage extends Message{

	public static final int id = 1333;
	public int _type;
	public int waitingTimeSeconds;

	public SystemInnerServerMaintenanceMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this.waitingTimeSeconds = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeInt(this.waitingTimeSeconds);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerServerMaintenanceMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerServerMaintenanceMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1333;
//
//        private var _type:int;
//        private var ASV2014_4803:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._type = _arg1.readByte();
//            this.ASV2014_4803 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeInt(this.ASV2014_4803);
//        }
//
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
//        }
//
//        public function get waitingTimeSeconds():int
//        {
//            return (this.ASV2014_4803);
//        }
//
//        public function set waitingTimeSeconds(_arg1:int):void
//        {
//            this.ASV2014_4803 = _arg1;
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
// ASV2014_4803 = "1X" (String#17926)
//