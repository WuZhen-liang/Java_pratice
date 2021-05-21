package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> list2 = Arrays.asList("Hello","World");
		List<Integer> list3 = Arrays.asList(1,2,3);
		
		
				
		List<String> list = new ArrayList<>();
		list.add("hello"); //0
		list.add("world"); //1
		System.out.println(list);
//		Double d = new Double(3.0); //3.0的物件,boxing
//		double e = d.doubleValue();//unboxing
//		list.add(d); //2
//		list.add(3.0);
		//list.add(new Double(3.0));
//		Double f = Double.valueOf("3.0");
//		Double g = Double.valueOf(3.0);
//		System.out.println("3.0"+1);
//		System.out.println(f+1);7
		
		System.out.println("Size:"+list.size());
		//get(index),index從0起算
		System.out.println("第一個:"+list.get(0));
		System.out.println("第二個:"+list.get(1));
//		System.out.println("第五個:"+list.get(4));
//                          3,(0,1,2)		
		for(int i =0; i<list.size() ; i++) {
//			System.out.println("第"+(i+1)+"個:"+list.get(i));
			System.out.printf("第%d個:%s%n",i+1,list.get(i));
		}
		//Iterator
		Iterator<String> iterator = list.iterator();//alt+shift+l
		
		while(iterator.hasNext()) { //有沒有下一筆
			String item = iterator.next(); //移到下一筆,把值取出來
			System.out.println(item);
		}
		System.out.println("------------------------");
		//for
		//Hello,World ,3.0 -->java.lang.String
		for( String item : list ) {
			System.out.println(item);
		}
		System.out.println("------lambda-------");
		//comsumer
		//lambda
		Consumer<String> consumer = (item)->System.out.println(item);
		//Method reference
		Consumer<String> consumer1 = System.out::println;
		Consumer<String> consumer2 = TestArrayList::aaaa;
		list.forEach(TestArrayList::aaaa);
		
	}
	//方法的型態跟Consumer一樣,傳入一個參數
	public static void aaaa(String item) {
		System.out.println(item);
	}
}
