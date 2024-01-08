import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		hhh h = new hhh();
		LoginManager loginManager = new LoginManager(10); // 최대 10명의 사용자를 저장할 수 있는 배열
		Calendar calendar = Calendar.getInstance(); // 정적 메소드 호출

		SimpleDateFormat kr = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat kr2 = new SimpleDateFormat("HH시 mm분 ss초");
		String result = kr.format(calendar.getTime());
		String result2 = kr2.format(calendar.getTime());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사용자 이름을 입력하세요: ");
		String username = scanner.nextLine();

		System.out.print("비밀번호를 입력하세요: ");
		String password = scanner.nextLine();

		User loggedInUser = loginManager.login(username, password);
		if (loggedInUser != null) {
			System.out.println(result);
			System.out.println(result2);
			System.out.println("로그인 성공!");
			System.out.println("현재 권한: " + (loggedInUser.isAdmin() ?  "admin" : "User"));
			if(loggedInUser.isAdmin()) {
				h.program();
			}
			
		
		} else {
			System.out.println("로그인 실패. 사용자 정보를 확인하세요.");
		}
	
	}
}