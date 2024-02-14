public class TestNull {
	public static void name(String[] args) {
		// 참조형 변수에 참조값이 없음을 나타냄(null 참조 null 값, 동작 x)
		String s = null;
		
		// 1. s의 값을 올바르게 초기화함.
//		s = "의도한 문자열값";
		
		// 2. s의 참조가 올바를 때만 접근함.
		if (s != null) { // 참조값 비교
			System.out.println();
		}
		
//		String empty = "";
		
//		String nonInt;
//		System.out.println(nonInt);
		
//		nonDecl = "값"
//		System.out.println(nonDecl);
		
		//null 참조시 컴파일은 이상없으나 실행시 오류 발생 nullpointerexception
//		System.out.println(empty.length());
		System.out.println(s.length());
	}
}