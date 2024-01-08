import java.util.Arrays;

public class TestPerson {
	public static void main(String[] args) {
		String a;
		
		Person p = new Person(180, 80, "길동");
		Person p2 = new Person(180, 80, "길동");
		Person p3 = new Person(190, 70, "마이콜");
		
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		
		System.out.println(p.compareTo(p2));
		System.out.println(p.compareTo(p3));
		
		Person[] arr = { p, p2, p3, new Person(170, 90, "둘리") };
		Arrays.sort(arr, new NameComparator());
		
		for (Person elem : arr) {
			System.out.println(elem);
		}
		
//		if(p > p3) {
//			
//		}
	}
}
