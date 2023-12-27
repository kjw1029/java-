import java.util.Arrays;
import java.util.Scanner;

//2. 분포도 (히스토그램)
// - 사용자에게 1 ~ 100 사이의 정수를 10번 입력받아서
// 각 범위의 수의 분포를 보여줄 수 있는 프로그램
// 입력예) 1 5 9 7 15 20 30 41 49 50
//	1 ~ 10) ****
//	11 ~ 20) **
//	21 ~ 30) *
//	31 ~ 40)
//	41 ~ 50) *
//    ...

public class Histogram {
	public static int[] userInput(int[] arr) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if (input >= 1 && input <= 100) {
				arr[i] = input;
			} else {
				i--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("1 ~ 100까지 입력");
		int[] arr = new int[10];

		userInput(arr);

		for (int i = 1; i <= 10; i++) {
			int a = (i - 1) * 10 + 1;
			int b = i * 10;
			System.out.print(a + "~" + b + ")");
			for (int elem : arr) {
				if (a <= elem && elem <= b) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}
}
