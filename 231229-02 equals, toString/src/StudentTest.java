
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(100, 100, 100, "둘리", new Pen(3000));
		Student s2 = new Student(100, 100, 100, "도우너", new Pen(3000));
		Student s3 = new Student(100, 100, 100, "둘리", null);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
