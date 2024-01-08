import java.util.Scanner;

public class TestObj {

	public static void main(String[] args) {
		Duck d = new Duck(1,1);
		System.out.println(d.hashCode());
		System.out.println(d.toString());
		System.out.println(d.getClass());
		
		Object o = "문자열";
		Object o2 = new Scanner(System.in);
		Object o3 = new int[3];
		Object o4 = new Zoo();
		
		
	}

}
