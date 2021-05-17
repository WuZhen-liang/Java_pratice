package exception;

public class TestException {

	public static void main(String[] args) {
	
// try...catch ...final(一定會被執行)
/*
 * 		try{
 *			產生例外程式
		}catch(發生的exception 類別 ex){
			發生exception後要執行的程式
		}finally{
			一定會執行的程式區塊
		}		
*/		
		try {
			int a = 1;
			int c = 1;
//			System.out.println("c = "+c--);
			
			
			int b = a / c;
			System.out.println("b = "+b);		
			
			int [] x = {};
			System.out.println(x[0]);
			//RuntimeException子類別,是不需要處理的			
		}
		catch (ArithmeticException ex) {
			System.out.println("程式除到0");
			ex.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}catch (Exception ex) { //Exception 的父類別 全部都攔的到(一定要在最下面)
			ex.printStackTrace();
			
		}finally {
			System.out.println("finally 一定會被執行的程式區塊");
			//close db connection ,JDBC
			//close file 
		}
		System.out.println("finish");
		
	}

}
