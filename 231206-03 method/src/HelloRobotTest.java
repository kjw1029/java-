
public class HelloRobotTest {

	public static void main(String[] args) {
		HelloRobot h = new HelloRobot();
		h.totalCount = 0;

		h.loop(5);
		System.out.println("추가확인");

		h.loop(8);

		System.out.println(h.totalCount);
	}

}
