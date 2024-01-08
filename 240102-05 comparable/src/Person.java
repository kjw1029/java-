
public class Person implements Comparable<Person> {
	private int height;
	private int weight;
	private String name;

	public Person(int height, int weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}



	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}

}
