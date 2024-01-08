import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManageID {
	private ID[] ids;

	public static void printNowTime() {
		Calendar calendar = Calendar.getInstance(); // 정적 메소드 호출

		SimpleDateFormat kr = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat kr2 = new SimpleDateFormat("HH시 mm분 ss초");
		String result = kr.format(calendar.getTime());
		String result2 = kr2.format(calendar.getTime());
		
		System.out.println(result);
		System.out.println(result2);
	}
	
	
	public ManageID(ID[] ids) {
		this.ids = ids;
	}
	
	public boolean contain(String id, String password) {
		for (int i = 0; i < ids.length; i++) {
			if (ids[i].matches(id, password)) {
				return true;
			}
		}
		return false;
	}
}


/*
 * import java.util.Scanner;

// 가입정보
// 아이디
// 비밀번호

// 다음과 같은 회원정보
// Pjava, l@veJava
// qwer, 1q2w3e
// aaabb, cccdd

// 사용자 입력(아이디, 비밀번호)을 받아서
// 해당 정보의 유무를 출력할 수 있는 프로그램
public class AccessProgram {
	public static void main(String[] args) {
		ManageIDs manager = new ManageIDs(
				new ID[] {
						new ID("Pjava", "l@veJava")
						, new ID("qwer", "1q2w3e")
						, new ID("aaabb", "cccdd")
				}
			);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디?");
		String id = scan.nextLine();
		System.out.println("비밀번호?");
		String password = scan.nextLine();
		
		if (manager.contain(id, password)) {
			System.out.println("일치 정보가 있습니다.");
		} else {
			System.out.println("일치 정보가 없습니다.");
		}
	}
}







public class UserInfo {
	private String name;
	private int age;

	public UserInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}




public class ManageIDs {
	private ID[] ids;

	public ManageIDs(ID[] ids) {
		this.ids = ids;
	}
	
	public boolean contain(String id, String password) {
		for (int i = 0; i < ids.length; i++) {
			if (ids[i].matches(id, password)) {
				return true;
			}
		}
		return false;
	}
}

 * 
 * 
 * 
 * 
public class ID {
	private String id;
	private String password;

	public ID(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public boolean matches(String id, String password) {
		return this.id.equals(id) && this.password.equals(password);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

 * 
 * 
 * 
 * 
 * 
 */