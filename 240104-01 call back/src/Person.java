
public class Person  {
	private int height;
	private int weight;

	public Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
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

}
