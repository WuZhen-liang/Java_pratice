package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		//try (放入要關閉的資料){}  ,IO,JDBC(close db connect)
		try (FileInputStream fis = new FileInputStream("C:\\java\\io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);				
				) {//binary,二進位
			System.out.println("available="+bis.available()); //same with file.lenth()
			int data = bis.read();//讀一個byte
			char c = (char)data; 
			System.out.println(c);
			System.out.println(data); //ASCII
//			System.out.println("available="+fis.available()); //same with file.lenth()
		while ((data = bis.read()) != -1) {
			System.out.println((char)(data));
		}
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
	}
		
	}

}
