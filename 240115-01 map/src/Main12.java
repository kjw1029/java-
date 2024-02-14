import java.util.HashMap;
import java.util.Map;

interface Calcul {
	int calculate (int num1, int num2);
}
public class Main12 {
	public static void main(String[] args) {
		// +, -, *, / 를 입력받아
		// 두 수의 연산결과를 출력하는 프로그램
		
		String input = "+";
		int num1 = 100;
		int num2 = 200;
		
		
		Map<String, Calcul> command = new HashMap<>();
		command.put("+", new Calcul() {
			@Override
			public int calculate(int num1, int num2) {
				return num1 + num2;
			}
		});
		command.put("-", new Calcul() {
			@Override
			public int calculate(int num1, int num2) {
				return num1 - num2;
			}
		});
		
		Calcul calculator = command.get(input);
		System.out.println(calculator.calculate(num1, num2));
//		if (input.equals("+")) {
//			System.out.println(num1 + num2);
//		} else if (input.equals("-")) {
//			System.out.println(num1 - num2);
//		}
	}

}
