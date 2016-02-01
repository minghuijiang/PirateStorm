package component;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

import message.asv.StaticObjectMessage;

public class FixedObject extends Drawable {

	public static int radius = 10;
	private Location location;
	private int id, type;
	
	public FixedObject(StaticObjectMessage msg) {
		id = msg.objectId;
		type = msg.objectType;
		location = new Location(msg.posX, msg.posY);
	}

	@Override
	public void draw(Graphics2D graphic) {
		graphic.fillOval(location.getX()-10, location.getY()-10, 20, 20);
	}

}
