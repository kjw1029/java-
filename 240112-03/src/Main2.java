import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(Arrays.asList(1,2,3));
		list.add(Arrays.asList(4,5,6));
		list.add(Arrays.asList(7,8,9));
		
		for(List<Integer> l : list) {
			System.out.println(l);
		}
		
		for(int i = 0; i <list.size(); i++) {
			for(int j = 0; j <list.get(i).size(); j++) {
				System.out.println(list.get(i).get(j));
			}
		}
		
	}

}
