
public class TestPen {

	public static void main(String[] args) {
		Pen p = new Pen();
//		p.writeConsole();
//		p.writeConsole("안녕하세요");
//		p.writeConsole(15);

		Person person = new Person("둘리", 12);
		person.writeNameAge(p);
		
//		person.writeNameAge(null);
	}

}