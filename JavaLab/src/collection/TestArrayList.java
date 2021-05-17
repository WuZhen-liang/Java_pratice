package collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("hello"); //0
		list.add("world"); //1
		list.add(3.0); //2
		
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
	
	
	}

}
