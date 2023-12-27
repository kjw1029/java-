import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double  PI = 3.14;
		System.out.println("반지름?");
		double radius = scanner.nextDouble();

		double area = radius * radius * PI;
		System.out.println("원 넓이: " + area);
	}
}
