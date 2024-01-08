
public class TestShape {

	public static void main(String[] args) {
		Triangle t = new Triangle(100, 100);
		t.printArea();
		
//		Shape s = new Shape();
		Shape s = t;
		s.printArea();
	}

}
