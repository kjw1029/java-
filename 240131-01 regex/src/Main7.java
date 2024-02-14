import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]{1,10}");// 영소문자로 한글자에서 열글자 사이
		Pattern p2 = Pattern.compile("[a-z]{1,}"); // 최소값
		Pattern p3 = Pattern.compile("[a-z]{5}"); //최대값
		Matcher m = p2.matcher("");
		
		System.out.println(m.matches());
	}

}
