
public class UserInfo {
	private String name;
	private int age;
	
	public UserInfo(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public void printAll() {
		System.out.print(name);
		System.out.print(age);
		System.out.println();
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
	
	
}
