package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NamedMethodGenerator;

public class TestCheckException  {

	public static void main(String[] args) throws IOException {
		//可以用兩個反斜線或者單斜線作為目錄區隔符號
		// ctrl+1:fix,
		FileReader fr = new FileReader("C:\\eclipse\\workspace\\JavaLab\\src\\Employee.java");
		
		System.out.println("done");
		//java:JVM
//		FileReader fr = new FileReader("c:/java/a aaa.text");
		
		
		
	}

}
