import java.util.Arrays;
import java.util.Scanner;

// 사용자가 입력한 정수만큼
// 정수를 반복 입력받아
// 입력받은 정수들 중, 소수의 개수와 목록을 출력하기

public class UserLength {
	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 수를 확인함?");
		int length = scan.nextInt();
		
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < length; i++) {
			if(isPrime(arr[i])) {
				count++;
			}
		}
		System.out.println("집계된 소수의 개수: "+count);
		
		for (int i = 0; i < length; i++) {
			if (isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
//		int[] arr = new int[];
//		
//		while (true) {
//			isPrime(scan.nextInt());
//			if (isPrime(scan.nextInt()) == true) {
//				arr[] = number;
//			}
//		}
	}

}
