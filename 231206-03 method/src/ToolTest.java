
public class ToolTest {

	public static void main(String[] args) {
		MyTool my = new MyTool();
		my.doNothing();
		my.doRerturn();
		int value = my.getOne();
		System.out.println(value);
		
		double pi = my.getPI();
		System.out.println("원 넓이 구할때: " + pi);
		
		System.out.println("프로그램종료");
	}

}
