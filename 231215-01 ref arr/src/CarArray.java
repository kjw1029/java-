import java.util.Arrays;

public class CarArray {
	public static void main(String[] args) {
		Car[] arr = new Car[3];
		
		arr[0] = new Car("빨강", 10);
		arr[1] = new Car("파랑", 20);
		arr[2] = new Car("초록", 30);
		
		Car red = arr[0];
		System.out.println(red.getColor());
		System.out.println(red.getSpeed());
		
		System.out.println(arr[1].getColor());
		System.out.println(arr[1].getSpeed());
		
		
	}
}
