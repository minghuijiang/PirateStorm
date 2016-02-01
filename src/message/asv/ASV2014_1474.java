package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1474 extends Message{

	public static final int id = 1047;
	public int questId;
	public int ASV2014_6604;
	public int _amount;
	public int _category;
	public int _type;

	public ASV2014_1474(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this.ASV2014_6604 = data.readInt();
		this._amount = data.readInt();
		this._category = data.readInt();
		this._type = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		data.writeInt(this.ASV2014_6604);
		data.writeInt(this._amount);
		data.writeInt(this._category);
		data.writeInt(this._type);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1474(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1474 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1047;
//
//        private var ASV2014_4731:int;
//        private var ASV2014_6603:int;
//        private var _amount:int;
//        private var _category:int;
//        private var _type:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4731 = _arg1.readInt();
//            this.ASV2014_6603 = _arg1.readInt();
//            this._amount = _arg1.readInt();
//            this._category = _arg1.readInt();
//            this._type = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            _arg1.writeInt(this.ASV2014_6603);
//            _arg1.writeInt(this._amount);
//            _arg1.writeInt(this._category);
//            _arg1.writeInt(this._type);
//        }
//
//        public function get questId():int
//        {
//            return (this.ASV2014_4731);
//        }
//
//        public function set questId(_arg1:int):void
//        {
//            this.ASV2014_4731 = _arg1;
//        }
//
//        public function get ASV2014_6604():int
//        {
//            return (this.ASV2014_6603);
//        }
//
//        public function set ASV2014_6604(_arg1:int):void
//        {
//            this.ASV2014_6603 = _arg1;
//        }
//
//        public function get amount():int
//        {
//            return (this._amount);
//        }
//
//        public function set amount(_arg1:int):void
//        {
//            this._amount = _arg1;
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
//        public function get type():int
//        {
//            return (this._type);
//        }
//
//        public function set type(_arg1:int):void
//        {
//            this._type = _arg1;
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
// ASV2014_1474 = "&\"C" (String#21903)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4731 = "!!C" (String#1122)
// ASV2014_6603 = "<d" (String#16664)
// ASV2014_6604 = "0#-" (String#37114)
//