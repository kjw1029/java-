import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		
		String[] arr = list.toArray(new String[0]);
		System.out.println("배열변환확인" + Arrays.toString(arr));
		
		List<String> vec = new Vector<>();
		vec.add("원소1");
		vec.add("원소2");
		vec.add("원소3");
		
		System.out.println(list.containsAll(vec));
		
		System.out.println(list.equals(vec)); // 크기, 각 원소들이 같은 인덱스에 위치하는지
		
		list.removeAll(vec);
		
		System.out.println(list.isEmpty());
		
//		System.out.println(vec.get(0));
//		System.out.println(vec.get(1));
//		System.out.println(vec.get(2));
//		
//		System.out.println(vec.size());
	}

}
