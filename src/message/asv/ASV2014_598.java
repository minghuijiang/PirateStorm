package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_598 extends Message{

	public static final int id = 1240;
	public int ASV2014_4374;
	public Message _stats;

	public ASV2014_598(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.ASV2014_4374 = data.readInt();
		this._stats = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.ASV2014_4374);
		component.ClientSocket.writeMessage(this._stats, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_598(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_598 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1240;
//
//        private var ASV2014_5667:int;
//        private var _stats:ASV2014_30;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5667 = _arg1.readInt();
//            this._stats = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_5667);
//            ASV2014_229.writeMessage(this._stats, _arg1);
//        }
//
//        public function get ASV2014_4374():int
//        {
//            return (this.ASV2014_5667);
//        }
//
//        public function set ASV2014_4374(_arg1:int):void
//        {
//            this.ASV2014_5667 = _arg1;
//        }
//
//        public function get stats():ASV2014_30
//        {
//            return (this._stats);
//        }
//
//        public function set stats(_arg1:ASV2014_30):void
//        {
//            this._stats = _arg1;
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
// ASV2014_4374 = "0!Q" (String#10631)
// ASV2014_5667 = ",!C" (String#11061)
// ASV2014_598 = "3!;" (String#6624)
//