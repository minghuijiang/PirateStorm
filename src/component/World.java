package component;

import java.util.ArrayList;
import java.util.List;


public class World{

	private User user;
	private List<Drawable> fixedObject;
	public World(User user) {
		this.user = user;
		fixedObject = new ArrayList<Drawable>();
	}
	
	
	public synchronized void addStaticObject(FixedObject obj){
		fixedObject.add(obj);
	}

}
