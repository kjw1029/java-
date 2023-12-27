
public class Person {
	private String name;
	private int age;
	private Pen pen;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.pen = new Pen();
	}
	
	public Person(String name, int age, Pen pen) {
		this.name = name;
		this.age = age;
		this.pen = pen;
	}
	
	// use-a 관계
	public void writeNameAge() {
//		Pen pen = new Pen();
		pen.writeConsole(name);
		pen.writeConsole(age);
	}
	
	public void createPenAndWrite() {
		pen.writeConsole(name);
	}
}
