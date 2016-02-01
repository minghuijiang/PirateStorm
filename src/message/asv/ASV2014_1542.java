package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1542 extends Message{

	public static final int id = 1443;
	public int _position;
	public String _name;
	public int _coins;
	public int _wonMatches;

	public ASV2014_1542(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._position = data.readInt();
		this._name = data.readUTF();
		this._coins = data.readInt();
		this._wonMatches = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._position);
		data.writeUTF(this._name);
		data.writeInt(this._coins);
		data.writeInt(this._wonMatches);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1542(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1542 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1443;
//
//        private var _position:int;
//        private var _name:String;
//        private var _coins:int;
//        private var _wonMatches:int;
//
//        public function ASV2014_1542()
//        {
//            this.name = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._position = _arg1.readInt();
//            this._name = _arg1.readUTF();
//            this._coins = _arg1.readInt();
//            this._wonMatches = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._position);
//            _arg1.writeUTF(this._name);
//            _arg1.writeInt(this._coins);
//            _arg1.writeInt(this._wonMatches);
//        }
//
//        public function get position():int
//        {
//            return (this._position);
//        }
//
//        public function set position(_arg1:int):void
//        {
//            this._position = _arg1;
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
//        public function get coins():int
//        {
//            return (this._coins);
//        }
//
//        public function set coins(_arg1:int):void
//        {
//            this._coins = _arg1;
//        }
//
//        public function get wonMatches():int
//        {
//            return (this._wonMatches);
//        }
//
//        public function set wonMatches(_arg1:int):void
//        {
//            this._wonMatches = _arg1;
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
// ASV2014_1542 = "7\"&" (String#9930)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
//