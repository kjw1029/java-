import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main14 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(100, "백");
		map.put(1, "일");
		map.put(1000, "천");
		map.put(250, "이백오십");
		
		System.out.println(map.toString());
		
		TreeMap<Integer, String> down = (TreeMap<Integer, String>) map; // 다운캐스팅 후 트리가 가지는 추가메소드, 추가,삭제  성능자체는 느리나 대소비교 가능, 탐색에 유리, 대소가 같으면 중복
		Map<Integer, String> headMap = down.headMap(251);
		
		System.out.println(headMap);
		
		Map<Integer, String> tailMap =down.tailMap(249);
		System.out.println(tailMap);
	}

}
