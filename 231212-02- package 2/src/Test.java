
public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("문자열");
		sb.append(true);
		sb.append(78.12);
		sb.append("zzzz");
		
		// 스트링빌더가 만들고 있는 준자열을 뒤집는 메소드를 찾아 호출해 결과 확인해보기
		sb.reverse();
		
		String result = sb.toString();
		System.out.println(result);
	}
}
