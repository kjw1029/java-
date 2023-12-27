public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 5;
		c.printArea();
//		System.out.println("c 객체(원 타입) 의 넓이: " + 
//				c.radius * c.radius * c.PI);

		// 반지름 7인 원의 넓이
		c.radius = 7;
//		c.PI = 55.33 //컴파일 에러(상수)
//		System.out.println("c 객체(원 타입) 의 넓이: " + 
//				c.radius * c.radius * c.PI);
		c.printArea();
	}
}
