// 책상
// 모델명 : String
// 가격 :
// 높이조절여부:boolean

// 생성자 정의
// (String 모델명, int 가격, boolean 높이조절여부) 모든 필드 초기화
// (String 모델명, int 가격) <<높이조절여부  tue

public class Desk {
	String model;
	int price;
	boolean hh;

	public Desk(String m, int p, boolean h) {
		model = m;
		price = p;
		hh = h;
		System.out.println("3개 파라미터를 전달받는 생성자로 책상이 생성되고 모든 필드기 초기화됨.");
	}

	public Desk(String m, int p) {
		model = m;
		price = p;
		hh = true;

	}
	
	public static void main(String[] args) {
		Desk d = new Desk("책상", 100000, true);
		System.out.println(d.model);
		System.out.println(d.price);
		System.out.println(d.hh);
	}
}