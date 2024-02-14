
public class TestArray2 {
	public static void main(String[] args) {
		int[] arr = { 3, 44, 2, 15 , 23, 36 };
		
		// 위의 배열의 원소 중 짝수만을 출력해보세요.
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
