package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import com.mingJiang.util.FileUtil;

public class Download {

	public static void updateFile(String source, String file) {
		ReadableByteChannel rbc = null;
		FileOutputStream fos = null;
		try {
			long start = System.currentTimeMillis();
			rbc = Channels.newChannel(new URL(source).openStream());
			fos = new FileOutputStream(file);
			fos.getChannel().transferFrom(rbc, 0, 1 << 24);
			System.out.println("成功 " + file + " "
					+ (System.currentTimeMillis() - start));
		} catch (FileNotFoundException e) {// e.printStackTrace();

		} catch (IOException e) {
			System.out.println(e.toString() + source);
			// updateFile(source,file);
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void updateFile2(String source, String file) {
		try {
			long start = System.currentTimeMillis();
			URL link = new URL(source);
			// Code to download
			InputStream in = new BufferedInputStream(link.openStream());
			FileOutputStream out = new FileOutputStream(file);
			byte[] buf = new byte[4096];
			int n = 0;
			while (-1 != (n = in.read(buf))) {
				out.write(buf, 0, n);
			}
			out.close();
			in.close();
			
			System.out.println("成功 " + file + " "
					+ (System.currentTimeMillis() - start));
		} catch (MalformedURLException e) {
			
		}
		catch (IOException e) {
		}

	}
	
	
	public static void main(String[] args) throws IOException{
		final String host = "http://pirates-721.level3.bpcdn.net/";
		String downString = "download";
		Files.createDirectories(new File("download/swf").toPath());
		Files.createDirectories(new File("download/xml").toPath());
		Files.createDirectories(new File("download/res").toPath());


		long start = System.currentTimeMillis();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
		for (final String s : FileUtil.readFrom("resources.xml")) {
			executor.execute(new Runnable() {
				
				@Override
				public void run() {
					if(s.contains("hash")){
						//<file id="static_11" location="swf" name="static_11" type="swf" hash="3b0dc3ae45656a10ce16c63ceeee6f00" />
						String fileName = s.split("name=\"")[1].split("\"")[0]+".swf";
						String hash = s.split("hash=\"")[1].split("\"")[0];
//						//<cv url="img/icons/buff/93.png" hash="5bbf45cf7084c42f08bb27ff5d579f00"/>
//						String url = s.split("url=\"")[1].split("\"",2)[0];
//						String[] sp = url.split("/");
//						String fileName = url.replace("/", "_");
//						String hash = s.split("hash=\"")[1].split("\"")[0];
						String url=host+"swf/"+fileName+"?__cv="+hash;
					//	fileName =hash+fileName;
						if(fileName.endsWith(".png"))
							fileName="download/res/"+fileName;
						else if(fileName.endsWith(".swf"))
							fileName="download/swf/"+fileName;
						else
							fileName="download/res/"+fileName;
						updateFile(url, fileName);
//					
//						long ss  = System.currentTimeMillis();
//						try {
//						//	Files.copy(new URL(url).openStream(), new File(fileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
//						//	FileUtils.copyURLToFile(new URL(url), new File(fileName));
//							updateFile(url, fileName);
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						//FileUtils.copyURLToFile(new URL(url), new File(fileName));
//						System.out.println("成功 " + fileName + " "
//								+ (System.currentTimeMillis() - ss));
					}
				}
			});
			
		}
		
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("time: "+(end1-start));
	}
}
