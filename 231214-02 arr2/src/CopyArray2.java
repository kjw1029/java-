public class CopyArray2 {
	public static void main(String[] args) {
		int[] numbers = { 20, 22, 26, 30 };
		
		// 위의 배열에서 앞 2개만을 원소로 가지는 배열생성;
		
		int[] copy = new int[2];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = numbers[i]; 
		}
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
		
		// numbers 배열의 뒤 2개 원소를 역순으로 가지는 배열 생성
		int[] reverse = new int[2];
		
		for (int i = 0, j =numbers.length-1; i <reverse.length; i++, j--) {
			copy[i] = numbers[j];
			System.out.println(copy[i]);
		}
		
	}

}
