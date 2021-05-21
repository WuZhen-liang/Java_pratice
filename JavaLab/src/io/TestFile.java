package io;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NamedMethodGenerator;

import collection.TestTreeSet;

public class TestFile  {

	public static void main(String[] args) {
/*		
		Comparator com = new Comparator() {
			
			public int compare(Object o1, Object o2) {
				
				Long i1 =(Long) o1;
				Long i2 =(Long) o2;							//my method
				
				if( i1 > i2 ) {
					return 1;
				}
				else if(i1 < i2){
					return -1;
				}
				return 0 ;//相等情況,就隨便TreeSet排
			}
		};		
*/
		Set<File> fileSet = new TreeSet<>(new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				
				if (o1.length() > o2.length()) {
					return 1;
				}
				else{					
					return -1;
				}
			}
		}    
		);
		Comparator<File> com = (o1,o2) ->{
			if (o1.length() > o2.length()) {
					return 1;
				}
				else{					
					return -1;
				}
		};
//		Set set = new TreeSet(com);	//my method
		File dir = new File("C:\\java");
		File[] list = dir.listFiles();
		int counter = 0;
		long size = 0;
		for( File f    : list   ) {
//			long lastModified = f.lastModified();//修改時間
//			Date date = new Date(lastModified);
//			DateFormat format = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
//			System.out.println((format.format(date)));
			if (!f.isDirectory()) {
				fileSet.add(f);
//				set.add(f.length()); //my method
				System.out.println(f.getName()+", 檔案大小:"+f.length());
				counter++;
				size += f.length();
			}
			
		}
		System.out.println("檔案總數 = "+counter);
		System.out.println("檔案大小總和="+size+"bytes");
		System.out.println("===================");
		for (File f :fileSet) {
			System.out.println("名稱:"+f.getName()+"大小"+f.length());
		}

	}

}