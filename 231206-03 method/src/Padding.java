// 패딩
// 모델명 : String
// 실가격 : int
// 할인중 : boolean
// 할인율 : int

// 구입시 가격을 반환하는 메소드 : int //소수점 버림
public class Padding {
	String Model01;
	int mo1;
	String Model02;
	int mo2;
	boolean go;
	boolean go2;

	public void goo1() {
		go = !go;
	}
	public void goo2() {
		go2 = !go2;
	}
	public int dis(int a) {
		if (go) {
			mo1 = mo1 * (100-a)/100;
			return mo1;
		} else {
			return mo1;
		}
	}

	public int dis2(int b) {
		if (go2) {
			mo2 = mo2 * (100-b)/100;
			return mo2;
		} else {
			return mo2;
		}
	}

}
