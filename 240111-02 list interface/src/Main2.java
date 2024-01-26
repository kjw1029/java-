import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("원소1", "원소2", "원소3"));
		System.out.println(list);

		List<String> readable = Arrays.asList("원소1", "원소2", "원소3"); // 익명 클래스 추가 기능 x
		
		System.out.println(readable);
		
		readable.add("원소4");
	}

}
