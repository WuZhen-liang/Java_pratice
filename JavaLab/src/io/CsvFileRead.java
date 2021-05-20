package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CsvFileRead {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\java\\Employees.csv");
		try (FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				){
			String line;
			int sum ;
			while((line = br.readLine())!= null) {
				System.out.println(line);
				String [] column = line.split(",");
				System.out.println(column[2]);

 			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
