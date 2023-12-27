
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "길동";
		p.age = 22;
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		// 생성자(constructor) 호출
		// 기본 생성자 => 각 필드의 자료형에 따라 기본값으로 초기화해줌.
		// 정수형 기본값 : 0
		// 실수형 기본값 : 0.0
		// 논리형 기본값 : false
		// 참조형 기본값 : null
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.age);

	}

}
