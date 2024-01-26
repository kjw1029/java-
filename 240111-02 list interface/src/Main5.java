import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> origin = new ArrayList<>(
					Arrays.asList(10, 20, 30, 40)
				);
		
		List<Integer> target = new ArrayList<>(
					Arrays.asList(60, 70, 80, 90, 100) // 불변
				);
		
		Collections.copy(target, origin);
		
		System.out.println(target);
		
//		Collections.fill(target, 999);
//		System.out.println(target);
		
		Collections.swap(target, 0, 4);
		System.out.println(target);
		
		Collections.shuffle(target);
		System.out.println(target);
		
		List<Integer> nums = Collections.nCopies(5, 99); // 불변
		System.out.println(nums);
//		nums.add(355);
		
		List<Integer> empty = Collections.emptyList(); // 불변
		System.out.println(empty);
		
		List<Integer> unmod = Collections.unmodifiableList(target); // 같은 리스트 생성하지만 불변
		System.out.println(unmod);
		
		int count = Collections.frequency(target, 100); // 갯수 체크
		System.out.println(count);
		
	}

}
