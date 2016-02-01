package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_151 extends Message{

	public static final int id = 1395;
	public int _teamId;
	public String _leader;
	public int _foundationDate;
	public int _currentRank;
	public int _maxRank;
	public int ASV2014_3856;
	public int weeklyPlayedMatches;
	public int weeklyWonMatches;
	public int seasonalPlayedMatches;
	public int seasonalWonMatches;
	public int overallPlayedMatches;
	public int overallWonMatches;

	public ASV2014_151(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._teamId = data.readInt();
		this._leader = data.readUTF();
		this._foundationDate = data.readInt();
		this._currentRank = data.readInt();
		this._maxRank = data.readInt();
		this.ASV2014_3856 = data.readShort();
		this.weeklyPlayedMatches = data.readShort();
		this.weeklyWonMatches = data.readShort();
		this.seasonalPlayedMatches = data.readShort();
		this.seasonalWonMatches = data.readShort();
		this.overallPlayedMatches = data.readInt();
		this.overallWonMatches = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._teamId);
		data.writeUTF(this._leader);
		data.writeInt(this._foundationDate);
		data.writeInt(this._currentRank);
		data.writeInt(this._maxRank);
		data.writeShort(this.ASV2014_3856);
		data.writeShort(this.weeklyPlayedMatches);
		data.writeShort(this.weeklyWonMatches);
		data.writeShort(this.seasonalPlayedMatches);
		data.writeShort(this.seasonalWonMatches);
		data.writeInt(this.overallPlayedMatches);
		data.writeInt(this.overallWonMatches);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_151(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_151 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1395;
//
//        private var _teamId:int;
//        private var _leader:String;
//        private var _foundationDate:int;
//        private var _currentRank:int;
//        private var _maxRank:int;
//        private var ASV2014_3849:int;
//        private var ASV2014_3850:int;
//        private var ASV2014_3851:int;
//        private var ASV2014_3852:int;
//        private var ASV2014_3853:int;
//        private var ASV2014_3854:int;
//        private var ASV2014_3855:int;
//
//        public function ASV2014_151()
//        {
//            this.leader = "";
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._teamId = _arg1.readInt();
//            this._leader = _arg1.readUTF();
//            this._foundationDate = _arg1.readInt();
//            this._currentRank = _arg1.readInt();
//            this._maxRank = _arg1.readInt();
//            this.ASV2014_3849 = _arg1.readShort();
//            this.ASV2014_3850 = _arg1.readShort();
//            this.ASV2014_3851 = _arg1.readShort();
//            this.ASV2014_3852 = _arg1.readShort();
//            this.ASV2014_3853 = _arg1.readShort();
//            this.ASV2014_3854 = _arg1.readInt();
//            this.ASV2014_3855 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._teamId);
//            _arg1.writeUTF(this._leader);
//            _arg1.writeInt(this._foundationDate);
//            _arg1.writeInt(this._currentRank);
//            _arg1.writeInt(this._maxRank);
//            _arg1.writeShort(this.ASV2014_3849);
//            _arg1.writeShort(this.ASV2014_3850);
//            _arg1.writeShort(this.ASV2014_3851);
//            _arg1.writeShort(this.ASV2014_3852);
//            _arg1.writeShort(this.ASV2014_3853);
//            _arg1.writeInt(this.ASV2014_3854);
//            _arg1.writeInt(this.ASV2014_3855);
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
//        public function get leader():String
//        {
//            return (this._leader);
//        }
//
//        public function set leader(_arg1:String):void
//        {
//            this._leader = _arg1;
//        }
//
//        public function get foundationDate():int
//        {
//            return (this._foundationDate);
//        }
//
//        public function set foundationDate(_arg1:int):void
//        {
//            this._foundationDate = _arg1;
//        }
//
//        public function get currentRank():int
//        {
//            return (this._currentRank);
//        }
//
//        public function set currentRank(_arg1:int):void
//        {
//            this._currentRank = _arg1;
//        }
//
//        public function get maxRank():int
//        {
//            return (this._maxRank);
//        }
//
//        public function set maxRank(_arg1:int):void
//        {
//            this._maxRank = _arg1;
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
//        public function get weeklyPlayedMatches():int
//        {
//            return (this.ASV2014_3850);
//        }
//
//        public function set weeklyPlayedMatches(_arg1:int):void
//        {
//            this.ASV2014_3850 = _arg1;
//        }
//
//        public function get weeklyWonMatches():int
//        {
//            return (this.ASV2014_3851);
//        }
//
//        public function set weeklyWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3851 = _arg1;
//        }
//
//        public function get seasonalPlayedMatches():int
//        {
//            return (this.ASV2014_3852);
//        }
//
//        public function set seasonalPlayedMatches(_arg1:int):void
//        {
//            this.ASV2014_3852 = _arg1;
//        }
//
//        public function get seasonalWonMatches():int
//        {
//            return (this.ASV2014_3853);
//        }
//
//        public function set seasonalWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3853 = _arg1;
//        }
//
//        public function get overallPlayedMatches():int
//        {
//            return (this.ASV2014_3854);
//        }
//
//        public function set overallPlayedMatches(_arg1:int):void
//        {
//            this.ASV2014_3854 = _arg1;
//        }
//
//        public function get overallWonMatches():int
//        {
//            return (this.ASV2014_3855);
//        }
//
//        public function set overallWonMatches(_arg1:int):void
//        {
//            this.ASV2014_3855 = _arg1;
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
// ASV2014_151 = "=!I" (String#8425)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3849 = "%\"," (String#8918)
// ASV2014_3850 = "5\"p" (String#8392)
// ASV2014_3851 = "4P" (String#9012)
// ASV2014_3852 = "^#9" (String#5985)
// ASV2014_3853 = "!#T" (String#5721)
// ASV2014_3854 = ",!I" (String#5915)
// ASV2014_3855 = "!8" (String#4551)
// ASV2014_3856 = "]\"2" (String#14123)
//