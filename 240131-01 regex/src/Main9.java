import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main9 {
	public static void main(String[] args) {
		// . => 1개 문자 일치. 예외)개행문자 
		// \. => .문자
		Pattern p = Pattern.compile("\\d+\\.\\d+");
		Matcher m = p.matcher("3444321432.23342");
		System.out.println(m.matches());
	}

}
