package component;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

import message.LoginMessage;
import message.Message;
import message.NullMessage;

import com.mingJiang.as.ByteArray;
import com.mingJiang.gui.listener.ThreadAL;
import com.mingJiang.util.Util;

import data.Info;

public class ClientSocket {

	public Socket socket;
	public boolean isConnected;
	public boolean isAlive;
	private OutputStream output;
	private DataInputStream  input;
	public static final long ASV2014_4172 = 3735929054L;
	public static final int ASV2014_4173 = 11;
	public short sequenceNum=0;
	public User user;
	
	public ClientSocket(User user) {
		this.user = user;
	}

	  public void resetSocket(){
	        if(!isAlive){
	        	user.error(" socket 关闭. 退出");
	            return ;
	            
	        }
	        try {
	            isAlive= false;
	            user.error("重置socket,  等待10秒");
	            Thread.sleep(1000);
	            connect();
	        } catch (InterruptedException ex) {
	        }
	    }
	    
	    public void connect(){
	    	connect(true);
	    }
	    
	    public void connect(boolean needLogin) {
	        if (this.isAlive) {
	            user.error("socket already connected.");
	            return;
	        }

	        try {
	            isAlive= true;
	            
	            boolean connectFail = true;
	            while(connectFail){
	            	try{
	  
	            		this.socket = new Socket();
			            this.socket.connect(new InetSocketAddress(
			                    InetAddress.getByName(Info.host), Info.port));
			            connectFail = false;
			            isConnected=true;
	            	}catch(IOException e){
	            		user.log("connect fail- retry "+e.getMessage());
	            		try {
							Thread.sleep(System.currentTimeMillis()%15000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	            	}
	            }
	         //   this.registHeart(new PingReq(), 20000 + (int) (Math.random() * 10000));

	            onConnect();

	            if(needLogin){
	            	LoginMessage loginMessage = new LoginMessage(user);
	            	loginMessage._userId=user.userId;
	            	loginMessage.sessionId=user.session;
	            	sendMessage(loginMessage);
	            }
	        } catch (IOException e) {
	           // close();
	          //  connect();
	            user.log("socket io: "+e.getMessage());
	            resetSocket();
	        }
	        
	    }

	    protected void onConnect() throws IOException {
	        input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	        output = socket.getOutputStream();
	        this.startListen();
	    }

	    private void startListen() {
	        new Thread(user.userName+" Listener") {
	            @Override
	            public void run() {
	                while (isAlive) {
	                    try {
	                    	if(input.available()>0){
	                    		read();
	                    		if(!isConnected)
	                    			throw new EOFException();
	                    	}
	                    	Thread.sleep(50);
	                    } catch (EOFException eofe) {
	                        user.error("异地登陆");
	                        isAlive = false;
	                        user.isAlive = false;
	                        
	                    } catch (IOException e) {
	                        user.error("读取错误 "+e.getMessage());
	                        if(e.getMessage().equalsIgnoreCase("Connection reset"))
	                            resetSocket();
	                       if(e.getMessage().contains("Software caused connection abort")){
	                    	   resetSocket();
	                       }
	                            //resetSocket();
	                    } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

	                }
	                user.setMsg("Listener terminate");
	            }
	        }.start();
	    }
	    public void read() throws IOException {
	        ByteArray arr = null;
	      //  System.out.println(input.available());
	        int available = input.available();
	        byte[] tmp = new byte[available];
	        input.read(tmp);
	        arr = new ByteArray(tmp,ByteOrder.BIG_ENDIAN);
	        try{
	        	int  k = 0;
	        	while(arr.position()<available){
	        	//	int c = arr.position();
	        		
	        	//	System.out.println("pos: "+arr.position()+" ava:"+available);
			        Message message =readFromByteArray(arr, user);
			        if(showSocket&&showReceive){
			        	user.log(k+++" Received: "+System.currentTimeMillis()+"  "+message.getClass()+"\n"+message);
			        }
			     //   if(c!=0)
			      //  	user.log("Sub message: "+message.getClass());
	        	}
	        }catch(Exception e){
	        	System.out.println("readError"+e.getMessage());
	        	e.printStackTrace();
	        }
	    }
	    public void close() {
	        isAlive= false;
	        Util.close(input);
	        Util.close(output);
	        Util.close(socket);
	        input = null; output = null; socket = null;
	      //  Thread.currentThread().interrupt();
	    }
	
	    public static  boolean showSocket = !true;
	    public static boolean showSend= true;
	    public static boolean showReceive = false;
	    public void sendMessage(Message message) {
	        if (!isAlive) {
	            user.error("socket服务器无法链接，消息发送失败");
	            return;
	        }
	        if(showSocket&&showSend)
	        	user.log("send: "+message.getClass()+"\n"+message);
	        ByteArray array = generateData(message, sequenceNum++);
	        byte[] val = array.data();
	     //   Util.print(val);
	        this.send(val);
	    }

	    private synchronized boolean send(byte[] param1) {
	    	if(isAlive)
		        try {
		            this.output.write(param1);
		            this.output.flush();
		        } catch (IOException e) {
		            user.error("  " + e.getMessage());
		            int count = 0;
	
		            while (count++ < 5&&isAlive) {
		                try {
		                    Thread.sleep(System.currentTimeMillis()%5000);
		                    this.output.write(param1);
		                    return true;
		                } catch (IOException ex) {
		                    user.error("  " + e.getMessage());
		                    if(e.getMessage().contains("Software caused connection abort")){
		                    	   resetSocket();
		                       }
		                    if(e.getMessage().contains("Connection reset")){
		 	              	   resetSocket();
		 	                 }
		                } catch (InterruptedException ex) {
		                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
		                }
		            }
		           // resetSocket();
		          //  return user.getSocket().send(param1);
		        }catch(Exception e){
		        	user.log(e.getMessage());
		        	 if(e.getMessage().contains("Software caused connection abort")){
	              	   resetSocket();
	                 }
		        	 if(e.getMessage().contains("Connection reset")){
		              	   resetSocket();
		                 }
		        	return false;
		        }
	        return true;
	    }




	private static ByteArray generateData(Message message, int sequenceNum) {
		ByteArray messageByteArray = new ByteArray(1024,ByteOrder.BIG_ENDIAN);
		
        messageByteArray.writeUnsignedInt(ASV2014_4172);
        messageByteArray.writeShort(sequenceNum);
        messageByteArray.writeShort((short) 0);
        messageByteArray.writeByte(240);
        ByteArray data = new ByteArray(1024,ByteOrder.BIG_ENDIAN);
        writeMessage(message, data);
        byte[] raw = data.data();
        messageByteArray.writeShort((short) raw.length);
        messageByteArray.writeBytes(raw, 0, raw.length);
//        int old = messageByteArray.setPosition((ASV2014_4173 - 2));
//        messageByteArray.writeShort((short) (old - ASV2014_4173));
		return messageByteArray;
	}


	public static void writeMessage(Message message, ByteArray messageByteArray) {
		messageByteArray.writeShort(message.getID());
		message.serialize(messageByteArray);

	}
	
	public static Message readFromByteArray(ByteArray data, User user){

		long val = data.readUnsignedInt();
		if(val!=ASV2014_4172){
			System.out.println("Header error: expect: "+ASV2014_4172+" get: "+val);
			return new NullMessage(user);
		}
		int p =data.readUnsignedShort();
		int p2 =data.readUnsignedShort();
		byte p3 =data.readByte();
		int p4 =data.readUnsignedShort();
	//	if(showSocket)
	//		user.log("val "+val+" seq: "+p+" reseq: "+p2+" flag: "+p3+" length: "+p4);

		return readMessage(data,user);
	}
	public static Message readMessage(ByteArray data,User user){
		int id = data.readShort();
		Message message = constant.Register.getMessage(id,user);
        if(showSocket){
      //  	user.log("Received: nested: "+message.getClass());
        }
		message.digestBytes(data);
		return message;
	}
	
//	public static void read(byte[] data){
//		ByteArray byteArray = ClientSocket.generateData(
//				(ClientSocket.readMessages(new ByteArray(data,ByteOrder.BIG_ENDIAN),null)),37);
//		Util.print(data);
//		Util.print(byteArray.getData());
//	}
}
