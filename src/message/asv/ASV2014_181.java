package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_181 extends Message{

	public static final int id = 1492;
	public int ASV2014_3905;
	public int _count;
	public int itemType;
	public int itemDefaultId;

	public ASV2014_181(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3905 = data.readByte();
		this._count = data.readByte();
		this.itemType = data.readByte();
		this.itemDefaultId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_3905);
		data.writeByte(this._count);
		data.writeByte(this.itemType);
		data.writeByte(this.itemDefaultId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_181(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_181 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1492;
//
//        private var ASV2014_3904:int;
//        private var _count:int;
//        private var ASV2014_2516:int;
//        private var ASV2014_2843:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3904 = _arg1.readByte();
//            this._count = _arg1.readByte();
//            this.ASV2014_2516 = _arg1.readByte();
//            this.ASV2014_2843 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3904);
//            _arg1.writeByte(this._count);
//            _arg1.writeByte(this.ASV2014_2516);
//            _arg1.writeByte(this.ASV2014_2843);
//        }
//
//        public function get ASV2014_3905():int
//        {
//            return (this.ASV2014_3904);
//        }
//
//        public function set ASV2014_3905(_arg1:int):void
//        {
//            this.ASV2014_3904 = _arg1;
//        }
//
//        public function get count():int
//        {
//            return (this._count);
//        }
//
//        public function set count(_arg1:int):void
//        {
//            this._count = _arg1;
//        }
//
//        public function get itemType():int
//        {
//            return (this.ASV2014_2516);
//        }
//
//        public function set itemType(_arg1:int):void
//        {
//            this.ASV2014_2516 = _arg1;
//        }
//
//        public function get itemDefaultId():int
//        {
//            return (this.ASV2014_2843);
//        }
//
//        public function set itemDefaultId(_arg1:int):void
//        {
//            this.ASV2014_2843 = _arg1;
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
// ASV2014_181 = "5q" (String#6522)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2516 = "!!<" (String#407)
// ASV2014_2843 = "<#;" (String#789)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3904 = "^\"\"" (String#3043)
// ASV2014_3905 = "<!4" (String#4894)
//