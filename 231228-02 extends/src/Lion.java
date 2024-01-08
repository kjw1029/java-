// 상속 구현 키워드 오른쪽 부모
public class Lion extends Animal {
	public Lion(int weight, int age) {
		super(weight,age);
		//		super(weight, age);
		
	}
	public void eatMeat() {
		System.out.println("사자는 육식을 합니다.");
	}
}
