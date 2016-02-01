package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1411 extends Message{

	public static final int id = 1304;
	public int ASV2014_4879;
	public boolean ASV2014_5924;
	public boolean _parleyLocked;

	public ASV2014_1411(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4879 = data.readInt();
		this.ASV2014_5924 = data.readBoolean();
		this._parleyLocked = data.readBoolean();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_4879);
		data.writeBoolean(this.ASV2014_5924);
		data.writeBoolean(this._parleyLocked);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1411(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1411 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1304;
//
//        private var ASV2014_5920:int;
//        private var ASV2014_6526:Boolean;
//        private var _parleyLocked:Boolean;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5920 = _arg1.readInt();
//            this.ASV2014_6526 = _arg1.readBoolean();
//            this._parleyLocked = _arg1.readBoolean();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5920);
//            _arg1.writeBoolean(this.ASV2014_6526);
//            _arg1.writeBoolean(this._parleyLocked);
//        }
//
//        public function get ASV2014_4879():int
//        {
//            return (this.ASV2014_5920);
//        }
//
//        public function set ASV2014_4879(_arg1:int):void
//        {
//            this.ASV2014_5920 = _arg1;
//        }
//
//        public function get ASV2014_5924():Boolean
//        {
//            return (this.ASV2014_6526);
//        }
//
//        public function set ASV2014_5924(_arg1:Boolean):void
//        {
//            this.ASV2014_6526 = _arg1;
//        }
//
//        public function get parleyLocked():Boolean
//        {
//            return (this._parleyLocked);
//        }
//
//        public function set parleyLocked(_arg1:Boolean):void
//        {
//            this._parleyLocked = _arg1;
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
// ASV2014_1411 = "6\"6" (String#8797)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4879 = "]!9" (String#11419)
// ASV2014_5920 = "5!J" (String#5206)
// ASV2014_5924 = "+\"5" (String#13970)
// ASV2014_6526 = "]#+" (String#8469)
//