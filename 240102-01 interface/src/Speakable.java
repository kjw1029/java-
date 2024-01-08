class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}


	
}

class KoreanPerson extends Person implements Speakable {

	public KoreanPerson(String name) {
		super(name);
	}

	@Override
	public void printHello() {
		System.out.println("안녕하세요. 제 이름은 " + super.getName());
	}
	
}
class EnglishPerson extends Person implements Speakable {

	public EnglishPerson(String name) {
		super(name);
	}

	@Override
	public void printHello() {
	System.out.println("Hello. My name is " + super.getName());
		
	}
	
}

public interface Speakable {
	// 추상 메소드만을 가질 수 있습니다.
	public abstract void printHello();
}

class MyKoreanPrinter implements Speakable {

	@Override
	public void printHello() {
		System.out.println("안녕!");
	}
}

class MyEnglishPrinter implements Speakable {

	@Override
	public void printHello() {
		System.out.println("Hello");
	}
	
}