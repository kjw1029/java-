
public class Student extends Person {
	private int score;
	
	public Student (String name, int score) {
		super(name);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
