package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args){
		//呼叫方法
	 //呼叫若有throws :呼叫方需要處理
		try {
			checkFile("c:\\java\\aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static void checkFile(String filePath) throws FileNotFoundException {
		
		File file = new File(filePath);
		if(!file.exists() ) {
			//產生Exception物件
//			FileNotFoundException fne = new FileNotFoundException(filePath);
//			throw fne;
			throw new FileNotFoundException(filePath);
//			System.out.println("aaa"); //Unreachable code:不會被執行到
		}
		
	}
	
}
