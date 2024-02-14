import java.util.regex.Pattern;

public class Main10 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[-+]?(\\d+|\\d+\\.\\d+)");
		System.out.println(p.matcher("123.345").matches());
		System.out.println(p.matcher("12345").matches());
		System.out.println(p.matcher("12.3212345").matches());
		
		System.out.println(p.matcher("+12.3212345").matches());
		System.out.println(p.matcher(".23212345").matches());
	}

}
