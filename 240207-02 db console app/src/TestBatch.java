import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBatch {
	public static void main(String[] args) {
		PersonDAOImpl dao = PersonDAOImpl.getInstance();
		
		
		PersonService service = new PersonService(dao);
		int result = service.insert(new Person("사람40", 99));
		
		System.out.println(dao.getAll());
		//		List<Person> list = new ArrayList<>(
//					Arrays.asList(
//								new Person("사람1", 1)
//								, new Person("사람2", 2)
//								, new Person("사람3", 3)
//								, new Person("사람4", 4)
//								, new Person("사람5", 5)
//							)
//				);
//		
//		PersonDAOImpl dao = PersonDAOImpl.getInstance();
//		int[] result = dao.batchAdd(list);
//		System.out.println(Arrays.toString(result));
	}
}






