import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		int result = this.age - o.age;
		
		return result != 0 ? result : this.name.compareTo(o.name);
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name, age);
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
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}

public class Main7 {
	public static void main(String[] args) {
		System.out.println(new Person("ㅋㅋㅋ", 444).hashCode());
		System.out.println(new Person("ㅋㅋㅋ", 444).hashCode());
		System.out.println(new Person("ㅋㅋㅋ", 443).hashCode());
		System.out.println(new Person("ㅋㅋㄱ", 444).hashCode());
		
		Set<Person> setPerson = new HashSet<>();
		setPerson.add(new Person("길동", 22));
		setPerson.add(new Person("길동", 22));
		setPerson.add(new Person("둘리", 22));
		setPerson.add(new Person("둘리", 22));
		
		System.out.println(setPerson.size());
		System.out.println(setPerson.toString());
	}

}
