package message.asv;

import message.Message;
import com.mingJiang.as.ByteArray;
import component.User;

public class ASV2014_170 extends Message{

	public static final int id = 1404;
	public int _userId;
	public int _teamId;
	public int joinDate;
	public int weeklyTeamMatchCount;
	public int weeklyPlayedMatches;
	public int weeklyWonMatches;
	public int weeklyQuitMatches;
	public int seasonalTeamMatchCount;
	public int seasonalPlayedMatches;
	public int seasonalWonMatches;
	public int seasonalQuitMatches;
	public int overallPlayedMatches;
	public int overallWonMatches;
	public int overallQuitMatches;

	public ASV2014_170(User user) {
		super(user);
	}

	public void deserialize(ByteArray data){
		this._userId = data.readInt();
		this._teamId = data.readInt();
		this.joinDate = data.readInt();
		this.weeklyTeamMatchCount = data.readShort();
		this.weeklyPlayedMatches = data.readShort();
		this.weeklyWonMatches = data.readShort();
		this.weeklyQuitMatches = data.readShort();
		this.seasonalTeamMatchCount = data.readShort();
		this.seasonalPlayedMatches = data.readShort();
		this.seasonalWonMatches = data.readShort();
		this.seasonalQuitMatches = data.readShort();
		this.overallPlayedMatches = data.readInt();
		this.overallWonMatches = data.readInt();
		this.overallQuitMatches = data.readInt();
	}

	public void serialize(ByteArray data){
		data.writeInt(this._userId);
		data.writeInt(this._teamId);
		data.writeInt(this.joinDate);
		data.writeShort(this.weeklyTeamMatchCount);
		data.writeShort(this.weeklyPlayedMatches);
		data.writeShort(this.weeklyWonMatches);
		data.writeShort(this.weeklyQuitMatches);
		data.writeShort(this.seasonalTeamMatchCount);
		data.writeShort(this.seasonalPlayedMatches);
		data.writeShort(this.seasonalWonMatches);
		data.writeShort(this.seasonalQuitMatches);
		data.writeInt(this.overallPlayedMatches);
		data.writeInt(this.overallWonMatches);
		data.writeInt(this.overallQuitMatches);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ASV2014_170(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_170 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1404;
//
//        private var _userId:int;
//        private var _teamId:int;
//        private var ASV2014_3894:int;
//        private var ASV2014_3895:int;
//        private var ASV2014_3850:int;
//        private var ASV2014_3851:int;
//        private var ASV2014_3896:int;
//        private var ASV2014_3897:int;
//        private var ASV2014_3852:int;
//        private var ASV2014_3853:int;
//        private var ASV2014_3898:int;
//        private var ASV2014_3854:int;
//        private var ASV2014_3855:int;
//        private var ASV2014_3899:int;
//
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this._userId = _arg1.readInt();
//            this._teamId = _arg1.readInt();
//            this.ASV2014_3894 = _arg1.readInt();
//            this.ASV2014_3895 = _arg1.readShort();
//            this.ASV2014_3850 = _arg1.readShort();
//            this.ASV2014_3851 = _arg1.readShort();
//            this.ASV2014_3896 = _arg1.readShort();
//            this.ASV2014_3897 = _arg1.readShort();
//            this.ASV2014_3852 = _arg1.readShort();
//            this.ASV2014_3853 = _arg1.readShort();
//            this.ASV2014_3898 = _arg1.readShort();
//            this.ASV2014_3854 = _arg1.readInt();
//            this.ASV2014_3855 = _arg1.readInt();
//            this.ASV2014_3899 = _arg1.readInt();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this._userId);
//            _arg1.writeInt(this._teamId);
//            _arg1.writeInt(this.ASV2014_3894);
//            _arg1.writeShort(this.ASV2014_3895);
//            _arg1.writeShort(this.ASV2014_3850);
//            _arg1.writeShort(this.ASV2014_3851);
//            _arg1.writeShort(this.ASV2014_3896);
//            _arg1.writeShort(this.ASV2014_3897);
//            _arg1.writeShort(this.ASV2014_3852);
//            _arg1.writeShort(this.ASV2014_3853);
//            _arg1.writeShort(this.ASV2014_3898);
//            _arg1.writeInt(this.ASV2014_3854);
//            _arg1.writeInt(this.ASV2014_3855);
//            _arg1.writeInt(this.ASV2014_3899);
//        }
//
//        public function get userId():int
//        {
//            return (this._userId);
//        }
//
//        public function set userId(_arg1:int):void
//        {
//            this._userId = _arg1;
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
//        public function get joinDate():int
//        {
//            return (this.ASV2014_3894);
//        }
//
//        public function set joinDate(_arg1:int):void
//        {
//            this.ASV2014_3894 = _arg1;
//        }
//
//        public function get weeklyTeamMatchCount():int
//        {
//            return (this.ASV2014_3895);
//        }
//
//        public function set weeklyTeamMatchCount(_arg1:int):void
//        {
//            this.ASV2014_3895 = _arg1;
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
//        public function get weeklyQuitMatches():int
//        {
//            return (this.ASV2014_3896);
//        }
//
//        public function set weeklyQuitMatches(_arg1:int):void
//        {
//            this.ASV2014_3896 = _arg1;
//        }
//
//        public function get seasonalTeamMatchCount():int
//        {
//            return (this.ASV2014_3897);
//        }
//
//        public function set seasonalTeamMatchCount(_arg1:int):void
//        {
//            this.ASV2014_3897 = _arg1;
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
//        public function get seasonalQuitMatches():int
//        {
//            return (this.ASV2014_3898);
//        }
//
//        public function set seasonalQuitMatches(_arg1:int):void
//        {
//            this.ASV2014_3898 = _arg1;
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
//        public function get overallQuitMatches():int
//        {
//            return (this.ASV2014_3899);
//        }
//
//        public function set overallQuitMatches(_arg1:int):void
//        {
//            this.ASV2014_3899 = _arg1;
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
// ASV2014_170 = "2\"4" (String#8267)
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_3850 = "5\"p" (String#8392)
// ASV2014_3851 = "4P" (String#9012)
// ASV2014_3852 = "^#9" (String#5985)
// ASV2014_3853 = "!#T" (String#5721)
// ASV2014_3854 = ",!I" (String#5915)
// ASV2014_3855 = "!8" (String#4551)
// ASV2014_3894 = "^!" (String#18595)
// ASV2014_3895 = "6\"L" (String#18928)
// ASV2014_3896 = "<#`" (String#17044)
// ASV2014_3897 = "`\"O" (String#16531)
// ASV2014_3898 = "&\"$" (String#18398)
// ASV2014_3899 = "1!]" (String#18373)
//