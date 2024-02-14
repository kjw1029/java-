
public class TestStringbuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(20);
		sb.append("원본");
		sb.append("추가");
		sb.append("구성");
		
		String result = sb.toString();
		System.out.println(result);
		
//		// 참조가 아님
//		char c = 'a';
//		c = 'b';

	}

}
