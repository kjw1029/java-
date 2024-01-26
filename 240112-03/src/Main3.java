import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// 사용자가 정수값을 입력.

// 3번의 고유한 정수값 입력이 있으면
// 합을 출력

// 종료시, 모든 수의 출력

public class Main3 {
	private static void printSum(Set<Integer> set) {
		int sum = 0;
		for (Integer i : set) {
			sum += i;
		}
		System.out.println("합: " + sum);
	}

	public static void main(String[] args) {

		List<Set<Integer>> list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while (true) {
			Set<Integer> setInput = new HashSet<>();
			while (setInput.size() < 3) {
				setInput.add(scan.nextInt());
			}

			printSum(setInput);
			list.add(setInput);

			if (list.size() == 3) {
				System.out.println(list);
				System.exit(0);
			}
		}

	}

}
