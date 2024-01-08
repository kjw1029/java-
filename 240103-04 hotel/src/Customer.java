
public class Customer {
	private String name;
	private String number;
	public Customer(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + "]";
	}
	
	
}
