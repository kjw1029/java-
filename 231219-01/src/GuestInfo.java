import java.util.Scanner;

public class GuestInfo {
	private String name;
	private int number;
	private int date;
	private int single;
	
	public GuestInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scan.next();
		System.out.println("번호를 입력하세요");
		number = scan.nextInt();
		this.name = name;
		this.number = number;
	}
	
	public GuestInfo(String name, int number, int date, int single) {
		super();
		this.name = name;
		this.number = number;
		this.single = single;
		this.date = date;
	}

	public GuestInfo(String name, int number, int date) {
		this.name = name;
		this.number = number;
		this.date = date;
	}
	

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	

	public boolean matches(String name, int number, int date) {
		if (this.name.equals(name) && this.number == number && this.date == date) {
			return true;
		}
		return false;
	}

//	public void reservationMenu() {
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("메뉴를 선택하세요.");
//			System.out.println("1. 예약");
//			System.out.println("2. 예약확인");
//			System.out.println("3. 예약변경");
//			int input = scan.nextInt();
//			if (input == 1) {
//				System.out.println("이름을 입력하세요");
//				String name = scan.next();
//				System.out.println("번호를 입력하세요");
//				int number = scan.nextInt();
//				System.out.println("날짜를 입력하세요");
//				int date = scan.nextInt();
//				Reservation[] re = new Reservation[] {new Reservation(name, number, date)};
//				ReservationList rerr = new ReservationList(re);
////				Reservation[] re = new Reservation[3] ;
//////						String[] re = new String[3];
////						re[0].getName() = "name";
////						re[1] = number;
////						re[2] = date;
////				System.out.println(Arrays.toString());
//				break;
//			} else if (input == 2) {
//				System.out.println("이름을 입력하세요");
//				String name = scan.next();
//				System.out.println("번호를 입력하세요");
//				int number = scan.nextInt();
//				System.out.println("날짜를 입력하세요");
//				int date = scan.nextInt();
//				boolean bool = matches(name, number, date);
//				System.out.println(bool);
//			} else if (input == 3) {
//				System.out.println("이름을 입력하세요");
//				String name = scan.next();
//				System.out.println("번호를 입력하세요");
//				int number = scan.nextInt();
//				System.out.println("날짜를 입력하세요");
//				int date = scan.nextInt();
//				boolean bool = !matches(name, number, date);
//				System.out.println(bool);
//				break;
//			} else {
//				System.out.println("잘못된 입력입니다.");
//			}
//			
//
//		}
//	}
//
//}

}
