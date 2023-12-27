
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// use-a 관계
	public void writeNameAge(Pen pen) {
//		Pen pen = new Pen();
		pen.writeConsole(name);
		pen.writeConsole(age);
	}
}
