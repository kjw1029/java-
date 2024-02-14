import java.util.Scanner;

// 가입정보
// 아이디
// 비밀번호

// 다음과 같은 회원정보
// Pjava, l@veJava
// qwer, 1q2w3e
// aaabb, cccdd

// 사용자 입력(아이디, 비밀번호)을 받아서
// 해당 정보의 유무를 출력할 수 있는 프로그램
public class AccessProgram {

	public static void main(String[] args) {
		ManageIDs manager = new ManageIDs(
				new ID[] { new ID("Pjava", "l@veJava")
						,new ID("qwer", "1q2w3e")
						,new ID("aaabb", "cccdd")
				});
				
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = scan.nextLine();
		System.out.println("비밀번호 입력");
		String pass = scan.nextLine();
		
		if(manager.contain(id, pass)) {
			System.out.println("일치 정보가 있습니다.");
		} else {
			System.out.println("일치 정보가 없습니다.");
		}
		
		

		

	}

}
