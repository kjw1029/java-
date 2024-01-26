import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
	private String name;

	public Student(String name) {
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
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
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
		return "Student [name=" + name + "]";
	}
	
	
}
public class Main5Test {
	public static void main(String[] args) {
		Student s1 = new Student("길동");
		Student s2 = new Student("도우너");
		Student s3 = new Student("둘리");
		Student s4 = new Student("길동");
		
		StudentManagement manage = new StudentManagement();
		
		manage.addEnglish(s1);
		manage.addEnglish(s2);
		manage.addEnglish(s3);
		manage.addEnglish(s4);
		
		manage.addEnglish(new Student("톰"));
		manage.addEnglish(new Student("브래드"));
		manage.addEnglish(new Student("레오나르도"));
		manage.addEnglish(new Student("레오나르도"));
		manage.addEnglish(new Student("길동"));
		
		manage.printEnglish();
		
		
		
	}

}
