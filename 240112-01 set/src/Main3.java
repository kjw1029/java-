import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		Set<Integer> numA = new HashSet<>(
				Arrays.asList(3, 4, 1, 2, 5));
		Set<Integer> numB = new HashSet<>(
				Arrays.asList(3, 4, 5, 6, 7));
		
		
//		System.out.println(numA);
//		System.out.println(numB);
		Set<Integer> duplicate = new HashSet<>();
		for(Integer i : numB) {
			if(numA.contains(i)) {
				System.out.println("찾은 중복된 원소" + i);
			}
		}
		System.out.println("교집합(중복값들) : " + duplicate.toString());
	}

}
