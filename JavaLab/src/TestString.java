
public class TestString {

	public static void main(String[] args) {
		
		String name = "vincent";//pool會產生vincent字,回傳記憶體位置給name變數
		String name1 = "vincent";/*第二次再要,pool直接回傳vincent記憶體位置給name1,不再產生新的字*/	
		//		name = "vincent1";
		String name2 = new String("vincent");//new 會產生在heap區,不會在pool內
		
		System.out.println(name == name1); //比較記憶體位置-->pool=pool-->True 
		
		System.out.println((name2 == name1)); //比較記憶體位置-->heap(new) != pool("")
		
		System.out.println("equals="+ name2.equals(name1));//文字逐字比較,要用equals()
//---------------String回傳字串長度(.length)---------------------------
		
		System.out.println("中文.qazwsx".length()); //中英文符號都算一個字元
		
//---------------String搜尋位置[IndexOf("尋找字元")]---------------------------------		
		System.out.println("中文abc".indexOf("中1")); //第一個字的位置為0
													//找不到時回傳值為:-1
//---------------String截字[substring(第幾個字元)]----------------------------------
		
		System.out.println("中文abc".substring(2));  
	
//---------------String截字(起始跟結束)[substring(start,end)]-----------------------
//											   start:including		
		System.out.println("中文abc".substring(0,4));  

//---------------String 文字格式化[String.format((代入形式),(代入資料))][%d(整數)、%s(文字)、%f(小數)、%%(百分比)]--------------------------------------	
		
		System.out.println(String.format("Hello World %10s", "David"));//%s(String)-->10%s=>要有10個字->若無前面補空白
		System.out.println(String.format( "%.4f", 10/3.0));//%f(小數點)-->%.4f=>小數點後4位
		System.out.println(String.format("aaa bbb %12d%%", 10));
		System.out.printf("aaa bbb %12d%%", 10); //print.format
	
	
	
	
	} 
	

}
