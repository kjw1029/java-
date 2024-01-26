import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 사용자가 정수를 계속 입력함.

// 매 3회의 입력이 있을 때
// 입력한 정수를 나열하고 합을 출력

// 음수를 입력하면 종료
// 모든 정수 입력 기록을 출력

public class NumbersSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> total = new ArrayList();

		while (true) {
			// 정수 입력
			System.out.println("정수입력");
			int input = scan.nextInt();
			if (input > 0) {
				list.add(input);
				total.add(input);

				// 3번째마다 덧셈
				if (list.size() == 3) {
					System.out.printf("%d + %d + %d = %d\n", list.get(0), list.get(1), list.get(2),
							list.get(0) + list.get(1) + list.get(2));
					list.clear();

				}
			} else {
				System.out.println(total);
				break;
			}
		}

	}

}
