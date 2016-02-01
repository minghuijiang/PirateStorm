package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_624 extends Message{

	public static final int id = 1487;
	public int ASV2014_4489;
	public boolean _done;
	public Message innerMessage;

	public ASV2014_624(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4489 = data.readByte();
		this._done = data.readBoolean();
		this.innerMessage = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4489);
		data.writeBoolean(this._done);
		component.ClientSocket.writeMessage(this.innerMessage, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_624(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_624 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1487;
//
//        private var ASV2014_5710:int;
//        private var _done:Boolean;
//        private var ASV2014_3912:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5710 = _arg1.readByte();
//            this._done = _arg1.readBoolean();
//            this.ASV2014_3912 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5710);
//            _arg1.writeBoolean(this._done);
//            ASV2014_229.writeMessage(this.ASV2014_3912, _arg1);
//        }
//
//        public function get ASV2014_4489():int
//        {
//            return (this.ASV2014_5710);
//        }
//
//        public function set ASV2014_4489(_arg1:int):void
//        {
//            this.ASV2014_5710 = _arg1;
//        }
//
//        public function get done():Boolean
//        {
//            return (this._done);
//        }
//
//        public function set done(_arg1:Boolean):void
//        {
//            this._done = _arg1;
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
// ASV2014_3912 = "5#" (String#5835)
// ASV2014_4489 = "<!S" (String#7167)
// ASV2014_5710 = "4\"K" (String#4521)
// ASV2014_624 = "@G" (String#8046)
//