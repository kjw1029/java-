import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");
		
		System.out.println(list);
		
		list.remove(0);
		list.remove("원소4");
		
		
//		list.clear();
		
		System.out.println(list);
	}

}
