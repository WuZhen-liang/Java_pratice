import java.math.*;

public class TestBasic {

	public static void main(String[] args) {
		
		short k = 10;
		int i = k + k;
		System.out.println("i="+i);
		int comeOn = 10;
		int j = 2100000000;
		int l = j + j;
		System.out.println(l);//資料溢位
		BigDecimal bd = new BigDecimal("10.123");
		BigDecimal bd1 = new BigDecimal(10.123);
		System.out.println(bd+"/n"+bd1);
		if (j > 200) {
			System.out.println("over 200.");
		}
	}

}
