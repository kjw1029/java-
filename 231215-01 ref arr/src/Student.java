
public class Student {
	private int kor;
	private int eng;
	private int math;

	public Student(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getSum() {
		return kor + eng + math;
	}
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public String toString() {
		return String.format("국어: %d, 영어: %d, 수학: %d",
							kor, eng, math);
	}

}
