import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class HotelProgram {
	public static void main(String[] args) {
		ManageID manager = new ManageID(
				new ID[] { new ID("manager", "1234"), new ID("infoDesk", "1234"), new ID("Cleaner", "1234") });

		boolean go = true;
		while (go) {

			Scanner scan = new Scanner(System.in);
			System.out.println("----- 메뉴 -----");
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int menuNum = scan.nextInt();

			switch (menuNum) {
			case 1:
				scan.nextLine();
				System.out.println("---- 로그인 ----");
				System.out.println("1. 아이디를 입력하세요.");
				String id = scan.nextLine();
				System.out.println("2. 비밀번호를 입력하세요.");
				String password = scan.nextLine();

				if (manager.contain(id, password)) {
					if (id.equals("manager")) {
						System.out.println("매니저님 환영합니다.");
						ManageID.printNowTime();
					} else if (id.equals("infoDesk")) {
						System.out.println("데스크 직원님 환영합니다.");
						ManageID.printNowTime();
						InfoDesk.printInfoDeskMenu();
					} else if (id.equals("Cleaner")) {
						System.out.println("청소 직원님 환영합니다.");
						ManageID.printNowTime();
					}
				} else {
					System.out.println("일치 정보가 없습니다.");
				}
				break;
			case 2:
				
				return;
			}

		}
	}

}
