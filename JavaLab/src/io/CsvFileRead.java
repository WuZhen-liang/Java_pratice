package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.jmx.interceptor.DefaultMBeanServerInterceptor;

import equals.Employee;

public class CsvFileRead  {


	public static void main(String[] args) {

		
		File file = new File("C:\\java\\Employees.csv");
		try (FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				){
			String line;
			int salary_sum = 0 ;
			while((line = br.readLine())!= null) {
//				System.out.println(line);
				String [] column = line.split(",");
//				System.out.println(column[2]);
				Scanner scanner = new Scanner(column[2]);
				String answer = scanner.nextLine();
//				System.out.println(answer);
				if (isContainChinese(answer)) {
					continue;
				}
				else {
					int salrayData = Integer.parseInt(answer);
//					System.out.println(selection);					
					salary_sum = salary_sum+salrayData;
				}
 			}
			System.out.println("salary_sum:"+salary_sum);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static boolean isContainChinese(String str) {
		Pattern p = Pattern.compile("[\u4e00-\u9fa5]"); //use Unicode編碼來判斷 中文區間:0x4e00--0x9fbb

		Matcher m = p.matcher(str);

		if (m.find()) {
		return true;

		}
		return false;

	}
	
}	
