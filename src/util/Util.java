package util;

import java.io.File;
import java.io.IOException;

import com.mingJiang.util.FileUtil;

public class Util {

	public static void parseConstant(String fileName) throws IOException{
		System.out.println(fileName);
		
		for(String str: FileUtil.readFrom(fileName))
			if(str.contains("const")){// 命令行
				String[] sp = str.split("\""); // String 是在 sp[1]里
				String val = sp[1];
				// 转换成java格式
				System.out.println("\tpublic static final String "+camelToUpperCase(val)+" = \""+val+"\";");
				
			}
		
		System.out.println("\n\n");
	}
	
	//转码 InitializeLoginDataProxy 变成 INITIALIZE_LOGIN_DATA_PROXY
	public static String camelToUpperCase(String camelForm){
		if(Character.isUpperCase(camelForm.charAt(0))&&Character.isUpperCase(camelForm.charAt(1)))
			return camelForm;
		boolean isUp= true;
		for(int i=0; i<camelForm.length();i++){
			if(Character.isUpperCase(camelForm.charAt(i))&&!isUp){
				camelForm = camelForm.substring(0,i)+"_"+camelForm.substring(i);
				i++;
				isUp= true;
			}
			else {
				isUp= false;
			}
		}
		return camelForm.toUpperCase();
	}
	
	public static void main(String[] args) throws IOException{
		for(String fileName : new File(".").list()){
			if(fileName.endsWith(".as"))
				parseConstant(fileName);
		}
	}

	public static String UpperCaseToCamel(String camelForm) {
		boolean nextUp = true;
		camelForm = camelForm.toLowerCase();
		for(int i=0; i<camelForm.length();i++){
			if(nextUp){
				if(i==0)
					camelForm = Character.toUpperCase(camelForm.charAt(i))+camelForm.substring(i+1);
				else
					camelForm = camelForm.substring(0,i-1)+Character.toUpperCase(camelForm.charAt(i))+camelForm.substring(i+1);
				nextUp= false;
			}
			if(camelForm.charAt(i)=='_')
				nextUp = true;
		}
		return camelForm;
	}

}
