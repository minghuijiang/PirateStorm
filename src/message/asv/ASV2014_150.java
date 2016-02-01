package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_150 extends Message{

	public static final int id = 1411;
	public int _position;
	public String _name;
	public int lostMatches;
	public int _wonMatches;
	public int ASV2014_3848;

	public ASV2014_150(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._position = data.readInt();
		this._name = data.readUTF();
		this.lostMatches = data.readInt();
		this._wonMatches = data.readInt();
		this.ASV2014_3848 = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._position);
		data.writeUTF(this._name);
		data.writeInt(this.lostMatches);
		data.writeInt(this._wonMatches);
		data.writeShort(this.ASV2014_3848);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_150(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_150 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1411;
//
//        private var _position:int;
//        private var _name:String;
//        private var ASV2014_3846:int;
//        private var _wonMatches:int;
//        private var ASV2014_3847:int;
//
//        public function ASV2014_150()
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
//            this.ASV2014_3846 = _arg1.readInt();
//            this._wonMatches = _arg1.readInt();
//            this.ASV2014_3847 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._position);
//            _arg1.writeUTF(this._name);
//            _arg1.writeInt(this.ASV2014_3846);
//            _arg1.writeInt(this._wonMatches);
//            _arg1.writeShort(this.ASV2014_3847);
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
//        public function get lostMatches():int
//        {
//            return (this.ASV2014_3846);
//        }
//
//        public function set lostMatches(_arg1:int):void
//        {
//            this.ASV2014_3846 = _arg1;
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
//        public function get ASV2014_3848():int
//        {
//            return (this.ASV2014_3847);
//        }
//
//        public function set ASV2014_3848(_arg1:int):void
//        {
//            this.ASV2014_3847 = _arg1;
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
// ASV2014_150 = "0\"A" (String#8372)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3846 = "-!P" (String#15914)
// ASV2014_3847 = "4!t" (String#16416)
// ASV2014_3848 = ";=" (String#26307)
//