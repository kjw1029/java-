import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
//		Set : 수학적 집합 - Collection, Iterable
//		중복을 허용하지 않음
//		동적 size 제공
		// HashSet : Set 인터페이스의 구현 클래스 : 삽입(insert) 순서를 보장하지 않음
		Set<String> set = new HashSet<>(); 
		System.out.println(set.add("강아지")); // 중복이 없어 원소 추가가 된 경우 true
		set.add("고양이");
		set.add("독수리");
		System.out.println(set.add("고양이")); // 중복인 경우 false
		
		System.out.println(set.size());
		
//		System.out.println(set.toString());
		
		for(String elem : set) {
			System.out.println(elem);
		}
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
