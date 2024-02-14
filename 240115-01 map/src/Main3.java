import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer, String> e = iterator.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
