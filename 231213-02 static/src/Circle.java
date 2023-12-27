import java.util.Calendar;

public class Circle {
	int radius;
	public final static double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(9);
		
		System.out.println(Math.PI);
//		Circle.pi = 5.5555; final로 인한 값 변경 불가로 컴파일
		
		System.out.println(Calendar.YEAR);
	}
}
