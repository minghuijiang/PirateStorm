package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class MoveRequestMessage extends Message{

	public static final int id = 1016;
	public int posX;
	public int posY;

	public MoveRequestMessage(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.posX = data.readShort();
		this.posY = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeShort(this.posX);
		data.writeShort(this.posY);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new MoveRequestMessage(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_502 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1016;
//
//        private var ASV2014_4037:int;
//        private var ASV2014_4038:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4037 = _arg1.readShort();
//            this.ASV2014_4038 = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeShort(this.ASV2014_4037);
//            _arg1.writeShort(this.ASV2014_4038);
//        }
//
//        public function get posX():int
//        {
//            return (this.ASV2014_4037);
//        }
//
//        public function set posX(_arg1:int):void
//        {
//            this.ASV2014_4037 = _arg1;
//        }
//
//        public function get posY():int
//        {
//            return (this.ASV2014_4038);
//        }
//
//        public function set posY(_arg1:int):void
//        {
//            this.ASV2014_4038 = _arg1;
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
// ASV2014_4037 = "\"B" (String#1842)
// ASV2014_4038 = "\"#m" (String#1847)
// ASV2014_502 = "<!R" (String#13365)
//