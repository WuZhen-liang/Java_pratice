package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		
		
		//取得對方網站的InputStream
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		try (InputStream openStream = url.openStream();
				FileOutputStream fos = new FileOutputStream("C:\\java\\a.jpg");//看你的附檔名是甚麼
				//Buffered
				BufferedInputStream bis = new BufferedInputStream(openStream);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
 				){
			byte [] buffer = new byte[4096]; //一次可以塞1024
			int length;
			while((length = bis.read(buffer)) !=-1){
				System.out.println("len="+length);
				bos.write(buffer,0,length); // write(要放入的檔案,擺入length第0位置,寫了多少東西)
			}
			System.out.println("finish");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
