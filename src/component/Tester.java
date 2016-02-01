package component;

import message.HarbourArrivalMessage;
import message.HarbourDepartureMessage;
import message.MatchUserReadyMessage;
import message.Message;
import message.asv.ASV2014_452;
import message.asv.DoBidMessage;
import message.asv.HardWareTracking;
import message.asv.InitRepairMessage;
import message.asv.RequestAuction;
import message.asv.ReviveMsg;

public class Tester {
	static{
		com.mingJiang.log.Logging.initLogger();
	}
	
	public static void main(String [] args) throws InterruptedException{
		User[] users = { // old
				new User(635659, "c8981acdb56825cce97870780d771ced"), //jack 5
				new User(635655, "e59baf8f57c02785b0c2442b0bcd0776"), //jack4
				new User(635653, "c1e96f51d1fe15513ad84d435d298c2f"), //jack 3
				new User(635649, "7aec3b36cead6e54c7a68636bf3ac3ea"), // jack 2
				new User(635644, "7b47c1a589e19b9dee4cd492a7132554"),
				
				new User(636109, "c7396d3b117046b80fac60a721bc51a1"), //jack 11
				new User(636070, "1ae5f674fbf41db4491869c051f4a91a"), //jack 10
				new User(636065, "9e155ee9f12815b716c005557973719e"), //jack 9
				new User(636077, "fab6ac87ece135406894f7c918a78392"), //jack8
				new User(636056, "e32b513f81d9c2be733c6087adbee4b3"), //jack 7
				new User(636054, "c8704925136625a4c4114c70e8c1fb3f"), // jack 6
		};
		
		ClientSocket.showSocket= !true;
		for(User u: users)
			runUser(u);
	}
	
	public static void runUser(final User user) throws InterruptedException{


		user.login();
//		user.isBG=true;
		user.doBid =false;
		user.pick=false;
		user.showLog = false;
		user.revive();

		if(user.doBid){
			user.send(new RequestAuction(user));
			for(int i: user.bidItem)
				user.send(new DoBidMessage(user,i));
		}
		
		new Thread(){
			public void run(){
				while(user.isAlive){
					Main.sleep(200);
					Main.moveNext(user);
					Main.checkBlood(user,9500);
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(user.isAlive){
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(user.hp<1000&&user.isBotting()){
						//user.revive();
						user.moveTo(1200, 1200);
					}else{
						user.keepMove = false;
						Main.getLoot(user);
					//	if(user.isBuffered(84))
						Main.fight(user);
						user.keepMove = true;
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				int c =10;
				while(user.isAlive){
					if(c++%10==0){
						for(Message m: Main.msgs)
							user.send(m);
						user.revive();
						user.useItem(19);//silver
					}
					if(user.isBotting())
						for(Message m: Main.Skillmsgs)
							user.send(m);
					
					Main.sleep(10000);
					
					
				}
			}
		}.start();
//		user.send(new HarbourDepartureMessage(user));
//		user.send(new HardWareTracking(user));
//		user.send(new ASV2014_452(user));
//		Thread.sleep(1000);
//		int dx = 1;
//		while(true){
//			user.send(		new MatchUserReadyMessage(null,1));
//			Thread.sleep(200);
//			Main.checkBlood(user,10000);
//			user.send(new HarbourArrivalMessage(user));
//			Main.fight(user);
//			Main.getLoot(user);
//			Main.moveNext(user);
//		}
	
	}

}
