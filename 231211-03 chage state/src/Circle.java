// 2차원 평면상의 원
// 중심점 x, y 좌표
// 반지름
public class Circle {
	private int radius;
	private Point center;
	
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public void printCoordi() {
		System.out.println(center.getX());
		System.out.println(center.getY());
	}
	
	public void setNewXY(int x, int y) {
		center.setX(x);
		center.setY(y);
	}
}
