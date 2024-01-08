class MySub extends MySuper {
	public MySub() {
		System.out.println("자식 클래스의 생성자가 호출되었습니다.");
	}
}
public class MySuper {
	public MySuper() {
		System.out.println("부모클래스의 생성자가 호출되었습니다.");
	}
	public static void main(String[] args) {
		MySub mySub = new MySub();
		
	}
}
