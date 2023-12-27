// 사각형 클래스 정의
// 가로(정수)
// 세로(정수)
// 넓이를 구해 콘솔에 출력 기능 - public void ???() {} -
public class Rectangle {
	int x;
	int y;

	public void printArea() {
		int xy = x * y;
		System.out.println("직사각형의 넓이: " + xy);
	}
	
	public void printArea2() {
		System.out.println("작사각형의 둘레: " + 2*(x+y));
		
	}
}
