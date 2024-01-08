import java.util.Scanner;

public class ReservationProgram {
	private Scanner scanner;
	private HotelManageImpl manager;
	
	public ReservationProgram() {
		scanner = new Scanner(System.in);
		manager = new HotelManageImpl();
	}
	
	private Customer inputCutomer() {
		System.out.println("고객정보 이름, 번호");
		String name = scanner.nextLine();
		String number = scanner.nextLine();
		return new Customer (name, number);
		
	}
	
//	private reservation() {
//		
//	}
}
