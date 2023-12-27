import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// 1. 좌석 예약 프로그램 (콘솔 입출력)
//  - 10개의 좌석이 준비되어 있음.
//  - 사용자는 메뉴 선택 입력을 통해, 현재 좌석 예약 상태를 볼 수 있어야 함.
//  출력예) (o : 예약가능한 좌석, x : 예약된 좌석)
//       1 2 3 4 5 6 7 8 9 10
//	     o x x o x o o o x x
//  - 사용자는 메뉴 선택 입력을 통해, 좌석을 예약할 수 있어야함.
//  예) 몇 번째 좌석을 예약하시겠습니까? 4
//       1 2 3 4 5 6 7 8 9 10
//       o x x x x o o o x x
public class Seats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		char[] state = { 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'x' };
		System.out.println("예약 현황");
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(state) + "\n");
		System.out.println("몇 번째 좌석을 예약하시겠습니까?");

		while (true) {
			int num = scan.nextInt();
			if (state[num - 1] == 'o') {
				state[num - 1] = 'x';
				System.out.println(Arrays.toString(number));
				System.out.println(Arrays.toString(state));
				System.out.println("예매 완료");
				break;
			} else if (state[num - 1] == 'x') {
				System.out.println("예약된 좌석입니다.");
				System.out.println(Arrays.toString(number));
				System.out.println(Arrays.toString(state));
				System.out.println("몇 번째 좌석을 예약하시겠습니까?");
			}
		}

	}
}
