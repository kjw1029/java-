
public class TestString2 {

	public static void main(String[] args) {
		String origin = "원본";
		String same = "원본";
		
		origin += "추가";
		origin += "구성";
		
		System.out.println(origin);
		System.out.println(same);
		System.out.println(origin == same);
		
//		Person person = new Person(10);
//		Person same = person;
//		
//		person.setAge(15);
//		
//		System.out.println(same.getAge());

	}

}
