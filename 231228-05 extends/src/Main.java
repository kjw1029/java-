// 자동차
// 색깔
// 속도
// 가속
// 감속

// 스포츠카
// 속도
// 터보 기능 유무
// 가속
// 감속

// 트럭
// 최대 적재 중량
// 속도
// 가속
// 감속 

class Car {
	private int speed;
	private String color;
	
	public Car(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	public void increas() {
		speed ++;
	}
	public void decrease() {
		speed --;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Truck t = new Truck(0, "검정", 1000);
		t.increas();
		t.increas();
		t.decrease();
		System.out.println(t.getMaxWeight());
	}

}
