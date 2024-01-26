import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(); // arraylist보다 속도가 조금 더 빠름, 연속자료? x 순환접근시 느림
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2)+"\n");
		
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
	}

}
