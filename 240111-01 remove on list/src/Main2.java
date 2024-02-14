import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");

		while (list.size() > 0) {
			System.out.println(list.remove(0));
		}
		
//		list.remove(17);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.remove(i));
//		}
	}

}
