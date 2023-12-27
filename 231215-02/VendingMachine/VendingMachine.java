package VendingMachine;
// 환전 프로그램 

import java.util.Arrays;
import java.util.Scanner;

//회원가입 X

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int[] money = new int[4] ;
//		money[0] = 10000;
//		money[1] = 20000;
//		money[2] = 30000;
//		money[3] = 40000;
//		
//		System.out.println(Arrays.toString(money));
//		
//		
//		

		ManageCoins manager = new ManageCoins(
				new Coins[] { new Coins(1, 1), new Coins(2, 2), new Coins(3, 3), new Coins(4, 4) });

		int[] unit = { 1000, 1, 100, 5 }; // 환율
		System.out.println("사용하는 통화단위를 입력하세요.");
		System.out.println("1. 원(1000) / 2. 달러(1)/ 3. 엔(100)/ 4. 위안(5)");
		int userType = scan.nextInt(); // 번호고르기
		System.out.println("환전할 금액을 입력하세요.");
		int userNum = scan.nextInt(); // 환전 금액

		System.out.println("환전할 통화단위를 입력하세요.");

		System.out.println("1. 원 / 2. 달러/ 3. 엔/ 4. 위안");
		int transType = scan.nextInt(); // 번호고르기
		if (manager.contain(userType, transType)) {
			System.out.println("환전이 불가능합니다.");
		} else {
			System.out.println("환전이 가능합니다.");
			int result = userNum / (unit[userType - 1] / unit[transType - 1]);
			System.out.println(unit[userType - 1]);
			System.out.println(unit[transType - 1]);
			System.out.println(userNum);
			System.out.println(userNum + "을" + result);
		}
//		원을 달러러
//		
//	    금액원/ (환율원/환율달)
//		원/원/엔
//		원/원/위안
//		user/user/trans
//		엔 /엔 /위안
//		money[userType - 1] += userNum;
//		System.out.println(money[userType - 1]);

	}
}
