
public class carTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed = 0;
		c1.xA(10);
		Car c2 = new Car();
		c2.speed = 10;
		c2.xA(100);
		Car c3 = new Car();
		c3.speed = 20;
		c3.xA(50);
		
		System.out.println(c1.speed);
		System.out.println(c2.speed);
		System.out.println(c3.speed);

	}

}
