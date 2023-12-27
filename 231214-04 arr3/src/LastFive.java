import java.util.Arrays;
import java.util.Scanner;

// 사용자가 음수를 입력할 때까지
// 반복 입력을 받는 프로그램.

// 종료 전 최근 5개의 정수들을 나열 (순서 무관)

public class LastFive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 음수 입력시 정지");
		int[] arr = new int[5];
	
		int next = 0;
		while(true) {
			int input = scan.nextInt();
			
			if (input < 0) {
				break;
			}
			
			arr[next] = input;
			
			next++;
			if (next >= 5) {
				next = 0;
			} 
		}
		System.out.println(Arrays.toString(arr));
	}

}
