class MyMethods {
	// overload -> 메소드 이름은 같으나, 파라미터의 타입, 개수, 순서
	public void print(int a) {
		System.out.println(a);
	}
//	public void print(int asdfasdf) { // 중복메소드 컴파일 에러
//	}
	public void print (double a) {
		System.out.println(a);
	}
}

class MyExtMethods extends MyMethods {
	// Override -> 부모의 메소드 header와 일치
	@Override
	public void print(int a) {
		System.out.println("정수의 값은" + a);
	}
}

public class Main {
	public static void main(String[] args) {
		

	}

}
