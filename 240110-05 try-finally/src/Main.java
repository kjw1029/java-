
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("문장1");
			System.out.println(10/0);
			System.out.println("문장2");
			System.out.println("문장3");
			
			System.out.println("꼭 실행되어야 하는 마지막 문장");
		} catch (Exception e) {
			System.out.println("catch 블럭");
		} finally {
			System.out.println("finally 블럭");
		}
		System.out.println("프로그램종료");
	}
}
