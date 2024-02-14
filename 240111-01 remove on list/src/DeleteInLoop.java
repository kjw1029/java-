import java.util.ArrayList;

public class DeleteInLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("dog");
		list.add("eagle");
		
		// 위 리스트에서 길이가 3인 문자열을 모두 삭제하기
		// 1. 삭제가 발생하는 경우 인덱스 -1 해주기(논리적으로 복잡함)
		for(int i = 0; i < list.size(); i++) {
			String elem = list.get(i);
			if(elem.length() == 3) {
				list.remove(i);
			}
		}
		// 2. 역순으로 접근
		
		
		System.out.println(list);
	}

}
