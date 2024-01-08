
public class StringEquality {

	public static void main(String[] args) {
		String word = "사과";
		
		String apple = "사과";
		
		String anotherIns = new String("사과");
		
		System.out.println(word == apple);
		System.out.println(word == anotherIns);
		
		System.out.println("----");
		
		System.out.println(word.equals(anotherIns));
		
		Object o = new Object();
		o.equals(o);
	}

}
