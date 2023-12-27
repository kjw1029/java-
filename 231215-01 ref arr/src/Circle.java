
public class Circle {
	private CenterPoint center;
	private int radius;

	public Circle(int x, int y, int radius) {
		center = new CenterPoint(x, y);
		this.radius = radius;
	}

	public String toString() {
		return String.format("(x: %d, y: %d) 반지름: %d", 
				center.getX(), center.getY(), radius);
	}

	public CenterPoint getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}

	public void setCenter(CenterPoint center) {
		this.center = center;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
