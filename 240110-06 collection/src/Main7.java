import java.util.ArrayList;

public class Main7 {
	public static void main(String[] args) {
		String[] words = new String[] { "가", "가", "나", "다", "다", "라" };

		// 위 배열과 같은 길이(크기)를 가지고 원소의 값과 순서가 동일한 리스트
		ArrayList<String> list = new ArrayList<>();
		for (String elem : words) {
			list.add(elem);
		}
//		 위 배열에서 고유한 원소들만을 가지는 리스트 생성 ["가", "나", "다", "라"]
		ArrayList<String> unique = new ArrayList<>();
		for (String elem : words) {
			if (!unique.contains(elem)) {
				unique.add(elem);
			}
		}
		System.out.println(unique);
		
		System.out.println(unique.indexOf("가"));
		System.out.println(unique.indexOf("마"));
	}

}
