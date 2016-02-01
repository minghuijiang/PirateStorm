package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1451 extends Message{

	public static final int id = 1418;
	public boolean _hasApplication;
	public int _teamId;
	public String _name;
	public int _type;
	public int ASV2014_3856;
	public int _teamJoinDelay;

	public ASV2014_1451(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._hasApplication = data.readBoolean();
		this._teamId = data.readInt();
		this._name = data.readUTF();
		this._type = data.readByte();
		this.ASV2014_3856 = data.readShort();
		this._teamJoinDelay = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeBoolean(this._hasApplication);
		data.writeInt(this._teamId);
		data.writeUTF(this._name);
		data.writeByte(this._type);
		data.writeShort(this.ASV2014_3856);
		data.writeInt(this._teamJoinDelay);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1451(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1451 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1418;
//
//        private var _hasApplication:Boolean;
//        private var _teamId:int;
//        private var _name:String;
//        private var _type:int;
//        private var ASV2014_3849:int;
//        private var _teamJoinDelay:int;
//
//        public function ASV2014_1451()
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
//            this._hasApplication = _arg1.readBoolean();
//            this._teamId = _arg1.readInt();
//            this._name = _arg1.readUTF();
//            this._type = _arg1.readByte();
//            this.ASV2014_3849 = _arg1.readShort();
//            this._teamJoinDelay = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeBoolean(this._hasApplication);
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this._name);
//            _arg1.writeByte(this._type);
//            _arg1.writeShort(this.ASV2014_3849);
//            _arg1.writeInt(this._teamJoinDelay);
//        }
//
//        public function get hasApplication():Boolean
//        {
//            return (this._hasApplication);
//        }
//
//        public function set hasApplication(_arg1:Boolean):void
//        {
//            this._hasApplication = _arg1;
//        }
//
//        public function get teamId():int
//        {
//            return (this._teamId);
//        }
//
//        public function set teamId(_arg1:int):void
//        {
//            this._teamId = _arg1;
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
//        public function get ASV2014_3856():int
//        {
//            return (this.ASV2014_3849);
//        }
//
//        public function set ASV2014_3856(_arg1:int):void
//        {
//            this.ASV2014_3849 = _arg1;
//        }
//
//        public function get teamJoinDelay():int
//        {
//            return (this._teamJoinDelay);
//        }
//
//        public function set teamJoinDelay(_arg1:int):void
//        {
//            this._teamJoinDelay = _arg1;
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
// ASV2014_1451 = "%\"N" (String#11968)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3849 = "%\"," (String#8918)
// ASV2014_3856 = "]\"2" (String#14123)
//