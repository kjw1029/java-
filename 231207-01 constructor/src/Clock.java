// 시계
// 시
// 분
// 초
public class Clock {
	int hour;
	int minute;
	int second;
	
	// 시간만을 전달받아서 초기화할 수 있는 생성자
	public Clock(int hour) {
		this(hour, 0, 0); // 첫문장에 작성해야 한다
	}
	
	public Clock(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public static void main(String[] args) {
		Clock c = new Clock(10, 20, 30);
		Clock c2 = new Clock(10);
		System.out.println(c2.hour);
		System.out.println(c2.minute);
		System.out.println(c2.second);
		
		
	}
}
