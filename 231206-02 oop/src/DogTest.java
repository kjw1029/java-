
public class DogTest {
	public static void main(String[] args) {
		// 클래스는 참조형 type
		Dog d = new Dog(); // 객체생성/ 인스턴스화
		d.name = "초코";
		d.age = 6;
		
		Dog d2 = new Dog();
		d2.name = "복실";
		d2.age = 3;
		
		System.out.println(d.name);
		System.out.println(d.age);
		
		System.out.println(d2.name);
		System.out.println(d2.age);
	}
}
