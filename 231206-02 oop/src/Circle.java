// 원을 표현할 수 있는 클래스
public class Circle {
	//반지름
	double radius;
	//파이
	final double PI = 3.14;
	
	public void printArea() {
		double area = radius * radius * PI;
		System.out.println(area);
	}
}
