package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1289 extends Message{

	public static final int id = 1470;
	public int _status;
	public Message newDetails;

	public ASV2014_1289(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._status = data.readByte();
		this.newDetails = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._status);
		component.ClientSocket.writeMessage(this.newDetails, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1289(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1289 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1470;
//
//        private var _status:int;
//        private var ASV2014_6503:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._status = _arg1.readByte();
//            this.ASV2014_6503 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._status);
//            ASV2014_229.writeMessage(this.ASV2014_6503, _arg1);
//        }
//
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
//        }
//
//        public function get newDetails():ASV2014_30
//        {
//            return (this.ASV2014_6503);
//        }
//
//        public function set newDetails(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6503 = _arg1;
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
// ASV2014_1289 = "!\"S" (String#12335)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_6503 = "%\"P" (String#17935)
//