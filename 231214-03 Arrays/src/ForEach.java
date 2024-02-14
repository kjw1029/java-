public class ForEach {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 7, 8 };
		
		// 정순. 순환하는 배열의 원소 수정 x
		for (int elem : arr) {
			System.out.println(elem);
		}
	}
}
