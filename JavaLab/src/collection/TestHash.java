package collection;

import java.util.HashSet;
import java.util.Set;

import equals.Employee;

public class TestHash {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Employee em1 = new Employee("001");
		Employee em2 = new Employee("001");
		set.add(em1);
		boolean success = set.add(em2);
		System.out.println("加第二次Employee 001:"+success);
		
		System.out.println("size:"+set.size());
	}

}
