public class CarArray2 {
	public static void main(String[] args) {
		Car c = new Car("검정", 40);
		
		Car[] arr = new Car[3];
		
		arr[0] = c;
		arr[1] = arr[0];
		arr[2] = arr[1];
		
		c.setColor("회색");
		
		System.out.println(arr[0].getColor());
		System.out.println(arr[1].getColor());
		System.out.println(arr[2].getColor());

	}

}
