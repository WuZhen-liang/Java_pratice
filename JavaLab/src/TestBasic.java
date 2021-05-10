
public class TestBasic {

	public static void main(String[] args) {	
		//8基本型態,4整數,2浮點數(float,double),char,boolean
		long salaryOfMary =500000;
		System.out.println("salary="+salaryOfMary);
		int i=1,j=2,k=3;
		System.out.println("i="+i+"\r\nj="+j+"\r\nk="+k);
		System.out.println(2222222222L);//long(8)
		//-------------整數計算:準確,小數計算:會有些許誤差----------------------
		System.out.println(0.1+0.1+0.1); //0.30000000000000004
		 System.out.println(3333 * 45 ); //149985
		//-------------單引號:字元，雙引號:字串->多個字元----------------------
		char c ='中';
		System.out.println(c);
		//-------------boolean:true or false,1 bit---------------------
		boolean d =true;
		System.out.println(d);
		//-------------\r\n :Windows 換行 \n :Mac Linux 換行-------------
		System.out.println("\\HelloWorld\\");
		System.out.println("Hello\nWorld");
		System.out.println("Hello\r\nWorld");
		//----------------------加減乘除&餘數-----------------------------
		int x = 10;
		int y = 3;
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+x * y);
		System.out.println("x/y="+x/y);
		System.out.println("x%/y="+y%x); //取餘數		
		//-------------兩個相同型別運算時，至少有一個為整數---------------------
		int a = 2000000000;// int:+-21e
		long b= a+a;//40e overflow ##
		System.out.println("b="+b);
		//--------------double +int =>double +double ->double---
		//--------------double>float>long>int(至少為int)---
		double xxx = 10.0;
		int yyy = 5;
		double zzz = xxx + yyy; //double +int =>double +double ->double
		//--------------強制轉換型別-->前面加上要轉成的資料型態----------------------
		double ccc = 10.3456789;
		int aaa = (int)ccc;//(int)(double)(char)
		System.out.println("aaa="+aaa);
		//--------------比較運算子(==)(!=)(<=)(>=)(>)(<)----------------------
		int age = 20;
		boolean isAdult = age >=18;//==,!=,<=,>=,>,<
		System.out.println("是否成年:"+isAdult);
		//--------------條件運算(||)(&&)(!)(&)(|)(^)左右兩邊為boolean值----------------------
		int ageMan = 16;
		boolean isMan = (ageMan >18 && ageMan < 30);
		System.out.println("是否低於30歲:"+isMan);//!(結果反向)
		//--------------位元運算子(左右兩邊為數字)----------------------
		System.out.println(12&6);//1100   (12)
//								   0110(& (6)
//								 ------------- 
//								   0100   (4)
		System.out.println(12|6);//1100   (12)
//		   						   0110(& (6)
//		 						 ------------- 
//		   						   1110   (14)
		//--------------位元位移運算子(<<:左移,>>:右移)----------------------
		System.out.println(2<<5);//左移N為位元相當於乘上2的N次方
		System.out.println(2>>5);//右移N為位元相當於除以2的N次方
		//--------------遞增、遞減運算:符號在前先做,符號在後後做----------------------
		int king = 50;
		System.out.println("king="+king);		
		king--;
		System.out.println("king="+king);
		//--------------指定運算(+=,-=,*=,/=,%=)----------------------
		int go = 20;
		go *= 10;
		System.out.println("go="+go);
		//--------------三元運算(a?b:c-->a為判斷式,若判斷式成立執行b,反之判斷式不成立執行c)----------------------
		System.out.println(go >= 200?"200 up":"200 down");
		int sales = 2000;
		int salaryPay = 1000;
		salaryPay = sales > 1000 ? salaryPay + 10:salaryPay - 10;
		System.out.println("salaryPay="+salaryPay);
		//--------------運算優先順序(i++/i==>++i/--i==>* or/==>+/-)----------------------
		int q = 6;
		int w = 10;
		int e = (q++) * (w--);
		System.out.println("e="+e+",q="+q+",w="+w);

		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
