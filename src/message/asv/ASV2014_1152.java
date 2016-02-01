package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1152 extends Message{

	public static final int id = 1097;
	public int groupUserId;
	public String _groupUserName;

	public ASV2014_1152(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.groupUserId = data.readInt();
		this._groupUserName = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.groupUserId);
		data.writeUTF(this._groupUserName);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1152(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1152 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1097;
//
//        private var ASV2014_6056:int;
//        private var _groupUserName:String;
//
//        public function ASV2014_1152()
//        {
//            this.groupUserName = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6056 = _arg1.readInt();
//            this._groupUserName = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6056);
//            _arg1.writeUTF(this._groupUserName);
//        }
//
//        public function get groupUserId():int
//        {
//            return (this.ASV2014_6056);
//        }
//
//        public function set groupUserId(_arg1:int):void
//        {
//            this.ASV2014_6056 = _arg1;
//        }
//
//        public function get groupUserName():String
//        {
//            return (this._groupUserName);
//        }
//
//        public function set groupUserName(_arg1:String):void
//        {
//            this._groupUserName = _arg1;
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
// ASV2014_1152 = "2D" (String#9008)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6056 = "`\"a" (String#3421)
//