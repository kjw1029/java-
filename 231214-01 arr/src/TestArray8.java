public class TestArray8 {
	// 문자 배열과 index 값을 전달받아 해당하는 원소값을 반환하는 정적 메소드
	
	public static char charAt(char[] target, int index) {
		if (index >= 0 && index < target.length) {
		return target[index];
		}
		return '\0'; // null 문자라고 부름
	} 
	public static void main(String[] args) {
		char[] abc = { 'a', 'b', 'c' };
		
		char ch = charAt(abc, 1);
		System.out.println(ch);
		
		System.out.println(charAt(abc, -3));
		charAt(abc, 9);
	}

}