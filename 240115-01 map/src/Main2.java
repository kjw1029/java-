import java.util.HashMap;
import java.util.Map;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("삼", 3);
		map.put("사", 4);
		map.put("오", 5);
		map.put("Three", 3);
		map.put("three", 3);
		map.put("오", 55);
		// key는 단순한 형태가 value를 찾기 쉽다.
		// 단, 중복을 주의해야한다.
		map.put("키값이너무복잡하고어려우면값을찾기어려워요", 1);
		
		System.out.println(map.size());
		System.out.println(map.toString());
	}
}
