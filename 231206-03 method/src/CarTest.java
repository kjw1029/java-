
public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.speed = 10;
		// 가속도 해보고
		car.xA(30);
		car.xD(20);
		
		System.out.println(car.speed);
	}

}
