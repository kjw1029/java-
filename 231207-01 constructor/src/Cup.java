// 컵
// 색깔
// 용량
// 손잡이 유무

// 모든 필드 초기화 생성자
// 색깔만 전달 받아서 초기화하는 생성자. {용량의 값은 200, 손잡이는 없음}

public class Cup {
	String co;
	int ml;
	boolean ca;
	
	public Cup(String co, int ml, boolean ca) {
		this.co = co;
		this.ml = ml;
		this.ca = ca;
		}
	
	public Cup(String col) {
		this("co", 200, false);
	}

}
