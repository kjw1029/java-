import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main11 {
	public static void main(String[] args) {
		Set<Person> set =new TreeSet<>();
		
		set.add(new Person("길동", 22));
		set.add(new Person("길동", 22));

		set.add(new Person("둘리", 33));
		set.add(new Person("둘리", 33));

		set.add(new Person("도우너", 22));
		set.add(new Person("희동", 21));
		
		System.out.println(set);
		
		Set<Person> anothPersons = new HashSet<>(set);
		System.out.println(set.equals(anothPersons));
	}

}
