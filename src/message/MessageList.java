package message;

import java.util.ArrayList;
import java.util.List;

import com.mingJiang.as.ByteArray;
import component.User;
import component.ClientSocket;

public class MessageList extends Message {

	public static final int id = 0;

	public List<Message> list = new ArrayList<Message>();

	public MessageList(User user) {
		super(user);
	}

	public void deserialize(ByteArray data) {
		int num = data.readShort();
		while (num-- > 0)
			this.list.add(ClientSocket.readMessage(data,user));
	}

	public void serialize(ByteArray data) {
		data.writeShort(this.list.size());
		for (Message message : list)
			ClientSocket.writeMessage(message, data);
		
	}

	public void action(){
		
	}

	public int getID() {
		return id;
	}

	public Message getInstance(User user) {
		return new MessageList(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import __AS3__.vec.Vector;
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//    import flash.utils.getQualifiedClassName;
//    import __AS3__.vec.*;
//
//    public class ASV2014_194 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 0;
//
//        private var _list:Vector.<ASV2014_30>;
//
//        public function ASV2014_194()
//        {
//            this._list = new Vector.<ASV2014_30>();
//            super();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            var _local2:int = _arg1.readShort();
//            this.list.length = 0;
//            var _local3:int;
//            while (_local3 < _local2)
//            {
//                this.list.push(ASV2014_229.ASV2014_3049(_arg1));
//                _local3++;
//            };
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            var _local2:ASV2014_30;
//            _arg1.writeShort(this.list.length);
//            for each (_local2 in this.list)
//            {
//                ASV2014_229.writeMessage(_local2, _arg1);
//            };
//        }
//
//        public function toString():String
//        {
//            var _local3:ASV2014_30;
//            var _local4:String;
//            var _local1 = "{";
//            var _local2:int;
//            for each (_local3 in this.list)
//            {
//                _local4 = getQualifiedClassName(_local3);
//                _local4 = _local4.substr((_local4.lastIndexOf(":") + 1), _local4.length);
//                _local1 = (_local1 + ((_local4 + "ASV2014_1754") + _local3));
//                if (_local2++ < this.list.length)
//                {
//                    _local1 = (_local1 + "] ");
//                };
//            };
//            return ((_local1 + "}"));
//        }
//
//        public function get list():Vector.<ASV2014_30>
//        {
//            return (this._list);
//        }
//
//        public function set list(_arg1:Vector.<ASV2014_30>):void
//        {
//            this._list = _arg1;
//        }
//
//
//    }
//}//package net.bigpoint.network.messages
//
// ASV2014_1754 = " [" (String#1367)
// ASV2014_194 = "[#c" (String#138)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
//