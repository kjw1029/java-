
import java.util.Arrays;
import java.util.Scanner;

public class CleanerProgram {
	public static void main(String[] args) {
		
//	String cleanerProgram() {
	//public static void main(String[] args) {
		
		Scanner end = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("층수를 선택하세요");
		System.out.println("나가기");
		System.out.println("2층, 3층, 4층, 5층");
		
		int ff = scan.nextInt();
		
	

		char num[] = { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' ,'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' };

		
		if(ff == 2)
		while (true) {
			for (int i = 0; i < num.length; i++) {
				System.out.printf("%02d ", (i + 200) + 1);
			}
			System.out.println("");
			for (int i = 0; i < num.length; i++) {
				System.out.printf("%c   ", num[i]);
			}

			System.out.print("\n청소를 완료한 방을 선택하세요.");
			int ib = scan.nextInt();
			char x = 'X';
			if (num[ib - 1] == 'O') {

				num[ib - 1] = x;
				System.out.println("확인되었습니다.");
			} else {
				System.out.println("이미 완료된 방입니다.");
			}
		}
		if(ff == 3)
			while (true) {
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%02d ", (i + 300) + 1);
				}
				System.out.println("");
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%c   ", num[i]);
				}

				System.out.print("\n청소를 완료한 방을 선택하세요.");
				int ib = scan.nextInt();
				char x = 'X';
				if (num[ib - 1] == 'O') {

					num[ib - 1] = x;
					System.out.println("확인되었습니다.");
				} else {
					System.out.println("이미 완료된 방입니다.");
				}
			}
		if(ff == 4)
			while (true) {
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%02d ", (i + 400) + 1);
				}
				System.out.println("");
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%c   ", num[i]);
				}

				System.out.print("\n청소를 완료한 방을 선택하세요.");
				int ib = scan.nextInt();
				char x = 'X';
				if (num[ib - 1] == 'O') {

					num[ib - 1] = x;
					System.out.println("확인되었습니다.");
				} else {
					System.out.println("이미 완료된 방입니다.");
				}
			}
		if(ff == 5)
			while (true) {
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%02d ", (i + 500) + 1);
				}
				System.out.println("");
				for (int i = 0; i < num.length; i++) {
					System.out.printf("%c   ", num[i]);
				}

				System.out.print("\n청소를 완료한 방을 선택하세요.");
				int ib = scan.nextInt();
				char x = 'X';
				if (num[ib - 1] == 'O') {

					num[ib - 1] = x;
					System.out.println("확인되었습니다.");
				} else {
					System.out.println("이미 완료된 방입니다.");
					
				}

					
			}
			
		
		
	}	
}