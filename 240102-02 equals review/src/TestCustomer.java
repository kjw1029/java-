import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("둘리", "010-1234-1234", 201);
		Customer c2 = new Customer("둘리", "010-1234-1234", 201);
		Customer c3 = new Customer("둘리", "010-1234-1234", 401);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		Customer[] arr = {c1, c2, c3};
		Scanner scan = new Scanner(System.in);
		System.out.println("고객정보를 입력하세요. (이름, 전화번호)");
		String name =scan.nextLine();
		String phoneNumber = scan.nextLine();
		Customer input = new Customer(name, phoneNumber, 0);
		
		int count = 0;
		for (Customer elem : arr) {
			if (elem.equals(input)) {
				count++;
			}
		}
		
		System.out.println("동일한 고객의 예약수 : " + count);
		
	}

}
