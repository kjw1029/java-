import java.util.Scanner;

public class MyUserInput {
	public int inputPositiveInt(Scanner scan) {
		int number;
		do {
			System.out.println("숫자입력");
			number  =  scan.nextInt();
		} while (number < 0);
		return number;
	}
}
