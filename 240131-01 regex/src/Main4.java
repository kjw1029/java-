import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String input = "Hello";
		String input2 = "Aello";
		
		Pattern p =Pattern.compile("[A-Z]ello"); // 대괄호 문자 하나 나타내고 범위 표현 가능
		Matcher m = p.matcher(input);
		System.out.println(m.matches());
		Matcher m2 = p.matcher(input2);
		System.out.println(m2.matches());
		
	}

}
