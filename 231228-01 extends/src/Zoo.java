// 동물원
// 동물[]

// 사자 - 몸무게, 나이, 육식을 함

// 코끼리 - 몸무게, 나이, 초식을 함

// 오리 - 몸무게, 나이, 날 수 있음, 꽥꽥 소리를 냄

// 독수리 - 몸무게, 나이, 날수 있음, 사냥을 할 수 있음

public class Zoo {
	private Animal[] animal;
	
	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		zoo.animal = new Animal[] { new Duck(3, 3), new egle(3, 4), new Elephant(1200, 7), new Lion(1100, 5) };
		
		// 위 배열에서
		// 사자는 몇 번쨰 인덱스에 위치하나요?
		
		// bird는 몇 마리 인가요?
		int count = 0;
		for (int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Duck) {
				Duck duckdown = (Duck) zoo.animal[i];
				duckdown.fly();
			} else if (zoo.animal[i] instanceof egle) {
				egle egledown = (egle) zoo.animal[i];
				egledown.Hunt();
			} else if (zoo.animal[i] instanceof Lion) {
				Lion liondown = (Lion) zoo.animal[i];
				liondown.eatMeat();
				System.out.println("사자 인덱스" + i);
			} else if (zoo.animal[i] instanceof Elephant) {
				Elephant elephantdown = (Elephant) zoo.animal[i];
				elephantdown.eatHay();
				System.out.println(elephantdown.getWeight());
			} if(zoo.animal[i] instanceof Bird) {
				count++;
			}

		}
		System.out.println("새는 총 " + count + "마리");
		System.out.println("프로그램 종료");
	}
}