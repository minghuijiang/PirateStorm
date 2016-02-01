package component;

import message.LootInfo;

public class Loot {
	
	private Location location;
	private int id;

	
	public Loot(LootInfo info){
		this(info.objectId, info.posX, info.posY);
	}
	
	public Loot(int id, int x, int y) {
		this.id= id;
		location = new Location(x, y);
	}


	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
