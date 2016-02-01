package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class ProfileEditRequest extends Message{

	public static final int id = 1206;
	public String guildText;
	public MessageList types;

	public ProfileEditRequest(User user) {
		super(user);
		types = new MessageList(user);
	}

	public void deserialize(ByteArray data){
		this.guildText = data.readUTF();
		this.types.deserialize(data);
	}

	public void serialize(ByteArray data){
		data.writeUTF(this.guildText);
		this.types.serialize(data);
	}

	public void action(){
		
	}

	public int getID(){
		return id;
	}

	public Message getInstance(User user) {
		return new ProfileEditRequest(user);
	}

}

//﻿//Created by Action Script Viewer - http://www.buraks.com/asv
//package net.bigpoint.network.messages
//{
//    import flash.utils.IDataInput;
//    import flash.utils.IDataOutput;
//
//    public class ASV2014_684 implements ASV2014_30 
//    {
//
//        public static const ASV2014_2337:int = 1206;
//
//        private var ASV2014_5791:String;
//        private var ASV2014_5792:ASV2014_194;
//
//        public function ASV2014_684()
//        {
//            this.ASV2014_5792 = new ASV2014_194();
//            super();
//            this.guildText = "";
//            this.types = new ASV2014_194();
//        }
//
//        public function get id():int
//        {
//            return (ASV2014_2337);
//        }
//
//        public function deserialize(_arg1:IDataInput):void
//        {
//            this.ASV2014_5791 = _arg1.readUTF();
//            this.ASV2014_5792.deserialize(_arg1);
//        }
//
//        public function ASV2014_2336(_arg1:IDataOutput):void
//        {
//            _arg1.writeUTF(this.ASV2014_5791);
//            this.ASV2014_5792.ASV2014_2336(_arg1);
//        }
//
//        public function get guildText():String
//        {
//            return (this.ASV2014_5791);
//        }
//
//        public function set guildText(_arg1:String):void
//        {
//            this.ASV2014_5791 = _arg1;
//        }
//
//        public function get types():ASV2014_194
//        {
//            return (this.ASV2014_5792);
//        }
//
//        public function set types(_arg1:ASV2014_194):void
//        {
//            this.ASV2014_5792 = _arg1;
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
// ASV2014_5791 = "7#f" (String#4406)
// ASV2014_5792 = "8t" (String#4844)
// ASV2014_684 = "5S" (String#10236)
//