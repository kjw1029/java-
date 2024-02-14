import java.util.Scanner;

public class TestUseA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyUserInput my = new MyUserInput();
		int number = my.inputPositiveInt(scan);
		
		System.out.println("입력한 숫자: " + number);
		
		int number2 = my.inputPositiveInt(scan);
		System.out.println("입력한 숫자: " + number2);

	}

}
