import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2687380973518114908L; // 클래스 변경을 알려준다??? 관리?
	
	private String name;
	private int height;
	private double weight;
	private boolean married;
	
	public Person(String name, int height, double weight, boolean married) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.married = married;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isMarried() {
		return married;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", married=" + married + "]";
	}
	
	
}
