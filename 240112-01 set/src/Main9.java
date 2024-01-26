import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main9 {
	public static void main(String[] args) {
		Set<Integer> nums =new TreeSet<Integer>(
				Arrays.asList(100, 200, 30, 50, 250));
		System.out.println(nums.toString());
		
		nums.add(100);
		
		System.out.println(nums.size());
	}

}
