import com.sun.org.apache.bcel.internal.classfile.ConstantUtf8;
import com.sun.org.apache.bcel.internal.generic.StackConsumer;

public class Practice {

	public static void main(String[] args) {
		conTrol(20);

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
