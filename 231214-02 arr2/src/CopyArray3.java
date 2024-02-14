public class CopyArray3 {
	public static void main(String[] args) {
		int[] numbers = { 20, 22, 26, 30 };
		
		// 위의 배열의 원소를 모두 가지는 길이가 6인 배열 생성
		
		int[] copy = new int[6];
		for(int i = 0; i < copy.length; i++) {
			copy[i] = 100;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}

}
