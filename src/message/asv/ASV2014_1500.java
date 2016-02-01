package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1500 extends Message{

	public static final int id = 1105;
	public int _statusIndex;
	public Message echoMessage;

	public ASV2014_1500(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._statusIndex = data.readByte();
		this.echoMessage = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this._statusIndex);
		component.ClientSocket.writeMessage(this.echoMessage, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1500(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1500 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1105;
//
//        private var _statusIndex:int;
//        private var ASV2014_4906:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._statusIndex = _arg1.readByte();
//            this.ASV2014_4906 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this._statusIndex);
//            ASV2014_229.writeMessage(this.ASV2014_4906, _arg1);
//        }
//
//        public function get statusIndex():int
//        {
//            return (this._statusIndex);
//        }
//
//        public function set statusIndex(_arg1:int):void
//        {
//            this._statusIndex = _arg1;
//        }
//
//        public function get echoMessage():ASV2014_30
//        {
//            return (this.ASV2014_4906);
//        }
//
//        public function set echoMessage(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_4906 = _arg1;
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
// ASV2014_1500 = ">#c" (String#20985)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_4906 = "]\"!" (String#3420)
//