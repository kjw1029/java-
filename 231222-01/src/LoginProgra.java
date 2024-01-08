
import java.util.Scanner;

public class LoginProgra {

	public static Scanner scanner = new Scanner(System.in);
	public static Hotel hotel = new Hotel();
	public static LoginManager loginManager = new LoginManager(10); // 최대 10명의 사용자를 저장할 수 있는 배열
//	public static CleanerProgram CleanerProgram  = new CleanerProgram();
	public static void loginStart() {

		System.out.print("사용자 이름을 입력하세요: ");
		String username = scanner.nextLine();

		System.out.print("비밀번호를 입력하세요: ");
		String password = scanner.nextLine();

		User loggedInUser = loginManager.login(username, password);
		if (loggedInUser != null) {
			System.out.println("로그인 성공!");
			//System.out.println("현재 권한: " + (loggedInUser.isAdmin() ? "매니저" : "사원"));
			if (loggedInUser.isAdmin()) {
				
			}else if(loggedInUser.getUsername().equals("데스크")) {
				Hotel.hotel();
			}else if(loggedInUser.getUsername().equals("청소")) {
				//CleanerProgram.cleanerProgram();
			}
		} else {
			System.out.println("로그인 실패. 사용자 정보를 확인하세요.");
			loginStart();
		}
	}

	public static void loginEnd() {
		Scanner endScrChk = new Scanner(System.in);
		System.out.println("정말 종료하시겠습니까?(네)");
		String endProgram = endScrChk.nextLine();
		if (endProgram.equals("네")) {
			loginStart();
		}
	}



}
