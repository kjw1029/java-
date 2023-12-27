import java.util.Scanner;

// 사용자 3명의 인적정보를 (이름:String, 나이:int)
// 입력받아 출력하는 프로그램

public class PersonArray {
	public static void main(String[] args) {
//		String[] names = new String[3];
//		int[] ages = new int[3];

//		scan.nextLine();
//		scan.nextInt(); // 개행문자는 남기고 실행됨 다음 스캐너에서 개행문자를 문자로 인식해버림(입력버퍼)
//		scan.nextLine();// 개행문자 제거 의도

//		scan.next(); // 위의 행동 필요없이 바로 가능 단, 띄어쓰기시 따로 인식해버림(ends emkw)
//		String s = scan.nextLine();
//		System.out.println("문자열값 확인: " + s);

		UserInfo[] users = new UserInfo[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < users.length; i++) {
			System.out.println("사용자의 이름은?");
			String name = scan.nextLine();
			System.out.println("사용자의 나이는?");
			int age = scan.nextInt();
			scan.nextLine(); // 입력 버퍼를 비움.

			users[i] = new UserInfo(name, age);
		}
		
		for (int i = 0; i < users.length; i++) {
			users[i].printAll();
		}
	}
}
