package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mingJiang.data.Tuple;
import com.mingJiang.util.FileUtil;

public class Matcher {

	static Map<String, String> fileMap;
	static{
		readFileMap();
	}
	private static void readFileMap(){
		if(!new File("FileMap.out").exists())
			outputFileMatch("C:/Users/Ming/Desktop/pirate/");
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(new File("FileMap.out")));
			fileMap = (Map<String, String>) input.readObject();
//			for(String k: fileMap.keySet())
//				System.out.printf("%-40s  %-40s%n", k, fileMap.get(k));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException{
		Map<String, Tuple<String, String, String>> map = new HashMap<>();
		for(String fileName : new File(".").list()){
			if(fileName.endsWith(".as"))
				for(Tuple<String, String, String> t:parseConstant(fileName))
					if(map.containsKey(t.getFirst()))
						System.out.println(t.getFirst());
					else
					map.put(t.getFirst(), t);
		}
		
		for(String line: FileUtil.readFrom("Register.txt")){
			if(line.contains("(")){
//ASV2014_76.as: line 67: 	facade.registerCommand(GameNotification.OPEN_FORUM, ASV2014_279);
		//		System.out.println(line);
				String obName = line.split("\\(")[1].split("\\.")[1].split(",")[0].trim();
				String targetClass = line.split(",")[1].split("\\)")[0].trim();
				String className = targetClass;
				if(className.startsWith("ASV")){
					className = map.get(obName).getLast();
					className= Util.UpperCaseToCamel(className)+"Command";
				}
				
				generateJava("src/command/",className,fileMap.get(targetClass+".as"));
			//	System.out.printf("%-40s %-40s %-40s%n",obName,targetClass,className);
			}
		}
	}
	
	public static void generateJava(String path, String className, String asFile) throws IOException{
		System.out.println("Generate "+path+className+".java from" +asFile);
		List<String> data = new ArrayList<>();
		data.add("package command;");
		data.add("public class "+className+" extends Command{");
		parseActionScript(data, FileUtil.readFrom(asFile));
		data.add("}");
	//	FileUtil.writeTo(path+className+".java", data);
	}
	
	private static void parseActionScript(List<String> out, List<String> in){
		String send = "";
		for(String s: in){
			if(s.contains("send")){
				System.out.println(s);
				send = s;
			}
		}
		if(send.length()<1)
			System.err.println("no send");
	}
	
	// obName, curName, Val
	public static List<Tuple<String,String,String>> parseConstant(String fileName) throws IOException{
		List<Tuple<String, String, String>>  list = new ArrayList<Tuple<String,String,String>>();
		
		for(String str: FileUtil.readFrom(fileName))
			if(str.contains("const")){// 命令行
				//public static const ATTACK_ENEMY:String = "ATTACK_ENEMY";
				String obName = str.split("const ")[1].split(":")[0];
				String val = str.split("\"")[1];
				String currentName = Util.camelToUpperCase(val);
				// 转换成java格式
				list.add(new Tuple<String, String, String>(obName, currentName, val));
			}
		return list;
	}
	
	public static void outputFileMatch(String dir){
		File f = new File(dir);
		if(f.exists()&&f.isDirectory()){
			Map<String, String> map = new HashMap<>();
			generateFileMatch(map, f);
			try {
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File("FileMap.out")));
				output.writeObject(map);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Wrong Dir: "+dir);
		}
	}
	
	public static void generateFileMatch(Map<String, String> map, File dir){
		for(File f: dir.listFiles()){
			if(f.isDirectory())
				generateFileMatch(map, f);
			else
				if(f.getName().endsWith(".as"))
					map.put(f.getName(), f.getAbsolutePath());
		}
	}
}
