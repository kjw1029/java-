// 이 주문들이 있을 때, 가격 순대로 처리.
// 피자
// 기본가격
// int 가격()

// 페퍼로니 피자
// 기본가격
// 페퍼로니 개수
// int 가격() => 기본가격 + 페퍼로니 개수 * 500

// 베이컨 피자
// 기본가격
// 베이컨 그램 수
// int 가격() => 기본가격 + 베이컨 그램 수 * 100

// 치킨 
// 기본가격
// 추가 닭다리 수
// int 가격() => 기본가격 + 추가 닭다리 * 1000

public class TestPizza {
	public static void main(String[] args) {
		Pizza pep = new PepperoniPizza(10);
		Pizza bacon = new BaconPizza(200);
		
		System.out.println(pep.getPrice());
		System.out.println(bacon.getPrice());
		
		System.out.println(pep.compareTo(bacon));
		
	}

}
