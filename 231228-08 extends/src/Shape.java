
public class Shape {
	public void printArea() {
		// 도형이라는 도형은 넓이를 구할 수 없어요.
	}
}

class Triangle extends Shape {
	private int height;
	private int length;

	public Triangle(int height, int length) {
		super();
		this.height = height;
		this.length = length;
	}

	@Override
	public void printArea() {
		System.out.println("삼각형 넓이: " + (height * length / 2));
	}

}

class Rectangle extends Shape {
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public void printArea() {
		System.out.println("사각형의 넓이: " + (width * height));
	}

}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void printArea() {
		System.out.println("원 넓이: " + (radius * radius * 3.14));
	}
	
	
}


