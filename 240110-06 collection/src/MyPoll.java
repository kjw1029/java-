import java.util.ArrayList;
import java.util.Scanner;

// 설문조사 집계 프로그램
// 인적사항(이름, 전화번호)와
// 응답(찬성, 반대)
// 정보를 기록하는 프로그램

// 정보기록, 응답 집계(총 찬성, 반대 수 출력)

// 단, 동일 인물의 기록한 하나만 존재해야한다.
class Person2 {
	private String name;
	private String phone;
	private boolean proscons;

	
	public Person2() {
		super();
	}

	public Person2(String name, String phone, boolean proscons) {
		super();
		this.name = name;
		this.phone = phone;
		this.proscons = proscons;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public boolean getProscons() {
		return proscons;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", phone=" + phone + ", proscons=" + proscons + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person2)) {
			return false;
		}
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}
	
	
}


public class MyPoll {
	public static void main(String[] args) {
		ArrayList<Person2> personList = new ArrayList<Person2>();
		Scanner scan = new Scanner(System.in);
		int pros = 0;
		int cons = 0;
		// 설문조사 시작
		while (true) {
			System.out.println("이름이렵");
			System.out.println("0입력시 종료");
			String name = scan.nextLine();
			if (name.equals("0")) {
				break;
			}
			System.out.println("전화번호입력");
			String phone = scan.nextLine();
			System.out.println("찬반입력");
			boolean proscons = scan.nextBoolean();

			personList.add(new Person2(name, phone, proscons));
			
		}
		
		// 목록 정리
		ArrayList<Person2> unique = new ArrayList<>();
		for (Person2 elem : personList) {
			if (!unique.contains(elem)) {
				unique.add(elem);
			}
		}	
		
//		personList.remove(new Person2());
			
//		for (Person2 elem : personList) {
//			if (personList.contains(elem)) {	
//			}
//		}
		
		// 찬반 집계
//		for (Person2 elem : unique) {
////			if (elem.getProscons().equals("찬성")) {
//				pros++;
////			} else if (elem.getProscons().equals("반대")) {
//				cons++;
//			}
//		}
//		System.out.println("찬성" + pros);
//		System.out.println("반대" + cons);
//		
//		System.out.println(unique);
		
	}

}
