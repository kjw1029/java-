import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
	private int height;
	private int weight;

	public Person(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}


	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + weight;
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
		if (height != other.height) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

}

public class Main4 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(
				Arrays.asList(new Person(180, 80), new Person(170, 90), new Person(190, 85)));
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		System.out.println(list);
		
		Person max = Collections.max(list);
		System.out.println(max);
	}

}
