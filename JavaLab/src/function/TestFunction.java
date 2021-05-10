package function;

public class TestFunction {

	public static void main(String[] args) {
//      修飾存取    回傳值 方法名稱(傳入參數1,傳入參數2,..)   		
		add(1, 1);
		int sum = add1(1, 1);
		System.out.println("sum="+sum);
//		System.out.println(sum);
	}
	//           2   =    1   +   1  
	//void: 表示這個方法沒有回傳,只是要執行方法內的程式
	public static void add(int a,int b) {
		int c = a + b; // c = 1 + 1
		
		System.out.println("c="+c);
	}
//		return c;    //宣告void 不能有return
	public static int add1(int a,int b) {
		
		int c = a + b; // c = 1 + 1
		return c;
	}

	



}
