package array;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class TestArray {

	public static void main(String[] args) {
		
		int[] age = new int[10];
		
		age[0] = 1;
		age[1] = 2;
		age[2] = 3;
		
		for(int i = 0; i < age.length ; i++) {
			System.out.println(age[i]);
		}
		
		int ages[] = {1,2,3};
		
		System.out.println(ages[0]);
		System.out.println("-----------------");
		for(int a:ages) {
			System.out.println(a);
		}
	}

}
