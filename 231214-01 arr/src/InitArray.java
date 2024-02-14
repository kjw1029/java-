
public class InitArray {

	public static void main(String[] args) {
		// 순서를 가지는 연속된 int 자료를 표현하고자 합니다.
		// 5개의 int 정보를 가질 수 있는 배열 선언.
		int[] arr = new int[5];
		
		// 각 인덱스로 접근하여, 순서대로 각 원소(element)를 2, 4, 6, 8, 10으로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i +1) * 2;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		arr[0] = 2;
//		arr[1] = 4;
//		arr[2] = 6;
//		arr[3] = 8;
//		arr[4] = 10;
//		
	}

}
