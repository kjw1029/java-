class Another{}

public class Main {
	public static void main(String[] args) {
		class Point {}
		
		Point p = new Point();
		
		Another a = new Another();
		
		class MyClass {
			private int x;
			private int y;
			
			public MyClass(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			public int getX() {
				return x;
			}
			public int getY() {
				return y;
			}
			public void setX(int x) {
				this.x = x;
			}
			public void setY(int y) {
				this.y = y;
			}
			@Override
			public String toString() {
				return "MyClass [x=" + x + ", y=" + y + "]";
			}
			
		}
		MyClass m = new MyClass(100, 200);
		System.out.println(m.getX());
		m.setX(300);
		System.out.println(m.getX());
	}
}