// 학생
// 국
// 영
// 수 

// 학급
// 3명의 학생
// 학급 전체의 평균 출력
// 학급 전체 인원의 국, 영, 수 점수 출력
public class StrudnetTest {
	public static void main(String[] args) {
		StudentClass c = new StudentClass(
				new Student[] {new Student(40, 50, 60)
								, new Student(50, 60, 70)
								, new Student(70, 80, 90)
					}
				);
		c.printAllScores();
		c.printTotalAVG();
	}

}
