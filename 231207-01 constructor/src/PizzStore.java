// 피자가게
// 상호명: String
// 주소 : String
// 전화번호: ???
// 대표자: ???
// 기본 배달료: ???
// 콤비네이션 피자 가격: int
// 치즈 피자 가격: int

public class PizzStore {
	String nn;
	String jj;
	String pp;
	String oo;
	int bb;
	int cc;
	int zz;
	
	public void no(String nn, String jj, String pp, String oo) {
		this.nn = nn;
		this.jj = jj; 
		this.pp = pp;
		this.oo = oo;
		
	}
	public int bo(int a) {
		bb = a;
		return bb;
	}
	
	public int co(int a) {
		cc = a;
		return cc;
	}
	
	public int zo(int a) {
		zz = a;
		return zz;
	}
	public void pr() {
		System.out.println(nn);
		System.out.println(jj);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
