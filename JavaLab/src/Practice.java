import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.classfile.ConstantUtf8;
import com.sun.org.apache.bcel.internal.generic.StackConsumer;
import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class Practice {

	public static void main(String[] args) {
		conTrol(20);
		double []	age = {1.0,2.2,2.5,0.9};
		
		Arrays.sort(age);
		
		System.out.println("最大值:"+age[3]);
		System.out.println("最小值:"+age[0]);
		for (double i : age) {
			double total = 0;
			total = total + i;
			double	aver = total/(age.length);
			System.out.println(aver);
		}
		}
	public static void conTrol(int a ) {
		String k ="*";
//		for(int j = 0 ; j < b; j++) {
				for(int i = 0 ;i < a ; i++) {
					if (i %2 ==0) {
						continue;
					}
					else if (i == 1){
						System.out.println(k);
					}
					else {
						k = k + "**";
						System.out.println(k);						
					}
				}		

	}

}
