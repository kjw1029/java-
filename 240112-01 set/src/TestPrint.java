import java.util.Arrays;

public class TestPrint {
	public static void print(String line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		print("asdf");
		print(Arrays.asList("10", "20").toString());
	}
}
