
import category.Item;
//若目錄下很多class 可以用category.*

public class TestPackage {

	public static void main(String[] args) {
		//在package下的類別必須使用全名
		category.Item  item = new category.Item();
		item.name = "Asus notebook";
		System.out.println("TestPackage's main:"+item.name);
		/*		若上面宣告import category.Item 下方只需要打Item 	
		Item  item = new Item();
		item.name = "Asus notebook"; */
/*						
	cmd執行--->C:\iii\java\javaWorkspace\JavaLab\bin java category.Item  -->O % 一定要在主目錄bin 
    				return:Item's main 方法  
	cmd執行--->C:\iii\java\javaWorkspace\JavaLab\bin\cateage java Item  -->X  
    				return:Error  
    		  C:\java>java -cp C:\iii\java\javaWorkspace\JavaLab\bin TestPackage
    				return:TestPackage's main:Asus notebook  
    		                			
*/	
		/*	
	jar cmd執行--->C:\java>java -jar Hello.jar
    				return:Item's main 方法	
			      C:\java>java -cp Hello.jar TestPackage
    				return:TestPackage's main:Asus notebook		
		 */	
	}

}
