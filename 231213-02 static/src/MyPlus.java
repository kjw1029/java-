
public class MyPlus {
	public int plus(int a, int b) {
		return a + b;
	}
	
	// static 인스턴스가 없다
	public static int staticPlus(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
//		MyPlus my = new MyPlus();
//		int result = my.plus(100,200);
//		int result = my.staticPlus(100, 200);
		
		// JVM Class Load -> static을 찾아감
//		int result =MyPlus.staticPlus(100, 200);
//		MyPlus.plus(100, 200);// 컴파일 에러
		
		int result = MyPlus.staticPlus(100, 200);
		
		
		System.out.println(result);
	}
}
