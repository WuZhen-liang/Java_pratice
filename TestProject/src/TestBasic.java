import java.math.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.sun.org.apache.bcel.internal.generic.INEG;
import com.sun.org.apache.bcel.internal.generic.Type;
import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;

public class TestBasic {

	public static void main(String[] args) {
		
		int comeOn = 10;
		int j = 2100000000;
		int l = j + j;
		System.out.println(l);//資料溢位
		BigDecimal bd = new BigDecimal("10.123");
		BigDecimal bd1 = new BigDecimal(10.123);
		System.out.println(bd+"/n"+bd1); //BigDecimal 類別
//----------------跳脫字元-----------------------
		System.out.println("\"");
//----------------加減乘除-----------------------
		int a = 2;
		int b = 1;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
/*----------------兩相同型別運算時，運算結果也會是同一型別-----------------------
  ----------------double>float>long>int(至少為int型別)-----------------------*/
//-------------int + int ------------------
		int k = 10;                  
		int i = 5 + k;
		System.out.println("i="+i);
//-------------int + double ------------------
		int c = 10;
		double d = 20 + c;
		System.out.println("d="+d);
//-------------float + double ------------------
		float e = 10;
		double f = 20 + c;
		System.out.println("f="+f);
//-------------byte + short ------------------
		byte g = 5;
		int h = (short)10+ g ;
		System.out.println("h="+h);
//-------------條件運算子(兩邊必須為Boolean型態，其回傳也是Boolean)-----------------------
//---&&:交集(and) 兩邊運算元都為True才會回傳True(其中一邊為false 則另一邊不做運算)-----
		int age = 35;
		if(age >18 && age <30) {
			System.out.println("成年");
		}
		else {
			System.out.println("not yet 30 years old");
//---&:交集(and) 兩邊運算元都為True才會回傳True(兩邊都會運算)-----
			int ageOfOneAnd = 35;
			if(ageOfOneAnd >18 && ageOfOneAnd <30) {
				System.out.println("成年");
			}
			else {
				System.out.println("not yet 30 years old");	
			}
//---||:聯集(or) 兩邊運算元其中一邊回傳True即為True(其中一邊為True 則另一邊不做運算)-----
			int people = 20;
			if(people >50 || people <30) {
				System.out.println("人數到達標準");
			}
//---|:聯集(or) 兩邊運算元其中一邊回傳True即為True(兩邊都會運算)-----
			int peopleOfOneOr = 20;
			if(peopleOfOneOr >50 || peopleOfOneOr <30) {
				System.out.println("人數到達標準");
			}
//---!:反向 相反的布林值-----------------------------
			int second = 30;
			System.out.println(!(second>50));
//---^:兩邊運算元一邊為True、另一邊為False，才回傳True-----------------------------
			int common = 20;
			System.out.println(common>15 ^ common <18);
//--------------------位元位移運算子----------------------------------
			int moveBit = 5;
			System.out.println(moveBit<<2);
			System.out.println(moveBit>>1);		
//--------------------Assignment Operators指定運算----------------------------------
			int compare_a = 5 ;
			int compare_b = 10 ;
			compare_a += compare_b;
			System.out.println("a+=b-->a = a + b-->a="+compare_a);//compare_a = 5+10=15
			compare_a -= compare_b;
			System.out.println("a-=b-->a = a - b-->a="+compare_a);//compare_a= 15-10=5
			compare_a *= compare_b;
			System.out.println("a*=b-->a = a * b-->a="+compare_a);//compare_a= 5*10=50
			compare_a /= compare_b;
			System.out.println("a/=b-->a = a / b-->a="+compare_a);//compare_a= 50/10=5
			compare_a %= compare_b;
			System.out.println("a%=b-->a = a % b-->a="+compare_a);//compare_a= 5%10=5
//--------------------三元運算----------------------------------
	int sales = 2000;
	int salary = 100;
	salary = sales > 1000? salary + 10:salary - 10;//(判斷式)?a:b-->判斷式成立執行a，若不成立執行b
	System.out.println("salary="+salary);
		
		
		
		
		
		}
	}
}
