// 학생을 표현한 클래스
// 국어(int)
// 영어(int)
// 수학(int)
// 이름(String)

// 자신의 이름을 출력하는 메소드
// 자신의 총점을 출력하는 메소드
// 자신의 이름과 총점을 모두 출력할 수 있음.
public class Student {
	int k;
	int e;
	int m;
	String n;
	
	public void namePrint() {
		System.out.println(n);
	}
	
	public void sumPrint() {
		System.out.println(k+e+m);
	}
	
	public void allPrint() {
		namePrint();
		sumPrint();
	}
}
