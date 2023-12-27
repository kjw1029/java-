
public class VendingMachine {
	CanDrink[] cans;

	public VendingMachine() {
		cans = new CanDrink[3];
		cans[0] = new CanDrink("콜라", 2000);
		cans[1] = new CanDrink("사이다", 1800);
		cans[2] = new CanDrink("오렌지쥬스", 2200);
	}

	public void printNames() {
		for (CanDrink c : cans) {
			System.out.println(c.getNaem());
		}
//		for (int i = 0; i < cans.length; i++) {
//			System.out.println(cans[i].getNaem());
//		}
	}

	public void printPrice(int index) {
		if (index >= 0 && index < cans.length) {
			System.out.println(cans[index].getPrice());
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}
}
