// 학생
// 이름 : String
// 성별 : String
// 나이 : int
// 점수 : int
public class Student {
	String name;
	String gender;
	int age;
	int score;
	
	public Student (String name, String gender, int age, int score) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.score = score;
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(score);
	}
	
	public static void main(String[] args) {
		Student s = new Student("길동", "아파치", 22, 100);
		s.printAll();
		
		Student s2 = new Student("둘리", "수컷", 30, 90);
		s.printAll();
	}
}