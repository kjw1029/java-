class SubClass extends TestStatic {
//	public static int a = 30;
	
	public static void print() {
		System.out.println("자식 정적 메소드");
	}
}
public class TestStatic {
	public static int a = 10;
	public static final int NUMBER = 22;
	
	public static void print() {
		System.out.println("정적 메소드");
	}
	
	public static void main(String[] args) {
		TestStatic.print();
		SubClass.print();
		
		TestStatic.a = 50;
		
		System.out.println(TestStatic.a);
		System.out.println(SubClass.a);
		
		System.out.println(TestStatic.NUMBER);
		System.out.println(SubClass.NUMBER);
		
	}
}
