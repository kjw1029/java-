package plane;

public class TestStaticMethods {
	int a = 100;
	int b = 200;
	


//	public static int test() {
//		return a + b;
//	}
	
	// 상태값과 무관하게 결과를 반활할 수 있는 메소드
	// 정적변수(상수) 또는 파라미터만을 사용
	
	public static void main(String[] args) {
		int abs = Math.abs(-100);
		System.out.println(abs);
		
		double ceil = Math.ceil(12.12); // 올림
		System.out.println(ceil);
		
		double floor = Math.floor(12.12); // 버림
		System.out.println(floor);
		
		double round = Math.round(12.12); // 반올림
		System.out.println(round);
		
		int max = Math.max(10, 20);
		System.out.println(20);
		
		int max2 = Math.max(10, Math.max(20, 30));
		System.out.println(max2);
		
		double pow = Math.pow(2, 4);
		System.out.println(pow);
		
		double r = Math.random();
		System.out.println(r);
		
		int num = (int) (Math.random() * 45);
		System.out.println(num);
	}
}
