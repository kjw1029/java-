// 커피가게
// 커피가격 : int
// 판매량 : int

// 생성자(int) : 커피가격 초기화

// void 판매량 증가(int)
// int 총매출()
public class CoffeeStore {
	int pr;
	int co;
		public CoffeeStore(int x) {
			pr = x;
		}
		
		public void in(int a) {
			System.out.println("현재 판매량" + co);
			co += a;
			System.out.println("에서 추가" + a + "잔을 더 판매했습니다.");
		}
		
		public int to() {
            return pr * co;
		}
		
		public void ap() {
			System.out.println("커피가격: " + pr);
			System.out.println("총판매량: " + co);
			System.out.println("총매출: " + to());
		}
}
