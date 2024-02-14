import java.util.HashMap;
import java.util.Map;

public class Main6 {
	public static void main(String[] args) {
		String line = "Hello. I'm a developer";

		// 위 문장에서 각 문자가 몇 개씩 있는지 집계해보세요.
		// H 1
		// e 4
		// l 3
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
	}

}
