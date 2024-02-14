import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main8 {
	public static void main(String[] args) {
		// \w : [A-Za-z0-9_] 특수 문자 밑줄
		// \d : [0-9]
		// ? : {0,1}
		// + : {1,}
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher("3nfje2ksd_fsjdsjfasnenj2f");
		
		System.out.println(m.matches());
	}

}
