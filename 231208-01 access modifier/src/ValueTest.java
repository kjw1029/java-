
public class ValueTest {
	public void increase(int i) {
		i++;
	}
	
	public static void main(String[] args) {
		ValueTest t = new ValueTest();
		int i = 10;
		t.increase(i);
		
		// call by value
		// 값이 복사됨 파라미터
		System.out.println(i); // 10
	}

}
