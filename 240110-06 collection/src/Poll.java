import java.util.ArrayList;
import java.util.Scanner;

// 설문조사 집계 프로그램
// 인적사항 (이름, 전화번호)와
// 응답(찬성, 반대)
// 정보를 기록하는 프로그램

// 정보 기록, 응답 집계 (총 찬성, 반대 수 출력)

// 단, 동일 인물의 기록한 하나만 존재해야한다.
class Survey {
	private String name;
	private String phoneNumber;
	private boolean agree;
	public Survey(String name, String phoneNumber, boolean agree) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.agree = agree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Survey))
			return false;
		Survey other = (Survey) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Survey [name=" + name + ", phoneNumber=" + phoneNumber + ", agree=" + agree + "]";
	}
}

public class Poll {
	private ArrayList<Survey> list;
	
	public Poll() {
		list = new ArrayList<>();
	}
	
	public boolean add(Survey s) {
		if (!list.contains(s)) {
			list.add(s);
			return true;
		}
		return false;
	}
	
	public int countAgree() {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Survey survey = list.get(i);
			if (survey.isAgree()) {
				count++;
			}
		}
		return count;
	}
	
	public ArrayList<Survey> getList() {
		return list;
	}
	
	public int getSize() {
		return list.size();
	}
	
	public void printCount() {
		int count = countAgree();
		System.out.println("찬성 수 : " + count);
		System.out.println("반대 수 : " + (list.size() - count));
	}
	
	public static void main(String[] args) {
		Poll poll = new Poll();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("설문지 기록/집계 프로그램");
			System.out.println("1. 기록 / 2. 집계");
			int select = scan.nextInt();
			scan.nextLine();
			
			if (select == 1) {
				System.out.println("설문자 이름?");
				String name = scan.nextLine();
				System.out.println("설문자 전화번호?");
				String phoneNumber = scan.nextLine();
				System.out.println("설문내용? (찬성 or 반대)");
				boolean agree = scan.nextLine().equals("찬성");
				
				Survey s = new Survey(name, phoneNumber, agree);
				if (poll.add(s)) {
					System.out.println("기록 되었습니다");
				} else {
					System.out.println("이미 설문에 응답하신 설문자입니다.");
				}
			} else if (select == 2) {
				poll.printCount();
			} else {
				System.exit(0);
			}
		}
	}
}












