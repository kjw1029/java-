public class InitArray2 {
	public static void main(String[] args) {
		// long 타입의 배열 선언 및 초기화(길이가 3인 인스턴스 생성 초기화)
		long[] arr = new long[3];
		
		// double 타입 배열. 길이 4
		double[] arr2 = new double[4];
		
		// 길이값은 int 타입. 최대값 = int의 최대값.
//		int[] arr3 = new int[343.343];
//		int[] arr4 = new int[-4];
		int[] arr5 = new int[0]; // 정상 컴파일 및 실행되나, 원소값을 가질 수 없음.
		
		System.out.println(arr5.length);
//		arr5.length = 4; // 초기화된 배열 인스턴스의 길이는 변경할 수 없다.
		
		System.out.println("프로그램종료");
	}

}
