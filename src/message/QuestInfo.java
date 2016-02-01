package message;

import com.mingJiang.as.ByteArray;

import component.User;

public class QuestInfo extends Message{

	public static final int id = 1141;
	public int questId;
	public MessageList tasks;
	public MessageList _rewards;
	public int _status;
	public MessageList fromQuestGiver;
	public MessageList _progress;
	public int iconGraphicId;

	public QuestInfo(User user) {
		super(user);
		_progress = new MessageList(user);
		fromQuestGiver = new MessageList(user);
		_rewards = new MessageList(user);
		tasks = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.questId = data.readInt();
		this.tasks.deserialize(data);
		this._rewards.deserialize(data);
		this._status = data.readByte();
		this.fromQuestGiver.deserialize(data);
		this._progress.deserialize(data);
		this.iconGraphicId = data.readByte();
	}

	public void serialize(ByteArray data){
		data.writeInt(this.questId);
		this.tasks.serialize(data);
		this._rewards.serialize(data);
		data.writeByte(this._status);
		this.fromQuestGiver.serialize(data);
		this._progress.serialize(data);
		data.writeByte(this.iconGraphicId);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new QuestInfo(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_565 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1141;
//
//        private var ASV2014_4731:int;
//        private var ASV2014_5592:ASV2014_194;
//        private var _rewards:ASV2014_194;
//        private var _status:int;
//        private var ASV2014_5593:ASV2014_194;
//        private var _progress:ASV2014_194;
//        private var ASV2014_5594:int;
//
//        public function ASV2014_565()
//        {
//            this.ASV2014_5592 = new ASV2014_194();
//            this._rewards = new ASV2014_194();
//            this.ASV2014_5593 = new ASV2014_194();
//            this._progress = new ASV2014_194();
//            super();
//            this.tasks = new ASV2014_194();
//            this.rewards = new ASV2014_194();
//            this.fromQuestGiver = new ASV2014_194();
//            this.progress = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_4731 = _arg1.readInt();
//            this.ASV2014_5592.deserialize(_arg1);
//            this._rewards.deserialize(_arg1);
//            this._status = _arg1.readByte();
//            this.ASV2014_5593.deserialize(_arg1);
//            this._progress.deserialize(_arg1);
//            this.ASV2014_5594 = _arg1.readByte();
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeInt(this.ASV2014_4731);
//            this.ASV2014_5592.ASV2014_2336(_arg1);
//            this._rewards.ASV2014_2336(_arg1);
//            _arg1.writeByte(this._status);
//            this.ASV2014_5593.ASV2014_2336(_arg1);
//            this._progress.ASV2014_2336(_arg1);
//            _arg1.writeByte(this.ASV2014_5594);
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
//        public function get tasks():ASV2014_194
//        {
//            return (this.ASV2014_5592);
//        }
//
//        public function set tasks(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5592 = _arg1;
//        }
//
//        public function get rewards():ASV2014_194
//        {
//            return (this._rewards);
//        }
//
//        public function set rewards(_arg1:ASV2014_194):void
//        {
//            this._rewards = _arg1;
//        }
//
//        public function get status():int
//        {
//            return (this._status);
//        }
//
//        public function set status(_arg1:int):void
//        {
//            this._status = _arg1;
//        }
//
//        public function get fromQuestGiver():ASV2014_194
//        {
//            return (this.ASV2014_5593);
//        }
//
//        public function set fromQuestGiver(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5593 = _arg1;
//        }
//
//        public function get progress():ASV2014_194
//        {
//            return (this._progress);
//        }
//
//        public function set progress(_arg1:ASV2014_194):void
//        {
//            this._progress = _arg1;
//        }
//
//        public function get iconGraphicId():int
//        {
//            return (this.ASV2014_5594);
//        }
//
//        public function set iconGraphicId(_arg1:int):void
//        {
//            this.ASV2014_5594 = _arg1;
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
// ASV2014_2336 = "6#m" (String#174)
// ASV2014_2337 = "7#R" (String#66)
// ASV2014_30 = ";#V" (String#144)
// ASV2014_4731 = "!!C" (String#1122)
// ASV2014_5592 = ">\"C" (String#8942)
// ASV2014_5593 = ",#e" (String#14241)
// ASV2014_5594 = "5\"g" (String#18664)
// ASV2014_565 = "]#\"" (String#7201)
//