package socket;

import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import com.mingJiang.as.ByteArray;
import com.mingJiang.util.FileUtil;

import component.ClientSocket;

public class Tester {
	static{
		com.mingJiang.log.Logging.initLogger();
	}
	public static List<String> CArrayToString(String cArrayFile) throws IOException{
		List<String> tmp = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		boolean isSend= false;
		for(String s: FileUtil.readFrom(cArrayFile)){
			if(s.length()<1){
				continue;
			}
			if(s.contains("{")){
				if(s.contains("peer0"))
					isSend= true;
				else {
					isSend= false;
				}
				sb.append(isSend?"1":"0");
				continue ;
			}
			if(s.contains("};")){
				sb.append(s.replace("};", "").trim());
				tmp.add(sb.toString());
				sb= new StringBuilder();
			}else {
				sb.append(s.trim());
			}
		}
		
		return tmp;
	}
	
	
	public static byte[] StringToSocket(String socketString){

		String[] list = socketString.split(",");
		byte[] tmpList = new byte[list.length];
		for(int i=0;i<list.length;i++){
			int intVal = Integer.valueOf(list[i].replace("0x", "").trim(),16);
			byte b = (byte) intVal;
			tmpList[i]=(byte)b;
		}

		return tmpList;
	}

	
	public static void main(String[] args) throws IOException{

		System.out.println("start");
	
		for(String s: CArrayToString("C:/Users/Ming/Desktop/testC.txt")){
		//	System.out.println(s);
			//System.out.println(s);
			if(s.charAt(0)=='1')
				System.out.println("Send: ");
			else{
				System.out.println("Read: ");//continue;
			}
			ByteArray arr = new ByteArray(StringToSocket(s.substring(1)),ByteOrder.BIG_ENDIAN);
			int c= 0;
			//while(arr.position()<arr.size)
			System.out.println(c+++"  "+
				ClientSocket.readFromByteArray(arr,null));

				
		}
			
//		for(int i=0;i<256;i++){
//			byte b = (byte) i;
//			System.out.println(i+"  "+b+"  "+(b&0xff));
//		}
	}


}
