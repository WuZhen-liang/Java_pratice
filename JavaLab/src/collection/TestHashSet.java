package collection;

import java.util.*;

import javax.print.attribute.Size2DSyntax;
public class TestHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); 
//		Set set = new LinkedHashSet(); //Linked:記錄加入順序
		set.add("Hello");
		boolean success =set.add("Hello");
		System.out.println("加第二次有沒有加成功"+success);
		System.out.println("size:"+set.size());
		set.add("world");
//		set.add(3.0);
		System.out.println("size:"+set.size() );
		
		// set.contains :檢查測試物件
		boolean contains = set.contains("world");
		System.out.println("有沒有World:"+contains);
		
		for(String item:set) {
			System.out.println(item);
		}
		//Iterator

	}

}
