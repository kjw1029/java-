import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = 0;
		int a = 0;

		try {
			a = scan.nextInt();
			b = scan.nextInt();

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생확인");
			System.out.println("0으로 x");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해야합니다");
		} catch(RuntimeException e) { // 부모클래스 위로 갈시 컴파일 에러, 순서중요
			System.out.println("ArithmeticException예외와 InputMismatchException 예외를 제외한 모든 Runtime 예외 처리");
		}
		

//		System.out.println(a);
//		System.out.println(b);
	}

}
