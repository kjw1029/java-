import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(90);
		set.add(200);
		set.add(250);
		
		System.out.println(set.toString());
		
		System.out.println(set.contains(100));
		System.out.println(set.contains(150));
		
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());
		
		System.out.println(set.contains(null));
	}

}
