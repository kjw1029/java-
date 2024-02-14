// 램프
// 상태: 불이 켜짐 or 불이 꺼짐
// 동작: 불을 껐다/켰다.
public class Lamp {
	boolean isOn;
	
	public void button() {
		isOn =!isOn;
	}
	
	public void printState() {
		if (isOn) {
			System.out.println("켜져있습니다.");
		} else {
			System.out.println("꺼져있습니다.");
		}
	
	
	}
	public static void main(String[] args) {
		Lamp l = new Lamp();
		l.isOn = false;
		l.printState();
		l.button();
		l.printState();
		l.button();
		l.printState();
	}
}
