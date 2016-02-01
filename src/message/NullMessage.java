package message;

import com.mingJiang.as.ByteArray;
import component.User;

public class NullMessage extends Message{

	public NullMessage(User user) {
		super(user);
	}
	
	@Override
	public void deserialize(ByteArray data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serialize(ByteArray data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}


	public void action(){
		
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public Message getInstance(User user) {
		// TODO Auto-generated method stub
		return new NullMessage(user);
	}

}