import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]+"); // 왼쪽 범위 표현이 하나 이상
		Matcher m = p.matcher("12sdji");
		
		System.out.println(m.matches());
	}

}
