
public class TestToString {

	public static void main(String[] args) {
		String concat = "문자열 결합, " + new Object();
		System.out.println(new Object());
		
		Object o = new Object();
		String str = "abcd";
		Box b = new Box(100, 100, 100);
		
		System.out.println(o.toString());
		System.out.println(str.toString());
		System.out.println(b.toString());
		
		
		Person p = new Person("둘리", 22);
		
		System.out.println(p.toString());
		
		Customer c = new Customer("고객", "010-1234");
		System.out.println(c.toString());
		
		Student s = new Student(100, 90, 80, "학생1", new Pen(4000));
		System.out.println(s.toString());
	}

}
