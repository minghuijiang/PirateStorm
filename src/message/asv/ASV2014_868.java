package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_868 extends Message{

	public static final int id = 0x0505;
	public int sourceGuildId;
	public int sourceUserId;
	public String _sourceUserName;
	public String _sourceGuildTag;
	public int _date;
	public String _text;

	public ASV2014_868(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.sourceGuildId = data.readInt();
		this.sourceUserId = data.readInt();
		this._sourceUserName = data.readUTF();
		this._sourceGuildTag = data.readUTF();
		this._date = data.readInt();
		this._text = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.sourceGuildId);
		data.writeInt(this.sourceUserId);
		data.writeUTF(this._sourceUserName);
		data.writeUTF(this._sourceGuildTag);
		data.writeInt(this._date);
		data.writeUTF(this._text);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_868(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_868 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0x0505;
//
//        private var ASV2014_6182:int;
//        private var ASV2014_6186:int;
//        private var _sourceUserName:String;
//        private var _sourceGuildTag:String;
//        private var _date:int;
//        private var _text:String;
//
//        public function ASV2014_868()
//        {
//            this.sourceUserName = "";
//            this.sourceGuildTag = "";
//            this.text = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_6182 = _arg1.readInt();
//            this.ASV2014_6186 = _arg1.readInt();
//            this._sourceUserName = _arg1.readUTF();
//            this._sourceGuildTag = _arg1.readUTF();
//            this._date = _arg1.readInt();
//            this._text = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_6182);
//            _arg1.writeInt(this.ASV2014_6186);
//            _arg1.writeUTF(this._sourceUserName);
//            _arg1.writeUTF(this._sourceGuildTag);
//            _arg1.writeInt(this._date);
//            _arg1.writeUTF(this._text);
//        }
//
//        public function get sourceGuildId():int
//        {
//            return (this.ASV2014_6182);
//        }
//
//        public function set sourceGuildId(_arg1:int):void
//        {
//            this.ASV2014_6182 = _arg1;
//        }
//
//        public function get sourceUserId():int
//        {
//            return (this.ASV2014_6186);
//        }
//
//        public function set sourceUserId(_arg1:int):void
//        {
//            this.ASV2014_6186 = _arg1;
//        }
//
//        public function get sourceUserName():String
//        {
//            return (this._sourceUserName);
//        }
//
//        public function set sourceUserName(_arg1:String):void
//        {
//            this._sourceUserName = _arg1;
//        }
//
//        public function get sourceGuildTag():String
//        {
//            return (this._sourceGuildTag);
//        }
//
//        public function set sourceGuildTag(_arg1:String):void
//        {
//            this._sourceGuildTag = _arg1;
//        }
//
//        public function get date():int
//        {
//            return (this._date);
//        }
//
//        public function set date(_arg1:int):void
//        {
//            this._date = _arg1;
//        }
//
//        public function get text():String
//        {
//            return (this._text);
//        }
//
//        public function set text(_arg1:String):void
//        {
//            this._text = _arg1;
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
// ASV2014_6182 = "1#U" (String#4540)
// ASV2014_6186 = "1\"h" (String#18176)
// ASV2014_868 = "=#>" (String#8880)
//