
public class Human {
	String name;
	int age;
	
	// 개발자의 의도에 따라
	// 필요한 필드를 초기화하는 생성자를 정의할 수 있다.
	// 반환형X, 이름은 클래스 이름, 파라미터(순서와 자료형을 명시)
	public Human(String n, int a) {
		name = n;
		age = a;
	}
	
	public static void mian(String[] args) {
		Human h = new Human("둘리", 30);
		
		System.out.println(h.name);
		System.out.println(h.age);
	}
}
