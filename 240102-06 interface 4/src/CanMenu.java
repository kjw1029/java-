interface MenuNumber {
	final int COLA = 1;
	final int CIDAR = 2;
	final int ORANGE_JUICE = 3;
}
public class CanMenu {

	public static void main(String[] args) {
		int userInput = 1;

		switch (userInput) {
		case MenuNumber.COLA:
			System.out.println("콜라");
			break;

		case MenuNumber.CIDAR:
			System.out.println("사이다");
			break;

		case MenuNumber.ORANGE_JUICE:
			System.out.println("오렌지쥬스");
			break;
		default:
			System.out.println("메뉴없음");
		}
	}

}
