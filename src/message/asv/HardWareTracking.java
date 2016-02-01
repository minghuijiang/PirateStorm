package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class HardWareTracking extends Message{

	public static final int id = 1567;
	public String driverInfo="OpenGL";
	public boolean isDebugger= true;
	public String manufacturer="Google Pepper";
	public String os="Windows 8.1";
	public String playerType="PlugIn";
	public int screenResolutionX= 1366;
	public int screenResolutionY= 768;
	public String _version = "WIN 14,0,0,145";

	public HardWareTracking(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.driverInfo = data.readUTF();
		this.isDebugger = data.readBoolean();
		this.manufacturer = data.readUTF();
		this.os = data.readUTF();
		this.playerType = data.readUTF();
		this.screenResolutionX = data.readShort();
		this.screenResolutionY = data.readShort();
		this._version = data.readUTF();
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.driverInfo);
		data.writeBoolean(this.isDebugger);
		data.writeUTF(this.manufacturer);
		data.writeUTF(this.os);
		data.writeUTF(this.playerType);
		data.writeShort(this.screenResolutionX);
		data.writeShort(this.screenResolutionY);
		data.writeUTF(this._version);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new HardWareTracking(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_532 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1567;
//
//        private var ASV2014_5485:String;
//        private var ASV2014_5486:Boolean;
//        private var ASV2014_5487:String;
//        private var ASV2014_5488:String;
//        private var ASV2014_5489:String;
//        private var ASV2014_5490:int;
//        private var ASV2014_5491:int;
//        private var _version:String;
//
//        public function ASV2014_532()
//        {
//            this.driverInfo = "";
//            this.manufacturer = "";
//            this.os = "";
//            this.playerType = "";
//            this.version = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5485 = _arg1.readUTF();
//            this.ASV2014_5486 = _arg1.readBoolean();
//            this.ASV2014_5487 = _arg1.readUTF();
//            this.ASV2014_5488 = _arg1.readUTF();
//            this.ASV2014_5489 = _arg1.readUTF();
//            this.ASV2014_5490 = _arg1.readShort();
//            this.ASV2014_5491 = _arg1.readShort();
//            this._version = _arg1.readUTF();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_5485);
//            _arg1.writeBoolean(this.ASV2014_5486);
//            _arg1.writeUTF(this.ASV2014_5487);
//            _arg1.writeUTF(this.ASV2014_5488);
//            _arg1.writeUTF(this.ASV2014_5489);
//            _arg1.writeShort(this.ASV2014_5490);
//            _arg1.writeShort(this.ASV2014_5491);
//            _arg1.writeUTF(this._version);
//        }
//
//        public function get driverInfo():String
//        {
//            return (this.ASV2014_5485);
//        }
//
//        public function set driverInfo(_arg1:String):void
//        {
//            this.ASV2014_5485 = _arg1;
//        }
//
//        public function get isDebugger():Boolean
//        {
//            return (this.ASV2014_5486);
//        }
//
//        public function set isDebugger(_arg1:Boolean):void
//        {
//            this.ASV2014_5486 = _arg1;
//        }
//
//        public function get manufacturer():String
//        {
//            return (this.ASV2014_5487);
//        }
//
//        public function set manufacturer(_arg1:String):void
//        {
//            this.ASV2014_5487 = _arg1;
//        }
//
//        public function get os():String
//        {
//            return (this.ASV2014_5488);
//        }
//
//        public function set os(_arg1:String):void
//        {
//            this.ASV2014_5488 = _arg1;
//        }
//
//        public function get playerType():String
//        {
//            return (this.ASV2014_5489);
//        }
//
//        public function set playerType(_arg1:String):void
//        {
//            this.ASV2014_5489 = _arg1;
//        }
//
//        public function get screenResolutionX():int
//        {
//            return (this.ASV2014_5490);
//        }
//
//        public function set screenResolutionX(_arg1:int):void
//        {
//            this.ASV2014_5490 = _arg1;
//        }
//
//        public function get screenResolutionY():int
//        {
//            return (this.ASV2014_5491);
//        }
//
//        public function set screenResolutionY(_arg1:int):void
//        {
//            this.ASV2014_5491 = _arg1;
//        }
//
//        public function get version():String
//        {
//            return (this._version);
//        }
//
//        public function set version(_arg1:String):void
//        {
//            this._version = _arg1;
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
// ASV2014_532 = "]\"," (String#9358)
// ASV2014_5485 = ";\"u" (String#17977)
// ASV2014_5486 = "##o" (String#15781)
// ASV2014_5487 = "3!C" (String#15714)
// ASV2014_5488 = ";#N" (String#18018)
// ASV2014_5489 = "]u" (String#16176)
// ASV2014_5490 = "+#A" (String#16368)
// ASV2014_5491 = "=!_" (String#18902)
//