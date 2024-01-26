import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
		
		boolean result = set.remove(10);
		System.out.println(result);
		System.out.println(set.size());
		
		System.out.println(set.remove(40));

	}

}
