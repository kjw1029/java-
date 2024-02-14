// 동물
// 종
// 나이
// 체중

// 모든 필드 초기화 생성자
// 각각의 필드의 접근자, 설정자 쌍
public class Animal {
	private String name;
	private String jo;
	private int age;
	private int kg;
	
	public Animal (String name, String jo, int age, int kg) {
		this.name = name;
		this.jo = jo;
		this.age = age;
		this.kg = kg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJo(String jo) {
		this.jo = jo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJo() {
		return jo;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getKg() {
		return kg;
	}
	
	public void allPrint() {
		System.out.println(name);
		System.out.println(jo);
		System.out.println(age);
		System.out.println(kg);
	}
}
