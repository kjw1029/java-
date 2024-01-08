
public class Test2 {

	public static void main(String[] args) {
		Lion l = new Lion(1000, 8);
		
		l.eatMeat();
		l.getWeight();
		l.getAge();
		
		// 상향형변환(up-casting)
		Animal a = (Animal) new Lion(1500, 9); // 자동으로 가능
		a.getAge();
		a.getWeight();
//		a.eatMeat();
		
		// 하향형변환(down-casting)
		Lion lion = (Lion) a; // 명시적 형변환 필요
		lion.eatMeat();
	}

}
