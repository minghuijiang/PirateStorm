package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class DataInfo extends Message{

	public static final int id = 1067;
	public int currentXp;
	public int nextXp;
	public int prevXp;
	public int _gold;
	public int ASV2014_2930;
	public int ASV2014_2931;
	public int victoryToken;
	public int _viewDistance;

	public DataInfo(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this.currentXp = data.readInt();
		this.nextXp = data.readInt();
		this.prevXp = data.readInt();
		this._gold = data.readInt();
		this.ASV2014_2930 = data.readInt();
		this.ASV2014_2931 = data.readInt();
		this.victoryToken = data.readInt();
		this._viewDistance = data.readShort();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.currentXp);
		data.writeInt(this.nextXp);
		data.writeInt(this.prevXp);
		data.writeInt(this._gold);
		data.writeInt(this.ASV2014_2930);
		data.writeInt(this.ASV2014_2931);
		data.writeInt(this.victoryToken);
		data.writeShort(this._viewDistance);
	}

	public void action(){
		user.gold=_gold;
		user.exp = currentXp;
		user.dimond= ASV2014_2930;
		user.setMsg(String.format("HP: %-5d G: %-10d D: %-7d F: %-4d E: %-10d L: %-4d DN: %-4d", 
				user.hp,user.gold,user.dimond,user.freeDive,user.exp,user.lootNum,user.destoryNum));
//		user.setMsg("HP: "+user.hp+" G: "+user.gold+" D: "+user.dimond+" F: "+user.freeDive+
//				" E: "+user.exp +" NE: "+nextXp+" "+" L: "+user.lootNum+" DN: "+user.destoryNum);
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new DataInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_1067 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1067;
//
//        private var ASV2014_3970:int;
//        private var ASV2014_6384:int;
//        private var ASV2014_6385:int;
//        private var _gold:int;
//        private var ASV2014_2906:int;
//        private var ASV2014_2907:int;
//        private var ASV2014_2908:int;
//        private var _viewDistance:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_3970 = _arg1.readInt();
//            this.ASV2014_6384 = _arg1.readInt();
//            this.ASV2014_6385 = _arg1.readInt();
//            this._gold = _arg1.readInt();
//            this.ASV2014_2906 = _arg1.readInt();
//            this.ASV2014_2907 = _arg1.readInt();
//            this.ASV2014_2908 = _arg1.readInt();
//            this._viewDistance = _arg1.readShort();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_3970);
//            _arg1.writeInt(this.ASV2014_6384);
//            _arg1.writeInt(this.ASV2014_6385);
//            _arg1.writeInt(this._gold);
//            _arg1.writeInt(this.ASV2014_2906);
//            _arg1.writeInt(this.ASV2014_2907);
//            _arg1.writeInt(this.ASV2014_2908);
//            _arg1.writeShort(this._viewDistance);
//        }
//
//        public function get currentXp():int
//        {
//            return (this.ASV2014_3970);
//        }
//
//        public function set currentXp(_arg1:int):void
//        {
//            this.ASV2014_3970 = _arg1;
//        }
//
//        public function get nextXp():int
//        {
//            return (this.ASV2014_6384);
//        }
//
//        public function set nextXp(_arg1:int):void
//        {
//            this.ASV2014_6384 = _arg1;
//        }
//
//        public function get prevXp():int
//        {
//            return (this.ASV2014_6385);
//        }
//
//        public function set prevXp(_arg1:int):void
//        {
//            this.ASV2014_6385 = _arg1;
//        }
//
//        public function get gold():int
//        {
//            return (this._gold);
//        }
//
//        public function set gold(_arg1:int):void
//        {
//            this._gold = _arg1;
//        }
//
//        public function get ASV2014_2930():int
//        {
//            return (this.ASV2014_2906);
//        }
//
//        public function set ASV2014_2930(_arg1:int):void
//        {
//            this.ASV2014_2906 = _arg1;
//        }
//
//        public function get ASV2014_2931():int
//        {
//            return (this.ASV2014_2907);
//        }
//
//        public function set ASV2014_2931(_arg1:int):void
//        {
//            this.ASV2014_2907 = _arg1;
//        }
//
//        public function get victoryToken():int
//        {
//            return (this.ASV2014_2908);
//        }
//
//        public function set victoryToken(_arg1:int):void
//        {
//            this.ASV2014_2908 = _arg1;
//        }
//
//        public function get viewDistance():int
//        {
//            return (this._viewDistance);
//        }
//
//        public function set viewDistance(_arg1:int):void
//        {
//            this._viewDistance = _arg1;
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
// ASV2014_1067 = "8#-" (String#9106)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_2906 = "+>" (String#6388)
// ASV2014_2907 = "-0" (String#9721)
// ASV2014_2908 = "7!a" (String#10009)
// ASV2014_2930 = "'\"#" (String#8427)
// ASV2014_2931 = "#<" (String#12899)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3970 = "8>" (String#10456)
// ASV2014_6384 = "49" (String#18479)
// ASV2014_6385 = "\"#U" (String#16876)
//