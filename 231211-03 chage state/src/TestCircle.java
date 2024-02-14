
public class TestCircle {

	public static void main(String[] args) {
		Point p = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Circle c = new Circle(5, p);
		Circle c2 = new Circle(7, p2);
		c.printCoordi();
		
		c.setNewXY(10, 10);
		
		c.printCoordi();
		
		c2.printCoordi();

	}

}
