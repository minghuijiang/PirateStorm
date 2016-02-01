package message.asv;

import message.HarbourDepartureMessage;
import message.MessageList;
import message.Message;

import com.mingJiang.as.ByteArray;

import component.User;

public class WaitReviveMsg extends Message{

	public static final int id = 1007;
	public int priceRestoreBasic;
	public int priceRestoreFull;
	public int ASV2014_2176;
	public boolean ASV2014_2849;
	public int _locaId;
	public String ASV2014_2839;
	public MessageList _lostItems;

	public WaitReviveMsg(User user) {
		super(user);
		_lostItems = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.priceRestoreBasic = data.readInt();
		this.priceRestoreFull = data.readInt();
		this.ASV2014_2176 = data.readByte();
		this.ASV2014_2849 = data.readBoolean();
		this._locaId = data.readInt();
		this.ASV2014_2839 = data.readUTF();
		this._lostItems.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.priceRestoreBasic);
		data.writeInt(this.priceRestoreFull);
		data.writeByte(this.ASV2014_2176);
		data.writeBoolean(this.ASV2014_2849);
		data.writeInt(this._locaId);
		data.writeUTF(this.ASV2014_2839);
		this._lostItems.serialize(data);
	}

	public void action(){
		user.revive();
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new WaitReviveMsg(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_62 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1007;
//
//        private var ASV2014_2845:int;
//        private var ASV2014_2846:int;
//        private var ASV2014_2847:int;
//        private var ASV2014_2848:Boolean;
//        private var _locaId:int;
//        private var ASV2014_2838:String;
//        private var _lostItems:ASV2014_194;
//
//        public function ASV2014_62()
//        {
//            this._lostItems = new ASV2014_194();
//            super();
//            this.ASV2014_2839 = "";
//            this.lostItems = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_2845 = _arg1.readInt();
//            this.ASV2014_2846 = _arg1.readInt();
//            this.ASV2014_2847 = _arg1.readByte();
//            this.ASV2014_2848 = _arg1.readBoolean();
//            this._locaId = _arg1.readInt();
//            this.ASV2014_2838 = _arg1.readUTF();
//            this._lostItems.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_2845);
//            _arg1.writeInt(this.ASV2014_2846);
//            _arg1.writeByte(this.ASV2014_2847);
//            _arg1.writeBoolean(this.ASV2014_2848);
//            _arg1.writeInt(this._locaId);
//            _arg1.writeUTF(this.ASV2014_2838);
//            this._lostItems.ASV2014_2336(_arg1);
//        }
//
//        public function get priceRestoreBasic():int
//        {
//            return (this.ASV2014_2845);
//        }
//
//        public function set priceRestoreBasic(_arg1:int):void
//        {
//            this.ASV2014_2845 = _arg1;
//        }
//
//        public function get priceRestoreFull():int
//        {
//            return (this.ASV2014_2846);
//        }
//
//        public function set priceRestoreFull(_arg1:int):void
//        {
//            this.ASV2014_2846 = _arg1;
//        }
//
//        public function get ASV2014_2176():int
//        {
//            return (this.ASV2014_2847);
//        }
//
//        public function set ASV2014_2176(_arg1:int):void
//        {
//            this.ASV2014_2847 = _arg1;
//        }
//
//        public function get ASV2014_2849():Boolean
//        {
//            return (this.ASV2014_2848);
//        }
//
//        public function set ASV2014_2849(_arg1:Boolean):void
//        {
//            this.ASV2014_2848 = _arg1;
//        }
//
//        public function get locaId():int
//        {
//            return (this._locaId);
//        }
//
//        public function set locaId(_arg1:int):void
//        {
//            this._locaId = _arg1;
//        }
//
//        public function get ASV2014_2839():String
//        {
//            return (this.ASV2014_2838);
//        }
//
//        public function set ASV2014_2839(_arg1:String):void
//        {
//            this.ASV2014_2838 = _arg1;
//        }
//
//        public function get lostItems():ASV2014_194
//        {
//            return (this._lostItems);
//        }
//
//        public function set lostItems(_arg1:ASV2014_194):void
//        {
//            this._lostItems = _arg1;
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
// ASV2014_194 = "[#c" (String#138)
// ASV2014_2176 = "##g" (String#13126)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2838 = "@#j" (String#4415)
// ASV2014_2839 = "<\"V" (String#4585)
// ASV2014_2845 = "7d" (String#18054)
// ASV2014_2846 = "0#3" (String#18371)
// ASV2014_2847 = "3\"P" (String#15730)
// ASV2014_2848 = "=1" (String#16724)
// ASV2014_2849 = "-!q" (String#25124)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_62 = "=!C" (String#7611)
//