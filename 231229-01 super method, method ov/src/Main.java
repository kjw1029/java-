
class MySuper {
	public void printHello() {
		System.out.println("Hello");
	}
}

class MySub extends MySuper {
	// Method Override
	// 부모의 클래스에서 정의된 메소드(Head가 같은 메소드)를 새 구현(Body를 작성)
	public void printHello() {
//		System.out.println("Hello");
		super.printHello();
		System.out.println("HI");
	}
}

public class Main {
	public static void main(String[] args) {
		MySuper sup = new MySuper();
		sup.printHello();
		
		MySub sub = new MySub();
		sub.printHello();
	}
}