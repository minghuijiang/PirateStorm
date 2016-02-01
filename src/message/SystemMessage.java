package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class SystemMessage extends Message{

	public static final int id = 1330;
	public Message innerMessage;
	public int ASV2014_3517;

	public SystemMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.innerMessage = component.ClientSocket.readMessage(data,user);
		this.ASV2014_3517 = data.readByte();
	}

	public void serialize(ByteArray data){
		component.ClientSocket.writeMessage(this.innerMessage, data);
		data.writeByte(this.ASV2014_3517);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new SystemMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class SystemMessage implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1330;
//
//        private var ASV2014_3912:ASV2014_30;
//        private var ASV2014_4531:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3912 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_4531 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            ASV2014_229.writeMessage(this.ASV2014_3912, _arg1);
//            _arg1.writeByte(this.ASV2014_4531);
//        }
//
//        public function get innerMessage():ASV2014_30
//        {
//            return (this.ASV2014_3912);
//        }
//
//        public function set innerMessage(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_3912 = _arg1;
//        }
//
//        public function get ASV2014_3517():int
//        {
//            return (this.ASV2014_4531);
//        }
//
//        public function set ASV2014_3517(_arg1:int):void
//        {
//            this.ASV2014_4531 = _arg1;
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
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3517 = "1\"o" (String#7336)
// ASV2014_3912 = "5#" (String#5835)
// ASV2014_4531 = "<#H" (String#11677)
//