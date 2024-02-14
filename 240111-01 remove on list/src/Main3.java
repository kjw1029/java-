import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");
		
		boolean result = list.remove("원소1");
		System.out.println(result);
		
		System.out.println(list.remove("없는객체"));
	}

}
