public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(100, 90, 80, "홍길동");
		s.printAll();
		
		Student s2 = new Student(new int[] {60, 70, 80}, "둘리");
		s2.printAll();
		
		Student s3 = new Student(new int[] {50}, "도우너");
		s3.printAll();
		
		Student s4 = new Student(new int[] {10, 20, 30, 40},"희동");
	}

}
