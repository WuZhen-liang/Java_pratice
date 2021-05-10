
public class TestStringBuilder {

	public static void main(String[] args) {
		String hello = "hello"; //pool
		String world = "world"; //pool
		String helloworld = "helloworld"; //pool
		
		String hw = hello + world ;//helloworld,2個文字串接時,會在Heap區產生新的文字,等同於下方程式
//		--->hw = new String ("helloworld");//heap
		
		System.out.println(hw == helloworld); // heap != pool
		
		String temp = "";
		for (int i = 0;i<10;i++) {
			temp = temp + i ;
			/* i = 0, temp = " " + 0 = "0"
			i = 1, temp = "0" + 1 = "01"....
			等於是在Heap區占了9個記憶體空間沒用處(可能會導致記憶體空間不足)       */
		}
		System.out.println("temp="+temp);
//-------------------StringBuilder(用於大量文字串接,不要用加號(占記憶體空間))--------------------   	    
		StringBuilder builder = new StringBuilder();
		for (int i = 0 ; i<10;i++) {
			builder.append(i);
		}
		System.out.println(builder.toString());
	
	
	}

}
