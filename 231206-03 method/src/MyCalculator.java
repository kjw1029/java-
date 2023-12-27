
public class MyCalculator {
	// (..) - 파라미터
	// () : 파라미터가 없음
	// (자료형 이름) : 파라미터가 하나
	// (자료형 이름1, 자료형 이름2) : 파라미터가 두 개
	public int plus(int left, int right) {
		int sum = left + right;
		return sum;
	}
	
	// 두 정수를 파라미터로 전달받아
	// 차를 구해 반환하는 메소드
	// (큰수에서 작은수를 뺌)
	public int minus(int left, int right) {
		int a = 0;
		if (left > right) {
			return left - right;
		} else {
		    return right - left;
		}
	}
	
	// 0부터 파라미터로 입력받은 정수까지의 합을 반환하는 메소드
	
	public int getSumFromZero(int to) {
		int sum = 0;
		for (int i = 0; i <= to; i++) {
			sum+=i;
		}
		return sum;
		
	}
}
