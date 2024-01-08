class MySuper {
	private void print() {
		System.out.println("출력");
	}
	void hi() {
		System.out.println("하이");
	}
	protected void hello() {
		System.out.println("헬로");
	}
}
class Mysub extends MySuper {
	@Override
	public void hi() { // 넓은 방향으로 접근제한 가능
		System.out.println("재정의 하이");
	}
//	@Override
//	private void print() {
//		
//	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
