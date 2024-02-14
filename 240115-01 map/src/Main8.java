import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main8 {
	public static void main(String[] args) {
		// 사람1
		// 이름: 길동
		// 나이: 22
			
		Map<String, Object> person1 = new LinkedHashMap<>();
		person1.put("이름", "길동");
		person1.put("나이", 22);
		System.out.println(person1.toString());
		
		// 사람2
		// 이름: 둘리
		// 키: 180
		// 몸무게: 65
		Map<String, Object> person2 = new LinkedHashMap<>();
		person2.put("이름", "둘리");
		person2.put("키", "180");
		person2.put("몸무게", "65");
		System.out.println(person2.toString());
		
		Map<String, Object> person3 = new HashMap<>(person2);
		System.out.println(person3);
		
		System.out.println(person2.equals(person3));
		
	}
}
