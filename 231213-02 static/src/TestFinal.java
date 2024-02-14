
public class TestFinal {
	public static int MINUSE_ERROR = -100;
	public static int ZERO_ERROR = -200;
	
	public int divide(int num, int num2) {
		if (num >= 0 && num2 > 0) {
			return num / num2;
		} else if (num2 == 0) {
			return ZERO_ERROR;
		} else {
			return MINUSE_ERROR;
		}
	}
	
	public static void main(String[] args) {
		 TestFinal t = new TestFinal();
		 
		 int result = t.divide(100, -50);
		 if (result == MINUSE_ERROR) {
			 System.out.println("양수값을 입력해주세요.");
		 }
		 
		 if (t.divide(100, 0) == ZERO_ERROR) {
			 System.out.println("0으로는 나눌 수 없어요");
		 }

	}

}
