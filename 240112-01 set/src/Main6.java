import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<Integer> numA = new HashSet<>(Arrays.asList(3, 4, 1, 2, 5));
		Set<Integer> numB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> leftOuterSecter = new HashSet<>(new HashSet<>(numA));
		
		for(Integer i : numB) {
			leftOuterSecter.remove(i);
		}
		
		
		System.out.println(leftOuterSecter.toString());
	}

}
