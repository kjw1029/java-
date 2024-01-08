
public class CustomerEqual {

	public static void main(String[] args) {
		Customer cus1 = new Customer("고객1", "010-1234-1234");
		Customer cus2 = new Customer("고객1", "010-1234-1234");
		
		if (cus1.equals(cus2)) { 
			System.out.println("고객일치 확인");
		}
		
		Customer cus3 = new Customer("고객2", "010-3214-3214");
		
		if (cus1.equals(cus3)) {
			System.out.println("1번 3번 고객일치 확인");
		}
	}
}
