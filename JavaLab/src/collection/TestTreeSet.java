package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import equals.Employee;

public class TestTreeSet {

	public static void main(String[] args) {
//		DescComparator comparator = new DescComparator();
		//anonymous class,TestTreeSet$1.class
		Comparator com = new Comparator() {
			
			public int compare(Object o1, Object o2) {
				
				Integer i1 =(Integer) o1;
				Integer i2 =(Integer) o2;
				
				if( i1 > i2 ) {
					return -1;
				}
				else if(i1 < i2){
					return 1;
				}
				return 0 ;//相等情況,就隨便TreeSet排
			}
		};
		
		//lambda

		
		
		Set set = new TreeSet(com);	//只能放同一類別的物件,預設有小到大,自然排序
		set.add(1);//autoboxing
		set.add(2);
		set.add(3);
		set.add(4);


		for(Object item:set) {
			System.out.println(item);
		}
		

 		
	}

}
