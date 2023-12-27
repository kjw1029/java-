
public class TestString {

	public static void main(String[] args) {
		// 문자열은 "불변"의 객체이다.
		// StringPool에 보관된다.
		String origin = "원본문자열";
		String sameValue = "원본문자열";
		String sameRef = origin;
		
		System.out.println(origin == sameValue);
		System.out.println(origin == sameRef);
		
//		Person person = new Person(10);
//		Person samePerson = person;
//		
//		Person anotherPerson = new Person(10);
//		
//		System.out.println(person == samePerson);
//		System.out.println(person == anotherPerson);
//		
//		anotherPerson = null; // 참조를 잃어버린 인스턴스 = 쓰레기(garbage)
//		
//		samePerson = null;
//		
//		// JVM. Garbage Collector
	}

}
