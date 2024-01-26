import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(
					Arrays.asList(1,2,3,4,5)
				);
		Set<Integer> setB = new HashSet<>(
				Arrays.asList(3,4,5,6,7)
			);
		
		Set<Integer> union = new HashSet<>();
		union.addAll(setA);
		union.addAll(setB);
		
		System.out.println(union);
		
		Set<Integer> duplicate = new HashSet<>();
		duplicate.addAll(setA);
		duplicate.retainAll(setB);
		
		System.out.println(duplicate);
		
		Set<Integer> leftOuterSecter = new HashSet<>();
		leftOuterSecter.addAll(setA);
		leftOuterSecter.removeAll(setA);
		System.out.println(leftOuterSecter);
		
	}

}
