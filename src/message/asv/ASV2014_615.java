package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_615 extends Message{

	public static final int id = 1465;
	public int ASV2014_4460;
	public int ASV2014_4459;
	public int _category;
	public int currentLevel;
	public int maxLevel;
	public int _position;
	public Message _condition;

	public ASV2014_615(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4460 = data.readByte();
		this.ASV2014_4459 = data.readByte();
		this._category = data.readByte();
		this.currentLevel = data.readByte();
		this.maxLevel = data.readByte();
		this._position = data.readByte();
		this._condition = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_4460);
		data.writeByte(this.ASV2014_4459);
		data.writeByte(this._category);
		data.writeByte(this.currentLevel);
		data.writeByte(this.maxLevel);
		data.writeByte(this._position);
		component.ClientSocket.writeMessage(this._condition, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_615(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_615 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1465;
//
//        private var ASV2014_5698:int;
//        private var ASV2014_5705:int;
//        private var _category:int;
//        private var ASV2014_5706:int;
//        private var ASV2014_5614:int;
//        private var _position:int;
//        private var _condition:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5698 = _arg1.readByte();
//            this.ASV2014_5705 = _arg1.readByte();
//            this._category = _arg1.readByte();
//            this.ASV2014_5706 = _arg1.readByte();
//            this.ASV2014_5614 = _arg1.readByte();
//            this._position = _arg1.readByte();
//            this._condition = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_5698);
//            _arg1.writeByte(this.ASV2014_5705);
//            _arg1.writeByte(this._category);
//            _arg1.writeByte(this.ASV2014_5706);
//            _arg1.writeByte(this.ASV2014_5614);
//            _arg1.writeByte(this._position);
//            ASV2014_229.writeMessage(this._condition, _arg1);
//        }
//
//        public function get ASV2014_4460():int
//        {
//            return (this.ASV2014_5698);
//        }
//
//        public function set ASV2014_4460(_arg1:int):void
//        {
//            this.ASV2014_5698 = _arg1;
//        }
//
//        public function get ASV2014_4459():int
//        {
//            return (this.ASV2014_5705);
//        }
//
//        public function set ASV2014_4459(_arg1:int):void
//        {
//            this.ASV2014_5705 = _arg1;
//        }
//
//        public function get category():int
//        {
//            return (this._category);
//        }
//
//        public function set category(_arg1:int):void
//        {
//            this._category = _arg1;
//        }
//
//        public function get currentLevel():int
//        {
//            return (this.ASV2014_5706);
//        }
//
//        public function set currentLevel(_arg1:int):void
//        {
//            this.ASV2014_5706 = _arg1;
//        }
//
//        public function get maxLevel():int
//        {
//            return (this.ASV2014_5614);
//        }
//
//        public function set maxLevel(_arg1:int):void
//        {
//            this.ASV2014_5614 = _arg1;
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
//        public function get condition():ASV2014_30
//        {
//            return (this._condition);
//        }
//
//        public function set condition(_arg1:ASV2014_30):void
//        {
//            this._condition = _arg1;
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
// ASV2014_4459 = "8!j" (String#7757)
// ASV2014_4460 = "^\"J" (String#2497)
// ASV2014_5614 = "5\"N" (String#2726)
// ASV2014_5698 = "8!-" (String#2108)
// ASV2014_5705 = "3\"C" (String#7855)
// ASV2014_5706 = "]#2" (String#2737)
// ASV2014_615 = "<\"$" (String#9436)
//