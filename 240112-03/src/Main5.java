import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// 학원 수강생 관리 프로그램

// 영어반, 수학반

// 같은 과목에 중복 등록 x 불가
// 각 반은 총원이 3명

class Person {
	private String name;
	private String subject;

	public Person(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		if (subject == null) {
			if (other.subject != null) {
				return false;
			}
		} else if (!subject.equals(other.subject)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "[이름: " + name +"]";
	}

}

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Person> math3 = new HashSet<>();
		Set<Person> eng3 = new HashSet<>();
		List<Set<Person>> math = new ArrayList<>();
		List<Set<Person>> eng = new ArrayList<>();

		while (true) {
			System.out.println("이름");
			String name = scan.nextLine();
			System.out.println("과목");
			String subject = scan.nextLine();

			Person person = new Person(name, subject);

			if (person.getSubject().equals("수학")) {
				math3.add(person);
			}
			if (person.getSubject().equals("수학") && math3.size() == 3 && !math.contains(person)) {
				math.add(math3);
				math3.remove(0);
				math3.remove(1);
				math3.remove(2);
			}
			
			if (name.equals("끝")) {
				break;
			}
		}
		System.out.println(math.toString());
	}
}