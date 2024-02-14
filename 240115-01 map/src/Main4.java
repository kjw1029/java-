import java.util.HashMap;
import java.util.Map;

public class Main4 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(null, null);
		map.put(2, "Two");

		if (!map.containsKey(1)) {
			map.put(1, "일");
		}
		
		System.out.println(map);
		
		map.remove(null);
		System.out.println(map);
		
		map.remove(2);
		System.out.println(map);
		
	}
}
