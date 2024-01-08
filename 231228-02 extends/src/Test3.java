
public class Test3 {

	public static void main(String[] args) {
//		Animal animal = new Animal(2000, 3);
//		
//		// 하향형변환은 실제 인스턴스의 형을 주의해야 합니다.
//		Lion lion = (Lion) animal;
		
		Elephant e = new Elephant(4300, 8);
		Animal a = e;
		
		System.out.println(a instanceof Elephant);
		System.out.println(a instanceof Lion);
		System.out.println(a instanceof Animal);
		
		if (a instanceof Elephant) {
			Elephant down = (Elephant) a;
		}
//		Lion l = (Lion) a;
//		System.out.println("프로그램 정상 종료");

	}

}
