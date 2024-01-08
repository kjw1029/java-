
public class Person {
	private String name;
	private String phoneNumber;
	private String nationality;
	private int baseSalery;

	public Person(String name, String phoneNumber, String nationality, int baseSalery) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
		this.baseSalery = baseSalery;
	}

	public Person(String name, String phoneNumber, String nationality) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public int getBaseSalery() {
		return baseSalery;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setBaseSalary(int baseSalery) {
		this.baseSalery = baseSalery;
	}
	
	
	

}
