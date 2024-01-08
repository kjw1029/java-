
public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(10, 20, 30);
		Box b3 = new Box(30, 20, 10);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));

	}

}
