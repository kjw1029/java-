// 정수 2 ~ 100 사이의 모든 소수를 출력하는 프로그램
public class Test06 {

	public static void main(String[] args) {
		for (int i = 2 ; i <= 100 ; i++) {
			boolean a = true;
			
			for (int j = 2 ; j<i ; j++) {
				if (i%j==0) {
					a=false;
					break;
				}
			}
			if(a)
				System.out.println(i);
		}
	}
}