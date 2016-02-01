package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_837 extends Message{

	public static final int id = 1278;
	public int ASV2014_3361;
	public int theme;
	public int _entranceHarbour;
	public int guildLevel;

	public ASV2014_837(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_3361 = data.readByte();
		this.theme = data.readByte();
		this._entranceHarbour = data.readByte();
		this.guildLevel = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeByte(this.ASV2014_3361);
		data.writeByte(this.theme);
		data.writeByte(this._entranceHarbour);
		data.writeByte(this.guildLevel);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_837(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_837 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1278;
//
//        private var ASV2014_4570:int;
//        private var ASV2014_4714:int;
//        private var _entranceHarbour:int;
//        private var ASV2014_5953:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4570 = _arg1.readByte();
//            this.ASV2014_4714 = _arg1.readByte();
//            this._entranceHarbour = _arg1.readByte();
//            this.ASV2014_5953 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeByte(this.ASV2014_4570);
//            _arg1.writeByte(this.ASV2014_4714);
//            _arg1.writeByte(this._entranceHarbour);
//            _arg1.writeByte(this.ASV2014_5953);
//        }
//
//        public function get ASV2014_3361():int
//        {
//            return (this.ASV2014_4570);
//        }
//
//        public function set ASV2014_3361(_arg1:int):void
//        {
//            this.ASV2014_4570 = _arg1;
//        }
//
//        public function get theme():int
//        {
//            return (this.ASV2014_4714);
//        }
//
//        public function set theme(_arg1:int):void
//        {
//            this.ASV2014_4714 = _arg1;
//        }
//
//        public function get entranceHarbour():int
//        {
//            return (this._entranceHarbour);
//        }
//
//        public function set entranceHarbour(_arg1:int):void
//        {
//            this._entranceHarbour = _arg1;
//        }
//
//        public function get guildLevel():int
//        {
//            return (this.ASV2014_5953);
//        }
//
//        public function set guildLevel(_arg1:int):void
//        {
//            this.ASV2014_5953 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3361 = "&h" (String#5281)
// ASV2014_4570 = "\"#q" (String#3188)
// ASV2014_4714 = "8!H" (String#5505)
// ASV2014_5953 = "'#]" (String#4408)
// ASV2014_837 = "!\"-" (String#8968)
//