
public class CalculatorTest {

	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		cal.plus(100, 200);
		
		int result = cal.minus(200, 800);
		
		System.out.println(cal.plus(100, 200));
		System.out.println(result);
		

		int range = cal.getSumFromZero(50);
		
		System.out.println(range);
		
		System.out.println("프로그램 종료");
		
	}

}
