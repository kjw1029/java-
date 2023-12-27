// 다음의 클래스에
// 회수를 정수값으로 전달받아
// "안녕" 콘솔 출력을 여러번 출력하는 메소드 작성
public class HelloRobot {
	int totalCount;

	public void loop(int in) {
		for (int i = 0; i < in; i++) {
			System.out.println("안녕");
		}
		totalCount += in;
	}

}
