package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_192 extends Message{

	public static final int id = 1175;
	public int bonusMapId;
	public Message innerMessage;
	public int ASV2014_2826;

	public ASV2014_192(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.bonusMapId = data.readByte();
		this.innerMessage = component.ClientSocket.readMessage(data,user);
		this.ASV2014_2826 = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.bonusMapId);
		component.ClientSocket.writeMessage(this.innerMessage, data);
		data.writeInt(this.ASV2014_2826);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_192(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_192 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1175;
//
//        private var ASV2014_3906:int;
//        private var ASV2014_3912:ASV2014_30;
//        private var ASV2014_3913:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3906 = _arg1.readByte();
//            this.ASV2014_3912 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//            this.ASV2014_3913 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_3906);
//            ASV2014_229.writeMessage(this.ASV2014_3912, _arg1);
//            _arg1.writeInt(this.ASV2014_3913);
//        }
//
//        public function get bonusMapId():int
//        {
//            return (this.ASV2014_3906);
//        }
//
//        public function set bonusMapId(_arg1:int):void
//        {
//            this.ASV2014_3906 = _arg1;
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
//        public function get ASV2014_2826():int
//        {
//            return (this.ASV2014_3913);
//        }
//
//        public function set ASV2014_2826(_arg1:int):void
//        {
//            this.ASV2014_3913 = _arg1;
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
// ASV2014_192 = ">!I" (String#9043)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2826 = "-!#" (String#25281)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_3906 = "5\"\"" (String#1970)
// ASV2014_3912 = "5#" (String#5835)
// ASV2014_3913 = "'\"9" (String#17320)
//