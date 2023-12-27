import java.util.Scanner;

// 사용자에게 3개의 정수를 입력받아
// 합을 출력하는 프로그램.


// 사용자가 입력한 정수를 최근의 것부터 나열
public class TestArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		
		int sum = 0;
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			int input = scan.nextInt();
			sum += input;
			num[i] = input;
		}
		System.out.println(sum);
		
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}

}
