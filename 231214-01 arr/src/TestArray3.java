import java.util.Scanner;

// 사용자에게 5개의 정수를 입력받
// 2자리 정수의 개수와 합을 출력
// 탐색한 원소들을 나열.

public class TestArray3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		int count = 0;
		
		System.out.println("5개 정수 입력");
		
		for (int i = 0; i < arr.length; i++) {
			int input = scan.nextInt();
			arr[i] = input;
		}
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num/100 == 0 && num/10 != 0) {
				sum += num;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);

		}
	}

