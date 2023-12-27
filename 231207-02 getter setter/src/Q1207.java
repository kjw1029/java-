// 영화 클래스를 작성해보기
// 영화제목
// 평점
// 감독
// 발표된 연도
// 등 추가의 필드 추가 작성해도 됩니다.
// 모든 필드를 초기화 생성자
public class Q1207 {
	String nam;
	double sta;
	String dir;
	int bir;
	
	public Q1207 (String nam, double sta, String dir, int bir) {
		this.nam = nam;
		this.sta = sta;
		this.dir = dir;
		this.bir = bir;
	}
	
	public void allP () {
		System.out.println(nam);
		System.out.println(sta);
		System.out.println(dir);
		System.out.println(bir);
	}
	
	public String getnam() {
		return nam;
	}
	
	public void setnam(String nam) {
		this.nam = nam;
	}
	
	public static void main(String[] args) {
//		Q1207 q = new Q1207("괴물", 4.7, "봉준호", 2015);
//		q.allP();
		
		Box b2 = new Box(5);
//		b2.width = 300;
		b2.setx(50);
//		System.out.println(b2.width);
		System.out.println(b2.getx());
	}
	
}
