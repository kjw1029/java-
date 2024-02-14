import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Map, HashTable, Dictionary
		// 값 쌍 (Key, Value)
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Three");
		map.put(7, "Seven");
		map.put(11, "Eleven");
		map.put(3, "Three");
		map.put(3 , "Another"); // 키의 중복을 허용하지 않는다.
		map.put(77, "Seven");
		
		System.out.println(map.size());
		System.out.println(map.toString());
		
		System.out.println(map.get(11));
		System.out.println(map.get(33));
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key + " = " + map.get(key));
		}
		
		Iterator<Integer> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			System.out.println(key + " = " + map.get(key));
		}
	}

}
