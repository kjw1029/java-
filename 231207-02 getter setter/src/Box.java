// 가로
// 세로
// 높이
// 모든 필드 초기화 생성자
// 부피를 구해 반화할 수 있는 메소드
public class Box {
	// 접근제한자
	// private 외부의 모든 접근(가시성)을제한
	private int width;
	private int length;
	private int hight;
	
	public Box (int x, int y, int h) {
		this.width = x;
		this.length = y;
		this.hight = h;
	}
	
	public Box (int h) {
		this(10, 10, h);
	}
	
	public int Box() {
		if (width<0 || length<0 || hight<0) {
			if (width<0) {
				width *= -1;
			} if (length<0) {
				length *= -1;
			} if (hight<0) {
				hight *= -1;
				return width * length * hight;
			}
		}
		return width * length * hight;
	}
	
	public int getx() {
		return width;
	}
	
	public int gety() {
		return length;
	}
	
	public int geth() {
		return hight;
	}
//	데이터에 제한을 둘 수 있음(setter)
	public void setx(int x) {
		this.width =x; 
	}
	// 접근제한자
	// public 모든 접근(가시성)을 허용
	public void sety(int y) {
		this.length = y;
	}
	
	public void seth(int h) {
		this.hight = h;
	}
	
	public static void main(String[] args) {
		Box b = new Box(10, 10, 10);
		System.out.println(b.Box());
		
		Box b2 = new Box(5);
		System.out.println(b2.Box());
		
		b2.width = 300;
		System.out.println(b2.width);
	}
}
