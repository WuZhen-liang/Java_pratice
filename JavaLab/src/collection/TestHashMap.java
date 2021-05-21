package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class TestHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500); //前一行Tom:5000會被覆蓋
		
		System.out.println("Tom's薪水:"+map.get("Tom"));
//      檢查 key & values		
//		map.containsKey("Tom");
//		map.containsValue(2500);
		
		
		Set<String> keySet = map.keySet(); //Tom, David,John
		// keyset
		for( String key : keySet ) {
			System.out.println(key + " = " + map.get(key));
		}
		//EntrySet 
		
		Set< Entry <String, Integer>> entrySet = map.entrySet();
		int sum = 0;
		
		for (Entry <String, Integer> e : entrySet) { //java.util.Map.Entry
			
			sum = sum +e.getValue();
			System.out.println(e.getKey()+"="+e.getValue());
			
//			Map.Entry entry = (Map.Entry)e;
//			Object value = e.getValue(); //Integer
//			System.out.println(e.toString());			
		}
		System.out.println("薪水總和"+sum);
		
		System.out.println("----------forEach----------");
		
		BiConsumer<String, Integer> consumer = (key , value) ->{
			System.out.println("key="+key+",value="+value);
		};
		map.forEach(consumer);;
		//method referance
		map.forEach(TestHashMap::bbbb);
		
	}
	public static void bbbb(String key , Integer value) {
		System.out.println("key="+key+",value="+value);
	}
		

}
