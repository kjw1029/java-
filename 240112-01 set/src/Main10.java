import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main10 {
	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<>(Collections.reverseOrder());
		
		nums.add(100);
		nums.add(200);
		nums.add(10);
		nums.add(30);
		nums.add(250);
		
		System.out.println(nums);
	}

}
