import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main5 {
	public static void main(String[] args) {
		// 1조, (둘리, 도우너, 길동)
		// 2조, (톰, 브래드, 레오나르도)
		
		Map<Integer, List<String>> teams = new HashMap<>();
		teams.put(1, Arrays.asList("둘리", "도우너", "길동"));
		teams.put(2, Arrays.asList("톰", "브래드", "레오나르도"));
		
		System.out.println(teams.get(1));
		
		// 1조 조장 둘리
		// 2조 조장 톰
		Map<String, List<String>> teams2 = null;
		teams2.put("둘리", Arrays.asList( "도우너", "길동"));
	}

}
