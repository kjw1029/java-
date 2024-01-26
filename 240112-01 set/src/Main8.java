import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main8 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("고양이");
		set.add("강아지");
		set.add("고양이");
		set.add("독수리");
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
		for(String elem : set) {
			System.out.println(elem);
		}
		
		Set<String> another = new HashSet<>(set);
		System.out.println(another);
		
		System.out.println(set.equals(another));
	}

}
