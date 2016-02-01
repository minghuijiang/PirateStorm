package util;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.ParseConversionEvent;

import message.Message;
import message.MessageList;

import com.mingJiang.data.Pair;
import com.mingJiang.util.FileUtil;

public class MessageGenerator {

	public static void generate(String asDir, String outDir) throws IOException{
		for(File f: new File(asDir).listFiles()){
			if(f.getName().endsWith(".as")){
				List<String> out = new ArrayList<String>();
				List<String> header = new ArrayList<String>();
				List<String> body = new ArrayList<String>();
				List<String> footer = new ArrayList<String>();
				if(f.getName().startsWith("ASV")){
					header.add("package message.asv;");
					header.add("");
					header.add("import message.Message;");
					header.add("import com.mingJiang.as.ByteArray;");
				}
				else{
					header.add("package message;");
					header.add("");
					header.add("import com.mingJiang.as.ByteArray;");
				}
				
				body.add("");
				body.add("public class "+f.getName().replace(".as", "")+" extends Message{");
				body.add("");
				List<String> origin= FileUtil.readFrom(f.getAbsolutePath());
				List<String> getter = new ArrayList<>();
				
				//grab name match first
				Map<String, String> nameMatch = new HashMap<>();
				boolean start = false;
				String variable = "",obName = "";
				for(String s: origin){
					if(!start){
						if(s.contains("function get "))
							start = true;
					}
					if(start){
//						public function get guildInfoMessage():ASV2014_30
//				        {
//				            return (this.ASV2014_6435);
//				        }
						if(s.endsWith("):ASV2014_30"))
							System.out.println(s);
						if(s.contains("function get ")){
							variable = s.split(" get ")[1].split("\\(")[0];
						//	System.out.println("variable: "+variable);
						}else if(s.contains("return ")){
							
							obName = s.split("\\(")[1].split("\\);")[0].replace("this.", "");
						//	System.out.println(obName+" ==> "+variable);
							
							if(obName.startsWith("ASV")){
								nameMatch.put(obName, variable);
							}
							obName = ""; 
							variable= ""; 
							start = false;
						}
					}
				}
				
				List<String> parsed = new ArrayList<>();
				for(String s: origin){
					String modified = s.replace(":ASV2014_30;", ":Message;").replace(".ASV2014_2336(", ".serialize(")
							.replace("(ASV2014_229.ASV2014_3049", "socket.Sender.readMessage")
							.replace("ASV2014_229.writeMessage", "socket.Sender.writeMessage")
							.replace(" as ASV2014_30)", "").replace("    ", "\t").replace("\t\t", "\t");
					for(String key: nameMatch.keySet()){
						modified = modified.replace(key, nameMatch.get(key));
					}
					parsed.add(modified);
				}
				
				
				//grab Id and variable
				boolean serialStart = false, deserialStart = false;
				int sI = 0, dI= 0;
				for(String s: parsed){
					if(s.contains("public static const id")){
						// public static const ASV2014_2337:int = 1330;
						String id = s.split("=")[1].split(";")[0].trim();
						body.add("\tpublic static final int id = "+id+";");
						footer.add("\tpublic int getID(){");
						footer.add("\t\treturn id;");
						footer.add("\t}");
					}else if(s.contains("private var ")){
						//        private var ASV2014_3912:ASV2014_30;
				        //        private var ASV2014_4531:int;
						String variable2 = s.split("var")[1].split(":")[0].trim();
						String className = s.split(":")[1].split(";")[0].trim();
						body.add("\tpublic "+className+" "+variable2+";");
					}
					
					//grab deserialize
					if(deserialStart){
						if(s.contains("public function")){
							deserialStart=false;
						}
						if(deserialStart&&dI++>0)
							body.add(s.replace("_arg1", "data"));//;
					}else if(s.contains("function deserialize")){
						body.add("");
						body.add("\tpublic void deserialize(ByteArray data){");
						deserialStart= true;
					}
					
					
					//grab serialize
					if(serialStart){
						if(s.contains("public function")){
							serialStart= false;
						}
						if(serialStart&&sI++>0)
							body.add(s.replace("_arg1", "data"));//.replace("    ", "\t").replace("\t\t", "\t"));
					}else if(s.contains("function ASV2014_2336")){
						body.add("\tpublic void serialize(ByteArray data){");
						serialStart= true;
					}
				}

				out.addAll(header);
				out.addAll(body);
				out.addAll(footer);
				out.add("");
				out.add("\tpublic Message getInstance() {");
				out.add("\t\treturn new "+f.getName().replace(".as", "")+"();");
				out.add("\t}");
				out.add("");
				out.add("}");
				out.add("");
				for(String s: origin){
					if(s.startsWith("//"))
						out.add(s);
					else
						out.add("//"+s);//add original
				}
			//	com.mingJiang.util.Util.print(ori);
			//	com.mingJiang.util.Util.print(out);
				//System.exit(0);
				if(f.getName().startsWith("ASV")){
				//	FileUtil.writeTo(outDir+"asv/"+f.getName().replace(".as", ".java"), out);
				}
				//else
					//FileUtil.writeTo(outDir+f.getName().replace(".as", ".java"), out);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		//generate("P:\\workspace\\KeyWord\\back", "src\\message\\");
		//getCompareMap("C:/Users/Ming/Desktop/pirate");
		for(File f: FileUtil.getAllFiles(new File("src/message/"))){
			List<String> add= new ArrayList<>();
			List<String> lines = FileUtil.readFrom(f.getAbsolutePath());
			boolean needUpdate = false;
			for(int i=0; i<lines.size();i++){
				String line = lines.get(i);
				if(line.contains("new MessageList()")){
					lines.set(i, line.split(" = ")[0]+";");
					needUpdate = true;
					add.add(line.replace("public MessageList ", "\t").replace("()", "(user)"));
				}else {
					if(needUpdate&&line.contains("super(user);")){
						for(String s: add){
							lines.add(i+1,s);
						}
					}
				}
			}
			if(needUpdate)
			FileUtil.writeTo(f.getAbsolutePath(), lines);
		}
		
	}
	
	private static void Parse(File file, Map<String, List<String>> name) {
		if(file.isDirectory()){
			for(File f: file.listFiles()){
				if(f.isDirectory())
					Parse(f, name);
				else{
					parseFile(f, name);
				}
			}
		}else{
			parseFile(file, name);
		}
		
	}

	private static void parseFile(File f,Map<String, List<String>> name) {
		try {
			for(String s: FileUtil.readFrom(f.getAbsolutePath())){
				if(s.contains(":"))
				for(String key: name.keySet()){
					if(s.contains(":"+key)){
						if(s.contains(":"+key+" ")||s.contains(":"+key+";")){
							name.get(key).add(s);
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//					   Obname,   type     correctName
	public static Map<Pair<String, String>, String> getCompareMap(String dir){
		Map<Pair<String, String>,String> map = new HashMap<>();
		
		generateMatch(map, new File(dir));
		return map;
	}

	private static void generateMatch(Map<Pair<String, String>, String> map,File dir) {
	//	System.out.println("1 "+dir.getAbsolutePath());
		if(dir.isDirectory()){
			for(File f: dir.listFiles()){
			//	System.out.println(f);
				if(f.isDirectory())
					generateMatch(map, f);
				else{
					if(f.getName().endsWith(".as")){
						analyzeFile(map, f);
					}
				}
			}
		}else{
			if(dir.getName().endsWith(".as")){
				analyzeFile(map, dir);
			}
		}
	}

	
	/*
	 *  public function get displayFloatingNumbers():Boolean
        {
            return (this.ASV2014_6382);
        }
	 */
	private static void analyzeFile(Map<Pair<String, String>, String> map,File dir) {
		try {
			boolean start = false;
			for(String s: FileUtil.readFrom(dir.getAbsolutePath())){
				if(s.endsWith("):ASV2014_30")){
					System.out.println(s);
				}
//				if(!start){
//					if(s.contains("function get "))
//						start = true;
//				}
//				if(start){
//					if(s.contains("function get ")){
//					//	String variable = s.split(" get ")
//					}
//				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
