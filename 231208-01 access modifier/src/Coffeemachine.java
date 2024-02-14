// 커피 기계
// 커피 가루 준비
// 물 끓임
// 커피 완성
public class Coffeemachine {
	public void readyCoffePowder() {
		System.out.println("커피 가루 준비");
	}
	
	public void boilWater() {
		System.out.println("물 끓임");
	}
	
	public void completeCoffe() {
		System.out.println("커피 완성");
	}
	
	public void process() {
		readyCoffePowder();
		boilWater();
		completeCoffe();
	}
}
