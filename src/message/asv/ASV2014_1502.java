package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1502 extends Message{

	public static final int id = 1195;
	public String _name;
	public String tag;

	public ASV2014_1502(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._name = data.readUTF();
		this.tag = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this._name);
		data.writeUTF(this.tag);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1502(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1502 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1195;
//
//        private var _name:String;
//        private var ASV2014_6611:String;
//
//        public function ASV2014_1502()
//        {
//            this.name = "";
//            this.tag = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._name = _arg1.readUTF();
//            this.ASV2014_6611 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this._name);
//            _arg1.writeUTF(this.ASV2014_6611);
//        }
//
//        public function get name():String
//        {
//            return (this._name);
//        }
//
//        public function set name(_arg1:String):void
//        {
//            this._name = _arg1;
//        }
//
//        public function get tag():String
//        {
//            return (this.ASV2014_6611);
//        }
//
//        public function set tag(_arg1:String):void
//        {
//            this.ASV2014_6611 = _arg1;
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
// ASV2014_1502 = ",n" (String#12503)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_6611 = "@\"o" (String#15541)
//