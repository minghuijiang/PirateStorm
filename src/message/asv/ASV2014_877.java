package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_877 extends Message{

	public static final int id = 1264;
	public int guildId;
	public int theme;
	public int _entranceHarbour;
	public int guildLevel;
	public String guildText;

	public ASV2014_877(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.guildId = data.readInt();
		this.theme = data.readByte();
		this._entranceHarbour = data.readByte();
		this.guildLevel = data.readByte();
		this.guildText = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.guildId);
		data.writeByte(this.theme);
		data.writeByte(this._entranceHarbour);
		data.writeByte(this.guildLevel);
		data.writeUTF(this.guildText);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_877(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_877 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1264;
//
//        private var ASV2014_2901:int;
//        private var ASV2014_4714:int;
//        private var _entranceHarbour:int;
//        private var ASV2014_5953:int;
//        private var ASV2014_5791:String;
//
//        public function ASV2014_877()
//        {
//            this.guildText = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2901 = _arg1.readInt();
//            this.ASV2014_4714 = _arg1.readByte();
//            this._entranceHarbour = _arg1.readByte();
//            this.ASV2014_5953 = _arg1.readByte();
//            this.ASV2014_5791 = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2901);
//            _arg1.writeByte(this.ASV2014_4714);
//            _arg1.writeByte(this._entranceHarbour);
//            _arg1.writeByte(this.ASV2014_5953);
//            _arg1.writeUTF(this.ASV2014_5791);
//        }
//
//        public function get guildId():int
//        {
//            return (this.ASV2014_2901);
//        }
//
//        public function set guildId(_arg1:int):void
//        {
//            this.ASV2014_2901 = _arg1;
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
//        public function get guildText():String
//        {
//            return (this.ASV2014_5791);
//        }
//
//        public function set guildText(_arg1:String):void
//        {
//            this.ASV2014_5791 = _arg1;
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
// ASV2014_2901 = " 6" (String#828)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4714 = "8!H" (String#5505)
// ASV2014_5791 = "7#f" (String#4406)
// ASV2014_5953 = "'#]" (String#4408)
// ASV2014_877 = "8-" (String#8402)
//