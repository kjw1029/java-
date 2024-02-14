// 2차원 평면의 좌표
// x,y

// 원
// 반지름
// 2차원 평면 상에 중심점 (x,y)

// 원 여러개
// (x: 10, y: 10) 반지름:5
// (x: 10, y: 10) 반지름:7
// (x: 20, y: 20) 반지름:9

public class CircleArray {
	public static void main(String[] args) {
		Circle[] circleArr = new Circle[] {
				new Circle(10, 10, 5)
						, new Circle(10, 10, 7)
						, new Circle(20, 20, 9)
		};
		for (Circle elem: circleArr) {
			System.out.println(elem.toString());
		}
	}
}