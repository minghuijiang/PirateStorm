package util;

import java.io.IOException;

import com.mingJiang.util.FileUtil;

public class RegisterGenerator {

	public static void main(String[] args) throws IOException{
		for(String s: FileUtil.readFrom("MessageLookup.as")){
			if(s.contains("ASV2014_5478[")){
				//	ASV2014_5478[1591] = ASV2014_1456;
				//	to 
				// 	register(1591, new ASV2014_1456());
				
				String id = s.split("\\[")[1].split("\\]")[0].trim();
				String className = s.split("=")[1].split(";")[0].trim();
				System.out.println("\tregister("+id+" , new "+className+"());");
			}
		}
	}

}
