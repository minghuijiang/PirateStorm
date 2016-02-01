package component;

public class Location {

	private int x,y;
	
	public Location(int x, int y) {
		this.x= x;
		this.y=y;
	}

	public double distanceFrom(Location to){
		return Math.sqrt(Math.pow(to.x-x, 2)+Math.pow(to.y-y, 2));
	}
	
	public Location deepInto(Location to, int length){
		return deepInto(to, length, distanceFrom(to));
	}
	
	
	public Location deepInto(Location to, int length, double totalDistance){
		double factor = (double)length/totalDistance;
		if(factor>=1)
			return new Location(to.getX(), to.getY());
		return new Location((int)((to.x-x)*factor+x), (int)((to.y-y)*factor+y));
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	public String toString(){
		return "["+x+", "+y+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Location){
			Location other = (Location) obj;
			return this.x==other.x&&this.y==other.y;
		}
		return false;
	}
}
