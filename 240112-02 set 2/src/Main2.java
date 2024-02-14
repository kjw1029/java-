import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "다", "나", "나", "라", "가"));

		Set<String>set = new LinkedHashSet<>(list);
		System.out.println("중복이제거된 지합: "+ set);
		// 고유한 목록(list) : 가,다,나,라
		List<String> uniqueList = new ArrayList<>(set);
		for (int i = 0; i < uniqueList.size(); i++) {
			System.out.println(uniqueList.get(i));
			
		}
		String[] arr = set.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
//		Collections.sort(set);
	}

}
