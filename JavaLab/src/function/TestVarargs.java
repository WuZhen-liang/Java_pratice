package function;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;

public class TestVarargs {

	public static void main(String[] args) {
		
		int sum = add(1,2,3,4,5,6);
		System.out.println(sum);
	}
	public static int add(double a,int...values) {
		int sum = 0;
		for( int item :values) {
			sum += item;
		}
		return sum ;
	}
	
	
	
}
