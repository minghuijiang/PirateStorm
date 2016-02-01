package component;

import message.asv.DoBidMessage;

public class BidRunnable implements Runnable {

	private long stopTime;
	private boolean isRunning;
	private int bidID;
	private User user;
	public BidRunnable(int time,int bidID,User user) {
		stopTime = System.currentTimeMillis()+time*1000;
		isRunning=true;
		this.bidID = bidID;
		this.user = user;
		new Thread(this).start();
	//	this.run();
		
	}

	@Override
	public void run() {
		while((stopTime-System.currentTimeMillis())>1500&&user.isAlive){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(show){
				user.log("ID:  "+bidID+"  StopTime: "+stopTime+" ");
				show = false;
			}
		}
		user.send(new DoBidMessage(user, bidID));
		isRunning = false;
	}

	/**
	 * @return the stopTime
	 */
	public long getStopTime() {
		return stopTime;
	}

	/**
	 * @return the isRunning
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * @return the bidID
	 */
	public int getBidID() {
		return bidID;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	private boolean show = false;
	/**
	 * @param stopTime the stopTime to set
	 */
	public void setStopTime(int stopTime) {
		user.log("Bid setTime: "+stopTime+"  id:"+bidID);
		show = true;
		this.stopTime = System.currentTimeMillis()+stopTime*1000;
	}

	/**
	 * @param isRunning the isRunning to set
	 */
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	/**
	 * @param bidID the bidID to set
	 */
	public void setBidID(int bidID) {
		this.bidID = bidID;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	
	public void start(){
		if(!isRunning){
			isRunning= true;
			new Thread(this).start();
		}
	}
}
