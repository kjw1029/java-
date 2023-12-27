// 캔음료 자판기
// 콜라 2000
// 사이다 1800
// 오렌지쥬스 2200

// 모든 메뉴의 출력
// 특정 캔의 가격

public class CanDrinkArray {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		vm.printNames();
		
		vm.printPrice(0);
		
		vm.printPrice(-2);

	}

}
