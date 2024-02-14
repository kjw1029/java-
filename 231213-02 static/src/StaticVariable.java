
public class StaticVariable {
	int mynum = 300;
	static int yournum = 500;// 정적 변수

	public static void main(String[] args) {
		 StaticVariable a = new StaticVariable();
		 System.out.println(a.mynum);
		 
		 // 클래스명 없어도 같은 클래스라서 사용가능
		 System.out.println(StaticVariable.yournum);
		 
	}

}
