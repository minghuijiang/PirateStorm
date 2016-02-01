package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemInnerQuestLineMessage extends Message{

	public static final int id = 1331;
	public int _type;
	public int _questNumber;
	public int dateInSeconds;

	public SystemInnerQuestLineMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._type = data.readByte();
		this._questNumber = data.readInt();
		this.dateInSeconds = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this._type);
		data.writeInt(this._questNumber);
		data.writeInt(this.dateInSeconds);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemInnerQuestLineMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemInnerQuestLineMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1331;
//
//        private var _type:int;
//        private var _questNumber:int;
//        private var ASV2014_4752:int;
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
//            this._questNumber = _arg1.readInt();
//            this.ASV2014_4752 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._type);
//            _arg1.writeInt(this._questNumber);
//            _arg1.writeInt(this.ASV2014_4752);
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
//        public function get questNumber():int
//        {
//            return (this._questNumber);
//        }
//
//        public function set questNumber(_arg1:int):void
//        {
//            this._questNumber = _arg1;
//        }
//
//        public function get dateInSeconds():int
//        {
//            return (this.ASV2014_4752);
//        }
//
//        public function set dateInSeconds(_arg1:int):void
//        {
//            this.ASV2014_4752 = _arg1;
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
// ASV2014_4752 = "&\"b" (String#16378)
//