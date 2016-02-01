package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_1447 extends Message{

	public static final int id = 1032;
	public int questId;
	public int _groupId;
	public int ASV2014_6595;
	public int _pid;
	public Message ASV2014_6596;

	public ASV2014_1447(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this._groupId = data.readInt();
		this.ASV2014_6595 = data.readInt();
		this._pid = data.readInt();
		this.ASV2014_6596 = component.ClientSocket.readMessage(data,user);
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		data.writeInt(this._groupId);
		data.writeInt(this.ASV2014_6595);
		data.writeInt(this._pid);
		component.ClientSocket.writeMessage(this.ASV2014_6596, data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_1447(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import _N3_.ASV2014_229;
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1447 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1032;
//
//        private var ASV2014_4731:int;
//        private var _groupId:int;
//        private var ASV2014_6593:int;
//        private var _pid:int;
//        private var ASV2014_6594:ASV2014_30;
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
//            this._groupId = _arg1.readInt();
//            this.ASV2014_6593 = _arg1.readInt();
//            this._pid = _arg1.readInt();
//            this.ASV2014_6594 = (ASV2014_229.ASV2014_3049(_arg1) as ASV2014_30);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            _arg1.writeInt(this._groupId);
//            _arg1.writeInt(this.ASV2014_6593);
//            _arg1.writeInt(this._pid);
//            ASV2014_229.writeMessage(this.ASV2014_6594, _arg1);
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
//        public function get groupId():int
//        {
//            return (this._groupId);
//        }
//
//        public function set groupId(_arg1:int):void
//        {
//            this._groupId = _arg1;
//        }
//
//        public function get ASV2014_6595():int
//        {
//            return (this.ASV2014_6593);
//        }
//
//        public function set ASV2014_6595(_arg1:int):void
//        {
//            this.ASV2014_6593 = _arg1;
//        }
//
//        public function get pid():int
//        {
//            return (this._pid);
//        }
//
//        public function set pid(_arg1:int):void
//        {
//            this._pid = _arg1;
//        }
//
//        public function get ASV2014_6596():ASV2014_30
//        {
//            return (this.ASV2014_6594);
//        }
//
//        public function set ASV2014_6596(_arg1:ASV2014_30):void
//        {
//            this.ASV2014_6594 = _arg1;
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
// ASV2014_1447 = "9!`" (String#20168)
// ASV2014_229 = "+\"?" (String#1073)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3049 = "7#6" (String#2070)
// ASV2014_4731 = "!!C" (String#1122)
// ASV2014_6593 = ">H" (String#18907)
// ASV2014_6594 = "`!R" (String#16562)
// ASV2014_6595 = "<!f" (String#34046)
// ASV2014_6596 = "8!&" (String#30863)
//