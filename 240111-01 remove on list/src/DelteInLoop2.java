import java.util.ArrayList;
import java.util.Iterator;



public class DelteInLoop2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("dog");
		list.add("eagle");
		
		// ** List의 반복 중에서 삭제를 할 때는 iterator를 활용하는 것이 best
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
			if (elem.length() == 3) {
				iterator.remove();
			}
		}
		System.out.println(list);
//		for(String elem : list) {
//			if(elem.length() == 3) {
//				list.remove(elem);
//			}
//		}
	}

}
