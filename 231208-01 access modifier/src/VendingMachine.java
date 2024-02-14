import java.util.Scanner;

// 사용자의 
// 자판기 시뮬레이션

// 콘솔차에
// 1. 상품 목록
// 2. 선택 구입
public class VendingMachine {
	final String MENU1 = "콜라";
	final String MENU2 = "사이다";
	final String MENU3 = "오렌지쥬스";
	
	private void showList() {
		System.out.println("상품목록");
		System.out.println("1. " + MENU1);
		System.out.println("2. " + MENU2);
		System.out.println("3. " + MENU3);
	}

	private int userInput() {
		Scanner sc = new Scanner(System.in);
		int intput = sc.nextInt();
		return intput;
	}

	public void printResult(int input) {
		if (input == 1) {
			System.out.println("선택하신 물품은" + MENU1);
		} else if (input == 2) {
			System.out.println("선택하신 물품은" + MENU2);
		} else if (input == 3) {
			System.out.println("선택하신 물품은" + MENU3);
		}
	}
	
	public void process() {
		while (true) {
			showList();
			int input = userInput();
			if (input < 1 || input >3) {
				System.out.println("잘못된 입력입니다. 종료");
				break;
			}
			printResult(input);
		}
	}
}
