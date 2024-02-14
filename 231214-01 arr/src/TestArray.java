public class TestArray {
	public static void main(String[] args) {
//		 배열(Array)
//		 같은 자료형의 정보들이 순서를 가지고 연속되어 있는 구조
		int[] arr;	// 배열 변수 선언
//		길이(length)가 5. (총 int 개수 5개)
		arr = new int[5]; // 배열 인스턴스 생성 및 arr 변수 초기화
		
//		arr = 10;
//		index (0 ~ (길이값-1))
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
	}
}