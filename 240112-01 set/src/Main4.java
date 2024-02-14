import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> numA = new HashSet<>(Arrays.asList(3, 4, 1, 2, 5));
		Set<Integer> numB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> union = new HashSet<>();
		for(Integer i : numA) {
			union.add(i);
		}
		for(Integer i : numB) {
			union.add(i);
		}
		System.out.println(union.toString());
	}

}
